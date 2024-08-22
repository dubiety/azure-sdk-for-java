// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Target lags selection modes.
 */
public final class TargetLagsMode extends ExpandableStringEnum<TargetLagsMode> {
    /**
     * Static value Auto for TargetLagsMode.
     */
    public static final TargetLagsMode AUTO = fromString("Auto");

    /**
     * Static value Custom for TargetLagsMode.
     */
    public static final TargetLagsMode CUSTOM = fromString("Custom");

    /**
     * Creates a new instance of TargetLagsMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TargetLagsMode() {
    }

    /**
     * Creates or finds a TargetLagsMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TargetLagsMode.
     */
    public static TargetLagsMode fromString(String name) {
        return fromString(name, TargetLagsMode.class);
    }

    /**
     * Gets known TargetLagsMode values.
     * 
     * @return known TargetLagsMode values.
     */
    public static Collection<TargetLagsMode> values() {
        return values(TargetLagsMode.class);
    }
}
