// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics GetSiteDiagnosticCategory. */
public final class DiagnosticsGetSiteDiagnosticCategorySamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_GetSiteDiagnosticCategory.json
     */
    /**
     * Sample code: Get App Diagnostic Category.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppDiagnosticCategory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDiagnosticCategoryWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_GetSiteDiagnosticCategorySlot.json
     */
    /**
     * Sample code: Get App Slot Diagnostic Category.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSlotDiagnosticCategory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getSiteDiagnosticCategoryWithResponse(
                "Sample-WestUSResourceGroup", "SampleApp", "availability", Context.NONE);
    }
}
