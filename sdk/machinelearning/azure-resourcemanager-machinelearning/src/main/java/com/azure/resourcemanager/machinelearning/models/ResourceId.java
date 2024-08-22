// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a resource ID. For example, for a subnet, it is the resource URL for the subnet.
 */
@Fluent
public final class ResourceId implements JsonSerializable<ResourceId> {
    /*
     * The ID of the resource
     */
    private String id;

    /**
     * Creates an instance of ResourceId class.
     */
    public ResourceId() {
    }

    /**
     * Get the id property: The ID of the resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the resource.
     * 
     * @param id the id value to set.
     * @return the ResourceId object itself.
     */
    public ResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model ResourceId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceId.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceId from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceId if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceId.
     */
    public static ResourceId fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceId deserializedResourceId = new ResourceId();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedResourceId.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceId;
        });
    }
}
