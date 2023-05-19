// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ManagementGroupNetworkManagerConnections Delete. */
public final class ManagementGroupNetworkManagerConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/NetworkManagerConnectionManagementGroupDelete.json
     */
    /**
     * Sample code: Delete Management Group Network Manager Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteManagementGroupNetworkManagerConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getManagementGroupNetworkManagerConnections()
            .deleteWithResponse("managementGroupA", "TestNMConnection", com.azure.core.util.Context.NONE);
    }
}
