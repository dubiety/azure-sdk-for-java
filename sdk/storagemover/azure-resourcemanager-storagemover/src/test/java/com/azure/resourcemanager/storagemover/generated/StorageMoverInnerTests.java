// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.StorageMoverInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StorageMoverInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageMoverInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"vpjhulsuuv\",\"provisioningState\":\"Succeeded\"},\"location\":\"zkrwfn\",\"tags\":{\"jdpvwryo\":\"djpslw\",\"hbcryffdfdosyge\":\"psoacctazakljl\",\"rzevdphlxaol\":\"paojakhmsbzjh\"},\"id\":\"hqtrgqjbpf\",\"name\":\"fsinzgvfcjrwzoxx\",\"type\":\"tfell\"}")
                .toObject(StorageMoverInner.class);
        Assertions.assertEquals("zkrwfn", model.location());
        Assertions.assertEquals("djpslw", model.tags().get("jdpvwryo"));
        Assertions.assertEquals("vpjhulsuuv", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageMoverInner model =
            new StorageMoverInner()
                .withLocation("zkrwfn")
                .withTags(
                    mapOf("jdpvwryo", "djpslw", "hbcryffdfdosyge", "psoacctazakljl", "rzevdphlxaol", "paojakhmsbzjh"))
                .withDescription("vpjhulsuuv");
        model = BinaryData.fromObject(model).toObject(StorageMoverInner.class);
        Assertions.assertEquals("zkrwfn", model.location());
        Assertions.assertEquals("djpslw", model.tags().get("jdpvwryo"));
        Assertions.assertEquals("vpjhulsuuv", model.description());
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
