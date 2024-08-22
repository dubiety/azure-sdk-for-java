// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Sharing policy for applications on this compute instance
 * 
 * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the
 * creator can access applications on this compute instance. When Shared, any workspace user can access applications on
 * this instance depending on his/her assigned role.
 */
public final class ApplicationSharingPolicy extends ExpandableStringEnum<ApplicationSharingPolicy> {
    /**
     * Static value Personal for ApplicationSharingPolicy.
     */
    public static final ApplicationSharingPolicy PERSONAL = fromString("Personal");

    /**
     * Static value Shared for ApplicationSharingPolicy.
     */
    public static final ApplicationSharingPolicy SHARED = fromString("Shared");

    /**
     * Creates a new instance of ApplicationSharingPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationSharingPolicy() {
    }

    /**
     * Creates or finds a ApplicationSharingPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationSharingPolicy.
     */
    public static ApplicationSharingPolicy fromString(String name) {
        return fromString(name, ApplicationSharingPolicy.class);
    }

    /**
     * Gets known ApplicationSharingPolicy values.
     * 
     * @return known ApplicationSharingPolicy values.
     */
    public static Collection<ApplicationSharingPolicy> values() {
        return values(ApplicationSharingPolicy.class);
    }
}
