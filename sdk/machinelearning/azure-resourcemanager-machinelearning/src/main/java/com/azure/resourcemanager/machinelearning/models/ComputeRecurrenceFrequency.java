// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum to describe the frequency of a compute recurrence schedule.
 */
public final class ComputeRecurrenceFrequency extends ExpandableStringEnum<ComputeRecurrenceFrequency> {
    /**
     * Static value Minute for ComputeRecurrenceFrequency.
     */
    public static final ComputeRecurrenceFrequency MINUTE = fromString("Minute");

    /**
     * Static value Hour for ComputeRecurrenceFrequency.
     */
    public static final ComputeRecurrenceFrequency HOUR = fromString("Hour");

    /**
     * Static value Day for ComputeRecurrenceFrequency.
     */
    public static final ComputeRecurrenceFrequency DAY = fromString("Day");

    /**
     * Static value Week for ComputeRecurrenceFrequency.
     */
    public static final ComputeRecurrenceFrequency WEEK = fromString("Week");

    /**
     * Static value Month for ComputeRecurrenceFrequency.
     */
    public static final ComputeRecurrenceFrequency MONTH = fromString("Month");

    /**
     * Creates a new instance of ComputeRecurrenceFrequency value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ComputeRecurrenceFrequency() {
    }

    /**
     * Creates or finds a ComputeRecurrenceFrequency from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ComputeRecurrenceFrequency.
     */
    public static ComputeRecurrenceFrequency fromString(String name) {
        return fromString(name, ComputeRecurrenceFrequency.class);
    }

    /**
     * Gets known ComputeRecurrenceFrequency values.
     * 
     * @return known ComputeRecurrenceFrequency values.
     */
    public static Collection<ComputeRecurrenceFrequency> values() {
        return values(ComputeRecurrenceFrequency.class);
    }
}
