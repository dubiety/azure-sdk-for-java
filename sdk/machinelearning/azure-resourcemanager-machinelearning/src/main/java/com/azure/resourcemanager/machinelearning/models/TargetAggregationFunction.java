// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Target aggregate function.
 */
public final class TargetAggregationFunction extends ExpandableStringEnum<TargetAggregationFunction> {
    /**
     * Static value None for TargetAggregationFunction.
     */
    public static final TargetAggregationFunction NONE = fromString("None");

    /**
     * Static value Sum for TargetAggregationFunction.
     */
    public static final TargetAggregationFunction SUM = fromString("Sum");

    /**
     * Static value Max for TargetAggregationFunction.
     */
    public static final TargetAggregationFunction MAX = fromString("Max");

    /**
     * Static value Min for TargetAggregationFunction.
     */
    public static final TargetAggregationFunction MIN = fromString("Min");

    /**
     * Static value Mean for TargetAggregationFunction.
     */
    public static final TargetAggregationFunction MEAN = fromString("Mean");

    /**
     * Creates a new instance of TargetAggregationFunction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TargetAggregationFunction() {
    }

    /**
     * Creates or finds a TargetAggregationFunction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TargetAggregationFunction.
     */
    public static TargetAggregationFunction fromString(String name) {
        return fromString(name, TargetAggregationFunction.class);
    }

    /**
     * Gets known TargetAggregationFunction values.
     * 
     * @return known TargetAggregationFunction values.
     */
    public static Collection<TargetAggregationFunction> values() {
        return values(TargetAggregationFunction.class);
    }
}
