// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricsResponseSeriesItemUnit. */
public final class MetricsResponseSeriesItemUnit extends ExpandableStringEnum<MetricsResponseSeriesItemUnit> {
    /** Static value count for MetricsResponseSeriesItemUnit. */
    public static final MetricsResponseSeriesItemUnit COUNT = fromString("count");

    /** Static value bytes for MetricsResponseSeriesItemUnit. */
    public static final MetricsResponseSeriesItemUnit BYTES = fromString("bytes");

    /** Static value bitsPerSecond for MetricsResponseSeriesItemUnit. */
    public static final MetricsResponseSeriesItemUnit BITS_PER_SECOND = fromString("bitsPerSecond");

    /** Static value milliSeconds for MetricsResponseSeriesItemUnit. */
    public static final MetricsResponseSeriesItemUnit MILLI_SECONDS = fromString("milliSeconds");

    /**
     * Creates or finds a MetricsResponseSeriesItemUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricsResponseSeriesItemUnit.
     */
    @JsonCreator
    public static MetricsResponseSeriesItemUnit fromString(String name) {
        return fromString(name, MetricsResponseSeriesItemUnit.class);
    }

    /** @return known MetricsResponseSeriesItemUnit values. */
    public static Collection<MetricsResponseSeriesItemUnit> values() {
        return values(MetricsResponseSeriesItemUnit.class);
    }
}
