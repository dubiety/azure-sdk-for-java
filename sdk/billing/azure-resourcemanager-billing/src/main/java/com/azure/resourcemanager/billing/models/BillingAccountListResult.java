// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.fluent.models.BillingAccountInner;
import java.io.IOException;
import java.util.List;

/**
 * A container for a list of resources.
 */
@Immutable
public final class BillingAccountListResult implements JsonSerializable<BillingAccountListResult> {
    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /*
     * The list of resources.
     */
    private List<BillingAccountInner> value;

    /**
     * Creates an instance of BillingAccountListResult class.
     */
    public BillingAccountListResult() {
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
    public List<BillingAccountInner> value() {
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
     * Reads an instance of BillingAccountListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingAccountListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BillingAccountListResult.
     */
    public static BillingAccountListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingAccountListResult deserializedBillingAccountListResult = new BillingAccountListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedBillingAccountListResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<BillingAccountInner> value
                        = reader.readArray(reader1 -> BillingAccountInner.fromJson(reader1));
                    deserializedBillingAccountListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingAccountListResult;
        });
    }
}
