// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for EventCategories List.
 */
public final class EventCategoriesListSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/stable/2015-04-01/examples/GetEventCategories.json
     */
    /**
     * Sample code: Get event categories.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getEventCategories(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings()
            .manager()
            .serviceClient()
            .getEventCategories()
            .list(com.azure.core.util.Context.NONE);
    }
}
