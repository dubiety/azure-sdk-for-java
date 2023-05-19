// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VpnServerConfigurations List. */
public final class VpnServerConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/VpnServerConfigurationList.json
     */
    /**
     * Sample code: VpnServerConfigurationList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnServerConfigurationList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVpnServerConfigurations().list(com.azure.core.util.Context.NONE);
    }
}
