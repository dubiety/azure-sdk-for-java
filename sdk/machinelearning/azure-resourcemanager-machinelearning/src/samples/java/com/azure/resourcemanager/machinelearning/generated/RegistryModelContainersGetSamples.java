// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for RegistryModelContainers Get.
 */
public final class RegistryModelContainersGetSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Registry/ModelContainer/get.json
     */
    /**
     * Sample code: Get Registry Model Container.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        getRegistryModelContainer(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.registryModelContainers()
            .getWithResponse("testrg123", "registry123", "testContainer", com.azure.core.util.Context.NONE);
    }
}
