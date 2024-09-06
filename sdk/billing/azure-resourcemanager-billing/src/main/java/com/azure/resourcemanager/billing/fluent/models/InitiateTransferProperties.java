// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request parameters to initiate transfer.
 */
@Fluent
public final class InitiateTransferProperties implements JsonSerializable<InitiateTransferProperties> {
    /*
     * The email ID of the recipient to whom the transfer request is sent.
     */
    private String recipientEmailId;

    /**
     * Creates an instance of InitiateTransferProperties class.
     */
    public InitiateTransferProperties() {
    }

    /**
     * Get the recipientEmailId property: The email ID of the recipient to whom the transfer request is sent.
     * 
     * @return the recipientEmailId value.
     */
    public String recipientEmailId() {
        return this.recipientEmailId;
    }

    /**
     * Set the recipientEmailId property: The email ID of the recipient to whom the transfer request is sent.
     * 
     * @param recipientEmailId the recipientEmailId value to set.
     * @return the InitiateTransferProperties object itself.
     */
    public InitiateTransferProperties withRecipientEmailId(String recipientEmailId) {
        this.recipientEmailId = recipientEmailId;
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
        jsonWriter.writeStringField("recipientEmailId", this.recipientEmailId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InitiateTransferProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InitiateTransferProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InitiateTransferProperties.
     */
    public static InitiateTransferProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InitiateTransferProperties deserializedInitiateTransferProperties = new InitiateTransferProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recipientEmailId".equals(fieldName)) {
                    deserializedInitiateTransferProperties.recipientEmailId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInitiateTransferProperties;
        });
    }
}
