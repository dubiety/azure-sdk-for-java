// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Metadata about the resource.
 */
@Immutable
public class Metadata implements JsonSerializable<Metadata> {
    /*
     * Azure offering managing this resource on-behalf-of customer.
     */
    private String provisionedBy;

    /**
     * Creates an instance of Metadata class.
     */
    public Metadata() {
    }

    /**
     * Get the provisionedBy property: Azure offering managing this resource on-behalf-of customer.
     * 
     * @return the provisionedBy value.
     */
    public String provisionedBy() {
        return this.provisionedBy;
    }

    /**
     * Set the provisionedBy property: Azure offering managing this resource on-behalf-of customer.
     * 
     * @param provisionedBy the provisionedBy value to set.
     * @return the Metadata object itself.
     */
    Metadata withProvisionedBy(String provisionedBy) {
        this.provisionedBy = provisionedBy;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Metadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Metadata if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Metadata.
     */
    public static Metadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Metadata deserializedMetadata = new Metadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisionedBy".equals(fieldName)) {
                    deserializedMetadata.provisionedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetadata;
        });
    }
}
