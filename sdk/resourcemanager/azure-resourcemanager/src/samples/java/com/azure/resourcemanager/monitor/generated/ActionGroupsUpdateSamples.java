// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.resourcemanager.monitor.models.ActionGroupPatchBody;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ActionGroups Update.
 */
public final class ActionGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/stable/2022-06-01/examples/patchActionGroup.json
     */
    /**
     * Sample code: Patch an action group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchAnActionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings()
            .manager()
            .serviceClient()
            .getActionGroups()
            .updateWithResponse("Default-NotificationRules", "SampleActionGroup",
                new ActionGroupPatchBody()
                    .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
                    .withEnabled(false),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
