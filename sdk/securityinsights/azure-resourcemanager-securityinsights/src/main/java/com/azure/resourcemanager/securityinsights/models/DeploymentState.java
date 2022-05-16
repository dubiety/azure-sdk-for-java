// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentState. */
public final class DeploymentState extends ExpandableStringEnum<DeploymentState> {
    /** Static value In_Progress for DeploymentState. */
    public static final DeploymentState IN_PROGRESS = fromString("In_Progress");

    /** Static value Completed for DeploymentState. */
    public static final DeploymentState COMPLETED = fromString("Completed");

    /** Static value Queued for DeploymentState. */
    public static final DeploymentState QUEUED = fromString("Queued");

    /** Static value Canceling for DeploymentState. */
    public static final DeploymentState CANCELING = fromString("Canceling");

    /**
     * Creates or finds a DeploymentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentState.
     */
    @JsonCreator
    public static DeploymentState fromString(String name) {
        return fromString(name, DeploymentState.class);
    }

    /**
     * Gets known DeploymentState values.
     *
     * @return known DeploymentState values.
     */
    public static Collection<DeploymentState> values() {
        return values(DeploymentState.class);
    }
}
