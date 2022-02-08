// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for AvailabilitySets GetByResourceGroup. */
public final class AvailabilitySetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/AvailabilitySets_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySets_Get_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void availabilitySetsGetMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getAvailabilitySets()
            .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/AvailabilitySets_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySets_Get_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void availabilitySetsGetMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getAvailabilitySets()
            .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaa", Context.NONE);
    }
}
