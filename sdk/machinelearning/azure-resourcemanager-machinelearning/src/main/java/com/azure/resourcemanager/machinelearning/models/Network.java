// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Network. */
public final class Network extends ExpandableStringEnum<Network> {
    /** Static value Bridge for Network. */
    public static final Network BRIDGE = fromString("Bridge");

    /** Static value Host for Network. */
    public static final Network HOST = fromString("Host");

    /**
     * Creates or finds a Network from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Network.
     */
    @JsonCreator
    public static Network fromString(String name) {
        return fromString(name, Network.class);
    }

    /**
     * Gets known Network values.
     *
     * @return known Network values.
     */
    public static Collection<Network> values() {
        return values(Network.class);
    }
}
