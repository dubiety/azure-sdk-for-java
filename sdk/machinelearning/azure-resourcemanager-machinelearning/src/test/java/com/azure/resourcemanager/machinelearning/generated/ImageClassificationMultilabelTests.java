// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ClassificationMultilabelPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageClassificationMultilabel;
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

public final class ImageClassificationMultilabelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageClassificationMultilabel model = BinaryData.fromString(
            "{\"taskType\":\"ImageClassificationMultilabel\",\"primaryMetric\":\"AUCWeighted\",\"modelSettings\":{\"trainingCropSize\":617578345,\"validationCropSize\":102589944,\"validationResizeSize\":1980460749,\"weightedLoss\":1156963756,\"amsGradient\":true,\"advancedSettings\":\"ctcxs\",\"augmentations\":\"bzdxmsynb\",\"beta1\":54.66098,\"beta2\":69.80503,\"checkpointFrequency\":1543500625,\"checkpointRunId\":\"uzmsvzyqrbr\",\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"uri\":\"hj\",\"mode\":\"EvalDownload\",\"description\":\"i\"},\"distributed\":true,\"earlyStopping\":false,\"earlyStoppingDelay\":583009502,\"earlyStoppingPatience\":858094139,\"evaluationFrequency\":1286684068,\"enableOnnxNormalization\":true,\"gradientAccumulationStep\":47403047,\"layersToFreeze\":1160956769,\"learningRate\":47.12773,\"learningRateScheduler\":\"Step\",\"modelName\":\"boz\",\"momentum\":40.360588,\"nesterov\":true,\"numberOfEpochs\":766236373,\"numberOfWorkers\":2064309702,\"optimizer\":\"None\",\"randomSeed\":26532947,\"stepLRGamma\":11.640281,\"stepLRStepSize\":1577359960,\"trainingBatchSize\":1671141270,\"validationBatchSize\":426588698,\"warmupCosineLRCycles\":4.2323647,\"warmupCosineLRWarmupEpochs\":913521751,\"weightDecay\":38.36152},\"searchSpace\":[{\"trainingCropSize\":\"orgfhjxsawooauff\",\"validationCropSize\":\"fqkmwz\",\"validationResizeSize\":\"q\",\"weightedLoss\":\"ybmrnotoc\",\"amsGradient\":\"zdaiovrb\",\"augmentations\":\"pqphk\",\"beta1\":\"yzadcrxylaypdt\",\"beta2\":\"velffohuriw\",\"distributed\":\"dfrwpsshrm\",\"earlyStopping\":\"cclpct\",\"earlyStoppingDelay\":\"gkscxjfsgmosp\",\"earlyStoppingPatience\":\"bnxsqc\",\"evaluationFrequency\":\"scuyfqlamfbqhsuj\",\"enableOnnxNormalization\":\"fu\",\"gradientAccumulationStep\":\"nxqpwnikxkcajgrb\",\"layersToFreeze\":\"tsvgoocqs\",\"learningRate\":\"mzlpcx\",\"learningRateScheduler\":\"mhxxrqicfzfvwjd\",\"modelName\":\"kvpyeyo\",\"momentum\":\"inmpnqupdkjrzfwk\",\"nesterov\":\"uobdxw\",\"numberOfEpochs\":\"dcclcvqsr\",\"numberOfWorkers\":\"ay\",\"optimizer\":\"vwbzmfxlrymf\",\"randomSeed\":\"lpiywqnpfydrfbg\",\"stepLRGamma\":\"y\",\"stepLRStepSize\":\"yxmkhmqyncgaul\",\"trainingBatchSize\":\"styygjq\",\"validationBatchSize\":\"lmwqg\",\"warmupCosineLRCycles\":\"mqmiwxzfvvzu\",\"warmupCosineLRWarmupEpochs\":\"fgufjnbx\",\"weightDecay\":\"mwdukinhl\"},{\"trainingCropSize\":\"gde\",\"validationCropSize\":\"kzou\",\"validationResizeSize\":\"ewwpz\",\"weightedLoss\":\"wcgldohgcandx\",\"amsGradient\":\"hhtestdqt\",\"augmentations\":\"nckkpljdshv\",\"beta1\":\"k\",\"beta2\":\"ccyijjimhi\",\"distributed\":\"rqnjxmvvsduydwnw\",\"earlyStopping\":\"uhhqldrdymnswxie\",\"earlyStoppingDelay\":\"wqnghxnimvyuj\",\"earlyStoppingPatience\":\"gunnqgypuqt\",\"evaluationFrequency\":\"lque\",\"enableOnnxNormalization\":\"mvyumgmmuebsnzn\",\"gradientAccumulationStep\":\"squfmjxcyoseq\",\"layersToFreeze\":\"zisvbrqgcyjpgaw\",\"learningRate\":\"kwonrzpghl\",\"learningRateScheduler\":\"tbgblxbuibrvjzta\",\"modelName\":\"vs\",\"momentum\":\"jihvfjcqrttjfuq\",\"nesterov\":\"fjewfeqbavdo\",\"numberOfEpochs\":\"wy\",\"numberOfWorkers\":\"fm\",\"optimizer\":\"lvxgwzz\",\"randomSeed\":\"dtlcjgpvcqzv\",\"stepLRGamma\":\"b\",\"stepLRStepSize\":\"wx\",\"trainingBatchSize\":\"xrmx\",\"validationBatchSize\":\"drwynbgovazoym\",\"warmupCosineLRCycles\":\"hhplkhww\",\"warmupCosineLRWarmupEpochs\":\"atveqm\",\"weightDecay\":\"cswzeyxrye\"},{\"trainingCropSize\":\"mhpwbukl\",\"validationCropSize\":\"mfasgtlvhqpoilos\",\"validationResizeSize\":\"emcezevftm\",\"weightedLoss\":\"l\",\"amsGradient\":\"kjyghztms\",\"augmentations\":\"wtpcflcezswwvw\",\"beta1\":\"tdjtvbfpfhru\",\"beta2\":\"syqcjnqswxdowum\",\"distributed\":\"ukrcdiohcl\",\"earlyStopping\":\"dnhfknebwedd\",\"earlyStoppingDelay\":\"yzcwy\",\"earlyStoppingPatience\":\"mkaqldqabnwvpaq\",\"evaluationFrequency\":\"xf\",\"enableOnnxNormalization\":\"igcfddofxnf\",\"gradientAccumulationStep\":\"jyyrqaedw\",\"layersToFreeze\":\"ocytjgoeayokrw\",\"learningRate\":\"ihwpadhedbfobd\",\"learningRateScheduler\":\"vothmkhjaoz\",\"modelName\":\"wfcn\",\"momentum\":\"bpoelhscmyhrhjv\",\"nesterov\":\"fqbokndwp\",\"numberOfEpochs\":\"qwojoev\",\"numberOfWorkers\":\"ufytdxmly\",\"optimizer\":\"lyvapbkrbu\",\"randomSeed\":\"gtdltlcuha\",\"stepLRGamma\":\"ijvaylze\",\"stepLRStepSize\":\"lpsftqkrvm\",\"trainingBatchSize\":\"bvvcpw\",\"validationBatchSize\":\"suspnhmzy\",\"warmupCosineLRCycles\":\"fetev\",\"warmupCosineLRWarmupEpochs\":\"tf\",\"weightDecay\":\"wacycsyotctkhf\"},{\"trainingCropSize\":\"satvcs\",\"validationCropSize\":\"mhnmizhvprhqqw\",\"validationResizeSize\":\"blehhkplo\",\"weightedLoss\":\"gottaksad\",\"amsGradient\":\"ghmmtbtdvucfvvra\",\"augmentations\":\"eurdeewlsuxp\",\"beta1\":\"wkdwjyjiznioroof\",\"beta2\":\"taspmcrei\",\"distributed\":\"ftrnighminuwqxu\",\"earlyStopping\":\"robgwfmsxj\",\"earlyStoppingDelay\":\"ylwx\",\"earlyStoppingPatience\":\"zjow\",\"evaluationFrequency\":\"geerclbl\",\"enableOnnxNormalization\":\"hpwachyeu\",\"gradientAccumulationStep\":\"wmvwryvdi\",\"layersToFreeze\":\"ii\",\"learningRate\":\"pruccwme\",\"learningRateScheduler\":\"txsytrtexegwmrq\",\"modelName\":\"wi\",\"momentum\":\"vycfjncindi\",\"nesterov\":\"q\",\"numberOfEpochs\":\"jwjuriarsb\",\"numberOfWorkers\":\"lanhzcknjxizba\",\"optimizer\":\"ygzkztxfexwacyy\",\"randomSeed\":\"lxppd\",\"stepLRGamma\":\"zkf\",\"stepLRStepSize\":\"uiiu\",\"trainingBatchSize\":\"b\",\"validationBatchSize\":\"cjy\",\"warmupCosineLRCycles\":\"dcizeqqfop\",\"warmupCosineLRWarmupEpochs\":\"opmotdsf\",\"weightDecay\":\"xqlyoazyfbkmvl\"}],\"limitSettings\":{\"maxTrials\":1571107486,\"timeout\":\"PT193H51S\",\"maxConcurrentTrials\":2050591523},\"sweepSettings\":{\"samplingAlgorithm\":\"Bayesian\",\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"evaluationInterval\":490867132,\"delayEvaluation\":787891741}},\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"kvhyejth\",\"mode\":\"ReadOnlyMount\",\"description\":\"bpergwlck\"},\"validationDataSize\":60.27486371298584,\"logVerbosity\":\"Error\",\"trainingData\":{\"jobInputType\":\"mltable\",\"uri\":\"qsokknpug\",\"mode\":\"EvalDownload\",\"description\":\"izcrjix\"},\"targetColumnName\":\"j\"}")
            .toObject(ImageClassificationMultilabel.class);
        Assertions.assertEquals(LogVerbosity.ERROR, model.logVerbosity());
        Assertions.assertEquals("izcrjix", model.trainingData().description());
        Assertions.assertEquals("qsokknpug", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("j", model.targetColumnName());
        Assertions.assertEquals(ClassificationMultilabelPrimaryMetrics.AUCWEIGHTED, model.primaryMetric());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("ctcxs", model.modelSettings().advancedSettings());
        Assertions.assertEquals("bzdxmsynb", model.modelSettings().augmentations());
        Assertions.assertEquals(54.66098F, model.modelSettings().beta1());
        Assertions.assertEquals(69.80503F, model.modelSettings().beta2());
        Assertions.assertEquals(1543500625, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("uzmsvzyqrbr", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("i", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("hj", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(false, model.modelSettings().earlyStopping());
        Assertions.assertEquals(583009502, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(858094139, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(1286684068, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(47403047, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1160956769, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(47.12773F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("boz", model.modelSettings().modelName());
        Assertions.assertEquals(40.360588F, model.modelSettings().momentum());
        Assertions.assertEquals(true, model.modelSettings().nesterov());
        Assertions.assertEquals(766236373, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(2064309702, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(26532947, model.modelSettings().randomSeed());
        Assertions.assertEquals(11.640281F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(1577359960, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1671141270, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(426588698, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(4.2323647F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(913521751, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(38.36152F, model.modelSettings().weightDecay());
        Assertions.assertEquals(617578345, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(102589944, model.modelSettings().validationCropSize());
        Assertions.assertEquals(1980460749, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(1156963756, model.modelSettings().weightedLoss());
        Assertions.assertEquals("zdaiovrb", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("pqphk", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("yzadcrxylaypdt", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("velffohuriw", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("dfrwpsshrm", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("cclpct", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("gkscxjfsgmosp", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("bnxsqc", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("scuyfqlamfbqhsuj", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("fu", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("nxqpwnikxkcajgrb", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("tsvgoocqs", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("mzlpcx", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("mhxxrqicfzfvwjd", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("kvpyeyo", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("inmpnqupdkjrzfwk", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("uobdxw", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("dcclcvqsr", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("ay", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("vwbzmfxlrymf", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("lpiywqnpfydrfbg", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("y", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("yxmkhmqyncgaul", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("styygjq", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("lmwqg", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("mqmiwxzfvvzu", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("fgufjnbx", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("mwdukinhl", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("orgfhjxsawooauff", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("fqkmwz", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("q", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("ybmrnotoc", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(1571107486, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT193H51S"), model.limitSettings().timeout());
        Assertions.assertEquals(2050591523, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(490867132, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(787891741, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("bpergwlck", model.validationData().description());
        Assertions.assertEquals("kvhyejth", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals(60.27486371298584D, model.validationDataSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageClassificationMultilabel model = new ImageClassificationMultilabel().withLogVerbosity(LogVerbosity.ERROR)
            .withTrainingData(new MLTableJobInput().withDescription("izcrjix")
                .withUri("qsokknpug")
                .withMode(InputDeliveryMode.EVAL_DOWNLOAD))
            .withTargetColumnName("j")
            .withPrimaryMetric(ClassificationMultilabelPrimaryMetrics.AUCWEIGHTED)
            .withModelSettings(new ImageModelSettingsClassification().withAmsGradient(true)
                .withAdvancedSettings("ctcxs")
                .withAugmentations("bzdxmsynb")
                .withBeta1(54.66098F)
                .withBeta2(69.80503F)
                .withCheckpointFrequency(1543500625)
                .withCheckpointRunId("uzmsvzyqrbr")
                .withCheckpointModel(new MLFlowModelJobInput().withDescription("i")
                    .withUri("hj")
                    .withMode(InputDeliveryMode.EVAL_DOWNLOAD))
                .withDistributed(true)
                .withEarlyStopping(false)
                .withEarlyStoppingDelay(583009502)
                .withEarlyStoppingPatience(858094139)
                .withEvaluationFrequency(1286684068)
                .withEnableOnnxNormalization(true)
                .withGradientAccumulationStep(47403047)
                .withLayersToFreeze(1160956769)
                .withLearningRate(47.12773F)
                .withLearningRateScheduler(LearningRateScheduler.STEP)
                .withModelName("boz")
                .withMomentum(40.360588F)
                .withNesterov(true)
                .withNumberOfEpochs(766236373)
                .withNumberOfWorkers(2064309702)
                .withOptimizer(StochasticOptimizer.NONE)
                .withRandomSeed(26532947)
                .withStepLRGamma(11.640281F)
                .withStepLRStepSize(1577359960)
                .withTrainingBatchSize(1671141270)
                .withValidationBatchSize(426588698)
                .withWarmupCosineLRCycles(4.2323647F)
                .withWarmupCosineLRWarmupEpochs(913521751)
                .withWeightDecay(38.36152F)
                .withTrainingCropSize(617578345)
                .withValidationCropSize(102589944)
                .withValidationResizeSize(1980460749)
                .withWeightedLoss(1156963756))
            .withSearchSpace(Arrays.asList(
                new ImageModelDistributionSettingsClassification().withAmsGradient("zdaiovrb")
                    .withAugmentations("pqphk")
                    .withBeta1("yzadcrxylaypdt")
                    .withBeta2("velffohuriw")
                    .withDistributed("dfrwpsshrm")
                    .withEarlyStopping("cclpct")
                    .withEarlyStoppingDelay("gkscxjfsgmosp")
                    .withEarlyStoppingPatience("bnxsqc")
                    .withEvaluationFrequency("scuyfqlamfbqhsuj")
                    .withEnableOnnxNormalization("fu")
                    .withGradientAccumulationStep("nxqpwnikxkcajgrb")
                    .withLayersToFreeze("tsvgoocqs")
                    .withLearningRate("mzlpcx")
                    .withLearningRateScheduler("mhxxrqicfzfvwjd")
                    .withModelName("kvpyeyo")
                    .withMomentum("inmpnqupdkjrzfwk")
                    .withNesterov("uobdxw")
                    .withNumberOfEpochs("dcclcvqsr")
                    .withNumberOfWorkers("ay")
                    .withOptimizer("vwbzmfxlrymf")
                    .withRandomSeed("lpiywqnpfydrfbg")
                    .withStepLRGamma("y")
                    .withStepLRStepSize("yxmkhmqyncgaul")
                    .withTrainingBatchSize("styygjq")
                    .withValidationBatchSize("lmwqg")
                    .withWarmupCosineLRCycles("mqmiwxzfvvzu")
                    .withWarmupCosineLRWarmupEpochs("fgufjnbx")
                    .withWeightDecay("mwdukinhl")
                    .withTrainingCropSize("orgfhjxsawooauff")
                    .withValidationCropSize("fqkmwz")
                    .withValidationResizeSize("q")
                    .withWeightedLoss("ybmrnotoc"),
                new ImageModelDistributionSettingsClassification().withAmsGradient("hhtestdqt")
                    .withAugmentations("nckkpljdshv")
                    .withBeta1("k")
                    .withBeta2("ccyijjimhi")
                    .withDistributed("rqnjxmvvsduydwnw")
                    .withEarlyStopping("uhhqldrdymnswxie")
                    .withEarlyStoppingDelay("wqnghxnimvyuj")
                    .withEarlyStoppingPatience("gunnqgypuqt")
                    .withEvaluationFrequency("lque")
                    .withEnableOnnxNormalization("mvyumgmmuebsnzn")
                    .withGradientAccumulationStep("squfmjxcyoseq")
                    .withLayersToFreeze("zisvbrqgcyjpgaw")
                    .withLearningRate("kwonrzpghl")
                    .withLearningRateScheduler("tbgblxbuibrvjzta")
                    .withModelName("vs")
                    .withMomentum("jihvfjcqrttjfuq")
                    .withNesterov("fjewfeqbavdo")
                    .withNumberOfEpochs("wy")
                    .withNumberOfWorkers("fm")
                    .withOptimizer("lvxgwzz")
                    .withRandomSeed("dtlcjgpvcqzv")
                    .withStepLRGamma("b")
                    .withStepLRStepSize("wx")
                    .withTrainingBatchSize("xrmx")
                    .withValidationBatchSize("drwynbgovazoym")
                    .withWarmupCosineLRCycles("hhplkhww")
                    .withWarmupCosineLRWarmupEpochs("atveqm")
                    .withWeightDecay("cswzeyxrye")
                    .withTrainingCropSize("gde")
                    .withValidationCropSize("kzou")
                    .withValidationResizeSize("ewwpz")
                    .withWeightedLoss("wcgldohgcandx"),
                new ImageModelDistributionSettingsClassification().withAmsGradient("kjyghztms")
                    .withAugmentations("wtpcflcezswwvw")
                    .withBeta1("tdjtvbfpfhru")
                    .withBeta2("syqcjnqswxdowum")
                    .withDistributed("ukrcdiohcl")
                    .withEarlyStopping("dnhfknebwedd")
                    .withEarlyStoppingDelay("yzcwy")
                    .withEarlyStoppingPatience("mkaqldqabnwvpaq")
                    .withEvaluationFrequency("xf")
                    .withEnableOnnxNormalization("igcfddofxnf")
                    .withGradientAccumulationStep("jyyrqaedw")
                    .withLayersToFreeze("ocytjgoeayokrw")
                    .withLearningRate("ihwpadhedbfobd")
                    .withLearningRateScheduler("vothmkhjaoz")
                    .withModelName("wfcn")
                    .withMomentum("bpoelhscmyhrhjv")
                    .withNesterov("fqbokndwp")
                    .withNumberOfEpochs("qwojoev")
                    .withNumberOfWorkers("ufytdxmly")
                    .withOptimizer("lyvapbkrbu")
                    .withRandomSeed("gtdltlcuha")
                    .withStepLRGamma("ijvaylze")
                    .withStepLRStepSize("lpsftqkrvm")
                    .withTrainingBatchSize("bvvcpw")
                    .withValidationBatchSize("suspnhmzy")
                    .withWarmupCosineLRCycles("fetev")
                    .withWarmupCosineLRWarmupEpochs("tf")
                    .withWeightDecay("wacycsyotctkhf")
                    .withTrainingCropSize("mhpwbukl")
                    .withValidationCropSize("mfasgtlvhqpoilos")
                    .withValidationResizeSize("emcezevftm")
                    .withWeightedLoss("l"),
                new ImageModelDistributionSettingsClassification().withAmsGradient("ghmmtbtdvucfvvra")
                    .withAugmentations("eurdeewlsuxp")
                    .withBeta1("wkdwjyjiznioroof")
                    .withBeta2("taspmcrei")
                    .withDistributed("ftrnighminuwqxu")
                    .withEarlyStopping("robgwfmsxj")
                    .withEarlyStoppingDelay("ylwx")
                    .withEarlyStoppingPatience("zjow")
                    .withEvaluationFrequency("geerclbl")
                    .withEnableOnnxNormalization("hpwachyeu")
                    .withGradientAccumulationStep("wmvwryvdi")
                    .withLayersToFreeze("ii")
                    .withLearningRate("pruccwme")
                    .withLearningRateScheduler("txsytrtexegwmrq")
                    .withModelName("wi")
                    .withMomentum("vycfjncindi")
                    .withNesterov("q")
                    .withNumberOfEpochs("jwjuriarsb")
                    .withNumberOfWorkers("lanhzcknjxizba")
                    .withOptimizer("ygzkztxfexwacyy")
                    .withRandomSeed("lxppd")
                    .withStepLRGamma("zkf")
                    .withStepLRStepSize("uiiu")
                    .withTrainingBatchSize("b")
                    .withValidationBatchSize("cjy")
                    .withWarmupCosineLRCycles("dcizeqqfop")
                    .withWarmupCosineLRWarmupEpochs("opmotdsf")
                    .withWeightDecay("xqlyoazyfbkmvl")
                    .withTrainingCropSize("satvcs")
                    .withValidationCropSize("mhnmizhvprhqqw")
                    .withValidationResizeSize("blehhkplo")
                    .withWeightedLoss("gottaksad")))
            .withLimitSettings(new ImageLimitSettings().withMaxTrials(1571107486)
                .withTimeout(Duration.parse("PT193H51S"))
                .withMaxConcurrentTrials(2050591523))
            .withSweepSettings(new ImageSweepSettings().withSamplingAlgorithm(SamplingAlgorithmType.BAYESIAN)
                .withEarlyTermination(
                    new EarlyTerminationPolicy().withEvaluationInterval(490867132).withDelayEvaluation(787891741)))
            .withValidationData(new MLTableJobInput().withDescription("bpergwlck")
                .withUri("kvhyejth")
                .withMode(InputDeliveryMode.READ_ONLY_MOUNT))
            .withValidationDataSize(60.27486371298584D);
        model = BinaryData.fromObject(model).toObject(ImageClassificationMultilabel.class);
        Assertions.assertEquals(LogVerbosity.ERROR, model.logVerbosity());
        Assertions.assertEquals("izcrjix", model.trainingData().description());
        Assertions.assertEquals("qsokknpug", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("j", model.targetColumnName());
        Assertions.assertEquals(ClassificationMultilabelPrimaryMetrics.AUCWEIGHTED, model.primaryMetric());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("ctcxs", model.modelSettings().advancedSettings());
        Assertions.assertEquals("bzdxmsynb", model.modelSettings().augmentations());
        Assertions.assertEquals(54.66098F, model.modelSettings().beta1());
        Assertions.assertEquals(69.80503F, model.modelSettings().beta2());
        Assertions.assertEquals(1543500625, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("uzmsvzyqrbr", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("i", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("hj", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(false, model.modelSettings().earlyStopping());
        Assertions.assertEquals(583009502, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(858094139, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(1286684068, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(47403047, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1160956769, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(47.12773F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("boz", model.modelSettings().modelName());
        Assertions.assertEquals(40.360588F, model.modelSettings().momentum());
        Assertions.assertEquals(true, model.modelSettings().nesterov());
        Assertions.assertEquals(766236373, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(2064309702, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(26532947, model.modelSettings().randomSeed());
        Assertions.assertEquals(11.640281F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(1577359960, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1671141270, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(426588698, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(4.2323647F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(913521751, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(38.36152F, model.modelSettings().weightDecay());
        Assertions.assertEquals(617578345, model.modelSettings().trainingCropSize());
        Assertions.assertEquals(102589944, model.modelSettings().validationCropSize());
        Assertions.assertEquals(1980460749, model.modelSettings().validationResizeSize());
        Assertions.assertEquals(1156963756, model.modelSettings().weightedLoss());
        Assertions.assertEquals("zdaiovrb", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("pqphk", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("yzadcrxylaypdt", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("velffohuriw", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("dfrwpsshrm", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("cclpct", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("gkscxjfsgmosp", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("bnxsqc", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("scuyfqlamfbqhsuj", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("fu", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("nxqpwnikxkcajgrb", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("tsvgoocqs", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("mzlpcx", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("mhxxrqicfzfvwjd", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("kvpyeyo", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("inmpnqupdkjrzfwk", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("uobdxw", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("dcclcvqsr", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("ay", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("vwbzmfxlrymf", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("lpiywqnpfydrfbg", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("y", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("yxmkhmqyncgaul", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("styygjq", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("lmwqg", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("mqmiwxzfvvzu", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("fgufjnbx", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("mwdukinhl", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("orgfhjxsawooauff", model.searchSpace().get(0).trainingCropSize());
        Assertions.assertEquals("fqkmwz", model.searchSpace().get(0).validationCropSize());
        Assertions.assertEquals("q", model.searchSpace().get(0).validationResizeSize());
        Assertions.assertEquals("ybmrnotoc", model.searchSpace().get(0).weightedLoss());
        Assertions.assertEquals(1571107486, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT193H51S"), model.limitSettings().timeout());
        Assertions.assertEquals(2050591523, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(490867132, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(787891741, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("bpergwlck", model.validationData().description());
        Assertions.assertEquals("kvhyejth", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals(60.27486371298584D, model.validationDataSize());
    }
}
