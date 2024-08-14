// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.AfdDomainInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list domains. It contains a list of domain objects and a URL link to get the next set of
 * results.
 */
@Fluent
public final class AfdDomainListResult implements JsonSerializable<AfdDomainListResult> {
    /*
     * List of AzureFrontDoor domains within a profile.
     */
    private List<AfdDomainInner> value;

    /*
     * URL to get the next set of domain objects if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of AfdDomainListResult class.
     */
    public AfdDomainListResult() {
    }

    /**
     * Get the value property: List of AzureFrontDoor domains within a profile.
     * 
     * @return the value value.
     */
    public List<AfdDomainInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of domain objects if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of domain objects if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AfdDomainListResult object itself.
     */
    public AfdDomainListResult withNextLink(String nextLink) {
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
     * Reads an instance of AfdDomainListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdDomainListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdDomainListResult.
     */
    public static AfdDomainListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdDomainListResult deserializedAfdDomainListResult = new AfdDomainListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AfdDomainInner> value = reader.readArray(reader1 -> AfdDomainInner.fromJson(reader1));
                    deserializedAfdDomainListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAfdDomainListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdDomainListResult;
        });
    }
}
