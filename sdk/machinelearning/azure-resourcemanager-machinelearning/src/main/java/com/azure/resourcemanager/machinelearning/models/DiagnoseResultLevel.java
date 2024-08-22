// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Level of workspace setup error.
 */
public final class DiagnoseResultLevel extends ExpandableStringEnum<DiagnoseResultLevel> {
    /**
     * Static value Warning for DiagnoseResultLevel.
     */
    public static final DiagnoseResultLevel WARNING = fromString("Warning");

    /**
     * Static value Error for DiagnoseResultLevel.
     */
    public static final DiagnoseResultLevel ERROR = fromString("Error");

    /**
     * Static value Information for DiagnoseResultLevel.
     */
    public static final DiagnoseResultLevel INFORMATION = fromString("Information");

    /**
     * Creates a new instance of DiagnoseResultLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiagnoseResultLevel() {
    }

    /**
     * Creates or finds a DiagnoseResultLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiagnoseResultLevel.
     */
    public static DiagnoseResultLevel fromString(String name) {
        return fromString(name, DiagnoseResultLevel.class);
    }

    /**
     * Gets known DiagnoseResultLevel values.
     * 
     * @return known DiagnoseResultLevel values.
     */
    public static Collection<DiagnoseResultLevel> values() {
        return values(DiagnoseResultLevel.class);
    }
}
