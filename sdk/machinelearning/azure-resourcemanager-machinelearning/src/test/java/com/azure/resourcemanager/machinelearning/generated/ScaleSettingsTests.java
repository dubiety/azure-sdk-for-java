// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScaleSettings model = BinaryData.fromString(
            "{\"maxNodeCount\":1397437100,\"minNodeCount\":1232796575,\"nodeIdleTimeBeforeScaleDown\":\"PT232H8M24S\"}")
            .toObject(ScaleSettings.class);
        Assertions.assertEquals(1397437100, model.maxNodeCount());
        Assertions.assertEquals(1232796575, model.minNodeCount());
        Assertions.assertEquals(Duration.parse("PT232H8M24S"), model.nodeIdleTimeBeforeScaleDown());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScaleSettings model = new ScaleSettings().withMaxNodeCount(1397437100)
            .withMinNodeCount(1232796575)
            .withNodeIdleTimeBeforeScaleDown(Duration.parse("PT232H8M24S"));
        model = BinaryData.fromObject(model).toObject(ScaleSettings.class);
        Assertions.assertEquals(1397437100, model.maxNodeCount());
        Assertions.assertEquals(1232796575, model.minNodeCount());
        Assertions.assertEquals(Duration.parse("PT232H8M24S"), model.nodeIdleTimeBeforeScaleDown());
    }
}
