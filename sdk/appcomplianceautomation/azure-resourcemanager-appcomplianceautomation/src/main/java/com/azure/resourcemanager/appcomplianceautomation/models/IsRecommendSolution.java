// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether this solution is the recommended.
 */
public final class IsRecommendSolution extends ExpandableStringEnum<IsRecommendSolution> {
    /**
     * Static value true for IsRecommendSolution.
     */
    public static final IsRecommendSolution TRUE = fromString("true");

    /**
     * Static value false for IsRecommendSolution.
     */
    public static final IsRecommendSolution FALSE = fromString("false");

    /**
     * Creates a new instance of IsRecommendSolution value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsRecommendSolution() {
    }

    /**
     * Creates or finds a IsRecommendSolution from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IsRecommendSolution.
     */
    public static IsRecommendSolution fromString(String name) {
        return fromString(name, IsRecommendSolution.class);
    }

    /**
     * Gets known IsRecommendSolution values.
     * 
     * @return known IsRecommendSolution values.
     */
    public static Collection<IsRecommendSolution> values() {
        return values(IsRecommendSolution.class);
    }
}
