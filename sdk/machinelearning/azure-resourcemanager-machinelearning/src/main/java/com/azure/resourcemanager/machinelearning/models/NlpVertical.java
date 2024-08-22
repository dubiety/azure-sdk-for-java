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
 * Abstract class for NLP related AutoML tasks.
 * NLP - Natural Language Processing.
 */
@Fluent
public class NlpVertical implements JsonSerializable<NlpVertical> {
    /*
     * Execution constraints for AutoMLJob.
     */
    private NlpVerticalLimitSettings limitSettings;

    /*
     * Featurization inputs needed for AutoML job.
     */
    private NlpVerticalFeaturizationSettings featurizationSettings;

    /*
     * Validation data inputs.
     */
    private MLTableJobInput validationData;

    /**
     * Creates an instance of NlpVertical class.
     */
    public NlpVertical() {
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     * 
     * @return the limitSettings value.
     */
    public NlpVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     * 
     * @param limitSettings the limitSettings value to set.
     * @return the NlpVertical object itself.
     */
    public NlpVertical withLimitSettings(NlpVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     * 
     * @return the featurizationSettings value.
     */
    public NlpVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     * 
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the NlpVertical object itself.
     */
    public NlpVertical withFeaturizationSettings(NlpVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Get the validationData property: Validation data inputs.
     * 
     * @return the validationData value.
     */
    public MLTableJobInput validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Validation data inputs.
     * 
     * @param validationData the validationData value to set.
     * @return the NlpVertical object itself.
     */
    public NlpVertical withValidationData(MLTableJobInput validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (limitSettings() != null) {
            limitSettings().validate();
        }
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
        if (validationData() != null) {
            validationData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("limitSettings", this.limitSettings);
        jsonWriter.writeJsonField("featurizationSettings", this.featurizationSettings);
        jsonWriter.writeJsonField("validationData", this.validationData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NlpVertical from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NlpVertical if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NlpVertical.
     */
    public static NlpVertical fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NlpVertical deserializedNlpVertical = new NlpVertical();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("limitSettings".equals(fieldName)) {
                    deserializedNlpVertical.limitSettings = NlpVerticalLimitSettings.fromJson(reader);
                } else if ("featurizationSettings".equals(fieldName)) {
                    deserializedNlpVertical.featurizationSettings = NlpVerticalFeaturizationSettings.fromJson(reader);
                } else if ("validationData".equals(fieldName)) {
                    deserializedNlpVertical.validationData = MLTableJobInput.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNlpVertical;
        });
    }
}
