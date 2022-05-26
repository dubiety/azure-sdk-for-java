// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RegistryHive. */
public final class RegistryHive extends ExpandableStringEnum<RegistryHive> {
    /** Static value HKEY_LOCAL_MACHINE for RegistryHive. */
    public static final RegistryHive HKEY_LOCAL_MACHINE = fromString("HKEY_LOCAL_MACHINE");

    /** Static value HKEY_CLASSES_ROOT for RegistryHive. */
    public static final RegistryHive HKEY_CLASSES_ROOT = fromString("HKEY_CLASSES_ROOT");

    /** Static value HKEY_CURRENT_CONFIG for RegistryHive. */
    public static final RegistryHive HKEY_CURRENT_CONFIG = fromString("HKEY_CURRENT_CONFIG");

    /** Static value HKEY_USERS for RegistryHive. */
    public static final RegistryHive HKEY_USERS = fromString("HKEY_USERS");

    /** Static value HKEY_CURRENT_USER_LOCAL_SETTINGS for RegistryHive. */
    public static final RegistryHive HKEY_CURRENT_USER_LOCAL_SETTINGS = fromString("HKEY_CURRENT_USER_LOCAL_SETTINGS");

    /** Static value HKEY_PERFORMANCE_DATA for RegistryHive. */
    public static final RegistryHive HKEY_PERFORMANCE_DATA = fromString("HKEY_PERFORMANCE_DATA");

    /** Static value HKEY_PERFORMANCE_NLSTEXT for RegistryHive. */
    public static final RegistryHive HKEY_PERFORMANCE_NLSTEXT = fromString("HKEY_PERFORMANCE_NLSTEXT");

    /** Static value HKEY_PERFORMANCE_TEXT for RegistryHive. */
    public static final RegistryHive HKEY_PERFORMANCE_TEXT = fromString("HKEY_PERFORMANCE_TEXT");

    /** Static value HKEY_A for RegistryHive. */
    public static final RegistryHive HKEY_A = fromString("HKEY_A");

    /** Static value HKEY_CURRENT_USER for RegistryHive. */
    public static final RegistryHive HKEY_CURRENT_USER = fromString("HKEY_CURRENT_USER");

    /**
     * Creates or finds a RegistryHive from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegistryHive.
     */
    @JsonCreator
    public static RegistryHive fromString(String name) {
        return fromString(name, RegistryHive.class);
    }

    /**
     * Gets known RegistryHive values.
     *
     * @return known RegistryHive values.
     */
    public static Collection<RegistryHive> values() {
        return values(RegistryHive.class);
    }
}
