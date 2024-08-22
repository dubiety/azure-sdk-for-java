// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for Datastores Delete.
 */
public final class DatastoresDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Datastore/delete.json
     */
    /**
     * Sample code: Delete datastore.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteDatastore(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.datastores()
            .deleteWithResponse("test-rg", "my-aml-workspace", "string", com.azure.core.util.Context.NONE);
    }
}
