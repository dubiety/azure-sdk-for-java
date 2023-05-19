// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for PrivateDnsZoneGroups Delete. */
public final class PrivateDnsZoneGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/PrivateEndpointDnsZoneGroupDelete.json
     */
    /**
     * Sample code: Delete private dns zone group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletePrivateDnsZoneGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateDnsZoneGroups()
            .delete("rg1", "testPe", "testPdnsgroup", com.azure.core.util.Context.NONE);
    }
}
