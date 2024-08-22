// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AutoSeasonality model.
 */
@Immutable
public final class AutoSeasonality extends Seasonality {
    /*
     * [Required] Seasonality mode.
     */
    private SeasonalityMode mode = SeasonalityMode.AUTO;

    /**
     * Creates an instance of AutoSeasonality class.
     */
    public AutoSeasonality() {
    }

    /**
     * Get the mode property: [Required] Seasonality mode.
     * 
     * @return the mode value.
     */
    @Override
    public SeasonalityMode mode() {
        return this.mode;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoSeasonality from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoSeasonality if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutoSeasonality.
     */
    public static AutoSeasonality fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoSeasonality deserializedAutoSeasonality = new AutoSeasonality();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mode".equals(fieldName)) {
                    deserializedAutoSeasonality.mode = SeasonalityMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoSeasonality;
        });
    }
}
