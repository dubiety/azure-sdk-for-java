// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatasetReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatasetReference model = BinaryData.fromString(
            "{\"referenceName\":\"kmyjmkxett\",\"parameters\":{\"dnqtoqxjhqx\":\"dataojfkq\",\"htkbtnq\":\"datas\",\"mbiipsnawwlqk\":\"datarngl\"}}")
            .toObject(DatasetReference.class);
        Assertions.assertEquals("kmyjmkxett", model.referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatasetReference model = new DatasetReference().withReferenceName("kmyjmkxett")
            .withParameters(mapOf("dnqtoqxjhqx", "dataojfkq", "htkbtnq", "datas", "mbiipsnawwlqk", "datarngl"));
        model = BinaryData.fromObject(model).toObject(DatasetReference.class);
        Assertions.assertEquals("kmyjmkxett", model.referenceName());
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
