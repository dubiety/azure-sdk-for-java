// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventGroupingAggregationKind. */
public final class EventGroupingAggregationKind extends ExpandableStringEnum<EventGroupingAggregationKind> {
    /** Static value SingleAlert for EventGroupingAggregationKind. */
    public static final EventGroupingAggregationKind SINGLE_ALERT = fromString("SingleAlert");

    /** Static value AlertPerResult for EventGroupingAggregationKind. */
    public static final EventGroupingAggregationKind ALERT_PER_RESULT = fromString("AlertPerResult");

    /**
     * Creates or finds a EventGroupingAggregationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventGroupingAggregationKind.
     */
    @JsonCreator
    public static EventGroupingAggregationKind fromString(String name) {
        return fromString(name, EventGroupingAggregationKind.class);
    }

    /**
     * Gets known EventGroupingAggregationKind values.
     *
     * @return known EventGroupingAggregationKind values.
     */
    public static Collection<EventGroupingAggregationKind> values() {
        return values(EventGroupingAggregationKind.class);
    }
}
