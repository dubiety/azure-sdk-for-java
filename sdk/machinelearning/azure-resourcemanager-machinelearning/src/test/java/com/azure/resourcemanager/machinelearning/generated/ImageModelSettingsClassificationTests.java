// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import org.junit.jupiter.api.Assertions;

public final class ImageModelSettingsClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageModelSettingsClassification model = BinaryData.fromString(
            "{\"trainingCropSize\":2019850919,\"validationCropSize\":1207062922,\"validationResizeSize\":284324942,\"weightedLoss\":1254415877,\"amsGradient\":true,\"advancedSettings\":\"vscbgngcrusxhir\",\"augmentations\":\"gcvsvkkjbjolpy\",\"beta1\":58.230556,\"beta2\":50.90398,\"checkpointFrequency\":901298308,\"checkpointRunId\":\"advhmli\",\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"uri\":\"igowxxbhtpsyioqe\",\"mode\":\"ReadOnlyMount\",\"description\":\"qszz\"},\"distributed\":true,\"earlyStopping\":false,\"earlyStoppingDelay\":958652184,\"earlyStoppingPatience\":1740509933,\"evaluationFrequency\":1046556371,\"enableOnnxNormalization\":true,\"gradientAccumulationStep\":321986139,\"layersToFreeze\":1384834321,\"learningRate\":89.54964,\"learningRateScheduler\":\"Step\",\"modelName\":\"ompnbnfgyweojbep\",\"momentum\":27.62385,\"nesterov\":true,\"numberOfEpochs\":810296596,\"numberOfWorkers\":1614250259,\"optimizer\":\"None\",\"randomSeed\":1918105896,\"stepLRGamma\":55.955624,\"stepLRStepSize\":1172060548,\"trainingBatchSize\":2093190507,\"validationBatchSize\":1129435958,\"warmupCosineLRCycles\":27.577805,\"warmupCosineLRWarmupEpochs\":1232186738,\"weightDecay\":96.705475}")
            .toObject(ImageModelSettingsClassification.class);
        Assertions.assertEquals(true, model.amsGradient());
        Assertions.assertEquals("vscbgngcrusxhir", model.advancedSettings());
        Assertions.assertEquals("gcvsvkkjbjolpy", model.augmentations());
        Assertions.assertEquals(58.230556F, model.beta1());
        Assertions.assertEquals(50.90398F, model.beta2());
        Assertions.assertEquals(901298308, model.checkpointFrequency());
        Assertions.assertEquals("advhmli", model.checkpointRunId());
        Assertions.assertEquals("qszz", model.checkpointModel().description());
        Assertions.assertEquals("igowxxbhtpsyioqe", model.checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.checkpointModel().mode());
        Assertions.assertEquals(true, model.distributed());
        Assertions.assertEquals(false, model.earlyStopping());
        Assertions.assertEquals(958652184, model.earlyStoppingDelay());
        Assertions.assertEquals(1740509933, model.earlyStoppingPatience());
        Assertions.assertEquals(1046556371, model.evaluationFrequency());
        Assertions.assertEquals(true, model.enableOnnxNormalization());
        Assertions.assertEquals(321986139, model.gradientAccumulationStep());
        Assertions.assertEquals(1384834321, model.layersToFreeze());
        Assertions.assertEquals(89.54964F, model.learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.learningRateScheduler());
        Assertions.assertEquals("ompnbnfgyweojbep", model.modelName());
        Assertions.assertEquals(27.62385F, model.momentum());
        Assertions.assertEquals(true, model.nesterov());
        Assertions.assertEquals(810296596, model.numberOfEpochs());
        Assertions.assertEquals(1614250259, model.numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.optimizer());
        Assertions.assertEquals(1918105896, model.randomSeed());
        Assertions.assertEquals(55.955624F, model.stepLRGamma());
        Assertions.assertEquals(1172060548, model.stepLRStepSize());
        Assertions.assertEquals(2093190507, model.trainingBatchSize());
        Assertions.assertEquals(1129435958, model.validationBatchSize());
        Assertions.assertEquals(27.577805F, model.warmupCosineLRCycles());
        Assertions.assertEquals(1232186738, model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(96.705475F, model.weightDecay());
        Assertions.assertEquals(2019850919, model.trainingCropSize());
        Assertions.assertEquals(1207062922, model.validationCropSize());
        Assertions.assertEquals(284324942, model.validationResizeSize());
        Assertions.assertEquals(1254415877, model.weightedLoss());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageModelSettingsClassification model = new ImageModelSettingsClassification().withAmsGradient(true)
            .withAdvancedSettings("vscbgngcrusxhir")
            .withAugmentations("gcvsvkkjbjolpy")
            .withBeta1(58.230556F)
            .withBeta2(50.90398F)
            .withCheckpointFrequency(901298308)
            .withCheckpointRunId("advhmli")
            .withCheckpointModel(new MLFlowModelJobInput().withDescription("qszz")
                .withUri("igowxxbhtpsyioqe")
                .withMode(InputDeliveryMode.READ_ONLY_MOUNT))
            .withDistributed(true)
            .withEarlyStopping(false)
            .withEarlyStoppingDelay(958652184)
            .withEarlyStoppingPatience(1740509933)
            .withEvaluationFrequency(1046556371)
            .withEnableOnnxNormalization(true)
            .withGradientAccumulationStep(321986139)
            .withLayersToFreeze(1384834321)
            .withLearningRate(89.54964F)
            .withLearningRateScheduler(LearningRateScheduler.STEP)
            .withModelName("ompnbnfgyweojbep")
            .withMomentum(27.62385F)
            .withNesterov(true)
            .withNumberOfEpochs(810296596)
            .withNumberOfWorkers(1614250259)
            .withOptimizer(StochasticOptimizer.NONE)
            .withRandomSeed(1918105896)
            .withStepLRGamma(55.955624F)
            .withStepLRStepSize(1172060548)
            .withTrainingBatchSize(2093190507)
            .withValidationBatchSize(1129435958)
            .withWarmupCosineLRCycles(27.577805F)
            .withWarmupCosineLRWarmupEpochs(1232186738)
            .withWeightDecay(96.705475F)
            .withTrainingCropSize(2019850919)
            .withValidationCropSize(1207062922)
            .withValidationResizeSize(284324942)
            .withWeightedLoss(1254415877);
        model = BinaryData.fromObject(model).toObject(ImageModelSettingsClassification.class);
        Assertions.assertEquals(true, model.amsGradient());
        Assertions.assertEquals("vscbgngcrusxhir", model.advancedSettings());
        Assertions.assertEquals("gcvsvkkjbjolpy", model.augmentations());
        Assertions.assertEquals(58.230556F, model.beta1());
        Assertions.assertEquals(50.90398F, model.beta2());
        Assertions.assertEquals(901298308, model.checkpointFrequency());
        Assertions.assertEquals("advhmli", model.checkpointRunId());
        Assertions.assertEquals("qszz", model.checkpointModel().description());
        Assertions.assertEquals("igowxxbhtpsyioqe", model.checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.checkpointModel().mode());
        Assertions.assertEquals(true, model.distributed());
        Assertions.assertEquals(false, model.earlyStopping());
        Assertions.assertEquals(958652184, model.earlyStoppingDelay());
        Assertions.assertEquals(1740509933, model.earlyStoppingPatience());
        Assertions.assertEquals(1046556371, model.evaluationFrequency());
        Assertions.assertEquals(true, model.enableOnnxNormalization());
        Assertions.assertEquals(321986139, model.gradientAccumulationStep());
        Assertions.assertEquals(1384834321, model.layersToFreeze());
        Assertions.assertEquals(89.54964F, model.learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.learningRateScheduler());
        Assertions.assertEquals("ompnbnfgyweojbep", model.modelName());
        Assertions.assertEquals(27.62385F, model.momentum());
        Assertions.assertEquals(true, model.nesterov());
        Assertions.assertEquals(810296596, model.numberOfEpochs());
        Assertions.assertEquals(1614250259, model.numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.optimizer());
        Assertions.assertEquals(1918105896, model.randomSeed());
        Assertions.assertEquals(55.955624F, model.stepLRGamma());
        Assertions.assertEquals(1172060548, model.stepLRStepSize());
        Assertions.assertEquals(2093190507, model.trainingBatchSize());
        Assertions.assertEquals(1129435958, model.validationBatchSize());
        Assertions.assertEquals(27.577805F, model.warmupCosineLRCycles());
        Assertions.assertEquals(1232186738, model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(96.705475F, model.weightDecay());
        Assertions.assertEquals(2019850919, model.trainingCropSize());
        Assertions.assertEquals(1207062922, model.validationCropSize());
        Assertions.assertEquals(284324942, model.validationResizeSize());
        Assertions.assertEquals(1254415877, model.weightedLoss());
    }
}
