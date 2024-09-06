// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.fluent.models.ValidateTransferResponseProperties;
import java.io.IOException;
import java.util.List;

/**
 * Transfer validation response.
 */
@Fluent
public final class ValidateTransferResponse implements JsonSerializable<ValidateTransferResponse> {
    /*
     * The properties of transfer validation response.
     */
    private ValidateTransferResponseProperties innerProperties;

    /**
     * Creates an instance of ValidateTransferResponse class.
     */
    public ValidateTransferResponse() {
    }

    /**
     * Get the innerProperties property: The properties of transfer validation response.
     * 
     * @return the innerProperties value.
     */
    private ValidateTransferResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: The status of validation.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the productId property: The product id for which this result applies.
     * 
     * @return the productId value.
     */
    public String productId() {
        return this.innerProperties() == null ? null : this.innerProperties().productId();
    }

    /**
     * Get the results property: The array of validation results.
     * 
     * @return the results value.
     */
    public List<ValidationResultProperties> results() {
        return this.innerProperties() == null ? null : this.innerProperties().results();
    }

    /**
     * Set the results property: The array of validation results.
     * 
     * @param results the results value to set.
     * @return the ValidateTransferResponse object itself.
     */
    public ValidateTransferResponse withResults(List<ValidationResultProperties> results) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateTransferResponseProperties();
        }
        this.innerProperties().withResults(results);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateTransferResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateTransferResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValidateTransferResponse.
     */
    public static ValidateTransferResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateTransferResponse deserializedValidateTransferResponse = new ValidateTransferResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedValidateTransferResponse.innerProperties
                        = ValidateTransferResponseProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateTransferResponse;
        });
    }
}
