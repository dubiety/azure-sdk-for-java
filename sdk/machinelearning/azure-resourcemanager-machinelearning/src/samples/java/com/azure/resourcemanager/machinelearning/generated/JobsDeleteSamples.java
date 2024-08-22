// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for Jobs Delete.
 */
public final class JobsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Job/delete.json
     */
    /**
     * Sample code: Delete Job.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.jobs()
            .delete("test-rg", "my-aml-workspace",
                "http://subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.MachineLearningServices/workspaces/{workspaceName}/jobs/my-favorite-aml-job",
                com.azure.core.util.Context.NONE);
    }
}
