// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The amount of any Azure credits automatically applied to this transaction.
 */
@Immutable
public final class TransactionPropertiesAzureCreditApplied extends Amount {
    /*
     * The amount value. For example, if the currency is USD, then a value of 600 would be $600.00.
     */
    private Float value;

    /*
     * The currency for the amount value.
     */
    private String currency;

    /**
     * Creates an instance of TransactionPropertiesAzureCreditApplied class.
     */
    public TransactionPropertiesAzureCreditApplied() {
    }

    /**
     * Get the value property: The amount value. For example, if the currency is USD, then a value of 600 would be
     * $600.00.
     * 
     * @return the value value.
     */
    @Override
    public Float value() {
        return this.value;
    }

    /**
     * Get the currency property: The currency for the amount value.
     * 
     * @return the currency value.
     */
    @Override
    public String currency() {
        return this.currency;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
     * Reads an instance of TransactionPropertiesAzureCreditApplied from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransactionPropertiesAzureCreditApplied if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TransactionPropertiesAzureCreditApplied.
     */
    public static TransactionPropertiesAzureCreditApplied fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TransactionPropertiesAzureCreditApplied deserializedTransactionPropertiesAzureCreditApplied
                = new TransactionPropertiesAzureCreditApplied();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currency".equals(fieldName)) {
                    deserializedTransactionPropertiesAzureCreditApplied.currency = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedTransactionPropertiesAzureCreditApplied.value
                        = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTransactionPropertiesAzureCreditApplied;
        });
    }
}
