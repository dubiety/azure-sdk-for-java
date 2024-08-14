// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
 */
public final class ManagedRuleEnabledState extends ExpandableStringEnum<ManagedRuleEnabledState> {
    /**
     * Static value Disabled for ManagedRuleEnabledState.
     */
    public static final ManagedRuleEnabledState DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for ManagedRuleEnabledState.
     */
    public static final ManagedRuleEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of ManagedRuleEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedRuleEnabledState() {
    }

    /**
     * Creates or finds a ManagedRuleEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedRuleEnabledState.
     */
    public static ManagedRuleEnabledState fromString(String name) {
        return fromString(name, ManagedRuleEnabledState.class);
    }

    /**
     * Gets known ManagedRuleEnabledState values.
     * 
     * @return known ManagedRuleEnabledState values.
     */
    public static Collection<ManagedRuleEnabledState> values() {
        return values(ManagedRuleEnabledState.class);
    }
}
