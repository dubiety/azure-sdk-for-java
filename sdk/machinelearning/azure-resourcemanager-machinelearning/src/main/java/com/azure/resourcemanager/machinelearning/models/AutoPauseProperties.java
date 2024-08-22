// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Auto pause properties.
 */
@Fluent
public final class AutoPauseProperties implements JsonSerializable<AutoPauseProperties> {
    /*
     * The delayInMinutes property.
     */
    private Integer delayInMinutes;

    /*
     * The enabled property.
     */
    private Boolean enabled;

    /**
     * Creates an instance of AutoPauseProperties class.
     */
    public AutoPauseProperties() {
    }

    /**
     * Get the delayInMinutes property: The delayInMinutes property.
     * 
     * @return the delayInMinutes value.
     */
    public Integer delayInMinutes() {
        return this.delayInMinutes;
    }

    /**
     * Set the delayInMinutes property: The delayInMinutes property.
     * 
     * @param delayInMinutes the delayInMinutes value to set.
     * @return the AutoPauseProperties object itself.
     */
    public AutoPauseProperties withDelayInMinutes(Integer delayInMinutes) {
        this.delayInMinutes = delayInMinutes;
        return this;
    }

    /**
     * Get the enabled property: The enabled property.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     * 
     * @param enabled the enabled value to set.
     * @return the AutoPauseProperties object itself.
     */
    public AutoPauseProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        jsonWriter.writeNumberField("delayInMinutes", this.delayInMinutes);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoPauseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoPauseProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutoPauseProperties.
     */
    public static AutoPauseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoPauseProperties deserializedAutoPauseProperties = new AutoPauseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("delayInMinutes".equals(fieldName)) {
                    deserializedAutoPauseProperties.delayInMinutes = reader.getNullable(JsonReader::getInt);
                } else if ("enabled".equals(fieldName)) {
                    deserializedAutoPauseProperties.enabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoPauseProperties;
        });
    }
}
