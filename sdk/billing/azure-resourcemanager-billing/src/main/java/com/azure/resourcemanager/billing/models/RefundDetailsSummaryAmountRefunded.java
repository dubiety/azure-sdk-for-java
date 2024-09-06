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
 * The amount refunded.
 */
@Immutable
public final class RefundDetailsSummaryAmountRefunded extends Amount {
    /*
     * The amount value. For example, if the currency is USD, then a value of 600 would be $600.00.
     */
    private Float value;

    /*
     * The currency for the amount value.
     */
    private String currency;

    /**
     * Creates an instance of RefundDetailsSummaryAmountRefunded class.
     */
    public RefundDetailsSummaryAmountRefunded() {
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
     * Reads an instance of RefundDetailsSummaryAmountRefunded from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RefundDetailsSummaryAmountRefunded if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RefundDetailsSummaryAmountRefunded.
     */
    public static RefundDetailsSummaryAmountRefunded fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RefundDetailsSummaryAmountRefunded deserializedRefundDetailsSummaryAmountRefunded
                = new RefundDetailsSummaryAmountRefunded();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currency".equals(fieldName)) {
                    deserializedRefundDetailsSummaryAmountRefunded.currency = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedRefundDetailsSummaryAmountRefunded.value = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRefundDetailsSummaryAmountRefunded;
        });
    }
}
