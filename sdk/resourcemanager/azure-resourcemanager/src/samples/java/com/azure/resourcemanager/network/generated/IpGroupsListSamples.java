// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for IpGroups List. */
public final class IpGroupsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/IpGroupsListBySubscription.json
     */
    /**
     * Sample code: List_IpGroups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listIpGroups(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getIpGroups().list(com.azure.core.util.Context.NONE);
    }
}
