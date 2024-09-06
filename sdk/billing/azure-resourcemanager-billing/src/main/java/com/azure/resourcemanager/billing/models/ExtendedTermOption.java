// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The billing account extension opted by the company.
 */
public final class ExtendedTermOption extends ExpandableStringEnum<ExtendedTermOption> {
    /**
     * Static value Other for ExtendedTermOption.
     */
    public static final ExtendedTermOption OTHER = fromString("Other");

    /**
     * Static value Opted-In for ExtendedTermOption.
     */
    public static final ExtendedTermOption OPTED_IN = fromString("Opted-In");

    /**
     * Static value Opted-Out for ExtendedTermOption.
     */
    public static final ExtendedTermOption OPTED_OUT = fromString("Opted-Out");

    /**
     * Creates a new instance of ExtendedTermOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExtendedTermOption() {
    }

    /**
     * Creates or finds a ExtendedTermOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExtendedTermOption.
     */
    public static ExtendedTermOption fromString(String name) {
        return fromString(name, ExtendedTermOption.class);
    }

    /**
     * Gets known ExtendedTermOption values.
     * 
     * @return known ExtendedTermOption values.
     */
    public static Collection<ExtendedTermOption> values() {
        return values(ExtendedTermOption.class);
    }
}
