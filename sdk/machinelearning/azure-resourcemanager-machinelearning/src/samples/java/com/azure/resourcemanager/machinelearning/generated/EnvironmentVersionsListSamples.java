// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for EnvironmentVersions List.
 */
public final class EnvironmentVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Workspace/EnvironmentVersion/list.json
     */
    /**
     * Sample code: List Workspace Environment Version.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        listWorkspaceEnvironmentVersion(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.environmentVersions()
            .list("test-rg", "my-aml-workspace", "string", "string", 1, null, null, com.azure.core.util.Context.NONE);
    }
}
