// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes operator to be matched.
 */
public final class Operator extends ExpandableStringEnum<Operator> {
    /**
     * Static value Any for Operator.
     */
    public static final Operator ANY = fromString("Any");

    /**
     * Static value IPMatch for Operator.
     */
    public static final Operator IPMATCH = fromString("IPMatch");

    /**
     * Static value GeoMatch for Operator.
     */
    public static final Operator GEO_MATCH = fromString("GeoMatch");

    /**
     * Static value Equal for Operator.
     */
    public static final Operator EQUAL = fromString("Equal");

    /**
     * Static value Contains for Operator.
     */
    public static final Operator CONTAINS = fromString("Contains");

    /**
     * Static value LessThan for Operator.
     */
    public static final Operator LESS_THAN = fromString("LessThan");

    /**
     * Static value GreaterThan for Operator.
     */
    public static final Operator GREATER_THAN = fromString("GreaterThan");

    /**
     * Static value LessThanOrEqual for Operator.
     */
    public static final Operator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /**
     * Static value GreaterThanOrEqual for Operator.
     */
    public static final Operator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /**
     * Static value BeginsWith for Operator.
     */
    public static final Operator BEGINS_WITH = fromString("BeginsWith");

    /**
     * Static value EndsWith for Operator.
     */
    public static final Operator ENDS_WITH = fromString("EndsWith");

    /**
     * Static value RegEx for Operator.
     */
    public static final Operator REG_EX = fromString("RegEx");

    /**
     * Creates a new instance of Operator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Operator() {
    }

    /**
     * Creates or finds a Operator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Operator.
     */
    public static Operator fromString(String name) {
        return fromString(name, Operator.class);
    }

    /**
     * Gets known Operator values.
     * 
     * @return known Operator values.
     */
    public static Collection<Operator> values() {
        return values(Operator.class);
    }
}
