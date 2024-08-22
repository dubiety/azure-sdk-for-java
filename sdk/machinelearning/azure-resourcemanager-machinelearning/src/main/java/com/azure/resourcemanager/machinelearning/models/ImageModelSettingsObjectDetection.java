// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings used for training the model.
 * For more information on the available settings please visit the official documentation:
 * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
 */
@Fluent
public final class ImageModelSettingsObjectDetection extends ImageModelSettings {
    /*
     * Maximum number of detections per image, for all classes. Must be a positive integer.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private Integer boxDetectionsPerImage;

    /*
     * During inference, only return proposals with a classification score greater than
     * BoxScoreThreshold. Must be a float in the range[0, 1].
     */
    private Float boxScoreThreshold;

    /*
     * Image size for train and validation. Must be a positive integer.
     * Note: The training run may get into CUDA OOM if the size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     */
    private Integer imageSize;

    /*
     * Maximum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private Integer maxSize;

    /*
     * Minimum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private Integer minSize;

    /*
     * Model size. Must be 'small', 'medium', 'large', or 'xlarge'.
     * Note: training run may get into CUDA OOM if the model size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     */
    private ModelSize modelSize;

    /*
     * Enable multi-scale image by varying image size by +/- 50%.
     * Note: training run may get into CUDA OOM if no sufficient GPU memory.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     */
    private Boolean multiScale;

    /*
     * IOU threshold used during inference in NMS post processing. Must be a float in the range [0, 1].
     */
    private Float nmsIouThreshold;

    /*
     * The grid size to use for tiling each image. Note: TileGridSize must not be
     * None to enable small object detection logic. A string containing two integers in mxn format.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private String tileGridSize;

    /*
     * Overlap ratio between adjacent tiles in each dimension. Must be float in the range [0, 1).
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private Float tileOverlapRatio;

    /*
     * The IOU threshold to use to perform NMS while merging predictions from tiles and image.
     * Used in validation/ inference. Must be float in the range [0, 1].
     * Note: This settings is not supported for the 'yolov5' algorithm.
     */
    private Float tilePredictionsNmsThreshold;

    /*
     * IOU threshold to use when computing validation metric. Must be float in the range [0, 1].
     */
    private Float validationIouThreshold;

    /*
     * Metric computation method to use for validation metrics.
     */
    private ValidationMetricType validationMetricType;

    /**
     * Creates an instance of ImageModelSettingsObjectDetection class.
     */
    public ImageModelSettingsObjectDetection() {
    }

    /**
     * Get the boxDetectionsPerImage property: Maximum number of detections per image, for all classes. Must be a
     * positive integer.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the boxDetectionsPerImage value.
     */
    public Integer boxDetectionsPerImage() {
        return this.boxDetectionsPerImage;
    }

    /**
     * Set the boxDetectionsPerImage property: Maximum number of detections per image, for all classes. Must be a
     * positive integer.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param boxDetectionsPerImage the boxDetectionsPerImage value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withBoxDetectionsPerImage(Integer boxDetectionsPerImage) {
        this.boxDetectionsPerImage = boxDetectionsPerImage;
        return this;
    }

    /**
     * Get the boxScoreThreshold property: During inference, only return proposals with a classification score greater
     * than
     * BoxScoreThreshold. Must be a float in the range[0, 1].
     * 
     * @return the boxScoreThreshold value.
     */
    public Float boxScoreThreshold() {
        return this.boxScoreThreshold;
    }

    /**
     * Set the boxScoreThreshold property: During inference, only return proposals with a classification score greater
     * than
     * BoxScoreThreshold. Must be a float in the range[0, 1].
     * 
     * @param boxScoreThreshold the boxScoreThreshold value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withBoxScoreThreshold(Float boxScoreThreshold) {
        this.boxScoreThreshold = boxScoreThreshold;
        return this;
    }

    /**
     * Get the imageSize property: Image size for train and validation. Must be a positive integer.
     * Note: The training run may get into CUDA OOM if the size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @return the imageSize value.
     */
    public Integer imageSize() {
        return this.imageSize;
    }

    /**
     * Set the imageSize property: Image size for train and validation. Must be a positive integer.
     * Note: The training run may get into CUDA OOM if the size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @param imageSize the imageSize value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withImageSize(Integer imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * Get the maxSize property: Maximum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the maxSize value.
     */
    public Integer maxSize() {
        return this.maxSize;
    }

