// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The amount.
 */
@Immutable
public class Amount implements JsonSerializable<Amount> {
    /*
     * The currency for the amount value.
     */
    private String currency;

    /*
     * The amount value. For example, if the currency is USD, then a value of 600 would be $600.00.
     */
    private Float value;

    /**
     * Creates an instance of Amount class.
     */
    public Amount() {
    }

    /**
     * Get the currency property: The currency for the amount value.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Set the currency property: The currency for the amount value.
     * 
     * @param currency the currency value to set.
     * @return the Amount object itself.
     */
    Amount withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get the value property: The amount value. For example, if the currency is USD, then a value of 600 would be
     * $600.00.
     * 
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Set the value property: The amount value. For example, if the currency is USD, then a value of 600 would be
     * $600.00.
     * 
     * @param value the value value to set.
     * @return the Amount object itself.
     */
    Amount withValue(Float value) {
        this.value = value;
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
     * Reads an instance of Amount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Amount if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Amount.
     */
    public static Amount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Amount deserializedAmount = new Amount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currency".equals(fieldName)) {
                    deserializedAmount.currency = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedAmount.value = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmount;
        });
    }
}
