// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Resource status of the profile.
 */
public final class ProfileResourceState extends ExpandableStringEnum<ProfileResourceState> {
    /**
     * Static value Creating for ProfileResourceState.
     */
    public static final ProfileResourceState CREATING = fromString("Creating");

    /**
     * Static value Active for ProfileResourceState.
     */
    public static final ProfileResourceState ACTIVE = fromString("Active");

    /**
     * Static value Deleting for ProfileResourceState.
     */
    public static final ProfileResourceState DELETING = fromString("Deleting");

    /**
     * Static value Disabled for ProfileResourceState.
     */
    public static final ProfileResourceState DISABLED = fromString("Disabled");

    /**
     * Static value Migrating for ProfileResourceState.
     */
    public static final ProfileResourceState MIGRATING = fromString("Migrating");

    /**
     * Static value Migrated for ProfileResourceState.
     */
    public static final ProfileResourceState MIGRATED = fromString("Migrated");

    /**
     * Static value PendingMigrationCommit for ProfileResourceState.
     */
    public static final ProfileResourceState PENDING_MIGRATION_COMMIT = fromString("PendingMigrationCommit");

    /**
     * Static value CommittingMigration for ProfileResourceState.
     */
    public static final ProfileResourceState COMMITTING_MIGRATION = fromString("CommittingMigration");

    /**
     * Static value AbortingMigration for ProfileResourceState.
     */
    public static final ProfileResourceState ABORTING_MIGRATION = fromString("AbortingMigration");

    /**
     * Creates a new instance of ProfileResourceState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProfileResourceState() {
    }

    /**
     * Creates or finds a ProfileResourceState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProfileResourceState.
     */
    public static ProfileResourceState fromString(String name) {
        return fromString(name, ProfileResourceState.class);
    }

    /**
     * Gets known ProfileResourceState values.
     * 
     * @return known ProfileResourceState values.
     */
    public static Collection<ProfileResourceState> values() {
        return values(ProfileResourceState.class);
    }
}
