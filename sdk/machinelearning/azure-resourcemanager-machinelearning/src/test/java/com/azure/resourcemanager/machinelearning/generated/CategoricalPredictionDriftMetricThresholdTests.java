// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.CategoricalPredictionDriftMetric;
import com.azure.resourcemanager.machinelearning.models.CategoricalPredictionDriftMetricThreshold;
import com.azure.resourcemanager.machinelearning.models.MonitoringThreshold;
import org.junit.jupiter.api.Assertions;

public final class CategoricalPredictionDriftMetricThresholdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CategoricalPredictionDriftMetricThreshold model = BinaryData.fromString(
            "{\"dataType\":\"Categorical\",\"metric\":\"PopulationStabilityIndex\",\"threshold\":{\"value\":29.225647005199463}}")
            .toObject(CategoricalPredictionDriftMetricThreshold.class);
        Assertions.assertEquals(29.225647005199463D, model.threshold().value());
        Assertions.assertEquals(CategoricalPredictionDriftMetric.POPULATION_STABILITY_INDEX, model.metric());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CategoricalPredictionDriftMetricThreshold model = new CategoricalPredictionDriftMetricThreshold()
            .withThreshold(new MonitoringThreshold().withValue(29.225647005199463D))
            .withMetric(CategoricalPredictionDriftMetric.POPULATION_STABILITY_INDEX);
        model = BinaryData.fromObject(model).toObject(CategoricalPredictionDriftMetricThreshold.class);
        Assertions.assertEquals(29.225647005199463D, model.threshold().value());
        Assertions.assertEquals(CategoricalPredictionDriftMetric.POPULATION_STABILITY_INDEX, model.metric());
    }
}
