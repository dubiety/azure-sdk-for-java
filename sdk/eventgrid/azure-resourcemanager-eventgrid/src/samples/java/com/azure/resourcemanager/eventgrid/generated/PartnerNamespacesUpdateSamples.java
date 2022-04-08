// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespace;
import java.util.HashMap;
import java.util.Map;

/** Samples for PartnerNamespaces Update. */
public final class PartnerNamespacesUpdateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/PartnerNamespaces_Update.json
     */
    /**
     * Sample code: PartnerNamespaces_Update.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerNamespacesUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        PartnerNamespace resource =
            manager
                .partnerNamespaces()
                .getByResourceGroupWithResponse("examplerg", "examplePartnerNamespaceName1", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
    }

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
