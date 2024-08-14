// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning status of the profile.
 */
public final class ProfileProvisioningState extends ExpandableStringEnum<ProfileProvisioningState> {
    /**
     * Static value Succeeded for ProfileProvisioningState.
     */
    public static final ProfileProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ProfileProvisioningState.
     */
    public static final ProfileProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Updating for ProfileProvisioningState.
     */
    public static final ProfileProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for ProfileProvisioningState.
     */
    public static final ProfileProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Creating for ProfileProvisioningState.
     */
    public static final ProfileProvisioningState CREATING = fromString("Creating");

    /**
     * Creates a new instance of ProfileProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProfileProvisioningState() {
    }

    /**
     * Creates or finds a ProfileProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProfileProvisioningState.
     */
    public static ProfileProvisioningState fromString(String name) {
        return fromString(name, ProfileProvisioningState.class);
    }

    /**
     * Gets known ProfileProvisioningState values.
     * 
     * @return known ProfileProvisioningState values.
     */
    public static Collection<ProfileProvisioningState> values() {
        return values(ProfileProvisioningState.class);
    }
}
