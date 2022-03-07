// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties related to EventGrid. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("EventGrid")
@Fluent
public final class EventGrid extends DigitalTwinsEndpointResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventGrid.class);

    /*
     * EventGrid Topic Endpoint.
     */
    @JsonProperty(value = "TopicEndpoint", required = true)
    private String topicEndpoint;

    /*
     * EventGrid secondary accesskey. Will be obfuscated during read.
     */
    @JsonProperty(value = "accessKey1", required = true)
    private String accessKey1;

    /*
     * EventGrid secondary accesskey. Will be obfuscated during read.
     */
    @JsonProperty(value = "accessKey2")
    private String accessKey2;

    /**
     * Get the topicEndpoint property: EventGrid Topic Endpoint.
     *
     * @return the topicEndpoint value.
     */
    public String topicEndpoint() {
        return this.topicEndpoint;
    }

    /**
     * Set the topicEndpoint property: EventGrid Topic Endpoint.
     *
     * @param topicEndpoint the topicEndpoint value to set.
     * @return the EventGrid object itself.
     */
    public EventGrid withTopicEndpoint(String topicEndpoint) {
        this.topicEndpoint = topicEndpoint;
        return this;
    }

    /**
     * Get the accessKey1 property: EventGrid secondary accesskey. Will be obfuscated during read.
     *
     * @return the accessKey1 value.
     */
    public String accessKey1() {
        return this.accessKey1;
    }

    /**
     * Set the accessKey1 property: EventGrid secondary accesskey. Will be obfuscated during read.
     *
     * @param accessKey1 the accessKey1 value to set.
     * @return the EventGrid object itself.
     */
    public EventGrid withAccessKey1(String accessKey1) {
        this.accessKey1 = accessKey1;
        return this;
    }

    /**
     * Get the accessKey2 property: EventGrid secondary accesskey. Will be obfuscated during read.
     *
     * @return the accessKey2 value.
     */
    public String accessKey2() {
        return this.accessKey2;
    }

    /**
     * Set the accessKey2 property: EventGrid secondary accesskey. Will be obfuscated during read.
     *
     * @param accessKey2 the accessKey2 value to set.
     * @return the EventGrid object itself.
     */
    public EventGrid withAccessKey2(String accessKey2) {
        this.accessKey2 = accessKey2;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGrid withAuthenticationType(AuthenticationType authenticationType) {
        super.withAuthenticationType(authenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGrid withDeadLetterSecret(String deadLetterSecret) {
        super.withDeadLetterSecret(deadLetterSecret);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGrid withDeadLetterUri(String deadLetterUri) {
        super.withDeadLetterUri(deadLetterUri);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (topicEndpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property topicEndpoint in model EventGrid"));
        }
        if (accessKey1() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accessKey1 in model EventGrid"));
        }
    }
}
