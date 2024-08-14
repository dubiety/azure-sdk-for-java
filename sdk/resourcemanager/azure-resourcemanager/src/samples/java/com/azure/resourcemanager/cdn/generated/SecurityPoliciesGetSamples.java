// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for SecurityPolicies Get.
 */
public final class SecurityPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/SecurityPolicies_Get.json
     */
    /**
     * Sample code: SecurityPolicies_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void securityPoliciesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles()
            .manager()
            .serviceClient()
            .getSecurityPolicies()
            .getWithResponse("RG", "profile1", "securityPolicy1", com.azure.core.util.Context.NONE);
    }
}
