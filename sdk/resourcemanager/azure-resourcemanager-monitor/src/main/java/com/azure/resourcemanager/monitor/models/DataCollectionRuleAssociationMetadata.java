// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Metadata about the resource.
 */
@Immutable
public final class DataCollectionRuleAssociationMetadata extends Metadata {
    /*
     * Azure offering managing this resource on-behalf-of customer.
     */
    private String provisionedBy;

    /**
     * Creates an instance of DataCollectionRuleAssociationMetadata class.
     */
    public DataCollectionRuleAssociationMetadata() {
    }

    /**
     * Get the provisionedBy property: Azure offering managing this resource on-behalf-of customer.
     * 
     * @return the provisionedBy value.
     */
    @Override
    public String provisionedBy() {
        return this.provisionedBy;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
     * Reads an instance of DataCollectionRuleAssociationMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataCollectionRuleAssociationMetadata if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataCollectionRuleAssociationMetadata.
     */
    public static DataCollectionRuleAssociationMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataCollectionRuleAssociationMetadata deserializedDataCollectionRuleAssociationMetadata
                = new DataCollectionRuleAssociationMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisionedBy".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociationMetadata.provisionedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataCollectionRuleAssociationMetadata;
        });
    }
}
