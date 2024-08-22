// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for RegistryDataContainers Get.
 */
public final class RegistryDataContainersGetSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Registry/DataContainer/get.json
     */
    /**
     * Sample code: Get Registry Data Container.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        getRegistryDataContainer(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.registryDataContainers()
            .getWithResponse("test-rg", "registryName", "string", com.azure.core.util.Context.NONE);
    }
}