    /**
     * Set the maxSize property: Maximum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param maxSize the maxSize value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * Get the minSize property: Minimum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the minSize value.
     */
    public Integer minSize() {
        return this.minSize;
    }

    /**
     * Set the minSize property: Minimum size of the image to be rescaled before feeding it to the backbone.
     * Must be a positive integer. Note: training run may get into CUDA OOM if the size is too big.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param minSize the minSize value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * Get the modelSize property: Model size. Must be 'small', 'medium', 'large', or 'xlarge'.
     * Note: training run may get into CUDA OOM if the model size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @return the modelSize value.
     */
    public ModelSize modelSize() {
        return this.modelSize;
    }

    /**
     * Set the modelSize property: Model size. Must be 'small', 'medium', 'large', or 'xlarge'.
     * Note: training run may get into CUDA OOM if the model size is too big.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @param modelSize the modelSize value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withModelSize(ModelSize modelSize) {
        this.modelSize = modelSize;
        return this;
    }

    /**
     * Get the multiScale property: Enable multi-scale image by varying image size by +/- 50%.
     * Note: training run may get into CUDA OOM if no sufficient GPU memory.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @return the multiScale value.
     */
    public Boolean multiScale() {
        return this.multiScale;
    }

    /**
     * Set the multiScale property: Enable multi-scale image by varying image size by +/- 50%.
     * Note: training run may get into CUDA OOM if no sufficient GPU memory.
     * Note: This settings is only supported for the 'yolov5' algorithm.
     * 
     * @param multiScale the multiScale value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withMultiScale(Boolean multiScale) {
        this.multiScale = multiScale;
        return this;
    }

    /**
     * Get the nmsIouThreshold property: IOU threshold used during inference in NMS post processing. Must be a float in
     * the range [0, 1].
     * 
     * @return the nmsIouThreshold value.
     */
    public Float nmsIouThreshold() {
        return this.nmsIouThreshold;
    }

    /**
     * Set the nmsIouThreshold property: IOU threshold used during inference in NMS post processing. Must be a float in
     * the range [0, 1].
     * 
     * @param nmsIouThreshold the nmsIouThreshold value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withNmsIouThreshold(Float nmsIouThreshold) {
        this.nmsIouThreshold = nmsIouThreshold;
        return this;
    }

    /**
     * Get the tileGridSize property: The grid size to use for tiling each image. Note: TileGridSize must not be
     * None to enable small object detection logic. A string containing two integers in mxn format.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the tileGridSize value.
     */
    public String tileGridSize() {
        return this.tileGridSize;
    }

    /**
     * Set the tileGridSize property: The grid size to use for tiling each image. Note: TileGridSize must not be
     * None to enable small object detection logic. A string containing two integers in mxn format.
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param tileGridSize the tileGridSize value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withTileGridSize(String tileGridSize) {
        this.tileGridSize = tileGridSize;
        return this;
    }

    /**
     * Get the tileOverlapRatio property: Overlap ratio between adjacent tiles in each dimension. Must be float in the
     * range [0, 1).
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the tileOverlapRatio value.
     */
    public Float tileOverlapRatio() {
        return this.tileOverlapRatio;
    }

    /**
     * Set the tileOverlapRatio property: Overlap ratio between adjacent tiles in each dimension. Must be float in the
     * range [0, 1).
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param tileOverlapRatio the tileOverlapRatio value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withTileOverlapRatio(Float tileOverlapRatio) {
        this.tileOverlapRatio = tileOverlapRatio;
        return this;
    }

    /**
     * Get the tilePredictionsNmsThreshold property: The IOU threshold to use to perform NMS while merging predictions
     * from tiles and image.
     * Used in validation/ inference. Must be float in the range [0, 1].
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @return the tilePredictionsNmsThreshold value.
     */
    public Float tilePredictionsNmsThreshold() {
        return this.tilePredictionsNmsThreshold;
    }

    /**
     * Set the tilePredictionsNmsThreshold property: The IOU threshold to use to perform NMS while merging predictions
     * from tiles and image.
     * Used in validation/ inference. Must be float in the range [0, 1].
     * Note: This settings is not supported for the 'yolov5' algorithm.
     * 
     * @param tilePredictionsNmsThreshold the tilePredictionsNmsThreshold value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withTilePredictionsNmsThreshold(Float tilePredictionsNmsThreshold) {
        this.tilePredictionsNmsThreshold = tilePredictionsNmsThreshold;
        return this;
    }

    /**
     * Get the validationIouThreshold property: IOU threshold to use when computing validation metric. Must be float in
     * the range [0, 1].
     * 
     * @return the validationIouThreshold value.
     */
    public Float validationIouThreshold() {
        return this.validationIouThreshold;
    }

