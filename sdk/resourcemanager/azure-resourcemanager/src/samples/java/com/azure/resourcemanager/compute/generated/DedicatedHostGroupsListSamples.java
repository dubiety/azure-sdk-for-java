// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for DedicatedHostGroups List. */
public final class DedicatedHostGroupsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/DedicatedHostGroups_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_ListBySubscription_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupsListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDedicatedHostGroups().list(Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/DedicatedHostGroups_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_ListBySubscription_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupsListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDedicatedHostGroups().list(Context.NONE);
    }
}
