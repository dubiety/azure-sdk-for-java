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
 * Job execution constraints.
 */
@Fluent
public final class NlpVerticalLimitSettings implements JsonSerializable<NlpVerticalLimitSettings> {
    /*
     * AutoML job timeout.
     */
    private Duration timeout;

    /*
     * Number of AutoML iterations.
     */
    private Integer maxTrials;

    /*
     * Maximum Concurrent AutoML iterations.
     */
    private Integer maxConcurrentTrials;

    /**
     * Creates an instance of NlpVerticalLimitSettings class.
     */
    public NlpVerticalLimitSettings() {
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
     * @return the NlpVerticalLimitSettings object itself.
     */
    public NlpVerticalLimitSettings withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the maxTrials property: Number of AutoML iterations.
     * 
     * @return the maxTrials value.
     */
    public Integer maxTrials() {
        return this.maxTrials;
    }

    /**
     * Set the maxTrials property: Number of AutoML iterations.
     * 
     * @param maxTrials the maxTrials value to set.
     * @return the NlpVerticalLimitSettings object itself.
     */
    public NlpVerticalLimitSettings withMaxTrials(Integer maxTrials) {
        this.maxTrials = maxTrials;
        return this;
    }

    /**
     * Get the maxConcurrentTrials property: Maximum Concurrent AutoML iterations.
     * 
     * @return the maxConcurrentTrials value.
     */
    public Integer maxConcurrentTrials() {
        return this.maxConcurrentTrials;
    }

    /**
     * Set the maxConcurrentTrials property: Maximum Concurrent AutoML iterations.
     * 
     * @param maxConcurrentTrials the maxConcurrentTrials value to set.
     * @return the NlpVerticalLimitSettings object itself.
     */
    public NlpVerticalLimitSettings withMaxConcurrentTrials(Integer maxConcurrentTrials) {
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
        jsonWriter.writeStringField("timeout", CoreUtils.durationToStringWithDays(this.timeout));
        jsonWriter.writeNumberField("maxTrials", this.maxTrials);
        jsonWriter.writeNumberField("maxConcurrentTrials", this.maxConcurrentTrials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NlpVerticalLimitSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NlpVerticalLimitSettings if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NlpVerticalLimitSettings.
     */
    public static NlpVerticalLimitSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NlpVerticalLimitSettings deserializedNlpVerticalLimitSettings = new NlpVerticalLimitSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeout".equals(fieldName)) {
                    deserializedNlpVerticalLimitSettings.timeout
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("maxTrials".equals(fieldName)) {
                    deserializedNlpVerticalLimitSettings.maxTrials = reader.getNullable(JsonReader::getInt);
                } else if ("maxConcurrentTrials".equals(fieldName)) {
                    deserializedNlpVerticalLimitSettings.maxConcurrentTrials = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNlpVerticalLimitSettings;
        });
    }
}
