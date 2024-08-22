// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.ListViewType;

/**
 * Samples for RegistryDataVersions List.
 */
public final class RegistryDataVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Registry/DataVersionBase/registryList.json
     */
    /**
     * Sample code: RegistryList Registry Data Version Base.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        registryListRegistryDataVersionBase(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.registryDataVersions()
            .list("test-rg", "registryName", "string", "string", 1, null, "string", ListViewType.ARCHIVED_ONLY,
                com.azure.core.util.Context.NONE);
    }
}
