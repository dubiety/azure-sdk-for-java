// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Primary metrics for InstanceSegmentation tasks.
 */
public final class InstanceSegmentationPrimaryMetrics extends ExpandableStringEnum<InstanceSegmentationPrimaryMetrics> {
    /**
     * Static value MeanAveragePrecision for InstanceSegmentationPrimaryMetrics.
     */
    public static final InstanceSegmentationPrimaryMetrics MEAN_AVERAGE_PRECISION = fromString("MeanAveragePrecision");

    /**
     * Creates a new instance of InstanceSegmentationPrimaryMetrics value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstanceSegmentationPrimaryMetrics() {
    }

    /**
     * Creates or finds a InstanceSegmentationPrimaryMetrics from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InstanceSegmentationPrimaryMetrics.
     */
    public static InstanceSegmentationPrimaryMetrics fromString(String name) {
        return fromString(name, InstanceSegmentationPrimaryMetrics.class);
    }

    /**
     * Gets known InstanceSegmentationPrimaryMetrics values.
     * 
     * @return known InstanceSegmentationPrimaryMetrics values.
     */
    public static Collection<InstanceSegmentationPrimaryMetrics> values() {
        return values(InstanceSegmentationPrimaryMetrics.class);
    }
}
