// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Operation status.
 */
public final class OperationStatus extends ExpandableStringEnum<OperationStatus> {
    /**
     * Static value InProgress for OperationStatus.
     */
    public static final OperationStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Succeeded for OperationStatus.
     */
    public static final OperationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value CreateFailed for OperationStatus.
     */
    public static final OperationStatus CREATE_FAILED = fromString("CreateFailed");

    /**
     * Static value StartFailed for OperationStatus.
     */
    public static final OperationStatus START_FAILED = fromString("StartFailed");

    /**
     * Static value StopFailed for OperationStatus.
     */
    public static final OperationStatus STOP_FAILED = fromString("StopFailed");

    /**
     * Static value RestartFailed for OperationStatus.
     */
    public static final OperationStatus RESTART_FAILED = fromString("RestartFailed");

    /**
     * Static value ReimageFailed for OperationStatus.
     */
    public static final OperationStatus REIMAGE_FAILED = fromString("ReimageFailed");

    /**
     * Static value DeleteFailed for OperationStatus.
     */
    public static final OperationStatus DELETE_FAILED = fromString("DeleteFailed");

    /**
     * Creates a new instance of OperationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationStatus() {
    }

    /**
     * Creates or finds a OperationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationStatus.
     */
    public static OperationStatus fromString(String name) {
        return fromString(name, OperationStatus.class);
    }

    /**
     * Gets known OperationStatus values.
     * 
     * @return known OperationStatus values.
     */
    public static Collection<OperationStatus> values() {
        return values(OperationStatus.class);
    }
}
