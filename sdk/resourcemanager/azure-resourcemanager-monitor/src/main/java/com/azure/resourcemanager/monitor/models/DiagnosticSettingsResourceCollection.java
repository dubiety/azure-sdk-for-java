// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Represents a collection of alert rule resources.
 */
@Fluent
public final class DiagnosticSettingsResourceCollection
    implements JsonSerializable<DiagnosticSettingsResourceCollection> {
    /*
     * The collection of diagnostic settings resources;.
     */
    private List<DiagnosticSettingsResourceInner> value;

    /**
     * Creates an instance of DiagnosticSettingsResourceCollection class.
     */
    public DiagnosticSettingsResourceCollection() {
    }

    /**
     * Get the value property: The collection of diagnostic settings resources;.
     * 
     * @return the value value.
     */
    public List<DiagnosticSettingsResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of diagnostic settings resources;.
     * 
     * @param value the value value to set.
     * @return the DiagnosticSettingsResourceCollection object itself.
     */
    public DiagnosticSettingsResourceCollection withValue(List<DiagnosticSettingsResourceInner> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticSettingsResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticSettingsResourceCollection if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticSettingsResourceCollection.
     */
    public static DiagnosticSettingsResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticSettingsResourceCollection deserializedDiagnosticSettingsResourceCollection
                = new DiagnosticSettingsResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DiagnosticSettingsResourceInner> value
                        = reader.readArray(reader1 -> DiagnosticSettingsResourceInner.fromJson(reader1));
                    deserializedDiagnosticSettingsResourceCollection.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticSettingsResourceCollection;
        });
    }
}
