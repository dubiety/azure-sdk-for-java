// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for AvailablePrivateEndpointTypes ListByResourceGroup. */
public final class AvailablePrivateEndpointTypesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/AvailablePrivateEndpointTypesResourceGroupGet.json
     */
    /**
     * Sample code: Get available PrivateEndpoint types in the resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailablePrivateEndpointTypesInTheResourceGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAvailablePrivateEndpointTypes()
            .listByResourceGroup("regionName", "rg1", com.azure.core.util.Context.NONE);
    }
}
