// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for ScheduledQueryRules Delete.
 */
public final class ScheduledQueryRulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/stable/2022-06-15/examples/deleteScheduledQueryRule.
     * json
     */
    /**
     * Sample code: Delete a scheduled query rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAScheduledQueryRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings()
            .manager()
            .serviceClient()
            .getScheduledQueryRules()
            .deleteWithResponse("QueryResourceGroupName", "heartbeat", com.azure.core.util.Context.NONE);
    }
}
