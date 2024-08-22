// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PartialMinimalTrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartialMinimalTrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartialMinimalTrackedResource model = BinaryData.fromString("{\"tags\":{\"pttaqutd\":\"snptfujgicgaao\"}}")
            .toObject(PartialMinimalTrackedResource.class);
        Assertions.assertEquals("snptfujgicgaao", model.tags().get("pttaqutd"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartialMinimalTrackedResource model
            = new PartialMinimalTrackedResource().withTags(mapOf("pttaqutd", "snptfujgicgaao"));
        model = BinaryData.fromObject(model).toObject(PartialMinimalTrackedResource.class);
        Assertions.assertEquals("snptfujgicgaao", model.tags().get("pttaqutd"));
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
