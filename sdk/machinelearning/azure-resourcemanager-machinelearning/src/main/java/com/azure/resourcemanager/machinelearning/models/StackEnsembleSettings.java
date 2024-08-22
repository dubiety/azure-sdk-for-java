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
 * Advances setting to customize StackEnsemble run.
 */
@Fluent
public final class StackEnsembleSettings implements JsonSerializable<StackEnsembleSettings> {
    /*
     * The meta-learner is a model trained on the output of the individual heterogeneous models.
     */
    private StackMetaLearnerType stackMetaLearnerType;

    /*
     * Specifies the proportion of the training set (when choosing train and validation type of training) to be reserved
     * for training the meta-learner. Default value is 0.2.
     */
    private Double stackMetaLearnerTrainPercentage;

    /*
     * Optional parameters to pass to the initializer of the meta-learner.
     */
    private Object stackMetaLearnerKWargs;

    /**
     * Creates an instance of StackEnsembleSettings class.
     */
    public StackEnsembleSettings() {
    }

    /**
     * Get the stackMetaLearnerType property: The meta-learner is a model trained on the output of the individual
     * heterogeneous models.
     * 
     * @return the stackMetaLearnerType value.
     */
    public StackMetaLearnerType stackMetaLearnerType() {
        return this.stackMetaLearnerType;
    }

    /**
     * Set the stackMetaLearnerType property: The meta-learner is a model trained on the output of the individual
     * heterogeneous models.
     * 
     * @param stackMetaLearnerType the stackMetaLearnerType value to set.
     * @return the StackEnsembleSettings object itself.
     */
    public StackEnsembleSettings withStackMetaLearnerType(StackMetaLearnerType stackMetaLearnerType) {
        this.stackMetaLearnerType = stackMetaLearnerType;
        return this;
    }

    /**
     * Get the stackMetaLearnerTrainPercentage property: Specifies the proportion of the training set (when choosing
     * train and validation type of training) to be reserved for training the meta-learner. Default value is 0.2.
     * 
     * @return the stackMetaLearnerTrainPercentage value.
     */
    public Double stackMetaLearnerTrainPercentage() {
        return this.stackMetaLearnerTrainPercentage;
    }

    /**
     * Set the stackMetaLearnerTrainPercentage property: Specifies the proportion of the training set (when choosing
     * train and validation type of training) to be reserved for training the meta-learner. Default value is 0.2.
     * 
     * @param stackMetaLearnerTrainPercentage the stackMetaLearnerTrainPercentage value to set.
     * @return the StackEnsembleSettings object itself.
     */
    public StackEnsembleSettings withStackMetaLearnerTrainPercentage(Double stackMetaLearnerTrainPercentage) {
        this.stackMetaLearnerTrainPercentage = stackMetaLearnerTrainPercentage;
        return this;
    }

    /**
     * Get the stackMetaLearnerKWargs property: Optional parameters to pass to the initializer of the meta-learner.
     * 
     * @return the stackMetaLearnerKWargs value.
     */
    public Object stackMetaLearnerKWargs() {
        return this.stackMetaLearnerKWargs;
    }

    /**
     * Set the stackMetaLearnerKWargs property: Optional parameters to pass to the initializer of the meta-learner.
     * 
     * @param stackMetaLearnerKWargs the stackMetaLearnerKWargs value to set.
     * @return the StackEnsembleSettings object itself.
     */
    public StackEnsembleSettings withStackMetaLearnerKWargs(Object stackMetaLearnerKWargs) {
        this.stackMetaLearnerKWargs = stackMetaLearnerKWargs;
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
        jsonWriter.writeStringField("stackMetaLearnerType",
            this.stackMetaLearnerType == null ? null : this.stackMetaLearnerType.toString());
        jsonWriter.writeNumberField("stackMetaLearnerTrainPercentage", this.stackMetaLearnerTrainPercentage);
        jsonWriter.writeUntypedField("stackMetaLearnerKWargs", this.stackMetaLearnerKWargs);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StackEnsembleSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StackEnsembleSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StackEnsembleSettings.
     */
    public static StackEnsembleSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StackEnsembleSettings deserializedStackEnsembleSettings = new StackEnsembleSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("stackMetaLearnerType".equals(fieldName)) {
                    deserializedStackEnsembleSettings.stackMetaLearnerType
                        = StackMetaLearnerType.fromString(reader.getString());
                } else if ("stackMetaLearnerTrainPercentage".equals(fieldName)) {
                    deserializedStackEnsembleSettings.stackMetaLearnerTrainPercentage
                        = reader.getNullable(JsonReader::getDouble);
                } else if ("stackMetaLearnerKWargs".equals(fieldName)) {
                    deserializedStackEnsembleSettings.stackMetaLearnerKWargs = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStackEnsembleSettings;
        });
    }
}
