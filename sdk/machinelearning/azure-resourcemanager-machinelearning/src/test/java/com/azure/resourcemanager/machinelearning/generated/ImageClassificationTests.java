// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ClassificationPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageClassification;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ImageClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageClassification model = BinaryData.fromString(
            "{\"taskType\":\"ImageClassification\",\"primaryMetric\":\"AveragePrecisionScoreWeighted\",\"modelSettings\":{\"trainingCropSize\":1833679290,\"validationCropSize\":381440577,\"validationResizeSize\":1189124637,\"weightedLoss\":2517837,\"amsGradient\":true,\"advancedSettings\":\"uarlcjiwgsxfaioc\",\"augmentations\":\"gujjgn\",\"beta1\":54.415714,\"beta2\":11.673647,\"checkpointFrequency\":1680002171,\"checkpointRunId\":\"cbpaefzqsym\",\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"uri\":\"enjc\",\"mode\":\"EvalDownload\",\"description\":\"mfucrtfod\"},\"distributed\":false,\"earlyStopping\":true,\"earlyStoppingDelay\":1307803742,\"earlyStoppingPatience\":532002430,\"evaluationFrequency\":1547790235,\"enableOnnxNormalization\":false,\"gradientAccumulationStep\":2075191599,\"layersToFreeze\":1027792262,\"learningRate\":20.873022,\"learningRateScheduler\":\"WarmupCosine\",\"modelName\":\"udxdyyrudmahswt\",\"momentum\":75.429596,\"nesterov\":false,\"numberOfEpochs\":1978635992,\"numberOfWorkers\":1173715021,\"optimizer\":\"None\",\"randomSeed\":1829590179,\"stepLRGamma\":37.33512,\"stepLRStepSize\":230541163,\"trainingBatchSize\":1518427810,\"validationBatchSize\":1851126067,\"warmupCosineLRCycles\":98.75179,\"warmupCosineLRWarmupEpochs\":453414511,\"weightDecay\":4.1702747},\"searchSpace\":[{\"trainingCropSize\":\"anx\",\"validationCropSize\":\"muvardlmzjot\",\"validationResizeSize\":\"rmuhcuhtuzlx\",\"weightedLoss\":\"yo\",\"amsGradient\":\"arpfctwrap\",\"augmentations\":\"dojq\",\"beta1\":\"zesi\",\"beta2\":\"ysnjqyowaadc\",\"distributed\":\"azab\",\"earlyStopping\":\"dtsewkaupwhlzyc\",\"earlyStoppingDelay\":\"emgjlm\",\"earlyStoppingPatience\":\"dorsirxxhy\",\"evaluationFrequency\":\"qakofajf\",\"enableOnnxNormalization\":\"prfvmkinwteyrqsh\",\"gradientAccumulationStep\":\"bcejopylbl\",\"layersToFreeze\":\"prrw\",\"learningRate\":\"pimtc\",\"learningRateScheduler\":\"fx\",\"modelName\":\"ytzfsl\",\"momentum\":\"zhqikm\",\"nesterov\":\"bliqemcdiiiskl\",\"numberOfEpochs\":\"nxx\",\"numberOfWorkers\":\"jxvtrkfkgenjqnnp\",\"optimizer\":\"kosnyxigfoujjc\",\"randomSeed\":\"dqmrlhnzkwopsw\",\"stepLRGamma\":\"inxupr\",\"stepLRStepSize\":\"yxwjezb\",\"trainingBatchSize\":\"ployuekdcpvu\",\"validationBatchSize\":\"rsvjmnsvujnjktv\",\"warmupCosineLRCycles\":\"efcjisepkdbxot\",\"warmupCosineLRWarmupEpochs\":\"jampqoclannm\",\"weightDecay\":\"nlsuqbwzstr\"}],\"limitSettings\":{\"maxTrials\":803234002,\"timeout\":\"PT72H6M3S\",\"maxConcurrentTrials\":1698507772},\"sweepSettings\":{\"samplingAlgorithm\":\"Bayesian\",\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"evaluationInterval\":2016687082,\"delayEvaluation\":336030670}},\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"nfhoksmmcul\",\"mode\":\"Download\",\"description\":\"cru\"},\"validationDataSize\":67.1284830438322,\"logVerbosity\":\"Warning\",\"trainingData\":{\"jobInputType\":\"mltable\",\"uri\":\"lsgaojbtqpq\",\"mode\":\"ReadWriteMount\",\"description\":\"tpzp\"},\"targetColumnName\":\"zflmcdsgxcelujis\"}")
            .toObject(ImageClassification.class);
        Assertions.assertEquals(LogVerbosity.WARNING, model.logVerbosity());
        Assertions.assertEquals("tpzp", model.trainingData().description());
        Assertions.assertEquals("lsgaojbtqpq", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("zflmcdsgxcelujis", model.targetColumnName());
        Assertions.assertEquals(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED, model.primaryMetric());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("uarlcjiwgsxfaioc", model.modelSettings().advancedSettings());
        Assertions.assertEquals("gujjgn", model.modelSettings().augmentations());
        Assertions.assertEquals(54.415714F, model.modelSettings().beta1());
        Assertions.assertEquals(11.673647F, model.modelSettings().beta2());
        Assertions.assertEquals(1680002171, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("cbpaefzqsym", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("mfucrtfod", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("enjc", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(false, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1307803742, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(532002430, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(1547790235, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(false, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(2075191599, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1027792262, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(20.873022F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.WARMUP_COSINE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("udxdyyrudmahswt", model.modelSettings().modelName());
        Assertions.assertEquals(75.429596F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1978635992, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1173715021, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(1829590179, model.modelSettings().randomSeed());
        Assertions.assertEquals(37.33512F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(230541163, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1518427810, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(1851126067, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(98.75179F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(453414511, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(4.1702747F, model.modelSettings().weightDecay());
        Assertions.assertEquals(1833679290, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(381440577, model.modelSettings().validationCropSize());
        Assertions.assertEquals(1189124637, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(2517837, model.modelSettings().weightedLoss());
        Assertions.assertEquals("arpfctwrap", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("dojq", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("zesi", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("ysnjqyowaadc", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("azab", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("dtsewkaupwhlzyc", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("emgjlm", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("dorsirxxhy", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("qakofajf", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("prfvmkinwteyrqsh", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("bcejopylbl", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("prrw", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("pimtc", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("fx", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ytzfsl", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("zhqikm", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("bliqemcdiiiskl", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("nxx", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("jxvtrkfkgenjqnnp", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("kosnyxigfoujjc", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("dqmrlhnzkwopsw", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("inxupr", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("yxwjezb", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("ployuekdcpvu", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("rsvjmnsvujnjktv", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("efcjisepkdbxot", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("jampqoclannm", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("nlsuqbwzstr", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("anx", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("muvardlmzjot", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("rmuhcuhtuzlx", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("yo", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(803234002, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT72H6M3S"), model.limitSettings().timeout());
        Assertions.assertEquals(1698507772, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(2016687082, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(336030670, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("cru", model.validationData().description());
        Assertions.assertEquals("nfhoksmmcul", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals(67.1284830438322D, model.validationDataSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageClassification model
            = new ImageClassification().withLogVerbosity(LogVerbosity.WARNING)
                .withTrainingData(new MLTableJobInput().withDescription("tpzp")
                    .withUri("lsgaojbtqpq")
                    .withMode(InputDeliveryMode.READ_WRITE_MOUNT))
                .withTargetColumnName("zflmcdsgxcelujis")
                .withPrimaryMetric(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED)
                .withModelSettings(new ImageModelSettingsClassification().withAmsGradient(true)
                    .withAdvancedSettings("uarlcjiwgsxfaioc")
                    .withAugmentations("gujjgn")
                    .withBeta1(54.415714F)
                    .withBeta2(11.673647F)
                    .withCheckpointFrequency(1680002171)
                    .withCheckpointRunId("cbpaefzqsym")
                    .withCheckpointModel(new MLFlowModelJobInput().withDescription("mfucrtfod")
                        .withUri("enjc")
                        .withMode(InputDeliveryMode.EVAL_DOWNLOAD))
                    .withDistributed(false)
                    .withEarlyStopping(true)
                    .withEarlyStoppingDelay(1307803742)
                    .withEarlyStoppingPatience(532002430)
                    .withEvaluationFrequency(1547790235)
                    .withEnableOnnxNormalization(false)
                    .withGradientAccumulationStep(2075191599)
                    .withLayersToFreeze(1027792262)
                    .withLearningRate(20.873022F)
                    .withLearningRateScheduler(LearningRateScheduler.WARMUP_COSINE)
                    .withModelName("udxdyyrudmahswt")
                    .withMomentum(75.429596F)
                    .withNesterov(false)
                    .withNumberOfEpochs(1978635992)
                    .withNumberOfWorkers(1173715021)
                    .withOptimizer(StochasticOptimizer.NONE)
                    .withRandomSeed(1829590179)
                    .withStepLRGamma(37.33512F)
                    .withStepLRStepSize(230541163)
                    .withTrainingBatchSize(1518427810)
                    .withValidationBatchSize(1851126067)
                    .withWarmupCosineLRCycles(98.75179F)
                    .withWarmupCosineLRWarmupEpochs(453414511)
                    .withWeightDecay(4.1702747F)
                    .withTrainingCropSize(1833679290)
                    .withValidationCropSize(381440577)
                    .withValidationResizeSize(1189124637)
                    .withWeightedLoss(2517837))
                .withSearchSpace(
                    Arrays.asList(new ImageModelDistributionSettingsClassification().withAmsGradient("arpfctwrap")
                        .withAugmentations("dojq")
                        .withBeta1("zesi")
                        .withBeta2("ysnjqyowaadc")
                        .withDistributed("azab")
                        .withEarlyStopping("dtsewkaupwhlzyc")
                        .withEarlyStoppingDelay("emgjlm")
                        .withEarlyStoppingPatience("dorsirxxhy")
                        .withEvaluationFrequency("qakofajf")
                        .withEnableOnnxNormalization("prfvmkinwteyrqsh")
                        .withGradientAccumulationStep("bcejopylbl")
                        .withLayersToFreeze("prrw")
                        .withLearningRate("pimtc")
                        .withLearningRateScheduler("fx")
                        .withModelName("ytzfsl")
                        .withMomentum("zhqikm")
                        .withNesterov("bliqemcdiiiskl")
                        .withNumberOfEpochs("nxx")
                        .withNumberOfWorkers("jxvtrkfkgenjqnnp")
                        .withOptimizer("kosnyxigfoujjc")
                        .withRandomSeed("dqmrlhnzkwopsw")
                        .withStepLRGamma("inxupr")
                        .withStepLRStepSize("yxwjezb")
                        .withTrainingBatchSize("ployuekdcpvu")
                        .withValidationBatchSize("rsvjmnsvujnjktv")
                        .withWarmupCosineLRCycles("efcjisepkdbxot")
                        .withWarmupCosineLRWarmupEpochs("jampqoclannm")
                        .withWeightDecay("nlsuqbwzstr")
                        .withTrainingCropSize("anx")
                        .withValidationCropSize("muvardlmzjot")
                        .withValidationResizeSize("rmuhcuhtuzlx")
                        .withWeightedLoss("yo")))
                .withLimitSettings(new ImageLimitSettings().withMaxTrials(803234002)
                    .withTimeout(Duration.parse("PT72H6M3S"))
                    .withMaxConcurrentTrials(1698507772))
                .withSweepSettings(
                    new ImageSweepSettings().withSamplingAlgorithm(SamplingAlgorithmType.BAYESIAN)
                        .withEarlyTermination(new EarlyTerminationPolicy().withEvaluationInterval(2016687082)
                            .withDelayEvaluation(336030670)))
                .withValidationData(new MLTableJobInput().withDescription("cru")
                    .withUri("nfhoksmmcul")
                    .withMode(InputDeliveryMode.DOWNLOAD))
                .withValidationDataSize(67.1284830438322D);
        model = BinaryData.fromObject(model).toObject(ImageClassification.class);
        Assertions.assertEquals(LogVerbosity.WARNING, model.logVerbosity());
        Assertions.assertEquals("tpzp", model.trainingData().description());
        Assertions.assertEquals("lsgaojbtqpq", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("zflmcdsgxcelujis", model.targetColumnName());
        Assertions.assertEquals(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED, model.primaryMetric());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("uarlcjiwgsxfaioc", model.modelSettings().advancedSettings());
        Assertions.assertEquals("gujjgn", model.modelSettings().augmentations());
        Assertions.assertEquals(54.415714F, model.modelSettings().beta1());
        Assertions.assertEquals(11.673647F, model.modelSettings().beta2());
        Assertions.assertEquals(1680002171, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("cbpaefzqsym", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("mfucrtfod", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("enjc", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(false, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1307803742, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(532002430, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(1547790235, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(false, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(2075191599, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1027792262, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(20.873022F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.WARMUP_COSINE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("udxdyyrudmahswt", model.modelSettings().modelName());
        Assertions.assertEquals(75.429596F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1978635992, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1173715021, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(1829590179, model.modelSettings().randomSeed());
        Assertions.assertEquals(37.33512F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(230541163, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1518427810, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(1851126067, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(98.75179F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(453414511, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(4.1702747F, model.modelSettings().weightDecay());
        Assertions.assertEquals(1833679290, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(381440577, model.modelSettings().validationCropSize());
        Assertions.assertEquals(1189124637, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(2517837, model.modelSettings().weightedLoss());
        Assertions.assertEquals("arpfctwrap", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("dojq", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("zesi", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("ysnjqyowaadc", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("azab", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("dtsewkaupwhlzyc", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("emgjlm", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("dorsirxxhy", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("qakofajf", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("prfvmkinwteyrqsh", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("bcejopylbl", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("prrw", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("pimtc", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("fx", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ytzfsl", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("zhqikm", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("bliqemcdiiiskl", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("nxx", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("jxvtrkfkgenjqnnp", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("kosnyxigfoujjc", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("dqmrlhnzkwopsw", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("inxupr", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("yxwjezb", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("ployuekdcpvu", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("rsvjmnsvujnjktv", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("efcjisepkdbxot", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("jampqoclannm", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("nlsuqbwzstr", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("anx", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("muvardlmzjot", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("rmuhcuhtuzlx", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("yo", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(803234002, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT72H6M3S"), model.limitSettings().timeout());
        Assertions.assertEquals(1698507772, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(2016687082, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(336030670, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("cru", model.validationData().description());
        Assertions.assertEquals("nfhoksmmcul", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals(67.1284830438322D, model.validationDataSize());
    }
}
