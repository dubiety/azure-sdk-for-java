// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ComponentContainerProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ComponentContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentContainerProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Succeeded\",\"isArchived\":true,\"latestVersion\":\"epbqpcrfkbw\",\"nextVersion\":\"snjvcdwxlpqekftn\",\"description\":\"tjsyin\",\"tags\":{\"gikdgsz\":\"qatmtdhtmdvy\"},\"properties\":{\"kj\":\"birryuzhl\"}}")
            .toObject(ComponentContainerProperties.class);
        Assertions.assertEquals("tjsyin", model.description());
        Assertions.assertEquals("qatmtdhtmdvy", model.tags().get("gikdgsz"));
        Assertions.assertEquals("birryuzhl", model.properties().get("kj"));
        Assertions.assertEquals(true, model.isArchived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentContainerProperties model = new ComponentContainerProperties().withDescription("tjsyin")
            .withTags(mapOf("gikdgsz", "qatmtdhtmdvy"))
            .withProperties(mapOf("kj", "birryuzhl"))
            .withIsArchived(true);
        model = BinaryData.fromObject(model).toObject(ComponentContainerProperties.class);
        Assertions.assertEquals("tjsyin", model.description());
        Assertions.assertEquals("qatmtdhtmdvy", model.tags().get("gikdgsz"));
        Assertions.assertEquals("birryuzhl", model.properties().get("kj"));
        Assertions.assertEquals(true, model.isArchived());
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
