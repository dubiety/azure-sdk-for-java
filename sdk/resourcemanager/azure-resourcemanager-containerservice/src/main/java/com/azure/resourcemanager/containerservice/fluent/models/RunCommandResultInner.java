// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** run command result. */
@Fluent
public final class RunCommandResultInner {
    /*
     * The command id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Properties of command result.
     */
    @JsonProperty(value = "properties")
    private CommandResultProperties innerProperties;

    /**
     * Get the id property: The command id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the innerProperties property: Properties of command result.
     *
     * @return the innerProperties value.
     */
    private CommandResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the exitCode property: The exit code of the command.
     *
     * @return the exitCode value.
     */
    public Integer exitCode() {
        return this.innerProperties() == null ? null : this.innerProperties().exitCode();
    }

    /**
     * Get the startedAt property: The time when the command started.
     *
     * @return the startedAt value.
     */
    public OffsetDateTime startedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().startedAt();
    }

    /**
     * Get the finishedAt property: The time when the command finished.
     *
     * @return the finishedAt value.
     */
    public OffsetDateTime finishedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().finishedAt();
    }

    /**
     * Get the logs property: The command output.
     *
     * @return the logs value.
     */
    public String logs() {
        return this.innerProperties() == null ? null : this.innerProperties().logs();
    }

    /**
     * Get the reason property: An explanation of why provisioningState is set to failed (if so).
     *
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
