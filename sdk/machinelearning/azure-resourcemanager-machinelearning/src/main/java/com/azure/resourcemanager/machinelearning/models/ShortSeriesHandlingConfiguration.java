// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The parameter defining how if AutoML should handle short time series.
 */
public final class ShortSeriesHandlingConfiguration extends ExpandableStringEnum<ShortSeriesHandlingConfiguration> {
    /**
     * Static value None for ShortSeriesHandlingConfiguration.
     */
    public static final ShortSeriesHandlingConfiguration NONE = fromString("None");

    /**
     * Static value Auto for ShortSeriesHandlingConfiguration.
     */
    public static final ShortSeriesHandlingConfiguration AUTO = fromString("Auto");

    /**
     * Static value Pad for ShortSeriesHandlingConfiguration.
     */
    public static final ShortSeriesHandlingConfiguration PAD = fromString("Pad");

    /**
     * Static value Drop for ShortSeriesHandlingConfiguration.
     */
    public static final ShortSeriesHandlingConfiguration DROP = fromString("Drop");

    /**
     * Creates a new instance of ShortSeriesHandlingConfiguration value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ShortSeriesHandlingConfiguration() {
    }

    /**
     * Creates or finds a ShortSeriesHandlingConfiguration from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ShortSeriesHandlingConfiguration.
     */
    public static ShortSeriesHandlingConfiguration fromString(String name) {
        return fromString(name, ShortSeriesHandlingConfiguration.class);
    }

    /**
     * Gets known ShortSeriesHandlingConfiguration values.
     * 
     * @return known ShortSeriesHandlingConfiguration values.
     */
    public static Collection<ShortSeriesHandlingConfiguration> values() {
        return values(ShortSeriesHandlingConfiguration.class);
    }
}
