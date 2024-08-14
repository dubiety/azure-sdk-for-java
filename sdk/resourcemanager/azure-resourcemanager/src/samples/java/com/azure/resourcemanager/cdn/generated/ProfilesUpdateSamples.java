// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.ProfileUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Profiles Update.
 */
public final class ProfilesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/Profiles_Update.json
     */
    /**
     * Sample code: Profiles_Update.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles()
            .manager()
            .serviceClient()
            .getProfiles()
            .update("RG", "profile1", new ProfileUpdateParameters().withTags(mapOf("additionalProperties", "Tag1")),
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
