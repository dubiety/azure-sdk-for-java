// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiskState. */
public final class DiskState extends ExpandableStringEnum<DiskState> {
    /** Static value Unattached for DiskState. */
    public static final DiskState UNATTACHED = fromString("Unattached");

    /** Static value Attached for DiskState. */
    public static final DiskState ATTACHED = fromString("Attached");

    /** Static value Reserved for DiskState. */
    public static final DiskState RESERVED = fromString("Reserved");

    /** Static value Frozen for DiskState. */
    public static final DiskState FROZEN = fromString("Frozen");

    /** Static value ActiveSAS for DiskState. */
    public static final DiskState ACTIVE_SAS = fromString("ActiveSAS");

    /** Static value ActiveSASFrozen for DiskState. */
    public static final DiskState ACTIVE_SASFROZEN = fromString("ActiveSASFrozen");

    /** Static value ReadyToUpload for DiskState. */
    public static final DiskState READY_TO_UPLOAD = fromString("ReadyToUpload");

    /** Static value ActiveUpload for DiskState. */
    public static final DiskState ACTIVE_UPLOAD = fromString("ActiveUpload");

    /**
     * Creates or finds a DiskState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskState.
     */
    @JsonCreator
    public static DiskState fromString(String name) {
        return fromString(name, DiskState.class);
    }

    /**
     * Gets known DiskState values.
     *
     * @return known DiskState values.
     */
    public static Collection<DiskState> values() {
        return values(DiskState.class);
    }
}
