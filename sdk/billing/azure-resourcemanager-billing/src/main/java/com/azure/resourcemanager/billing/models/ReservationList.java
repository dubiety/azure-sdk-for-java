// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.fluent.models.ReservationInner;
import java.io.IOException;
import java.util.List;

/**
 * List of `Reservations.
 */
@Fluent
public final class ReservationList implements JsonSerializable<ReservationList> {
    /*
     * The value property.
     */
    private List<ReservationInner> value;

    /*
     * Url to get the next page of reservations.
     */
    private String nextLink;

    /**
     * Creates an instance of ReservationList class.
     */
    public ReservationList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<ReservationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the ReservationList object itself.
     */
    public ReservationList withValue(List<ReservationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to get the next page of reservations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to get the next page of reservations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ReservationList object itself.
     */
    public ReservationList withNextLink(String nextLink) {
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
     * Reads an instance of ReservationList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReservationList.
     */
    public static ReservationList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationList deserializedReservationList = new ReservationList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ReservationInner> value = reader.readArray(reader1 -> ReservationInner.fromJson(reader1));
                    deserializedReservationList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedReservationList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationList;
        });
    }
}
