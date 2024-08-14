// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for Origins ListByEndpoint.
 */
public final class OriginsListByEndpointSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/Origins_ListByEndpoint.json
     */
    /**
     * Sample code: Origins_ListByEndpoint.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void originsListByEndpoint(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles()
            .manager()
            .serviceClient()
            .getOrigins()
            .listByEndpoint("RG", "profile1", "endpoint1", com.azure.core.util.Context.NONE);
    }
}
