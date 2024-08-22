// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.ContainerType;
import com.azure.resourcemanager.machinelearning.models.DeploymentLogsRequest;

/**
 * Samples for OnlineDeployments GetLogs.
 */
public final class OnlineDeploymentsGetLogsSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/OnlineDeployment/getLogs.json
     */
    /**
     * Sample code: Get Online Deployment Logs.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        getOnlineDeploymentLogs(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.onlineDeployments()
            .getLogsWithResponse("testrg123", "workspace123", "testEndpoint", "testDeployment",
                new DeploymentLogsRequest().withContainerType(ContainerType.STORAGE_INITIALIZER).withTail(0),
                com.azure.core.util.Context.NONE);
    }
}