    /**
     * Set the validationIouThreshold property: IOU threshold to use when computing validation metric. Must be float in
     * the range [0, 1].
     * 
     * @param validationIouThreshold the validationIouThreshold value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withValidationIouThreshold(Float validationIouThreshold) {
        this.validationIouThreshold = validationIouThreshold;
        return this;
    }

    /**
     * Get the validationMetricType property: Metric computation method to use for validation metrics.
     * 
     * @return the validationMetricType value.
     */
    public ValidationMetricType validationMetricType() {
        return this.validationMetricType;
    }

    /**
     * Set the validationMetricType property: Metric computation method to use for validation metrics.
     * 
     * @param validationMetricType the validationMetricType value to set.
     * @return the ImageModelSettingsObjectDetection object itself.
     */
    public ImageModelSettingsObjectDetection withValidationMetricType(ValidationMetricType validationMetricType) {
        this.validationMetricType = validationMetricType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withAmsGradient(Boolean amsGradient) {
        super.withAmsGradient(amsGradient);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withAdvancedSettings(String advancedSettings) {
        super.withAdvancedSettings(advancedSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withAugmentations(String augmentations) {
        super.withAugmentations(augmentations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withBeta1(Float beta1) {
        super.withBeta1(beta1);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withBeta2(Float beta2) {
        super.withBeta2(beta2);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withCheckpointFrequency(Integer checkpointFrequency) {
        super.withCheckpointFrequency(checkpointFrequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withCheckpointRunId(String checkpointRunId) {
        super.withCheckpointRunId(checkpointRunId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withCheckpointModel(MLFlowModelJobInput checkpointModel) {
        super.withCheckpointModel(checkpointModel);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withDistributed(Boolean distributed) {
        super.withDistributed(distributed);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withEarlyStopping(Boolean earlyStopping) {
        super.withEarlyStopping(earlyStopping);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withEarlyStoppingDelay(Integer earlyStoppingDelay) {
        super.withEarlyStoppingDelay(earlyStoppingDelay);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withEarlyStoppingPatience(Integer earlyStoppingPatience) {
        super.withEarlyStoppingPatience(earlyStoppingPatience);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withEvaluationFrequency(Integer evaluationFrequency) {
        super.withEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withEnableOnnxNormalization(Boolean enableOnnxNormalization) {
        super.withEnableOnnxNormalization(enableOnnxNormalization);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withGradientAccumulationStep(Integer gradientAccumulationStep) {
        super.withGradientAccumulationStep(gradientAccumulationStep);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withLayersToFreeze(Integer layersToFreeze) {
        super.withLayersToFreeze(layersToFreeze);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withLearningRate(Float learningRate) {
        super.withLearningRate(learningRate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withLearningRateScheduler(LearningRateScheduler learningRateScheduler) {
        super.withLearningRateScheduler(learningRateScheduler);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withModelName(String modelName) {
        super.withModelName(modelName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withMomentum(Float momentum) {
        super.withMomentum(momentum);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withNesterov(Boolean nesterov) {
        super.withNesterov(nesterov);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withNumberOfEpochs(Integer numberOfEpochs) {
        super.withNumberOfEpochs(numberOfEpochs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withNumberOfWorkers(Integer numberOfWorkers) {
        super.withNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withOptimizer(StochasticOptimizer optimizer) {
        super.withOptimizer(optimizer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withRandomSeed(Integer randomSeed) {
        super.withRandomSeed(randomSeed);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withStepLRGamma(Float stepLRGamma) {
        super.withStepLRGamma(stepLRGamma);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withStepLRStepSize(Integer stepLRStepSize) {
        super.withStepLRStepSize(stepLRStepSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withTrainingBatchSize(Integer trainingBatchSize) {
        super.withTrainingBatchSize(trainingBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withValidationBatchSize(Integer validationBatchSize) {
        super.withValidationBatchSize(validationBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withWarmupCosineLRCycles(Float warmupCosineLRCycles) {
        super.withWarmupCosineLRCycles(warmupCosineLRCycles);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withWarmupCosineLRWarmupEpochs(Integer warmupCosineLRWarmupEpochs) {
        super.withWarmupCosineLRWarmupEpochs(warmupCosineLRWarmupEpochs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsObjectDetection withWeightDecay(Float weightDecay) {
        super.withWeightDecay(weightDecay);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("amsGradient", amsGradient());
        jsonWriter.writeStringField("advancedSettings", advancedSettings());
        jsonWriter.writeStringField("augmentations", augmentations());
        jsonWriter.writeNumberField("beta1", beta1());
        jsonWriter.writeNumberField("beta2", beta2());
        jsonWriter.writeNumberField("checkpointFrequency", checkpointFrequency());
        jsonWriter.writeStringField("checkpointRunId", checkpointRunId());
        jsonWriter.writeJsonField("checkpointModel", checkpointModel());
        jsonWriter.writeBooleanField("distributed", distributed());
        jsonWriter.writeBooleanField("earlyStopping", earlyStopping());
        jsonWriter.writeNumberField("earlyStoppingDelay", earlyStoppingDelay());
        jsonWriter.writeNumberField("earlyStoppingPatience", earlyStoppingPatience());
        jsonWriter.writeNumberField("evaluationFrequency", evaluationFrequency());
        jsonWriter.writeBooleanField("enableOnnxNormalization", enableOnnxNormalization());
        jsonWriter.writeNumberField("gradientAccumulationStep", gradientAccumulationStep());
        jsonWriter.writeNumberField("layersToFreeze", layersToFreeze());
        jsonWriter.writeNumberField("learningRate", learningRate());
        jsonWriter.writeStringField("learningRateScheduler",
            learningRateScheduler() == null ? null : learningRateScheduler().toString());
        jsonWriter.writeStringField("modelName", modelName());
        jsonWriter.writeNumberField("momentum", momentum());
        jsonWriter.writeBooleanField("nesterov", nesterov());
        jsonWriter.writeNumberField("numberOfEpochs", numberOfEpochs());
        jsonWriter.writeNumberField("numberOfWorkers", numberOfWorkers());
        jsonWriter.writeStringField("optimizer", optimizer() == null ? null : optimizer().toString());
        jsonWriter.writeNumberField("randomSeed", randomSeed());
        jsonWriter.writeNumberField("stepLRGamma", stepLRGamma());
        jsonWriter.writeNumberField("stepLRStepSize", stepLRStepSize());
        jsonWriter.writeNumberField("trainingBatchSize", trainingBatchSize());
        jsonWriter.writeNumberField("validationBatchSize", validationBatchSize());
        jsonWriter.writeNumberField("warmupCosineLRCycles", warmupCosineLRCycles());
        jsonWriter.writeNumberField("warmupCosineLRWarmupEpochs", warmupCosineLRWarmupEpochs());
        jsonWriter.writeNumberField("weightDecay", weightDecay());
        jsonWriter.writeNumberField("boxDetectionsPerImage", this.boxDetectionsPerImage);
        jsonWriter.writeNumberField("boxScoreThreshold", this.boxScoreThreshold);
        jsonWriter.writeNumberField("imageSize", this.imageSize);
        jsonWriter.writeNumberField("maxSize", this.maxSize);
        jsonWriter.writeNumberField("minSize", this.minSize);
        jsonWriter.writeStringField("modelSize", this.modelSize == null ? null : this.modelSize.toString());
        jsonWriter.writeBooleanField("multiScale", this.multiScale);
        jsonWriter.writeNumberField("nmsIouThreshold", this.nmsIouThreshold);
        jsonWriter.writeStringField("tileGridSize", this.tileGridSize);
        jsonWriter.writeNumberField("tileOverlapRatio", this.tileOverlapRatio);
        jsonWriter.writeNumberField("tilePredictionsNmsThreshold", this.tilePredictionsNmsThreshold);
        jsonWriter.writeNumberField("validationIouThreshold", this.validationIouThreshold);
        jsonWriter.writeStringField("validationMetricType",
            this.validationMetricType == null ? null : this.validationMetricType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageModelSettingsObjectDetection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageModelSettingsObjectDetection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageModelSettingsObjectDetection.
     */
    public static ImageModelSettingsObjectDetection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageModelSettingsObjectDetection deserializedImageModelSettingsObjectDetection
                = new ImageModelSettingsObjectDetection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("amsGradient".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withAmsGradient(reader.getNullable(JsonReader::getBoolean));
                } else if ("advancedSettings".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withAdvancedSettings(reader.getString());
                } else if ("augmentations".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withAugmentations(reader.getString());
                } else if ("beta1".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withBeta1(reader.getNullable(JsonReader::getFloat));
                } else if ("beta2".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withBeta2(reader.getNullable(JsonReader::getFloat));
                } else if ("checkpointFrequency".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withCheckpointFrequency(reader.getNullable(JsonReader::getInt));
                } else if ("checkpointRunId".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withCheckpointRunId(reader.getString());
                } else if ("checkpointModel".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withCheckpointModel(MLFlowModelJobInput.fromJson(reader));
                } else if ("distributed".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withDistributed(reader.getNullable(JsonReader::getBoolean));
                } else if ("earlyStopping".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withEarlyStopping(reader.getNullable(JsonReader::getBoolean));
                } else if ("earlyStoppingDelay".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withEarlyStoppingDelay(reader.getNullable(JsonReader::getInt));
                } else if ("earlyStoppingPatience".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withEarlyStoppingPatience(reader.getNullable(JsonReader::getInt));
                } else if ("evaluationFrequency".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withEvaluationFrequency(reader.getNullable(JsonReader::getInt));
                } else if ("enableOnnxNormalization".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withEnableOnnxNormalization(reader.getNullable(JsonReader::getBoolean));
                } else if ("gradientAccumulationStep".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withGradientAccumulationStep(reader.getNullable(JsonReader::getInt));
                } else if ("layersToFreeze".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withLayersToFreeze(reader.getNullable(JsonReader::getInt));
                } else if ("learningRate".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withLearningRate(reader.getNullable(JsonReader::getFloat));
                } else if ("learningRateScheduler".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withLearningRateScheduler(LearningRateScheduler.fromString(reader.getString()));
                } else if ("modelName".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.withModelName(reader.getString());
                } else if ("momentum".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withMomentum(reader.getNullable(JsonReader::getFloat));
                } else if ("nesterov".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withNesterov(reader.getNullable(JsonReader::getBoolean));
                } else if ("numberOfEpochs".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withNumberOfEpochs(reader.getNullable(JsonReader::getInt));
                } else if ("numberOfWorkers".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withNumberOfWorkers(reader.getNullable(JsonReader::getInt));
                } else if ("optimizer".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withOptimizer(StochasticOptimizer.fromString(reader.getString()));
                } else if ("randomSeed".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withRandomSeed(reader.getNullable(JsonReader::getInt));
                } else if ("stepLRGamma".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withStepLRGamma(reader.getNullable(JsonReader::getFloat));
                } else if ("stepLRStepSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withStepLRStepSize(reader.getNullable(JsonReader::getInt));
                } else if ("trainingBatchSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withTrainingBatchSize(reader.getNullable(JsonReader::getInt));
                } else if ("validationBatchSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withValidationBatchSize(reader.getNullable(JsonReader::getInt));
                } else if ("warmupCosineLRCycles".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withWarmupCosineLRCycles(reader.getNullable(JsonReader::getFloat));
                } else if ("warmupCosineLRWarmupEpochs".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withWarmupCosineLRWarmupEpochs(reader.getNullable(JsonReader::getInt));
                } else if ("weightDecay".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection
                        .withWeightDecay(reader.getNullable(JsonReader::getFloat));
                } else if ("boxDetectionsPerImage".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.boxDetectionsPerImage
                        = reader.getNullable(JsonReader::getInt);
                } else if ("boxScoreThreshold".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.boxScoreThreshold
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("imageSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.imageSize = reader.getNullable(JsonReader::getInt);
                } else if ("maxSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.maxSize = reader.getNullable(JsonReader::getInt);
                } else if ("minSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.minSize = reader.getNullable(JsonReader::getInt);
                } else if ("modelSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.modelSize = ModelSize.fromString(reader.getString());
                } else if ("multiScale".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.multiScale
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("nmsIouThreshold".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.nmsIouThreshold
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("tileGridSize".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.tileGridSize = reader.getString();
                } else if ("tileOverlapRatio".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.tileOverlapRatio
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("tilePredictionsNmsThreshold".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.tilePredictionsNmsThreshold
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("validationIouThreshold".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.validationIouThreshold
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("validationMetricType".equals(fieldName)) {
                    deserializedImageModelSettingsObjectDetection.validationMetricType
                        = ValidationMetricType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageModelSettingsObjectDetection;
        });
    }
}
