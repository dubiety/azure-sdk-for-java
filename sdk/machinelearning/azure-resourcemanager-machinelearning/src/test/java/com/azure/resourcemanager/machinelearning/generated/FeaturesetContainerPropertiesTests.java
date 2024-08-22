// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainerProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FeaturesetContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FeaturesetContainerProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Succeeded\",\"isArchived\":false,\"latestVersion\":\"wkojpllndnpd\",\"nextVersion\":\"pqafgfugsnnfhy\",\"description\":\"efy\",\"tags\":{\"rmlmuowo\":\"octfjgtixrjvzuyt\"},\"properties\":{\"p\":\"uir\"}}")
            .toObject(FeaturesetContainerProperties.class);
        Assertions.assertEquals("efy", model.description());
        Assertions.assertEquals("octfjgtixrjvzuyt", model.tags().get("rmlmuowo"));
        Assertions.assertEquals("uir", model.properties().get("p"));
        Assertions.assertEquals(false, model.isArchived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FeaturesetContainerProperties model = new FeaturesetContainerProperties().withDescription("efy")
            .withTags(mapOf("rmlmuowo", "octfjgtixrjvzuyt"))
            .withProperties(mapOf("p", "uir"))
            .withIsArchived(false);
        model = BinaryData.fromObject(model).toObject(FeaturesetContainerProperties.class);
        Assertions.assertEquals("efy", model.description());
        Assertions.assertEquals("octfjgtixrjvzuyt", model.tags().get("rmlmuowo"));
        Assertions.assertEquals("uir", model.properties().get("p"));
        Assertions.assertEquals(false, model.isArchived());
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
