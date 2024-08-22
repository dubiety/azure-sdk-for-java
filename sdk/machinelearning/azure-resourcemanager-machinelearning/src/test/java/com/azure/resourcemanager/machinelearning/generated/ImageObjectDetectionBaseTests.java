// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsObjectDetection;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsObjectDetection;
import com.azure.resourcemanager.machinelearning.models.ImageObjectDetectionBase;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.ModelSize;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import com.azure.resourcemanager.machinelearning.models.ValidationMetricType;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ImageObjectDetectionBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageObjectDetectionBase model = BinaryData.fromString(
            "{\"modelSettings\":{\"boxDetectionsPerImage\":1628267631,\"boxScoreThreshold\":29.993313,\"imageSize\":1142675426,\"maxSize\":926269302,\"minSize\":1191635799,\"modelSize\":\"ExtraLarge\",\"multiScale\":false,\"nmsIouThreshold\":32.659657,\"tileGridSize\":\"taxjucltjlxsgce\",\"tileOverlapRatio\":78.93754,\"tilePredictionsNmsThreshold\":16.3262,\"validationIouThreshold\":95.671394,\"validationMetricType\":\"Voc\",\"amsGradient\":false,\"advancedSettings\":\"vfjyzufldif\",\"augmentations\":\"vlutggmaacxauhv\",\"beta1\":26.423735,\"beta2\":35.01808,\"checkpointFrequency\":79908941,\"checkpointRunId\":\"qxtoiyygktsrjyxx\",\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"uri\":\"wfzbkve\",\"mode\":\"ReadWriteMount\",\"description\":\"xphsowbe\"},\"distributed\":true,\"earlyStopping\":true,\"earlyStoppingDelay\":1870801520,\"earlyStoppingPatience\":1858531947,\"evaluationFrequency\":500672005,\"enableOnnxNormalization\":true,\"gradientAccumulationStep\":1493541388,\"layersToFreeze\":1056931812,\"learningRate\":71.24121,\"learningRateScheduler\":\"Step\",\"modelName\":\"rafjajvkyxmm\",\"momentum\":42.656822,\"nesterov\":false,\"numberOfEpochs\":1801731269,\"numberOfWorkers\":1139337478,\"optimizer\":\"None\",\"randomSeed\":1799945532,\"stepLRGamma\":31.64695,\"stepLRStepSize\":762243556,\"trainingBatchSize\":250358057,\"validationBatchSize\":403241529,\"warmupCosineLRCycles\":45.694794,\"warmupCosineLRWarmupEpochs\":459919584,\"weightDecay\":87.26493},\"searchSpace\":[{\"boxDetectionsPerImage\":\"yphfxnrpdh\",\"boxScoreThreshold\":\"okyqsfkxfsy\",\"imageSize\":\"ihqbtod\",\"maxSize\":\"yxbvkvwzdmv\",\"minSize\":\"qwcrugyo\",\"modelSize\":\"za\",\"multiScale\":\"jdvvlrhocr\",\"nmsIouThreshold\":\"vxundqzbvbps\",\"tileGridSize\":\"qhxtozfgdkwbkur\",\"tileOverlapRatio\":\"piigf\",\"tilePredictionsNmsThreshold\":\"keutuipjclzjwaq\",\"validationIouThreshold\":\"qydewuwxyllz\",\"validationMetricType\":\"evt\",\"amsGradient\":\"wczochw\",\"augmentations\":\"k\",\"beta1\":\"ynfpkyvnhiysdho\",\"beta2\":\"slhraqkiwlwkff\",\"distributed\":\"qwmwqoguflteat\",\"earlyStopping\":\"gefzj\",\"earlyStoppingDelay\":\"jtqbgysi\",\"earlyStoppingPatience\":\"hnvxwtd\",\"evaluationFrequency\":\"cbjdbtqy\",\"enableOnnxNormalization\":\"xu\",\"gradientAccumulationStep\":\"aujqgbbjv\",\"layersToFreeze\":\"oawh\",\"learningRate\":\"smbcsloygsab\",\"learningRateScheduler\":\"d\",\"modelName\":\"ronsdunr\",\"momentum\":\"vz\",\"nesterov\":\"tqhgz\",\"numberOfEpochs\":\"xtrvfdbqs\",\"numberOfWorkers\":\"qjbvitptpvsffa\",\"optimizer\":\"hpiwrmu\",\"randomSeed\":\"gjw\",\"stepLRGamma\":\"fdwfbwxy\",\"stepLRStepSize\":\"qtmg\",\"trainingBatchSize\":\"pdrmegajr\",\"validationBatchSize\":\"twymzs\",\"warmupCosineLRCycles\":\"qkkge\",\"warmupCosineLRWarmupEpochs\":\"iphgli\",\"weightDecay\":\"qsco\"},{\"boxDetectionsPerImage\":\"kj\",\"boxScoreThreshold\":\"axsqcomji\",\"imageSize\":\"incev\",\"maxSize\":\"kdevpximzii\",\"minSize\":\"eqmduvtvodqxxpqh\",\"modelSize\":\"qibtblmc\",\"multiScale\":\"j\",\"nmsIouThreshold\":\"notdofqvpbqsdqk\",\"tileGridSize\":\"bqsbbmitaf\",\"tileOverlapRatio\":\"zgcxsvqlcquf\",\"tilePredictionsNmsThreshold\":\"amxo\",\"validationIouThreshold\":\"gc\",\"validationMetricType\":\"yutehlkarvtipquk\",\"amsGradient\":\"iknsgo\",\"augmentations\":\"nswhpcek\",\"beta1\":\"vmfnnbbxn\",\"beta2\":\"fkk\",\"distributed\":\"eetxtpwcv\",\"earlyStopping\":\"fwsunjzijaciwmm\",\"earlyStoppingDelay\":\"tqdonbzzs\",\"earlyStoppingPatience\":\"zyviiwsu\",\"evaluationFrequency\":\"zhw\",\"enableOnnxNormalization\":\"uifkzqqhb\",\"gradientAccumulationStep\":\"loilmkfbeo\",\"layersToFreeze\":\"pjpngvyvuo\",\"learningRate\":\"dlpsx\",\"learningRateScheduler\":\"ugfw\",\"modelName\":\"qn\",\"momentum\":\"clo\",\"nesterov\":\"mvswxvjeleif\",\"numberOfEpochs\":\"d\",\"numberOfWorkers\":\"wwulkrybpaevy\",\"optimizer\":\"yjecrqkwakkch\",\"randomSeed\":\"oulborcxuibsdqbd\",\"stepLRGamma\":\"lp\",\"stepLRStepSize\":\"t\",\"trainingBatchSize\":\"wpgweoqhbj\",\"validationBatchSize\":\"qfbleruf\",\"warmupCosineLRCycles\":\"lcshjucihbym\",\"warmupCosineLRWarmupEpochs\":\"vtpnerxvje\",\"weightDecay\":\"ra\"},{\"boxDetectionsPerImage\":\"lhbimyii\",\"boxScoreThreshold\":\"a\",\"imageSize\":\"thtpqgfzdosi\",\"maxSize\":\"d\",\"minSize\":\"vflgzhc\",\"modelSize\":\"gwahcrxo\",\"multiScale\":\"rutvnpccxz\",\"nmsIouThreshold\":\"xpmhzghhhk\",\"tileGridSize\":\"njdtujqzvhnj\",\"tileOverlapRatio\":\"mxnhtm\",\"tilePredictionsNmsThreshold\":\"tqlfxolrwvtl\",\"validationIouThreshold\":\"yfjswequf\",\"validationMetricType\":\"yyopoaytwwgw\",\"amsGradient\":\"b\",\"augmentations\":\"bvufrkwjiemimdtn\",\"beta1\":\"wew\",\"beta2\":\"kreeeddd\",\"distributed\":\"tfquu\",\"earlyStopping\":\"clhsiigeeuw\",\"earlyStoppingDelay\":\"nqyxfedq\",\"earlyStoppingPatience\":\"tdqwynxo\",\"evaluationFrequency\":\"vbzpggpwme\",\"enableOnnxNormalization\":\"bqajejir\",\"gradientAccumulationStep\":\"vrvkgpogplb\",\"layersToFreeze\":\"vlnhx\",\"learningRate\":\"njhina\",\"learningRateScheduler\":\"esbxnepqmjmoplu\",\"modelName\":\"ykkfhsovadkrm\",\"momentum\":\"mwqpdkesjqbzkqm\",\"nesterov\":\"poriwbwggijtspzj\",\"numberOfEpochs\":\"rhikwsbzrhdug\",\"numberOfWorkers\":\"htrgz\",\"optimizer\":\"unjf\",\"randomSeed\":\"jhiycbauseqnczk\",\"stepLRGamma\":\"hvtuwyjsqwzsz\",\"stepLRStepSize\":\"zjg\",\"trainingBatchSize\":\"nkfnyskwwunq\",\"validationBatchSize\":\"za\",\"warmupCosineLRCycles\":\"jmslhi\",\"warmupCosineLRWarmupEpochs\":\"ukvbljpxpr\",\"weightDecay\":\"chyluqa\"},{\"boxDetectionsPerImage\":\"cufjjfxt\",\"boxScoreThreshold\":\"tqdstahhhsa\",\"imageSize\":\"xsri\",\"maxSize\":\"cw\",\"minSize\":\"aesyyefm\",\"modelSize\":\"oqotiiqbgpasrv\",\"multiScale\":\"tistyikjhorlx\",\"nmsIouThreshold\":\"ypk\",\"tileGridSize\":\"nycntr\",\"tileOverlapRatio\":\"xwtdmbqjtsuhqh\",\"tilePredictionsNmsThreshold\":\"xtdyqavfxbqmzxsy\",\"validationIouThreshold\":\"sinpaamihwbghvw\",\"validationMetricType\":\"pbgchcgsfzhb\",\"amsGradient\":\"iys\",\"augmentations\":\"jsdjpg\",\"beta1\":\"ysgwkcfferznzcbi\",\"beta2\":\"veomkhfeqc\",\"distributed\":\"plfpohimgckycjp\",\"earlyStopping\":\"b\",\"earlyStoppingDelay\":\"bznxsuloutnpbm\",\"earlyStoppingPatience\":\"oqohgp\",\"evaluationFrequency\":\"dmwk\",\"enableOnnxNormalization\":\"pfhsldqdza\",\"gradientAccumulationStep\":\"unye\",\"layersToFreeze\":\"yzdsytcikswhcam\",\"learningRate\":\"y\",\"learningRateScheduler\":\"xkcgsfcmvhadr\",\"modelName\":\"atvyrkljqkqws\",\"momentum\":\"tvjkowggxawwdm\",\"nesterov\":\"pnkteiidlbovwb\",\"numberOfEpochs\":\"prgeg\",\"numberOfWorkers\":\"ihkjcnerekyjuls\",\"optimizer\":\"wnqhqlqgpwxtvc\",\"randomSeed\":\"avv\",\"stepLRGamma\":\"xwvegenlrj\",\"stepLRStepSize\":\"mwevguyflnxel\",\"trainingBatchSize\":\"kfzcdetowwezhy\",\"validationBatchSize\":\"di\",\"warmupCosineLRCycles\":\"wqlqacs\",\"warmupCosineLRWarmupEpochs\":\"birtybcelfjn\",\"weightDecay\":\"dnjyhzfax\"}],\"limitSettings\":{\"maxTrials\":2124800129,\"timeout\":\"PT94H33M13S\",\"maxConcurrentTrials\":1476171773},\"sweepSettings\":{\"samplingAlgorithm\":\"Bayesian\",\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"evaluationInterval\":334216826,\"delayEvaluation\":297072472}},\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"xsorchazr\",\"mode\":\"Download\",\"description\":\"yhl\"},\"validationDataSize\":53.57251340621531}")
            .toObject(ImageObjectDetectionBase.class);
        Assertions.assertEquals(2124800129, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT94H33M13S"), model.limitSettings().timeout());
        Assertions.assertEquals(1476171773, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(334216826, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(297072472, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("yhl", model.validationData().description());
        Assertions.assertEquals("xsorchazr", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals(53.57251340621531D, model.validationDataSize());
        Assertions.assertEquals(false, model.modelSettings().amsGradient());
        Assertions.assertEquals("vfjyzufldif", model.modelSettings().advancedSettings());
        Assertions.assertEquals("vlutggmaacxauhv", model.modelSettings().augmentations());
        Assertions.assertEquals(26.423735F, model.modelSettings().beta1());
        Assertions.assertEquals(35.01808F, model.modelSettings().beta2());
        Assertions.assertEquals(79908941, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("qxtoiyygktsrjyxx", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("xphsowbe", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("wfzbkve", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1870801520, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(1858531947, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(500672005, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(1493541388, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1056931812, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(71.24121F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("rafjajvkyxmm", model.modelSettings().modelName());
        Assertions.assertEquals(42.656822F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1801731269, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1139337478, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(1799945532, model.modelSettings().randomSeed());
        Assertions.assertEquals(31.64695F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(762243556, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(250358057, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(403241529, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(45.694794F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(459919584, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(87.26493F, model.modelSettings().weightDecay());
        Assertions.assertEquals(1628267631, model.modelSettings().boxDetectionsPerImage());
        Assertions.assertEquals(29.993313F, model.modelSettings().boxScoreThreshold());
        Assertions.assertEquals(1142675426, model.modelSettings().imageSize());
        Assertions.assertEquals(926269302, model.modelSettings().maxSize());
        Assertions.assertEquals(1191635799, model.modelSettings().minSize());
        Assertions.assertEquals(ModelSize.EXTRA_LARGE, model.modelSettings().modelSize());
        Assertions.assertEquals(false, model.modelSettings().multiScale());
        Assertions.assertEquals(32.659657F, model.modelSettings().nmsIouThreshold());
        Assertions.assertEquals("taxjucltjlxsgce", model.modelSettings().tileGridSize());
        Assertions.assertEquals(78.93754F, model.modelSettings().tileOverlapRatio());
        Assertions.assertEquals(16.3262F, model.modelSettings().tilePredictionsNmsThreshold());
        Assertions.assertEquals(95.671394F, model.modelSettings().validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.VOC, model.modelSettings().validationMetricType());
        Assertions.assertEquals("wczochw", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("k", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("ynfpkyvnhiysdho", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("slhraqkiwlwkff", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("qwmwqoguflteat", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("gefzj", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("jtqbgysi", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("hnvxwtd", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("cbjdbtqy", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("xu", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("aujqgbbjv", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("oawh", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("smbcsloygsab", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("d", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ronsdunr", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("vz", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("tqhgz", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("xtrvfdbqs", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("qjbvitptpvsffa", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("hpiwrmu", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("gjw", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("fdwfbwxy", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("qtmg", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("pdrmegajr", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("twymzs", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("qkkge", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("iphgli", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("qsco", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("yphfxnrpdh", model.searchSpace().get(0).boxDetectionsPerImage());
        Assertions.assertEquals("okyqsfkxfsy", model.searchSpace().get(0).boxScoreThreshold());
        Assertions.assertEquals("ihqbtod", model.searchSpace().get(0).imageSize());
        Assertions.assertEquals("yxbvkvwzdmv", model.searchSpace().get(0).maxSize());
        Assertions.assertEquals("qwcrugyo", model.searchSpace().get(0).minSize());
        Assertions.assertEquals("za", model.searchSpace().get(0).modelSize());
        Assertions.assertEquals("jdvvlrhocr", model.searchSpace().get(0).multiScale());
        Assertions.assertEquals("vxundqzbvbps", model.searchSpace().get(0).nmsIouThreshold());
        Assertions.assertEquals("qhxtozfgdkwbkur", model.searchSpace().get(0).tileGridSize());
        Assertions.assertEquals("piigf", model.searchSpace().get(0).tileOverlapRatio());
        Assertions.assertEquals("keutuipjclzjwaq", model.searchSpace().get(0).tilePredictionsNmsThreshold());
        Assertions.assertEquals("qydewuwxyllz", model.searchSpace().get(0).validationIouThreshold());
        Assertions.assertEquals("evt", model.searchSpace().get(0).validationMetricType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageObjectDetectionBase model = new ImageObjectDetectionBase()
            .withLimitSettings(new ImageLimitSettings().withMaxTrials(2124800129)
                .withTimeout(Duration.parse("PT94H33M13S"))
                .withMaxConcurrentTrials(1476171773))
            .withSweepSettings(new ImageSweepSettings().withSamplingAlgorithm(SamplingAlgorithmType.BAYESIAN)
                .withEarlyTermination(
                    new EarlyTerminationPolicy().withEvaluationInterval(334216826).withDelayEvaluation(297072472)))
            .withValidationData(
                new MLTableJobInput().withDescription("yhl").withUri("xsorchazr").withMode(InputDeliveryMode.DOWNLOAD))
            .withValidationDataSize(53.57251340621531D)
            .withModelSettings(new ImageModelSettingsObjectDetection().withAmsGradient(false)
                .withAdvancedSettings("vfjyzufldif")
                .withAugmentations("vlutggmaacxauhv")
                .withBeta1(26.423735F)
                .withBeta2(35.01808F)
                .withCheckpointFrequency(79908941)
                .withCheckpointRunId("qxtoiyygktsrjyxx")
                .withCheckpointModel(new MLFlowModelJobInput().withDescription("xphsowbe")
                    .withUri("wfzbkve")
                    .withMode(InputDeliveryMode.READ_WRITE_MOUNT))
                .withDistributed(true)
                .withEarlyStopping(true)
                .withEarlyStoppingDelay(1870801520)
                .withEarlyStoppingPatience(1858531947)
                .withEvaluationFrequency(500672005)
                .withEnableOnnxNormalization(true)
                .withGradientAccumulationStep(1493541388)
                .withLayersToFreeze(1056931812)
                .withLearningRate(71.24121F)
                .withLearningRateScheduler(LearningRateScheduler.STEP)
                .withModelName("rafjajvkyxmm")
                .withMomentum(42.656822F)
                .withNesterov(false)
                .withNumberOfEpochs(1801731269)
                .withNumberOfWorkers(1139337478)
                .withOptimizer(StochasticOptimizer.NONE)
                .withRandomSeed(1799945532)
                .withStepLRGamma(31.64695F)
                .withStepLRStepSize(762243556)
                .withTrainingBatchSize(250358057)
                .withValidationBatchSize(403241529)
                .withWarmupCosineLRCycles(45.694794F)
                .withWarmupCosineLRWarmupEpochs(459919584)
                .withWeightDecay(87.26493F)
                .withBoxDetectionsPerImage(1628267631)
                .withBoxScoreThreshold(29.993313F)
                .withImageSize(1142675426)
                .withMaxSize(926269302)
                .withMinSize(1191635799)
                .withModelSize(ModelSize.EXTRA_LARGE)
                .withMultiScale(false)
                .withNmsIouThreshold(32.659657F)
                .withTileGridSize("taxjucltjlxsgce")
                .withTileOverlapRatio(78.93754F)
                .withTilePredictionsNmsThreshold(16.3262F)
                .withValidationIouThreshold(95.671394F)
                .withValidationMetricType(ValidationMetricType.VOC))
            .withSearchSpace(Arrays.asList(
                new ImageModelDistributionSettingsObjectDetection().withAmsGradient("wczochw")
                    .withAugmentations("k")
                    .withBeta1("ynfpkyvnhiysdho")
                    .withBeta2("slhraqkiwlwkff")
                    .withDistributed("qwmwqoguflteat")
                    .withEarlyStopping("gefzj")
                    .withEarlyStoppingDelay("jtqbgysi")
                    .withEarlyStoppingPatience("hnvxwtd")
                    .withEvaluationFrequency("cbjdbtqy")
                    .withEnableOnnxNormalization("xu")
                    .withGradientAccumulationStep("aujqgbbjv")
                    .withLayersToFreeze("oawh")
                    .withLearningRate("smbcsloygsab")
                    .withLearningRateScheduler("d")
                    .withModelName("ronsdunr")
                    .withMomentum("vz")
                    .withNesterov("tqhgz")
                    .withNumberOfEpochs("xtrvfdbqs")
                    .withNumberOfWorkers("qjbvitptpvsffa")
                    .withOptimizer("hpiwrmu")
                    .withRandomSeed("gjw")
                    .withStepLRGamma("fdwfbwxy")
                    .withStepLRStepSize("qtmg")
                    .withTrainingBatchSize("pdrmegajr")
                    .withValidationBatchSize("twymzs")
                    .withWarmupCosineLRCycles("qkkge")
                    .withWarmupCosineLRWarmupEpochs("iphgli")
                    .withWeightDecay("qsco")
                    .withBoxDetectionsPerImage("yphfxnrpdh")
                    .withBoxScoreThreshold("okyqsfkxfsy")
                    .withImageSize("ihqbtod")
                    .withMaxSize("yxbvkvwzdmv")
                    .withMinSize("qwcrugyo")
                    .withModelSize("za")
                    .withMultiScale("jdvvlrhocr")
                    .withNmsIouThreshold("vxundqzbvbps")
                    .withTileGridSize("qhxtozfgdkwbkur")
                    .withTileOverlapRatio("piigf")
                    .withTilePredictionsNmsThreshold("keutuipjclzjwaq")
                    .withValidationIouThreshold("qydewuwxyllz")
                    .withValidationMetricType("evt"),
                new ImageModelDistributionSettingsObjectDetection().withAmsGradient("iknsgo")
                    .withAugmentations("nswhpcek")
                    .withBeta1("vmfnnbbxn")
                    .withBeta2("fkk")
                    .withDistributed("eetxtpwcv")
                    .withEarlyStopping("fwsunjzijaciwmm")
                    .withEarlyStoppingDelay("tqdonbzzs")
                    .withEarlyStoppingPatience("zyviiwsu")
                    .withEvaluationFrequency("zhw")
                    .withEnableOnnxNormalization("uifkzqqhb")
                    .withGradientAccumulationStep("loilmkfbeo")
                    .withLayersToFreeze("pjpngvyvuo")
                    .withLearningRate("dlpsx")
                    .withLearningRateScheduler("ugfw")
                    .withModelName("qn")
                    .withMomentum("clo")
                    .withNesterov("mvswxvjeleif")
                    .withNumberOfEpochs("d")
                    .withNumberOfWorkers("wwulkrybpaevy")
                    .withOptimizer("yjecrqkwakkch")
                    .withRandomSeed("oulborcxuibsdqbd")
                    .withStepLRGamma("lp")
                    .withStepLRStepSize("t")
                    .withTrainingBatchSize("wpgweoqhbj")
                    .withValidationBatchSize("qfbleruf")
                    .withWarmupCosineLRCycles("lcshjucihbym")
                    .withWarmupCosineLRWarmupEpochs("vtpnerxvje")
                    .withWeightDecay("ra")
                    .withBoxDetectionsPerImage("kj")
                    .withBoxScoreThreshold("axsqcomji")
                    .withImageSize("incev")
                    .withMaxSize("kdevpximzii")
                    .withMinSize("eqmduvtvodqxxpqh")
                    .withModelSize("qibtblmc")
                    .withMultiScale("j")
                    .withNmsIouThreshold("notdofqvpbqsdqk")
                    .withTileGridSize("bqsbbmitaf")
                    .withTileOverlapRatio("zgcxsvqlcquf")
                    .withTilePredictionsNmsThreshold("amxo")
                    .withValidationIouThreshold("gc")
                    .withValidationMetricType("yutehlkarvtipquk"),
                new ImageModelDistributionSettingsObjectDetection().withAmsGradient("b")
                    .withAugmentations("bvufrkwjiemimdtn")
                    .withBeta1("wew")
                    .withBeta2("kreeeddd")
                    .withDistributed("tfquu")
                    .withEarlyStopping("clhsiigeeuw")
                    .withEarlyStoppingDelay("nqyxfedq")
                    .withEarlyStoppingPatience("tdqwynxo")
                    .withEvaluationFrequency("vbzpggpwme")
                    .withEnableOnnxNormalization("bqajejir")
                    .withGradientAccumulationStep("vrvkgpogplb")
                    .withLayersToFreeze("vlnhx")
                    .withLearningRate("njhina")
                    .withLearningRateScheduler("esbxnepqmjmoplu")
                    .withModelName("ykkfhsovadkrm")
                    .withMomentum("mwqpdkesjqbzkqm")
                    .withNesterov("poriwbwggijtspzj")
                    .withNumberOfEpochs("rhikwsbzrhdug")
                    .withNumberOfWorkers("htrgz")
                    .withOptimizer("unjf")
                    .withRandomSeed("jhiycbauseqnczk")
                    .withStepLRGamma("hvtuwyjsqwzsz")
                    .withStepLRStepSize("zjg")
                    .withTrainingBatchSize("nkfnyskwwunq")
                    .withValidationBatchSize("za")
                    .withWarmupCosineLRCycles("jmslhi")
                    .withWarmupCosineLRWarmupEpochs("ukvbljpxpr")
                    .withWeightDecay("chyluqa")
                    .withBoxDetectionsPerImage("lhbimyii")
                    .withBoxScoreThreshold("a")
                    .withImageSize("thtpqgfzdosi")
                    .withMaxSize("d")
                    .withMinSize("vflgzhc")
                    .withModelSize("gwahcrxo")
                    .withMultiScale("rutvnpccxz")
                    .withNmsIouThreshold("xpmhzghhhk")
                    .withTileGridSize("njdtujqzvhnj")
                    .withTileOverlapRatio("mxnhtm")
                    .withTilePredictionsNmsThreshold("tqlfxolrwvtl")
                    .withValidationIouThreshold("yfjswequf")
                    .withValidationMetricType("yyopoaytwwgw"),
                new ImageModelDistributionSettingsObjectDetection().withAmsGradient("iys")
                    .withAugmentations("jsdjpg")
                    .withBeta1("ysgwkcfferznzcbi")
                    .withBeta2("veomkhfeqc")
                    .withDistributed("plfpohimgckycjp")
                    .withEarlyStopping("b")
                    .withEarlyStoppingDelay("bznxsuloutnpbm")
                    .withEarlyStoppingPatience("oqohgp")
                    .withEvaluationFrequency("dmwk")
                    .withEnableOnnxNormalization("pfhsldqdza")
                    .withGradientAccumulationStep("unye")
                    .withLayersToFreeze("yzdsytcikswhcam")
                    .withLearningRate("y")
                    .withLearningRateScheduler("xkcgsfcmvhadr")
                    .withModelName("atvyrkljqkqws")
                    .withMomentum("tvjkowggxawwdm")
                    .withNesterov("pnkteiidlbovwb")
                    .withNumberOfEpochs("prgeg")
                    .withNumberOfWorkers("ihkjcnerekyjuls")
                    .withOptimizer("wnqhqlqgpwxtvc")
                    .withRandomSeed("avv")
                    .withStepLRGamma("xwvegenlrj")
                    .withStepLRStepSize("mwevguyflnxel")
                    .withTrainingBatchSize("kfzcdetowwezhy")
                    .withValidationBatchSize("di")
                    .withWarmupCosineLRCycles("wqlqacs")
                    .withWarmupCosineLRWarmupEpochs("birtybcelfjn")
                    .withWeightDecay("dnjyhzfax")
                    .withBoxDetectionsPerImage("cufjjfxt")
                    .withBoxScoreThreshold("tqdstahhhsa")
                    .withImageSize("xsri")
                    .withMaxSize("cw")
                    .withMinSize("aesyyefm")
                    .withModelSize("oqotiiqbgpasrv")
                    .withMultiScale("tistyikjhorlx")
                    .withNmsIouThreshold("ypk")
                    .withTileGridSize("nycntr")
                    .withTileOverlapRatio("xwtdmbqjtsuhqh")
                    .withTilePredictionsNmsThreshold("xtdyqavfxbqmzxsy")
                    .withValidationIouThreshold("sinpaamihwbghvw")
                    .withValidationMetricType("pbgchcgsfzhb")));
        model = BinaryData.fromObject(model).toObject(ImageObjectDetectionBase.class);
        Assertions.assertEquals(2124800129, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT94H33M13S"), model.limitSettings().timeout());
        Assertions.assertEquals(1476171773, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals(334216826, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(297072472, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals("yhl", model.validationData().description());
        Assertions.assertEquals("xsorchazr", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals(53.57251340621531D, model.validationDataSize());
        Assertions.assertEquals(false, model.modelSettings().amsGradient());
        Assertions.assertEquals("vfjyzufldif", model.modelSettings().advancedSettings());
        Assertions.assertEquals("vlutggmaacxauhv", model.modelSettings().augmentations());
        Assertions.assertEquals(26.423735F, model.modelSettings().beta1());
        Assertions.assertEquals(35.01808F, model.modelSettings().beta2());
        Assertions.assertEquals(79908941, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("qxtoiyygktsrjyxx", model.modelSettings().checkpointRunId());
        Assertions.assertEquals("xphsowbe", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals("wfzbkve", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(true, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1870801520, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(1858531947, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(500672005, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(true, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(1493541388, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(1056931812, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(71.24121F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.STEP, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("rafjajvkyxmm", model.modelSettings().modelName());
        Assertions.assertEquals(42.656822F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1801731269, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1139337478, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.modelSettings().optimizer());
        Assertions.assertEquals(1799945532, model.modelSettings().randomSeed());
        Assertions.assertEquals(31.64695F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(762243556, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(250358057, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(403241529, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(45.694794F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(459919584, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(87.26493F, model.modelSettings().weightDecay());
        Assertions.assertEquals(1628267631, model.modelSettings().boxDetectionsPerImage());
        Assertions.assertEquals(29.993313F, model.modelSettings().boxScoreThreshold());
        Assertions.assertEquals(1142675426, model.modelSettings().imageSize());
        Assertions.assertEquals(926269302, model.modelSettings().maxSize());
        Assertions.assertEquals(1191635799, model.modelSettings().minSize());
        Assertions.assertEquals(ModelSize.EXTRA_LARGE, model.modelSettings().modelSize());
        Assertions.assertEquals(false, model.modelSettings().multiScale());
        Assertions.assertEquals(32.659657F, model.modelSettings().nmsIouThreshold());
        Assertions.assertEquals("taxjucltjlxsgce", model.modelSettings().tileGridSize());
        Assertions.assertEquals(78.93754F, model.modelSettings().tileOverlapRatio());
        Assertions.assertEquals(16.3262F, model.modelSettings().tilePredictionsNmsThreshold());
        Assertions.assertEquals(95.671394F, model.modelSettings().validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.VOC, model.modelSettings().validationMetricType());
        Assertions.assertEquals("wczochw", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("k", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("ynfpkyvnhiysdho", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("slhraqkiwlwkff", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("qwmwqoguflteat", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("gefzj", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("jtqbgysi", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("hnvxwtd", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("cbjdbtqy", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("xu", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("aujqgbbjv", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("oawh", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("smbcsloygsab", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("d", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("ronsdunr", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("vz", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("tqhgz", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("xtrvfdbqs", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("qjbvitptpvsffa", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("hpiwrmu", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("gjw", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("fdwfbwxy", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("qtmg", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("pdrmegajr", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("twymzs", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("qkkge", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("iphgli", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("qsco", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("yphfxnrpdh", model.searchSpace().get(0).boxDetectionsPerImage());
        Assertions.assertEquals("okyqsfkxfsy", model.searchSpace().get(0).boxScoreThreshold());
        Assertions.assertEquals("ihqbtod", model.searchSpace().get(0).imageSize());
        Assertions.assertEquals("yxbvkvwzdmv", model.searchSpace().get(0).maxSize());
        Assertions.assertEquals("qwcrugyo", model.searchSpace().get(0).minSize());
        Assertions.assertEquals("za", model.searchSpace().get(0).modelSize());
        Assertions.assertEquals("jdvvlrhocr", model.searchSpace().get(0).multiScale());
        Assertions.assertEquals("vxundqzbvbps", model.searchSpace().get(0).nmsIouThreshold());
        Assertions.assertEquals("qhxtozfgdkwbkur", model.searchSpace().get(0).tileGridSize());
        Assertions.assertEquals("piigf", model.searchSpace().get(0).tileOverlapRatio());
        Assertions.assertEquals("keutuipjclzjwaq", model.searchSpace().get(0).tilePredictionsNmsThreshold());
        Assertions.assertEquals("qydewuwxyllz", model.searchSpace().get(0).validationIouThreshold());
        Assertions.assertEquals("evt", model.searchSpace().get(0).validationMetricType());
    }
}
