// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplate;

/** Samples for WorkbookTemplates Update. */
public final class WorkbookTemplatesUpdateSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2020-11-20/examples/WorkbookTemplateUpdate.json
     */
    /**
     * Sample code: WorkbookTemplateUpdate.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookTemplateUpdate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        WorkbookTemplate resource =
            manager
                .workbookTemplates()
                .getByResourceGroupWithResponse("my-resource-group", "my-template-resource", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
