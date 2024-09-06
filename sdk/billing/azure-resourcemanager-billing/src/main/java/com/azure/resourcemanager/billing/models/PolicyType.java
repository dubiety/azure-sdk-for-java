// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the policy.
 */
public final class PolicyType extends ExpandableStringEnum<PolicyType> {
    /**
     * Static value Other for PolicyType.
     */
    public static final PolicyType OTHER = fromString("Other");

    /**
     * Static value UserControlled for PolicyType.
     */
    public static final PolicyType USER_CONTROLLED = fromString("UserControlled");

    /**
     * Static value SystemControlled for PolicyType.
     */
    public static final PolicyType SYSTEM_CONTROLLED = fromString("SystemControlled");

    /**
     * Creates a new instance of PolicyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyType() {
    }

    /**
     * Creates or finds a PolicyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PolicyType.
     */
    public static PolicyType fromString(String name) {
        return fromString(name, PolicyType.class);
    }

    /**
     * Gets known PolicyType values.
     * 
     * @return known PolicyType values.
     */
    public static Collection<PolicyType> values() {
        return values(PolicyType.class);
    }
}
