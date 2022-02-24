// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.handler;

import com.azure.spring.messaging.AzureHeaders;
import com.azure.spring.messaging.AzureSendFailureException;
import com.azure.spring.messaging.PartitionSupplier;
import com.azure.spring.messaging.core.SendOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.MessageTimeoutException;
import org.springframework.integration.expression.ExpressionUtils;
import org.springframework.integration.expression.ValueExpression;
import org.springframework.integration.handler.AbstractMessageProducingHandler;
import org.springframework.integration.support.DefaultErrorMessageStrategy;
import org.springframework.integration.support.ErrorMessageStrategy;
import org.springframework.lang.NonNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageDeliveryException;
import org.springframework.messaging.MessageHeaders;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.util.concurrent.ListenableFutureCallback;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * Base class of outbound adapter to publish to azure backed messaging service
 *
 * <p>
 * It delegates real operation to {@link SendOperation} which supports synchronous and asynchronous sending.
 */
public class DefaultMessageHandler extends AbstractMessageProducingHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultMessageHandler.class);
    private static final long DEFAULT_SEND_TIMEOUT = 10000;
    private final String destination;
    private final SendOperation sendOperation;
    private boolean sync = false;
    private ListenableFutureCallback<Void> sendCallback;
    private EvaluationContext evaluationContext;
    private Expression sendTimeoutExpression = new ValueExpression<>(DEFAULT_SEND_TIMEOUT);
    private ErrorMessageStrategy errorMessageStrategy = new DefaultErrorMessageStrategy();
    private Expression partitionKeyExpression;
    private Expression partitionIdExpression;
    private MessageChannel sendFailureChannel;
    private String sendFailureChannelName;

    /**
     * Construct a {@link DefaultMessageHandler} with the specified destination and sendOperation.
     *
     * @param destination the destination
     * @param sendOperation operation for sending Messages to a destination
     */
    public DefaultMessageHandler(String destination, @NonNull SendOperation sendOperation) {
        Assert.hasText(destination, "destination can't be null or empty");
        this.destination = destination;
        this.sendOperation = sendOperation;
    }

    @Override
    protected void onInit() {
        super.onInit();
        this.evaluationContext = ExpressionUtils.createStandardEvaluationContext(getBeanFactory());
        LOGGER.info("Started DefaultMessageHandler with properties: {}", buildPropertiesMap());
    }

    @Override
    protected void handleMessageInternal(Message<?> message) {
        PartitionSupplier partitionSupplier = toPartitionSupplier(message);
        String destination = toDestination(message);
        final Mono<Void> mono = this.sendOperation.sendAsync(destination, message, partitionSupplier);

        if (this.sync) {
            waitingSendResponse(mono, message);
        } else {
            handleSendResponseAsync(mono, message);
        }

    }

    private <T> void handleSendResponseAsync(Mono<T> mono, Message<?> message) {
        mono.doOnError(ex -> {
            if (LOGGER.isWarnEnabled()) {
                LOGGER.warn("{} sent failed in async mode due to {}", message, ex.getMessage());
            }
            if (this.sendCallback != null) {
                this.sendCallback.onFailure(ex);
            }

            if (getSendFailureChannel() != null) {
                this.messagingTemplate.send(getSendFailureChannel(), getErrorMessageStrategy()
                    .buildErrorMessage(new AzureSendFailureException(message, ex), null));
            }
        }).doOnSuccess(t -> {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} sent successfully in async mode", message);
            }
            if (this.sendCallback != null) {
                this.sendCallback.onSuccess((Void) t);
            }
        }).subscribe();
    }

    private <T> void waitingSendResponse(Mono<T> mono, Message<?> message) {
        Long sendTimeout = this.sendTimeoutExpression.getValue(this.evaluationContext, message, Long.class);

        if (sendTimeout == null || sendTimeout < 0) {
            try {
                mono.block();
            } catch (Exception e) {
                throw new MessageDeliveryException(e.getMessage());
            }
        } else {
            try {
                mono.block(Duration.of(sendTimeout, ChronoUnit.MILLIS));
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("{} sent successfully in sync mode", message);
                }
            } catch (Exception e) {
                if (e.getCause() instanceof TimeoutException) {
                    throw new MessageTimeoutException(message, "Timeout waiting for send event hub response");
                }
                throw new MessageDeliveryException(e.getMessage());
            }

        }
    }

    /**
     * Set sync.
     *
     * @param sync the sync
     */
    public void setSync(boolean sync) {
        this.sync = sync;
        LOGGER.info("DefaultMessageHandler sync becomes: {}", sync);
    }

    @Override
    public void setSendTimeout(long sendTimeout) {
        setSendTimeoutExpression(new ValueExpression<>(sendTimeout));
    }

    /**
     * Set partition Key.
     *
     * @param partitionKey the partition Key
     */
    public void setPartitionKey(String partitionKey) {
        setPartitionKeyExpression(new LiteralExpression(partitionKey));
    }

    /**
     * Set partition key expression.
     *
     * @param partitionKeyExpression the partition key expression
     */
    public void setPartitionKeyExpression(Expression partitionKeyExpression) {
        this.partitionKeyExpression = partitionKeyExpression;
    }

    /**
     * Set partition id expression.
     *
     * @param partitionIdExpression the partition id expression
     */
    public void setPartitionIdExpression(Expression partitionIdExpression) {
        this.partitionIdExpression = partitionIdExpression;
    }

    /**
     * Set partition key expression string.
     *
     * @param partitionKeyExpression the partition key expression
     */
    public void setPartitionKeyExpressionString(String partitionKeyExpression) {
        setPartitionKeyExpression(EXPRESSION_PARSER.parseExpression(partitionKeyExpression));
    }

    private String toDestination(Message<?> message) {
        if (message.getHeaders().containsKey(AzureHeaders.NAME)) {
            return message.getHeaders().get(AzureHeaders.NAME, String.class);
        }

        return this.destination;
    }

    private PartitionSupplier toPartitionSupplier(Message<?> message) {
        PartitionSupplier partitionSupplier = new PartitionSupplier();
        // Priority setting partitionId
        String partitionId = getHeaderValue(message.getHeaders(), AzureHeaders.PARTITION_ID);
        if (!StringUtils.hasText(partitionId) && this.partitionIdExpression != null) {
            partitionId = this.partitionIdExpression.getValue(this.evaluationContext, message, String.class);
        }
        if (StringUtils.hasText(partitionId)) {
            partitionSupplier.setPartitionId(partitionId);
        }

        String partitionKey = getHeaderValue(message.getHeaders(), AzureHeaders.PARTITION_KEY);
        // The default key expression is the hash code of the payload.
        if (!StringUtils.hasText(partitionKey) && this.partitionKeyExpression != null) {
            partitionKey = this.partitionKeyExpression.getValue(this.evaluationContext, message, String.class);
        }
        if (StringUtils.hasText(partitionKey)) {
            partitionSupplier.setPartitionKey(partitionKey);
        }

        return partitionSupplier;
    }

    /**
     * Get header value from MessageHeaders
     * @param headers MessageHeaders
     * @param keyName Key name
     * @return String header value
     */
    private String getHeaderValue(MessageHeaders headers, String keyName) {
        return headers.keySet().stream()
                                    .filter(keyName::equals)
                                    .map(key -> String.valueOf(headers.get(key)))
                                    .findAny()
                                    .orElse(null);
    }

    private Map<String, Object> buildPropertiesMap() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("sync", sync);
        properties.put("sendTimeout", sendTimeoutExpression);
        properties.put("destination", destination);
        return properties;
    }

    /**
     * Set send call back.
     *
     * @param callback the call back
     */
    public void setSendCallback(ListenableFutureCallback<Void> callback) {
        this.sendCallback = callback;
    }

    /**
     * Get send time out expression.
     *
     * @return sendTimeoutExpression the send time out expression
     */
    public Expression getSendTimeoutExpression() {
        return sendTimeoutExpression;
    }

    /**
     * Set send time out expression.
     *
     * @param sendTimeoutExpression the send time out expression
     */
    public void setSendTimeoutExpression(Expression sendTimeoutExpression) {
        Assert.notNull(sendTimeoutExpression, "'sendTimeoutExpression' must not be null");
        this.sendTimeoutExpression = sendTimeoutExpression;
        LOGGER.info("DefaultMessageHandler syncTimeout becomes: {}", sendTimeoutExpression);
    }

    /**
     * Get send failure channel.
     *
     * @return sendFailureChannel If sendFailureChannel or sendFailureChannelName is not null, null otherwise
     */
    protected MessageChannel getSendFailureChannel() {
        if (this.sendFailureChannel != null) {
            return this.sendFailureChannel;
        } else if (this.sendFailureChannelName != null) {
            this.sendFailureChannel = getChannelResolver().resolveDestination(this.sendFailureChannelName);
            return this.sendFailureChannel;
        }

        return null;
    }

    /**
     * Set send failure channel.
     *
     * @param sendFailureChannel the send failure channel
     */
    public void setSendFailureChannel(MessageChannel sendFailureChannel) {
        this.sendFailureChannel = sendFailureChannel;
    }

    /**
     * Set send failure channel name.
     *
     * @param sendFailureChannelName the send failure channel name
     */
    public void setSendFailureChannelName(String sendFailureChannelName) {
        this.sendFailureChannelName = sendFailureChannelName;
    }

    /**
     * Get error message strategy.
     *
     * @return the error message strategy
     */
    protected ErrorMessageStrategy getErrorMessageStrategy() {
        return this.errorMessageStrategy;
    }

    /**
     * Set error message strategy.
     *
     * @param errorMessageStrategy the error message strategy
     */
    public void setErrorMessageStrategy(ErrorMessageStrategy errorMessageStrategy) {
        Assert.notNull(errorMessageStrategy, "'errorMessageStrategy' must not be null");
        this.errorMessageStrategy = errorMessageStrategy;
    }
}
