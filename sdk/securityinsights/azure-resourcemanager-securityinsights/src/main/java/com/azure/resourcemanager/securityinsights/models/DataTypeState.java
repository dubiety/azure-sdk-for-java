// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataTypeState. */
public final class DataTypeState extends ExpandableStringEnum<DataTypeState> {
    /** Static value Enabled for DataTypeState. */
    public static final DataTypeState ENABLED = fromString("Enabled");

    /** Static value Disabled for DataTypeState. */
    public static final DataTypeState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a DataTypeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataTypeState.
     */
    @JsonCreator
    public static DataTypeState fromString(String name) {
        return fromString(name, DataTypeState.class);
    }

    /**
     * Gets known DataTypeState values.
     *
     * @return known DataTypeState values.
     */
    public static Collection<DataTypeState> values() {
        return values(DataTypeState.class);
    }
}
