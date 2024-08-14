// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * The parameters for enabling predictive autoscale.
 */
@Fluent
public final class PredictiveAutoscalePolicy implements JsonSerializable<PredictiveAutoscalePolicy> {
    /*
     * the predictive autoscale mode
     */
    private PredictiveAutoscalePolicyScaleMode scaleMode;

    /*
     * the amount of time to specify by which instances are launched in advance. It must be between 1 minute and 60
     * minutes in ISO 8601 format.
     */
    private Duration scaleLookAheadTime;

    /**
     * Creates an instance of PredictiveAutoscalePolicy class.
     */
    public PredictiveAutoscalePolicy() {
    }

    /**
     * Get the scaleMode property: the predictive autoscale mode.
     * 
     * @return the scaleMode value.
     */
    public PredictiveAutoscalePolicyScaleMode scaleMode() {
        return this.scaleMode;
    }

    /**
     * Set the scaleMode property: the predictive autoscale mode.
     * 
     * @param scaleMode the scaleMode value to set.
     * @return the PredictiveAutoscalePolicy object itself.
     */
    public PredictiveAutoscalePolicy withScaleMode(PredictiveAutoscalePolicyScaleMode scaleMode) {
        this.scaleMode = scaleMode;
        return this;
    }

    /**
     * Get the scaleLookAheadTime property: the amount of time to specify by which instances are launched in advance. It
     * must be between 1 minute and 60 minutes in ISO 8601 format.
     * 
     * @return the scaleLookAheadTime value.
     */
    public Duration scaleLookAheadTime() {
        return this.scaleLookAheadTime;
    }

    /**
     * Set the scaleLookAheadTime property: the amount of time to specify by which instances are launched in advance. It
     * must be between 1 minute and 60 minutes in ISO 8601 format.
     * 
     * @param scaleLookAheadTime the scaleLookAheadTime value to set.
     * @return the PredictiveAutoscalePolicy object itself.
     */
    public PredictiveAutoscalePolicy withScaleLookAheadTime(Duration scaleLookAheadTime) {
        this.scaleLookAheadTime = scaleLookAheadTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scaleMode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property scaleMode in model PredictiveAutoscalePolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PredictiveAutoscalePolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scaleMode", this.scaleMode == null ? null : this.scaleMode.toString());
        jsonWriter.writeStringField("scaleLookAheadTime", CoreUtils.durationToStringWithDays(this.scaleLookAheadTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PredictiveAutoscalePolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PredictiveAutoscalePolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PredictiveAutoscalePolicy.
     */
    public static PredictiveAutoscalePolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PredictiveAutoscalePolicy deserializedPredictiveAutoscalePolicy = new PredictiveAutoscalePolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scaleMode".equals(fieldName)) {
                    deserializedPredictiveAutoscalePolicy.scaleMode
                        = PredictiveAutoscalePolicyScaleMode.fromString(reader.getString());
                } else if ("scaleLookAheadTime".equals(fieldName)) {
                    deserializedPredictiveAutoscalePolicy.scaleLookAheadTime
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPredictiveAutoscalePolicy;
        });
    }
}
