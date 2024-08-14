// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.AfdOriginInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list origins. It contains a list of origin objects and a URL link to get the next set of
 * results.
 */
@Fluent
public final class AfdOriginListResult implements JsonSerializable<AfdOriginListResult> {
    /*
     * List of Azure Front Door origins within an Azure Front Door endpoint
     */
    private List<AfdOriginInner> value;

    /*
     * URL to get the next set of origin objects if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of AfdOriginListResult class.
     */
    public AfdOriginListResult() {
    }

    /**
     * Get the value property: List of Azure Front Door origins within an Azure Front Door endpoint.
     * 
     * @return the value value.
     */
    public List<AfdOriginInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of origin objects if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of origin objects if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AfdOriginListResult object itself.
     */
    public AfdOriginListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdOriginListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdOriginListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdOriginListResult.
     */
    public static AfdOriginListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdOriginListResult deserializedAfdOriginListResult = new AfdOriginListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AfdOriginInner> value = reader.readArray(reader1 -> AfdOriginInner.fromJson(reader1));
                    deserializedAfdOriginListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAfdOriginListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdOriginListResult;
        });
    }
}
