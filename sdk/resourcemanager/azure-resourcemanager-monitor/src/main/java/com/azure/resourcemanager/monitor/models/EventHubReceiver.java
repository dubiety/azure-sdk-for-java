// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An Event hub receiver.
 */
@Fluent
public final class EventHubReceiver implements JsonSerializable<EventHubReceiver> {
    /*
     * The name of the Event hub receiver. Names must be unique across all receivers within an action group.
     */
    private String name;

    /*
     * The Event Hub namespace
     */
    private String eventHubNameSpace;

    /*
     * The name of the specific Event Hub queue
     */
    private String eventHubName;

    /*
     * Indicates whether to use common alert schema.
     */
    private Boolean useCommonAlertSchema;

    /*
     * The tenant Id for the subscription containing this event hub
     */
    private String tenantId;

    /*
     * The Id for the subscription containing this event hub
     */
    private String subscriptionId;

    /**
     * Creates an instance of EventHubReceiver class.
     */
    public EventHubReceiver() {
    }

    /**
     * Get the name property: The name of the Event hub receiver. Names must be unique across all receivers within an
     * action group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Event hub receiver. Names must be unique across all receivers within an
     * action group.
     * 
     * @param name the name value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the eventHubNameSpace property: The Event Hub namespace.
     * 
     * @return the eventHubNameSpace value.
     */
    public String eventHubNameSpace() {
        return this.eventHubNameSpace;
    }

    /**
     * Set the eventHubNameSpace property: The Event Hub namespace.
     * 
     * @param eventHubNameSpace the eventHubNameSpace value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withEventHubNameSpace(String eventHubNameSpace) {
        this.eventHubNameSpace = eventHubNameSpace;
        return this;
    }

    /**
     * Get the eventHubName property: The name of the specific Event Hub queue.
     * 
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the eventHubName property: The name of the specific Event Hub queue.
     * 
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     * 
     * @return the useCommonAlertSchema value.
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     * 
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withUseCommonAlertSchema(Boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Get the tenantId property: The tenant Id for the subscription containing this event hub.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant Id for the subscription containing this event hub.
     * 
     * @param tenantId the tenantId value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscriptionId property: The Id for the subscription containing this event hub.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The Id for the subscription containing this event hub.
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the EventHubReceiver object itself.
     */
    public EventHubReceiver withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model EventHubReceiver"));
        }
        if (eventHubNameSpace() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property eventHubNameSpace in model EventHubReceiver"));
        }
        if (eventHubName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property eventHubName in model EventHubReceiver"));
        }
        if (subscriptionId() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property subscriptionId in model EventHubReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventHubReceiver.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("eventHubNameSpace", this.eventHubNameSpace);
        jsonWriter.writeStringField("eventHubName", this.eventHubName);
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeBooleanField("useCommonAlertSchema", this.useCommonAlertSchema);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventHubReceiver from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventHubReceiver if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EventHubReceiver.
     */
    public static EventHubReceiver fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventHubReceiver deserializedEventHubReceiver = new EventHubReceiver();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedEventHubReceiver.name = reader.getString();
                } else if ("eventHubNameSpace".equals(fieldName)) {
                    deserializedEventHubReceiver.eventHubNameSpace = reader.getString();
                } else if ("eventHubName".equals(fieldName)) {
                    deserializedEventHubReceiver.eventHubName = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedEventHubReceiver.subscriptionId = reader.getString();
                } else if ("useCommonAlertSchema".equals(fieldName)) {
                    deserializedEventHubReceiver.useCommonAlertSchema = reader.getNullable(JsonReader::getBoolean);
                } else if ("tenantId".equals(fieldName)) {
                    deserializedEventHubReceiver.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventHubReceiver;
        });
    }
}
