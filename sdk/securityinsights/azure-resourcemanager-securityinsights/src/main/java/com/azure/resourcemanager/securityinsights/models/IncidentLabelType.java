// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IncidentLabelType. */
public final class IncidentLabelType extends ExpandableStringEnum<IncidentLabelType> {
    /** Static value User for IncidentLabelType. */
    public static final IncidentLabelType USER = fromString("User");

    /** Static value System for IncidentLabelType. */
    public static final IncidentLabelType SYSTEM = fromString("System");

    /**
     * Creates or finds a IncidentLabelType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IncidentLabelType.
     */
    @JsonCreator
    public static IncidentLabelType fromString(String name) {
        return fromString(name, IncidentLabelType.class);
    }

    /** @return known IncidentLabelType values. */
    public static Collection<IncidentLabelType> values() {
        return values(IncidentLabelType.class);
    }
}
