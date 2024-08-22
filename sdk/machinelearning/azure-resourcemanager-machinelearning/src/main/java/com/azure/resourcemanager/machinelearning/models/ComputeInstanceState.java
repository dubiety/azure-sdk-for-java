// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Current state of an ComputeInstance.
 */
public final class ComputeInstanceState extends ExpandableStringEnum<ComputeInstanceState> {
    /**
     * Static value Creating for ComputeInstanceState.
     */
    public static final ComputeInstanceState CREATING = fromString("Creating");

    /**
     * Static value CreateFailed for ComputeInstanceState.
     */
    public static final ComputeInstanceState CREATE_FAILED = fromString("CreateFailed");

    /**
     * Static value Deleting for ComputeInstanceState.
     */
    public static final ComputeInstanceState DELETING = fromString("Deleting");

    /**
     * Static value Running for ComputeInstanceState.
     */
    public static final ComputeInstanceState RUNNING = fromString("Running");

    /**
     * Static value Restarting for ComputeInstanceState.
     */
    public static final ComputeInstanceState RESTARTING = fromString("Restarting");

    /**
     * Static value JobRunning for ComputeInstanceState.
     */
    public static final ComputeInstanceState JOB_RUNNING = fromString("JobRunning");

    /**
     * Static value SettingUp for ComputeInstanceState.
     */
    public static final ComputeInstanceState SETTING_UP = fromString("SettingUp");

    /**
     * Static value SetupFailed for ComputeInstanceState.
     */
    public static final ComputeInstanceState SETUP_FAILED = fromString("SetupFailed");

    /**
     * Static value Starting for ComputeInstanceState.
     */
    public static final ComputeInstanceState STARTING = fromString("Starting");

    /**
     * Static value Stopped for ComputeInstanceState.
     */
    public static final ComputeInstanceState STOPPED = fromString("Stopped");

    /**
     * Static value Stopping for ComputeInstanceState.
     */
    public static final ComputeInstanceState STOPPING = fromString("Stopping");

    /**
     * Static value UserSettingUp for ComputeInstanceState.
     */
    public static final ComputeInstanceState USER_SETTING_UP = fromString("UserSettingUp");

    /**
     * Static value UserSetupFailed for ComputeInstanceState.
     */
    public static final ComputeInstanceState USER_SETUP_FAILED = fromString("UserSetupFailed");

    /**
     * Static value Unknown for ComputeInstanceState.
     */
    public static final ComputeInstanceState UNKNOWN = fromString("Unknown");

    /**
     * Static value Unusable for ComputeInstanceState.
     */
    public static final ComputeInstanceState UNUSABLE = fromString("Unusable");

    /**
     * Creates a new instance of ComputeInstanceState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ComputeInstanceState() {
    }

    /**
     * Creates or finds a ComputeInstanceState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ComputeInstanceState.
     */
    public static ComputeInstanceState fromString(String name) {
        return fromString(name, ComputeInstanceState.class);
    }

    /**
     * Gets known ComputeInstanceState values.
     * 
     * @return known ComputeInstanceState values.
     */
    public static Collection<ComputeInstanceState> values() {
        return values(ComputeInstanceState.class);
    }
}
