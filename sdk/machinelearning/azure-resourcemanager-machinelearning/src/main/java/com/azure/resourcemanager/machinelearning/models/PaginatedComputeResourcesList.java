// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Paginated list of Machine Learning compute objects wrapped in ARM resource envelope.
 */
@Fluent
public final class PaginatedComputeResourcesList implements JsonSerializable<PaginatedComputeResourcesList> {
    /*
     * An array of Machine Learning compute objects wrapped in ARM resource envelope.
     */
    private List<ComputeResourceInner> value;

    /*
     * A continuation link (absolute URI) to the next page of results in the list.
     */
    private String nextLink;

    /**
     * Creates an instance of PaginatedComputeResourcesList class.
     */
    public PaginatedComputeResourcesList() {
    }

    /**
     * Get the value property: An array of Machine Learning compute objects wrapped in ARM resource envelope.
     * 
     * @return the value value.
     */
    public List<ComputeResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of Machine Learning compute objects wrapped in ARM resource envelope.
     * 
     * @param value the value value to set.
     * @return the PaginatedComputeResourcesList object itself.
     */
    public PaginatedComputeResourcesList withValue(List<ComputeResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A continuation link (absolute URI) to the next page of results in the list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A continuation link (absolute URI) to the next page of results in the list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PaginatedComputeResourcesList object itself.
     */
    public PaginatedComputeResourcesList withNextLink(String nextLink) {
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PaginatedComputeResourcesList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PaginatedComputeResourcesList if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PaginatedComputeResourcesList.
     */
    public static PaginatedComputeResourcesList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PaginatedComputeResourcesList deserializedPaginatedComputeResourcesList
                = new PaginatedComputeResourcesList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ComputeResourceInner> value
                        = reader.readArray(reader1 -> ComputeResourceInner.fromJson(reader1));
                    deserializedPaginatedComputeResourcesList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPaginatedComputeResourcesList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPaginatedComputeResourcesList;
        });
    }
}
