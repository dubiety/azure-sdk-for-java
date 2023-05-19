// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for DdosProtectionPlans List. */
public final class DdosProtectionPlansListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/DdosProtectionPlanListAll.json
     */
    /**
     * Sample code: List all DDoS protection plans.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllDDoSProtectionPlans(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getDdosProtectionPlans().list(com.azure.core.util.Context.NONE);
    }
}
