// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.CustomTargetLags;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomTargetLagsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomTargetLags model = BinaryData.fromString("{\"mode\":\"Custom\",\"values\":[798032974,467459839]}")
            .toObject(CustomTargetLags.class);
        Assertions.assertEquals(798032974, model.values().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomTargetLags model = new CustomTargetLags().withValues(Arrays.asList(798032974, 467459839));
        model = BinaryData.fromObject(model).toObject(CustomTargetLags.class);
        Assertions.assertEquals(798032974, model.values().get(0));
    }
}
