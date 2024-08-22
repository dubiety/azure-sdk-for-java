// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Keys for endpoint authentication.
 */
@Fluent
public final class EndpointAuthKeysInner implements JsonSerializable<EndpointAuthKeysInner> {
    /*
     * The primary key.
     */
    private String primaryKey;

    /*
     * The secondary key.
     */
    private String secondaryKey;

    /**
     * Creates an instance of EndpointAuthKeysInner class.
     */
    public EndpointAuthKeysInner() {
    }

    /**
     * Get the primaryKey property: The primary key.
     * 
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: The primary key.
     * 
     * @param primaryKey the primaryKey value to set.
     * @return the EndpointAuthKeysInner object itself.
     */
    public EndpointAuthKeysInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: The secondary key.
     * 
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: The secondary key.
     * 
     * @param secondaryKey the secondaryKey value to set.
     * @return the EndpointAuthKeysInner object itself.
     */
    public EndpointAuthKeysInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("primaryKey", this.primaryKey);
        jsonWriter.writeStringField("secondaryKey", this.secondaryKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointAuthKeysInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointAuthKeysInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointAuthKeysInner.
     */
    public static EndpointAuthKeysInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointAuthKeysInner deserializedEndpointAuthKeysInner = new EndpointAuthKeysInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryKey".equals(fieldName)) {
                    deserializedEndpointAuthKeysInner.primaryKey = reader.getString();
                } else if ("secondaryKey".equals(fieldName)) {
                    deserializedEndpointAuthKeysInner.secondaryKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointAuthKeysInner;
        });
    }
}
