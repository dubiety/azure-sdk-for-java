// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes operator to be matched.
 */
public final class HostnameOperator extends ExpandableStringEnum<HostnameOperator> {
    /**
     * Static value Any for HostnameOperator.
     */
    public static final HostnameOperator ANY = fromString("Any");

    /**
     * Static value Equal for HostnameOperator.
     */
    public static final HostnameOperator EQUAL = fromString("Equal");

    /**
     * Static value Contains for HostnameOperator.
     */
    public static final HostnameOperator CONTAINS = fromString("Contains");

    /**
     * Static value BeginsWith for HostnameOperator.
     */
    public static final HostnameOperator BEGINS_WITH = fromString("BeginsWith");

    /**
     * Static value EndsWith for HostnameOperator.
     */
    public static final HostnameOperator ENDS_WITH = fromString("EndsWith");

    /**
     * Static value LessThan for HostnameOperator.
     */
    public static final HostnameOperator LESS_THAN = fromString("LessThan");

    /**
     * Static value LessThanOrEqual for HostnameOperator.
     */
    public static final HostnameOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /**
     * Static value GreaterThan for HostnameOperator.
     */
    public static final HostnameOperator GREATER_THAN = fromString("GreaterThan");

    /**
     * Static value GreaterThanOrEqual for HostnameOperator.
     */
    public static final HostnameOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /**
     * Static value RegEx for HostnameOperator.
     */
    public static final HostnameOperator REG_EX = fromString("RegEx");

    /**
     * Creates a new instance of HostnameOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HostnameOperator() {
    }

    /**
     * Creates or finds a HostnameOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HostnameOperator.
     */
    public static HostnameOperator fromString(String name) {
        return fromString(name, HostnameOperator.class);
    }

    /**
     * Gets known HostnameOperator values.
     * 
     * @return known HostnameOperator values.
     */
    public static Collection<HostnameOperator> values() {
        return values(HostnameOperator.class);
    }
}
