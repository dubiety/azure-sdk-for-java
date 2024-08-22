// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Image Instance Segmentation. Instance segmentation is used to identify objects in an image at the pixel level,
 * drawing a polygon around each object in the image.
 */
@Fluent
public final class ImageInstanceSegmentation extends AutoMLVertical {
    /*
     * [Required] Task type for AutoMLJob.
     */
    private TaskType taskType = TaskType.IMAGE_INSTANCE_SEGMENTATION;

    /*
     * Primary metric to optimize for this task.
     */
    private InstanceSegmentationPrimaryMetrics primaryMetric;

    /*
     * Settings used for training the model.
     */
    private ImageModelSettingsObjectDetection modelSettings;

    /*
     * Search space for sampling different combinations of models and their hyperparameters.
     */
    private List<ImageModelDistributionSettingsObjectDetection> searchSpace;

    /*
     * [Required] Limit settings for the AutoML job.
     */
    private ImageLimitSettings limitSettings;

    /*
     * Model sweeping and hyperparameter sweeping related settings.
     */
    private ImageSweepSettings sweepSettings;

    /*
     * Validation data inputs.
     */
    private MLTableJobInput validationData;

    /*
     * The fraction of training dataset that needs to be set aside for validation purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     */
    private Double validationDataSize;

    /**
     * Creates an instance of ImageInstanceSegmentation class.
     */
    public ImageInstanceSegmentation() {
    }

    /**
     * Get the taskType property: [Required] Task type for AutoMLJob.
     * 
     * @return the taskType value.
     */
    @Override
    public TaskType taskType() {
        return this.taskType;
    }

    /**
     * Get the primaryMetric property: Primary metric to optimize for this task.
     * 
     * @return the primaryMetric value.
     */
    public InstanceSegmentationPrimaryMetrics primaryMetric() {
        return this.primaryMetric;
    }

    /**
     * Set the primaryMetric property: Primary metric to optimize for this task.
     * 
     * @param primaryMetric the primaryMetric value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withPrimaryMetric(InstanceSegmentationPrimaryMetrics primaryMetric) {
        this.primaryMetric = primaryMetric;
        return this;
    }

    /**
     * Get the modelSettings property: Settings used for training the model.
     * 
     * @return the modelSettings value.
     */
    public ImageModelSettingsObjectDetection modelSettings() {
        return this.modelSettings;
    }

    /**
     * Set the modelSettings property: Settings used for training the model.
     * 
     * @param modelSettings the modelSettings value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withModelSettings(ImageModelSettingsObjectDetection modelSettings) {
        this.modelSettings = modelSettings;
        return this;
    }

    /**
     * Get the searchSpace property: Search space for sampling different combinations of models and their
     * hyperparameters.
     * 
     * @return the searchSpace value.
     */
    public List<ImageModelDistributionSettingsObjectDetection> searchSpace() {
        return this.searchSpace;
    }

