// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Limit settings for the AutoML job.
 */
@Fluent
public final class ImageLimitSettings implements JsonSerializable<ImageLimitSettings> {
    /*
     * Maximum number of AutoML iterations.
     */
    private Integer maxTrials;

    /*
     * AutoML job timeout.
     */
    private Duration timeout;

    /*
     * Maximum number of concurrent AutoML iterations.
     */
    private Integer maxConcurrentTrials;

    /**
     * Creates an instance of ImageLimitSettings class.
     */
    public ImageLimitSettings() {
    }

    /**
     * Get the maxTrials property: Maximum number of AutoML iterations.
     * 
     * @return the maxTrials value.
     */
    public Integer maxTrials() {
        return this.maxTrials;
    }

    /**
     * Set the maxTrials property: Maximum number of AutoML iterations.
     * 
     * @param maxTrials the maxTrials value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withMaxTrials(Integer maxTrials) {
        this.maxTrials = maxTrials;
        return this;
    }

    /**
     * Get the timeout property: AutoML job timeout.
     * 
     * @return the timeout value.
     */
    public Duration timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: AutoML job timeout.
     * 
     * @param timeout the timeout value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the maxConcurrentTrials property: Maximum number of concurrent AutoML iterations.
     * 
     * @return the maxConcurrentTrials value.
     */
    public Integer maxConcurrentTrials() {
        return this.maxConcurrentTrials;
    }

    /**
     * Set the maxConcurrentTrials property: Maximum number of concurrent AutoML iterations.
     * 
     * @param maxConcurrentTrials the maxConcurrentTrials value to set.
     * @return the ImageLimitSettings object itself.
     */
    public ImageLimitSettings withMaxConcurrentTrials(Integer maxConcurrentTrials) {
        this.maxConcurrentTrials = maxConcurrentTrials;
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
        jsonWriter.writeNumberField("maxTrials", this.maxTrials);
        jsonWriter.writeStringField("timeout", CoreUtils.durationToStringWithDays(this.timeout));
        jsonWriter.writeNumberField("maxConcurrentTrials", this.maxConcurrentTrials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageLimitSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageLimitSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageLimitSettings.
     */
    public static ImageLimitSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageLimitSettings deserializedImageLimitSettings = new ImageLimitSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxTrials".equals(fieldName)) {
                    deserializedImageLimitSettings.maxTrials = reader.getNullable(JsonReader::getInt);
                } else if ("timeout".equals(fieldName)) {
                    deserializedImageLimitSettings.timeout
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("maxConcurrentTrials".equals(fieldName)) {
                    deserializedImageLimitSettings.maxConcurrentTrials = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageLimitSettings;
        });
    }
}
