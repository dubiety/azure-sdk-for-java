// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of operating system.
 */
public final class OperatingSystemType extends ExpandableStringEnum<OperatingSystemType> {
    /**
     * Static value Linux for OperatingSystemType.
     */
    public static final OperatingSystemType LINUX = fromString("Linux");

    /**
     * Static value Windows for OperatingSystemType.
     */
    public static final OperatingSystemType WINDOWS = fromString("Windows");

    /**
     * Creates a new instance of OperatingSystemType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperatingSystemType() {
    }

    /**
     * Creates or finds a OperatingSystemType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperatingSystemType.
     */
    public static OperatingSystemType fromString(String name) {
        return fromString(name, OperatingSystemType.class);
    }

    /**
     * Gets known OperatingSystemType values.
     * 
     * @return known OperatingSystemType values.
     */
    public static Collection<OperatingSystemType> values() {
        return values(OperatingSystemType.class);
    }
}
