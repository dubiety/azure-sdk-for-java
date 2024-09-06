// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of reservation split.
 */
@Fluent
public final class ReservationSplitProperties implements JsonSerializable<ReservationSplitProperties> {
    /*
     * List of destination resource id that are created due to split. Format of the resource id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}
     */
    private List<String> splitDestinations;

    /*
     * Resource id of the reservation from which this is split. Format of the resource id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}
     */
    private String splitSource;

    /**
     * Creates an instance of ReservationSplitProperties class.
     */
    public ReservationSplitProperties() {
    }

    /**
     * Get the splitDestinations property: List of destination resource id that are created due to split. Format of the
     * resource id is /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @return the splitDestinations value.
     */
    public List<String> splitDestinations() {
        return this.splitDestinations;
    }

    /**
     * Set the splitDestinations property: List of destination resource id that are created due to split. Format of the
     * resource id is /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @param splitDestinations the splitDestinations value to set.
     * @return the ReservationSplitProperties object itself.
     */
    public ReservationSplitProperties withSplitDestinations(List<String> splitDestinations) {
        this.splitDestinations = splitDestinations;
        return this;
    }

    /**
     * Get the splitSource property: Resource id of the reservation from which this is split. Format of the resource id
     * is /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @return the splitSource value.
     */
    public String splitSource() {
        return this.splitSource;
    }

    /**
     * Set the splitSource property: Resource id of the reservation from which this is split. Format of the resource id
     * is /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @param splitSource the splitSource value to set.
     * @return the ReservationSplitProperties object itself.
     */
    public ReservationSplitProperties withSplitSource(String splitSource) {
        this.splitSource = splitSource;
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
        jsonWriter.writeArrayField("splitDestinations", this.splitDestinations,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("splitSource", this.splitSource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationSplitProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationSplitProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReservationSplitProperties.
     */
    public static ReservationSplitProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationSplitProperties deserializedReservationSplitProperties = new ReservationSplitProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("splitDestinations".equals(fieldName)) {
                    List<String> splitDestinations = reader.readArray(reader1 -> reader1.getString());
                    deserializedReservationSplitProperties.splitDestinations = splitDestinations;
                } else if ("splitSource".equals(fieldName)) {
                    deserializedReservationSplitProperties.splitSource = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationSplitProperties;
        });
    }
}
