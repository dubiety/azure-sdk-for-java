// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.models.AmlToken;
import com.azure.resourcemanager.machinelearning.models.AutoMLJob;
import com.azure.resourcemanager.machinelearning.models.CommandJob;
import com.azure.resourcemanager.machinelearning.models.CommandJobLimits;
import com.azure.resourcemanager.machinelearning.models.Goal;
import com.azure.resourcemanager.machinelearning.models.GridSamplingAlgorithm;
import com.azure.resourcemanager.machinelearning.models.ImageClassification;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.JobResourceConfiguration;
import com.azure.resourcemanager.machinelearning.models.JobService;
import com.azure.resourcemanager.machinelearning.models.LiteralJobInput;
import com.azure.resourcemanager.machinelearning.models.MedianStoppingPolicy;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.Mpi;
import com.azure.resourcemanager.machinelearning.models.Objective;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.PipelineJob;
import com.azure.resourcemanager.machinelearning.models.SweepJob;
import com.azure.resourcemanager.machinelearning.models.SweepJobLimits;
import com.azure.resourcemanager.machinelearning.models.TensorFlow;
import com.azure.resourcemanager.machinelearning.models.TrialComponent;
import com.azure.resourcemanager.machinelearning.models.UriFileJobOutput;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Jobs CreateOrUpdate.
 */
public final class JobsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Job/AutoMLJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate AutoML Job.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateAutoMLJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager)
        throws IOException {
        manager.jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(new AutoMLJob().withDescription("string")
                .withTags(mapOf("string", "string"))
                .withProperties(mapOf("string", "string"))
                .withDisplayName("string")
                .withExperimentName("string")
                .withServices(mapOf("string",
                    new JobService().withJobServiceType("string")
                        .withPort(1)
                        .withEndpoint("string")
                        .withProperties(mapOf("string", "string"))))
                .withComputeId("string")
                .withIsArchived(false)
                .withIdentity(new AmlToken())
                .withResources(new JobResourceConfiguration().withInstanceCount(1)
                    .withInstanceType("string")
                    .withProperties(mapOf("string",
                        SerializerFactory.createDefaultManagementSerializerAdapter()
                            .deserialize("{\"9bec0ab0-c62f-4fa9-a97c-7b24bbcc90ad\":null}", Object.class,
                                SerializerEncoding.JSON))))
                .withEnvironmentId("string")
                .withEnvironmentVariables(mapOf("string", "string"))
                .withTaskDetails(new ImageClassification().withTrainingData(new MLTableJobInput().withUri("string"))
                    .withTargetColumnName("string")
                    .withModelSettings(new ImageModelSettingsClassification().withValidationCropSize(2))
                    .withSearchSpace(Arrays.asList(
                        new ImageModelDistributionSettingsClassification().withValidationCropSize("choice(2, 360)")))
                    .withLimitSettings(new ImageLimitSettings().withMaxTrials(2)))
                .withOutputs(mapOf("string",
                    new UriFileJobOutput().withDescription("string")
                        .withUri("string")
                        .withMode(OutputDeliveryMode.READ_WRITE_MOUNT))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Job/SweepJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Sweep Job.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateSweepJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager)
        throws IOException {
        manager.jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(new SweepJob().withDescription("string")
                .withTags(mapOf("string", "string"))
                .withProperties(mapOf("string", "string"))
                .withDisplayName("string")
                .withExperimentName("string")
                .withServices(mapOf("string",
                    new JobService().withJobServiceType("string")
                        .withPort(1)
                        .withEndpoint("string")
                        .withProperties(mapOf("string", "string"))))
                .withComputeId("string")
                .withSearchSpace(SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{\"string\":{}}", Object.class, SerializerEncoding.JSON))
                .withSamplingAlgorithm(new GridSamplingAlgorithm())
                .withLimits(new SweepJobLimits().withMaxTotalTrials(1)
                    .withMaxConcurrentTrials(1)
                    .withTrialTimeout(Duration.parse("PT1S")))
                .withEarlyTermination(new MedianStoppingPolicy().withEvaluationInterval(1).withDelayEvaluation(1))
                .withObjective(new Objective().withPrimaryMetric("string").withGoal(Goal.MINIMIZE))
                .withTrial(new TrialComponent().withCodeId("fakeTokenPlaceholder")
                    .withCommand("string")
                    .withEnvironmentId("string")
                    .withEnvironmentVariables(mapOf("string", "string"))
                    .withDistribution(new Mpi().withProcessCountPerInstance(1))
                    .withResources(new JobResourceConfiguration().withInstanceCount(1)
                        .withInstanceType("string")
                        .withProperties(mapOf("string",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("{\"e6b6493e-7d5e-4db3-be1e-306ec641327e\":null}", Object.class,
                                    SerializerEncoding.JSON))))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Job/PipelineJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Pipeline Job.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdatePipelineJob(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager.jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(new PipelineJob().withDescription("string")
                .withTags(mapOf("string", "string"))
                .withProperties(mapOf("string", "string"))
                .withDisplayName("string")
                .withExperimentName("string")
                .withServices(mapOf("string",
                    new JobService().withJobServiceType("string")
                        .withPort(1)
                        .withEndpoint("string")
                        .withProperties(mapOf("string", "string"))))
                .withComputeId("string")
                .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                .withInputs(mapOf("string", new LiteralJobInput().withDescription("string").withValue("string")))
                .withOutputs(mapOf("string",
                    new UriFileJobOutput().withDescription("string")
                        .withUri("string")
                        .withMode(OutputDeliveryMode.UPLOAD))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Job/CommandJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Command Job.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateCommandJob(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager.jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(new CommandJob().withDescription("string")
                .withTags(mapOf("string", "string"))
                .withProperties(mapOf("string", "string"))
                .withDisplayName("string")
                .withExperimentName("string")
                .withServices(mapOf("string",
                    new JobService().withJobServiceType("string")
                        .withPort(1)
                        .withEndpoint("string")
                        .withProperties(mapOf("string", "string"))))
                .withComputeId("string")
                .withIdentity(new AmlToken())
                .withResources(new JobResourceConfiguration().withInstanceCount(1)
                    .withInstanceType("string")
                    .withProperties(mapOf("string",
                        SerializerFactory.createDefaultManagementSerializerAdapter()
                            .deserialize("{\"e6b6493e-7d5e-4db3-be1e-306ec641327e\":null}", Object.class,
                                SerializerEncoding.JSON))))
                .withCodeId("fakeTokenPlaceholder")
                .withCommand("string")
                .withEnvironmentId("string")
                .withInputs(mapOf("string", new LiteralJobInput().withDescription("string").withValue("string")))
                .withOutputs(mapOf("string",
                    new UriFileJobOutput().withDescription("string")
                        .withUri("string")
                        .withMode(OutputDeliveryMode.READ_WRITE_MOUNT)))
                .withDistribution(new TensorFlow().withWorkerCount(1).withParameterServerCount(1))
                .withLimits(new CommandJobLimits().withTimeout(Duration.parse("PT5M")))
                .withEnvironmentVariables(mapOf("string", "string")))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
