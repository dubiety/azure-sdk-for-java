// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhubs.inbound;

import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventProcessorClient;
import com.azure.messaging.eventhubs.models.ErrorContext;
import com.azure.messaging.eventhubs.models.EventBatchContext;
import com.azure.messaging.eventhubs.models.EventContext;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.spring.eventhubs.core.EventHubsProcessorFactory;
import com.azure.spring.eventhubs.core.listener.EventHubsMessageListenerContainer;
import com.azure.spring.eventhubs.core.properties.EventHubsContainerProperties;
import com.azure.spring.eventhubs.implementation.core.listener.adapter.BatchMessagingMessageListenerAdapter;
import com.azure.spring.integration.eventhubs.inbound.implementation.health.EventHubsProcessorInstrumentation;
import com.azure.spring.integration.implementation.instrumentation.DefaultInstrumentationManager;
import com.azure.spring.integration.instrumentation.Instrumentation;
import com.azure.spring.messaging.ListenerMode;
import com.azure.spring.messaging.checkpoint.CheckpointConfig;
import com.azure.spring.messaging.checkpoint.CheckpointMode;
import com.azure.spring.messaging.converter.AbstractAzureMessageConverter;
import com.azure.spring.service.eventhubs.consumer.EventHubsBatchMessageListener;
import com.azure.spring.service.eventhubs.consumer.EventHubsErrorHandler;
import com.azure.spring.service.eventhubs.consumer.EventHubsMessageListener;
import com.azure.spring.service.eventhubs.consumer.EventHubsRecordMessageListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.azure.spring.integration.instrumentation.Instrumentation.Type.CONSUMER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EventHubsInboundChannelAdapterTests {

    private EventHubsInboundChannelAdapter adapter;
    private EventHubsProcessorFactory processorFactory;
    private EventHubsContainerProperties containerProperties;

    private final String consumerGroup = "group";
    private final String eventHub = "dest";
    private final String[] payloads = { "payload1", "payload2" };
    private final List<Message<?>> messages = Arrays.stream(payloads)
                                                    .map(p -> MessageBuilder.withPayload(p).build())
                                                    .collect(Collectors.toList());
    @BeforeEach
    void setUp() {
        this.processorFactory = mock(EventHubsProcessorFactory.class);
        when(processorFactory.createProcessor(eq(eventHub), eq(consumerGroup), isA(EventHubsContainerProperties.class))).thenReturn(mock(EventProcessorClient.class));

        this.containerProperties = new EventHubsContainerProperties();
        containerProperties.setEventHubName(eventHub);
        containerProperties.setConsumerGroup(consumerGroup);

        this.adapter = new EventHubsInboundChannelAdapter(
            new EventHubsMessageListenerContainer(processorFactory, containerProperties),
            new CheckpointConfig());
    }

    @Test
    void defaultRecordListenerMode() {
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(
            new EventHubsMessageListenerContainer(mock(EventHubsProcessorFactory.class), new EventHubsContainerProperties()),
                new CheckpointConfig(CheckpointMode.RECORD));
        assertThat(channelAdapter).hasFieldOrPropertyWithValue("listenerMode", ListenerMode.RECORD);
    }

    @Test
    void batchListenerModeSet() {
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(
            new EventHubsMessageListenerContainer(mock(EventHubsProcessorFactory.class), new EventHubsContainerProperties()),
            ListenerMode.BATCH,
            new CheckpointConfig(CheckpointMode.RECORD));
        assertThat(channelAdapter).hasFieldOrPropertyWithValue("listenerMode", ListenerMode.BATCH);
    }

    @Test
    void batchListenerModeSetBatchListener() {
        EventHubsContainerProperties containerProperties = new EventHubsContainerProperties();
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(
            new EventHubsMessageListenerContainer(mock(EventHubsProcessorFactory.class), containerProperties),
            ListenerMode.BATCH,
            new CheckpointConfig(CheckpointMode.BATCH));
        channelAdapter.onInit();
        assertThat(containerProperties).extracting("messageListener").isInstanceOf(BatchMessagingMessageListenerAdapter.class);
    }

    @Test
    void setInstrumentationManager() {
        DefaultInstrumentationManager instrumentationManager = new DefaultInstrumentationManager();
        this.adapter.setInstrumentationManager(instrumentationManager);
        assertThat(this.adapter).hasFieldOrPropertyWithValue("instrumentationManager", instrumentationManager);
    }

    @Test
    void setInstrumentationId() {
        String instrumentationId = "testId";
        this.adapter.setInstrumentationId(instrumentationId);
        assertThat(this.adapter).hasFieldOrPropertyWithValue("instrumentationId", instrumentationId);
    }

    @Test
    void setMessageConverter() {
        TestAzureMessageConverter converter = new TestAzureMessageConverter();
        this.adapter.setMessageConverter(converter);
        assertThat(this.adapter).extracting("recordListener").extracting("messageConverter").isEqualTo(converter);
        assertThat(this.adapter).extracting("batchListener").extracting("messageConverter").isNotEqualTo(converter);
    }

    @Test
    void setBatchMessageConverter() {
        TestBatchAzureMessageConverter converter = new TestBatchAzureMessageConverter();
        this.adapter.setBatchMessageConverter(converter);
        assertThat(this.adapter).extracting("batchListener").extracting("messageConverter").isEqualTo(converter);
        assertThat(this.adapter).extracting("recordListener").extracting("messageConverter").isNotEqualTo(converter);
    }

    @Test
    void setPayloadType() {
        this.adapter.afterPropertiesSet();
        assertThat(this.adapter).extracting("recordListener").extracting("payloadType").isEqualTo(byte[].class);
        this.adapter.setPayloadType(Long.class);
        this.adapter.afterPropertiesSet();
        assertThat(this.adapter).extracting("recordListener").extracting("payloadType").isEqualTo(Long.class);
    }

    @Test
    void sendAndReceive() throws InterruptedException {
        EventHubsMessageListenerContainer listenerContainer =
            new EventHubsMessageListenerContainer(this.processorFactory, this.containerProperties);
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(listenerContainer,
            new CheckpointConfig(CheckpointMode.RECORD));

        DirectChannel channel = new DirectChannel();
        channel.setBeanName("output");

        final CountDownLatch latch = new CountDownLatch(1);
        final List<String> receivedMessages = new CopyOnWriteArrayList<>();
        channel.subscribe(message -> {
            try {
                receivedMessages.add(new String((byte[]) message.getPayload()));
            } finally {
                latch.countDown();
            }

        });

        channelAdapter.setOutputChannel(channel);
        channelAdapter.onInit();
        channelAdapter.doStart();

        EventHubsMessageListener messageListener = listenerContainer.getContainerProperties().getMessageListener();
        assertTrue(messageListener instanceof EventHubsRecordMessageListener);
        List<String> payloads = Arrays.asList("a", "b", "c");
        payloads.stream()
                .map(payload -> {
                    EventContext mock = mock(EventContext.class);
                    when(mock.getEventData()).thenReturn(new EventData(payload));
                    when(mock.getPartitionContext()).thenReturn(mock(PartitionContext.class));
                    when(mock.updateCheckpointAsync()).thenReturn(Mono.empty());
                    return mock;
                })
                .forEach(eventContext -> ((EventHubsRecordMessageListener) messageListener).onEvent(eventContext));


        assertTrue(latch.await(5L, TimeUnit.SECONDS), "Failed to receive message");

        for (int i = 0; i < receivedMessages.size(); i++) {
            Assertions.assertEquals(receivedMessages.get(i), payloads.get(i));
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    void sendAndReceiveBatch() throws InterruptedException {
        EventHubsMessageListenerContainer listenerContainer =
            new EventHubsMessageListenerContainer(this.processorFactory, this.containerProperties);
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(listenerContainer,
            ListenerMode.BATCH,
            new CheckpointConfig(CheckpointMode.BATCH));

        DirectChannel channel = new DirectChannel();
        channel.setBeanName("output");

        final CountDownLatch latch = new CountDownLatch(1);
        final List<List<String>> receivedMessages = new CopyOnWriteArrayList<>();
        channel.subscribe(message -> {
            try {
                List<byte[]> payload = (List<byte[]>) message.getPayload();
                List<String> batch = payload.stream().map(String::new).collect(Collectors.toList());
                receivedMessages.add(batch);
            } finally {
                latch.countDown();
            }

        });

        channelAdapter.setOutputChannel(channel);
        channelAdapter.onInit();
        channelAdapter.doStart();

        EventHubsMessageListener messageListener = listenerContainer.getContainerProperties().getMessageListener();
        assertTrue(messageListener instanceof EventHubsBatchMessageListener);
        List<String> payloads = Arrays.asList("a", "b", "c", "d", "e", "f");
        IntStream.range(0, 3)
                 .mapToObj(i -> {
                     EventBatchContext mock = mock(EventBatchContext.class);
                     when(mock.getEvents()).thenReturn(Arrays.asList((new EventData(payloads.get(2 * i))), (new EventData(payloads.get(2 * i + 1)))));
                     when(mock.getPartitionContext()).thenReturn(mock(PartitionContext.class));
                     when(mock.updateCheckpointAsync()).thenReturn(Mono.empty());
                     return mock;
                 })
                .forEach(eventContext -> ((EventHubsBatchMessageListener) messageListener).onEventBatch(eventContext));


        assertTrue(latch.await(5L, TimeUnit.SECONDS), "Failed to receive message");

        for (int i = 0; i < receivedMessages.size(); i++) {
            Assertions.assertEquals(receivedMessages.get(i), Arrays.asList(payloads.get(2 * i), payloads.get(2 * i + 1)));
        }
    }

    @Test
    void instrumentationErrorHandler() {
        DefaultInstrumentationManager instrumentationManager = new DefaultInstrumentationManager();
        EventHubsMessageListenerContainer listenerContainer =
            new EventHubsMessageListenerContainer(this.processorFactory, this.containerProperties);
        EventHubsInboundChannelAdapter channelAdapter = new EventHubsInboundChannelAdapter(listenerContainer,
            new CheckpointConfig(CheckpointMode.RECORD));

        String instrumentationId = CONSUMER + ":" + eventHub;

        EventHubsProcessorInstrumentation processorInstrumentation = new EventHubsProcessorInstrumentation(
            eventHub, CONSUMER, Duration.ofMinutes(1));
        instrumentationManager.addHealthInstrumentation(processorInstrumentation);

        processorInstrumentation.setStatus(Instrumentation.Status.UP);
        assertEquals(Instrumentation.Status.UP, processorInstrumentation.getStatus());

        channelAdapter.setInstrumentationId(instrumentationId);
        channelAdapter.setInstrumentationManager(instrumentationManager);
        channelAdapter.onInit();
        channelAdapter.doStart();

        EventHubsErrorHandler errorHandler = listenerContainer.getContainerProperties().getErrorHandler();

        errorHandler.accept(new ErrorContext(mock(PartitionContext.class), new IllegalArgumentException("test")));
        Instrumentation healthInstrumentation = instrumentationManager.getHealthInstrumentation(instrumentationId);
        assertEquals(Instrumentation.Status.DOWN, healthInstrumentation.getStatus());
        assertEquals(healthInstrumentation.getException().getClass(), IllegalArgumentException.class);
        assertEquals(healthInstrumentation.getException().getMessage(), "test");
    }

    static class TestAzureMessageConverter extends AbstractAzureMessageConverter<EventData, EventData> {


        @Override
        protected ObjectMapper getObjectMapper() {
            return null;
        }

        @Override
        protected Object getPayload(EventData azureMessage) {
            return azureMessage.getBody();
        }

        @Override
        protected EventData fromString(String payload) {
            return new EventData(payload.getBytes(StandardCharsets.UTF_8));
        }

        @Override
        protected EventData fromByte(byte[] payload) {
            return new EventData(payload);
        }
    }

    static class TestBatchAzureMessageConverter extends AbstractAzureMessageConverter<EventBatchContext, EventData> {


        @Override
        protected ObjectMapper getObjectMapper() {
            return null;
        }

        @Override
        protected Object getPayload(EventBatchContext azureMessage) {
            return azureMessage.getEvents().stream().map(EventData::getBody).collect(Collectors.toList());
        }

        @Override
        protected EventData fromString(String payload) {
            return new EventData(payload.getBytes(StandardCharsets.UTF_8));
        }

        @Override
        protected EventData fromByte(byte[] payload) {
            return new EventData(payload);
        }
    }
}
