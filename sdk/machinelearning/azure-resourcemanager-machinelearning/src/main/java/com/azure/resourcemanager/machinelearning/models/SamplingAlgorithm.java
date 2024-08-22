// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Sampling Algorithm used to generate hyperparameter values, along with properties to
 * configure the algorithm.
 */
@Immutable
public class SamplingAlgorithm implements JsonSerializable<SamplingAlgorithm> {
    /*
     * [Required] The algorithm used for generating hyperparameter values, along with configuration properties
     */
    private SamplingAlgorithmType samplingAlgorithmType = SamplingAlgorithmType.fromString("SamplingAlgorithm");

    /**
     * Creates an instance of SamplingAlgorithm class.
     */
    public SamplingAlgorithm() {
    }

    /**
     * Get the samplingAlgorithmType property: [Required] The algorithm used for generating hyperparameter values, along
     * with configuration properties.
     * 
     * @return the samplingAlgorithmType value.
     */
    public SamplingAlgorithmType samplingAlgorithmType() {
        return this.samplingAlgorithmType;
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
        jsonWriter.writeStringField("samplingAlgorithmType",
            this.samplingAlgorithmType == null ? null : this.samplingAlgorithmType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SamplingAlgorithm from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SamplingAlgorithm if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SamplingAlgorithm.
     */
    public static SamplingAlgorithm fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("samplingAlgorithmType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Bayesian".equals(discriminatorValue)) {
                    return BayesianSamplingAlgorithm.fromJson(readerToUse.reset());
                } else if ("Grid".equals(discriminatorValue)) {
                    return GridSamplingAlgorithm.fromJson(readerToUse.reset());
                } else if ("Random".equals(discriminatorValue)) {
                    return RandomSamplingAlgorithm.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static SamplingAlgorithm fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SamplingAlgorithm deserializedSamplingAlgorithm = new SamplingAlgorithm();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("samplingAlgorithmType".equals(fieldName)) {
                    deserializedSamplingAlgorithm.samplingAlgorithmType
                        = SamplingAlgorithmType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSamplingAlgorithm;
        });
    }
}
