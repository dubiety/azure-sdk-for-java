// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for AgentPools UpgradeNodeImageVersion. */
public final class AgentPoolsUpgradeNodeImageVersionSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-04-01/examples/AgentPoolsUpgradeNodeImageVersion.json
     */
    /**
     * Sample code: Upgrade Agent Pool Node Image Version.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void upgradeAgentPoolNodeImageVersion(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .upgradeNodeImageVersion("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
