// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkVirtualApplianceConnectionInner;
import com.azure.resourcemanager.network.models.PropagatedRouteTableNfv;
import com.azure.resourcemanager.network.models.RoutingConfigurationNfv;
import com.azure.resourcemanager.network.models.RoutingConfigurationNfvSubResource;
import java.util.Arrays;

/** Samples for NetworkVirtualApplianceConnections CreateOrUpdate. */
public final class NetworkVirtualApplianceConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/NetworkVirtualApplianceConnectionPut.json
     */
    /**
     * Sample code: NetworkVirtualApplianceConnectionPut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkVirtualApplianceConnectionPut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkVirtualApplianceConnections()
            .createOrUpdate(
                "rg1",
                "nva1",
                "connection1",
                new NetworkVirtualApplianceConnectionInner()
                    .withNamePropertiesName("connection1")
                    .withAsn(64512L)
                    .withTunnelIdentifier(0L)
                    .withBgpPeerAddress(Arrays.asList("169.254.16.13", "169.254.16.14"))
                    .withEnableInternetSecurity(false)
                    .withRoutingConfiguration(
                        new RoutingConfigurationNfv()
                            .withAssociatedRouteTable(
                                new RoutingConfigurationNfvSubResource()
                                    .withResourceUri(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubRouteTables/hubRouteTable1"))
                            .withPropagatedRouteTables(
                                new PropagatedRouteTableNfv()
                                    .withLabels(Arrays.asList("label1"))
                                    .withIds(
                                        Arrays
                                            .asList(
                                                new RoutingConfigurationNfvSubResource()
                                                    .withResourceUri(
                                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubRouteTables/hubRouteTable1"))))
                            .withInboundRouteMap(
                                new RoutingConfigurationNfvSubResource()
                                    .withResourceUri(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/routeMaps/routeMap1"))
                            .withOutboundRouteMap(
                                new RoutingConfigurationNfvSubResource()
                                    .withResourceUri(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/routeMaps/routeMap2"))),
                com.azure.core.util.Context.NONE);
    }
}
