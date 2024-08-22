// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ComponentContainerInner;
import com.azure.resourcemanager.machinelearning.models.ComponentContainerProperties;
import com.azure.resourcemanager.machinelearning.models.ComponentContainerResourceArmPaginatedResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ComponentContainerResourceArmPaginatedResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentContainerResourceArmPaginatedResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"isArchived\":false,\"latestVersion\":\"mwutwbdsre\",\"nextVersion\":\"drhneuyow\",\"description\":\"d\",\"tags\":{\"ib\":\"i\"},\"properties\":{\"lfzxiavrmbzonoki\":\"gpikpzimejza\",\"rgz\":\"rjqc\"}},\"id\":\"rlazszrnw\",\"name\":\"iin\",\"type\":\"fpwpjylwbt\"},{\"properties\":{\"provisioningState\":\"Failed\",\"isArchived\":false,\"latestVersion\":\"cdhszf\",\"nextVersion\":\"fbgofeljagrqmqh\",\"description\":\"vriiio\",\"tags\":{\"fk\":\"lg\"},\"properties\":{\"ueluqhhahhxvrhmz\":\"sexso\",\"ughftqsx\":\"wpjgwws\",\"grjguufzd\":\"qxujxukndxd\"}},\"id\":\"yqtfihwh\",\"name\":\"otzi\",\"type\":\"gamv\"}],\"nextLink\":\"ho\"}")
            .toObject(ComponentContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("d", model.value().get(0).properties().description());
        Assertions.assertEquals("i", model.value().get(0).properties().tags().get("ib"));
        Assertions.assertEquals("gpikpzimejza", model.value().get(0).properties().properties().get("lfzxiavrmbzonoki"));
        Assertions.assertEquals(false, model.value().get(0).properties().isArchived());
        Assertions.assertEquals("ho", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentContainerResourceArmPaginatedResult model
            = new ComponentContainerResourceArmPaginatedResult().withValue(Arrays.asList(
                new ComponentContainerInner().withProperties(new ComponentContainerProperties().withDescription("d")
                    .withTags(mapOf("ib", "i"))
                    .withProperties(mapOf("lfzxiavrmbzonoki", "gpikpzimejza", "rgz", "rjqc"))
                    .withIsArchived(false)),
                new ComponentContainerInner()
                    .withProperties(new ComponentContainerProperties().withDescription("vriiio")
                        .withTags(mapOf("fk", "lg"))
                        .withProperties(
                            mapOf("ueluqhhahhxvrhmz", "sexso", "ughftqsx", "wpjgwws", "grjguufzd", "qxujxukndxd"))
                        .withIsArchived(false))))
                .withNextLink("ho");
        model = BinaryData.fromObject(model).toObject(ComponentContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("d", model.value().get(0).properties().description());
        Assertions.assertEquals("i", model.value().get(0).properties().tags().get("ib"));
        Assertions.assertEquals("gpikpzimejza", model.value().get(0).properties().properties().get("lfzxiavrmbzonoki"));
        Assertions.assertEquals(false, model.value().get(0).properties().isArchived());
        Assertions.assertEquals("ho", model.nextLink());
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
