// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;

/** Samples for ManagedClusters ListClusterAdminCredentials. */
public final class ManagedClustersListClusterAdminCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-04-01/examples/ManagedClustersListClusterCredentialResult.json
     */
    /**
     * Sample code: Get Managed Cluster.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagedCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .listClusterAdminCredentialsWithResponse("rg1", "clustername1", null, Context.NONE);
    }
}
