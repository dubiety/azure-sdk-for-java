// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for FirewallPolicyRuleCollectionGroups Get. */
public final class FirewallPolicyRuleCollectionGroupsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/FirewallPolicyNatRuleCollectionGroupGet.json
     */
    /**
     * Sample code: Get FirewallPolicyNatRuleCollectionGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFirewallPolicyNatRuleCollectionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/FirewallPolicyRuleCollectionGroupWithWebCategoriesGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup With Web Categories.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFirewallPolicyRuleCollectionGroupWithWebCategories(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/FirewallPolicyRuleCollectionGroupGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFirewallPolicyRuleCollectionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/FirewallPolicyRuleCollectionGroupWithIpGroupsGet.json
     */
    /**
     * Sample code: Get FirewallPolicyRuleCollectionGroup With IpGroups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getFirewallPolicyRuleCollectionGroupWithIpGroups(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .getWithResponse("rg1", "firewallPolicy", "ruleGroup1", com.azure.core.util.Context.NONE);
    }
}
