// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for OnlineDeployments Get.
 */
public final class OnlineDeploymentsGetSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/OnlineDeployment/KubernetesOnlineDeployment/get.json
     */
    /**
     * Sample code: Get Kubernetes Online Deployment.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        getKubernetesOnlineDeployment(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.onlineDeployments()
            .getWithResponse("test-rg", "my-aml-workspace", "testEndpointName", "testDeploymentName",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/OnlineDeployment/ManagedOnlineDeployment/get.json
     */
    /**
     * Sample code: Get Managed Online Deployment.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        getManagedOnlineDeployment(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.onlineDeployments()
            .getWithResponse("test-rg", "my-aml-workspace", "testEndpointName", "testDeploymentName",
                com.azure.core.util.Context.NONE);
    }
}
