// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TargetCloud. */
public final class TargetCloud extends ExpandableStringEnum<TargetCloud> {
    /** Static value USGov for TargetCloud. */
    public static final TargetCloud USGOV = fromString("USGov");

    /** Static value USNat for TargetCloud. */
    public static final TargetCloud USNAT = fromString("USNat");

    /** Static value USSec for TargetCloud. */
    public static final TargetCloud USSEC = fromString("USSec");

    /**
     * Creates or finds a TargetCloud from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TargetCloud.
     */
    @JsonCreator
    public static TargetCloud fromString(String name) {
        return fromString(name, TargetCloud.class);
    }

    /** @return known TargetCloud values. */
    public static Collection<TargetCloud> values() {
        return values(TargetCloud.class);
    }
}
