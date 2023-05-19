// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for RouteFilters GetByResourceGroup. */
public final class RouteFiltersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/RouteFilterGet.json
     */
    /**
     * Sample code: RouteFilterGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeFilterGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRouteFilters()
            .getByResourceGroupWithResponse("rg1", "filterName", null, com.azure.core.util.Context.NONE);
    }
}
