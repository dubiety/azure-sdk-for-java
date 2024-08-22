// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.OutboundRule;
import java.io.IOException;

/**
 * Outbound Rule Basic Resource for the managed network of a machine learning workspace.
 */
@Fluent
public final class OutboundRuleBasicResourceInner extends ProxyResource {
    /*
     * Outbound Rule for the managed network of a machine learning workspace.
     */
    private OutboundRule properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of OutboundRuleBasicResourceInner class.
     */
    public OutboundRuleBasicResourceInner() {
    }

    /**
     * Get the properties property: Outbound Rule for the managed network of a machine learning workspace.
     * 
     * @return the properties value.
     */
    public OutboundRule properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Outbound Rule for the managed network of a machine learning workspace.
     * 
     * @param properties the properties value to set.
     * @return the OutboundRuleBasicResourceInner object itself.
     */
    public OutboundRuleBasicResourceInner withProperties(OutboundRule properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model OutboundRuleBasicResourceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OutboundRuleBasicResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutboundRuleBasicResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutboundRuleBasicResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutboundRuleBasicResourceInner.
     */
    public static OutboundRuleBasicResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutboundRuleBasicResourceInner deserializedOutboundRuleBasicResourceInner
                = new OutboundRuleBasicResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOutboundRuleBasicResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOutboundRuleBasicResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOutboundRuleBasicResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOutboundRuleBasicResourceInner.properties = OutboundRule.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedOutboundRuleBasicResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutboundRuleBasicResourceInner;
        });
    }
}
