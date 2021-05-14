// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Name. */
public final class Name extends ExpandableStringEnum<Name> {
    /** Static value S0 for Name. */
    public static final Name S0 = fromString("S0");

    /** Static value S1 for Name. */
    public static final Name S1 = fromString("S1");

    /** Static value G2 for Name. */
    public static final Name G2 = fromString("G2");

    /**
     * Creates or finds a Name from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Name.
     */
    @JsonCreator
    public static Name fromString(String name) {
        return fromString(name, Name.class);
    }

    /** @return known Name values. */
    public static Collection<Name> values() {
        return values(Name.class);
    }
}
