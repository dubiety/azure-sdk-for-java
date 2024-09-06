// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.fluent.models.InvoiceInner;
import java.io.IOException;
import java.util.List;

/**
 * A container for a list of resources.
 */
@Immutable
public final class InvoiceListResult implements JsonSerializable<InvoiceListResult> {
    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /*
     * The list of resources.
     */
    private List<InvoiceInner> value;

    /**
     * Creates an instance of InvoiceListResult class.
     */
    public InvoiceListResult() {
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The list of resources.
     * 
     * @return the value value.
     */
    public List<InvoiceInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
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
     * Reads an instance of InvoiceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InvoiceListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the InvoiceListResult.
     */
    public static InvoiceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InvoiceListResult deserializedInvoiceListResult = new InvoiceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedInvoiceListResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<InvoiceInner> value = reader.readArray(reader1 -> InvoiceInner.fromJson(reader1));
                    deserializedInvoiceListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInvoiceListResult;
        });
    }
}
