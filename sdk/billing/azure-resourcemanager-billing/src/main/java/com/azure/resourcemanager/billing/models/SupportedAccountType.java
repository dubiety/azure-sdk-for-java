// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The supported account types.
 */
public final class SupportedAccountType extends ExpandableStringEnum<SupportedAccountType> {
    /**
     * Static value None for SupportedAccountType.
     */
    public static final SupportedAccountType NONE = fromString("None");

    /**
     * Static value Partner for SupportedAccountType.
     */
    public static final SupportedAccountType PARTNER = fromString("Partner");

    /**
     * Static value Individual for SupportedAccountType.
     */
    public static final SupportedAccountType INDIVIDUAL = fromString("Individual");

    /**
     * Static value Enterprise for SupportedAccountType.
     */
    public static final SupportedAccountType ENTERPRISE = fromString("Enterprise");

    /**
     * Creates a new instance of SupportedAccountType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SupportedAccountType() {
    }

    /**
     * Creates or finds a SupportedAccountType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SupportedAccountType.
     */
    public static SupportedAccountType fromString(String name) {
        return fromString(name, SupportedAccountType.class);
    }

    /**
     * Gets known SupportedAccountType values.
     * 
     * @return known SupportedAccountType values.
     */
    public static Collection<SupportedAccountType> values() {
        return values(SupportedAccountType.class);
    }
}
