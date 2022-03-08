// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectionType. */
public final class ConnectionType extends ExpandableStringEnum<ConnectionType> {
    /** Static value AzureDataExplorer for ConnectionType. */
    public static final ConnectionType AZURE_DATA_EXPLORER = fromString("AzureDataExplorer");

    /**
     * Creates or finds a ConnectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionType.
     */
    @JsonCreator
    public static ConnectionType fromString(String name) {
        return fromString(name, ConnectionType.class);
    }

    /** @return known ConnectionType values. */
    public static Collection<ConnectionType> values() {
        return values(ConnectionType.class);
    }
}
