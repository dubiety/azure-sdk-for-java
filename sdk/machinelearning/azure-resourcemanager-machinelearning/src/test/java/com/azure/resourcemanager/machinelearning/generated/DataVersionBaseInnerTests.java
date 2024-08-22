// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.DataVersionBaseInner;
import com.azure.resourcemanager.machinelearning.models.DataVersionBaseProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataVersionBaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataVersionBaseInner model = BinaryData.fromString(
            "{\"properties\":{\"dataType\":\"DataVersionBaseProperties\",\"dataUri\":\"widf\",\"isArchived\":true,\"isAnonymous\":true,\"description\":\"unnoxyhk\",\"tags\":{\"oqcaaewdaomdj\":\"ddrihpf\",\"jxxkzbrmsgei\":\"l\",\"ggcula\":\"siykzkdncjdxonbz\",\"y\":\"z\"},\"properties\":{\"ajlyjtlvofqzhv\":\"ogtqxepnylbf\",\"fmo\":\"cib\",\"dwxf\":\"uxrkjp\",\"rkambt\":\"wiivwzjbhyzsx\"}},\"id\":\"egv\",\"name\":\"nvuqeqvldspa\",\"type\":\"tjb\"}")
            .toObject(DataVersionBaseInner.class);
        Assertions.assertEquals("unnoxyhk", model.properties().description());
        Assertions.assertEquals("ddrihpf", model.properties().tags().get("oqcaaewdaomdj"));
        Assertions.assertEquals("ogtqxepnylbf", model.properties().properties().get("ajlyjtlvofqzhv"));
        Assertions.assertEquals(true, model.properties().isArchived());
        Assertions.assertEquals(true, model.properties().isAnonymous());
        Assertions.assertEquals("widf", model.properties().dataUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataVersionBaseInner model = new DataVersionBaseInner().withProperties(new DataVersionBaseProperties()
            .withDescription("unnoxyhk")
            .withTags(mapOf("oqcaaewdaomdj", "ddrihpf", "jxxkzbrmsgei", "l", "ggcula", "siykzkdncjdxonbz", "y", "z"))
            .withProperties(
                mapOf("ajlyjtlvofqzhv", "ogtqxepnylbf", "fmo", "cib", "dwxf", "uxrkjp", "rkambt", "wiivwzjbhyzsx"))
            .withIsArchived(true)
            .withIsAnonymous(true)
            .withDataUri("widf"));
        model = BinaryData.fromObject(model).toObject(DataVersionBaseInner.class);
        Assertions.assertEquals("unnoxyhk", model.properties().description());
        Assertions.assertEquals("ddrihpf", model.properties().tags().get("oqcaaewdaomdj"));
        Assertions.assertEquals("ogtqxepnylbf", model.properties().properties().get("ajlyjtlvofqzhv"));
        Assertions.assertEquals(true, model.properties().isArchived());
        Assertions.assertEquals(true, model.properties().isAnonymous());
        Assertions.assertEquals("widf", model.properties().dataUri());
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