    /**
     * Set the searchSpace property: Search space for sampling different combinations of models and their
     * hyperparameters.
     * 
     * @param searchSpace the searchSpace value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withSearchSpace(List<ImageModelDistributionSettingsObjectDetection> searchSpace) {
        this.searchSpace = searchSpace;
        return this;
    }

    /**
     * Get the limitSettings property: [Required] Limit settings for the AutoML job.
     * 
     * @return the limitSettings value.
     */
    public ImageLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: [Required] Limit settings for the AutoML job.
     * 
     * @param limitSettings the limitSettings value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withLimitSettings(ImageLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the sweepSettings property: Model sweeping and hyperparameter sweeping related settings.
     * 
     * @return the sweepSettings value.
     */
    public ImageSweepSettings sweepSettings() {
        return this.sweepSettings;
    }

    /**
     * Set the sweepSettings property: Model sweeping and hyperparameter sweeping related settings.
     * 
     * @param sweepSettings the sweepSettings value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withSweepSettings(ImageSweepSettings sweepSettings) {
        this.sweepSettings = sweepSettings;
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
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withValidationData(MLTableJobInput validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @return the validationDataSize value.
     */
    public Double validationDataSize() {
        return this.validationDataSize;
    }

    /**
     * Set the validationDataSize property: The fraction of training dataset that needs to be set aside for validation
     * purpose.
     * Values between (0.0 , 1.0)
     * Applied when validation dataset is not provided.
     * 
     * @param validationDataSize the validationDataSize value to set.
     * @return the ImageInstanceSegmentation object itself.
     */
    public ImageInstanceSegmentation withValidationDataSize(Double validationDataSize) {
        this.validationDataSize = validationDataSize;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageInstanceSegmentation withLogVerbosity(LogVerbosity logVerbosity) {
        super.withLogVerbosity(logVerbosity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageInstanceSegmentation withTrainingData(MLTableJobInput trainingData) {
        super.withTrainingData(trainingData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageInstanceSegmentation withTargetColumnName(String targetColumnName) {
        super.withTargetColumnName(targetColumnName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (modelSettings() != null) {
            modelSettings().validate();
        }
        if (searchSpace() != null) {
            searchSpace().forEach(e -> e.validate());
        }
        if (limitSettings() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property limitSettings in model ImageInstanceSegmentation"));
        } else {
            limitSettings().validate();
        }
        if (sweepSettings() != null) {
            sweepSettings().validate();
        }
        if (validationData() != null) {
            validationData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageInstanceSegmentation.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("trainingData", trainingData());
        jsonWriter.writeStringField("logVerbosity", logVerbosity() == null ? null : logVerbosity().toString());
        jsonWriter.writeStringField("targetColumnName", targetColumnName());
        jsonWriter.writeJsonField("limitSettings", this.limitSettings);
        jsonWriter.writeStringField("taskType", this.taskType == null ? null : this.taskType.toString());
        jsonWriter.writeStringField("primaryMetric", this.primaryMetric == null ? null : this.primaryMetric.toString());
        jsonWriter.writeJsonField("modelSettings", this.modelSettings);
        jsonWriter.writeArrayField("searchSpace", this.searchSpace, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("sweepSettings", this.sweepSettings);
        jsonWriter.writeJsonField("validationData", this.validationData);
        jsonWriter.writeNumberField("validationDataSize", this.validationDataSize);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageInstanceSegmentation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageInstanceSegmentation if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImageInstanceSegmentation.
     */
    public static ImageInstanceSegmentation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageInstanceSegmentation deserializedImageInstanceSegmentation = new ImageInstanceSegmentation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trainingData".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.withTrainingData(MLTableJobInput.fromJson(reader));
                } else if ("logVerbosity".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.withLogVerbosity(LogVerbosity.fromString(reader.getString()));
                } else if ("targetColumnName".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.withTargetColumnName(reader.getString());
                } else if ("limitSettings".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.limitSettings = ImageLimitSettings.fromJson(reader);
                } else if ("taskType".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.taskType = TaskType.fromString(reader.getString());
                } else if ("primaryMetric".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.primaryMetric
                        = InstanceSegmentationPrimaryMetrics.fromString(reader.getString());
                } else if ("modelSettings".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.modelSettings
                        = ImageModelSettingsObjectDetection.fromJson(reader);
                } else if ("searchSpace".equals(fieldName)) {
                    List<ImageModelDistributionSettingsObjectDetection> searchSpace
                        = reader.readArray(reader1 -> ImageModelDistributionSettingsObjectDetection.fromJson(reader1));
                    deserializedImageInstanceSegmentation.searchSpace = searchSpace;
                } else if ("sweepSettings".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.sweepSettings = ImageSweepSettings.fromJson(reader);
                } else if ("validationData".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.validationData = MLTableJobInput.fromJson(reader);
                } else if ("validationDataSize".equals(fieldName)) {
                    deserializedImageInstanceSegmentation.validationDataSize
                        = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageInstanceSegmentation;
        });
    }
}
