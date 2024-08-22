// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.MonitoringThreshold;
import com.azure.resourcemanager.machinelearning.models.NumericalDataQualityMetric;
import com.azure.resourcemanager.machinelearning.models.NumericalDataQualityMetricThreshold;
import org.junit.jupiter.api.Assertions;

public final class NumericalDataQualityMetricThresholdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NumericalDataQualityMetricThreshold model = BinaryData.fromString(
            "{\"dataType\":\"Numerical\",\"metric\":\"OutOfBoundsRate\",\"threshold\":{\"value\":97.91248731841587}}")
            .toObject(NumericalDataQualityMetricThreshold.class);
        Assertions.assertEquals(97.91248731841587D, model.threshold().value());
        Assertions.assertEquals(NumericalDataQualityMetric.OUT_OF_BOUNDS_RATE, model.metric());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NumericalDataQualityMetricThreshold model = new NumericalDataQualityMetricThreshold()
            .withThreshold(new MonitoringThreshold().withValue(97.91248731841587D))
            .withMetric(NumericalDataQualityMetric.OUT_OF_BOUNDS_RATE);
        model = BinaryData.fromObject(model).toObject(NumericalDataQualityMetricThreshold.class);
        Assertions.assertEquals(97.91248731841587D, model.threshold().value());
        Assertions.assertEquals(NumericalDataQualityMetric.OUT_OF_BOUNDS_RATE, model.metric());
    }
}
