// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A state of a server that is visible to user.
 */
public final class ServerState extends ExpandableStringEnum<ServerState> {
    /**
     * Static value Ready for ServerState.
     */
    public static final ServerState READY = fromString("Ready");

    /**
     * Static value Dropping for ServerState.
     */
    public static final ServerState DROPPING = fromString("Dropping");

    /**
     * Static value Disabled for ServerState.
     */
    public static final ServerState DISABLED = fromString("Disabled");

    /**
     * Static value Starting for ServerState.
     */
    public static final ServerState STARTING = fromString("Starting");

    /**
     * Static value Stopping for ServerState.
     */
    public static final ServerState STOPPING = fromString("Stopping");

    /**
     * Static value Stopped for ServerState.
     */
    public static final ServerState STOPPED = fromString("Stopped");

    /**
     * Static value Updating for ServerState.
     */
    public static final ServerState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ServerState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerState() {
    }

    /**
     * Creates or finds a ServerState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerState.
     */
    @JsonCreator
    public static ServerState fromString(String name) {
        return fromString(name, ServerState.class);
    }

    /**
     * Gets known ServerState values.
     * 
     * @return known ServerState values.
     */
    public static Collection<ServerState> values() {
        return values(ServerState.class);
    }
}
