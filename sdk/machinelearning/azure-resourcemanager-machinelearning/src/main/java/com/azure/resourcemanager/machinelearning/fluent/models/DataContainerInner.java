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
import com.azure.resourcemanager.machinelearning.models.DataContainerProperties;
import java.io.IOException;

/**
 * Azure Resource Manager resource envelope.
 */
@Fluent
public final class DataContainerInner extends ProxyResource {
    /*
     * [Required] Additional attributes of the entity.
     */
    private DataContainerProperties properties;

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
     * Creates an instance of DataContainerInner class.
     */
    public DataContainerInner() {
    }

    /**
     * Get the properties property: [Required] Additional attributes of the entity.
     * 
     * @return the properties value.
     */
    public DataContainerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: [Required] Additional attributes of the entity.
     * 
     * @param properties the properties value to set.
     * @return the DataContainerInner object itself.
     */
    public DataContainerInner withProperties(DataContainerProperties properties) {
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
                .log(new IllegalArgumentException("Missing required property properties in model DataContainerInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataContainerInner.class);

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
     * Reads an instance of DataContainerInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataContainerInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataContainerInner.
     */
    public static DataContainerInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataContainerInner deserializedDataContainerInner = new DataContainerInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDataContainerInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDataContainerInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDataContainerInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDataContainerInner.properties = DataContainerProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedDataContainerInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataContainerInner;
        });
    }
}
