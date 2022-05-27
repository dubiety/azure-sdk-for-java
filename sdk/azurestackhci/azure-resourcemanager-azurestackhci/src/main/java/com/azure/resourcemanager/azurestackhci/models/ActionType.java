// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ActionType. */
public final class ActionType extends ExpandableStringEnum<ActionType> {
    /** Static value Internal for ActionType. */
    public static final ActionType INTERNAL = fromString("Internal");

    /**
     * Creates or finds a ActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActionType.
     */
    @JsonCreator
    public static ActionType fromString(String name) {
        return fromString(name, ActionType.class);
    }

    /**
     * Gets known ActionType values.
     *
     * @return known ActionType values.
     */
    public static Collection<ActionType> values() {
        return values(ActionType.class);
    }
}
