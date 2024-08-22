// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * An enum describing the unit of quota measurement.
 */
public final class QuotaUnit extends ExpandableStringEnum<QuotaUnit> {
    /**
     * Static value Count for QuotaUnit.
     */
    public static final QuotaUnit COUNT = fromString("Count");

    /**
     * Creates a new instance of QuotaUnit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QuotaUnit() {
    }

    /**
     * Creates or finds a QuotaUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QuotaUnit.
     */
    public static QuotaUnit fromString(String name) {
        return fromString(name, QuotaUnit.class);
    }

    /**
     * Gets known QuotaUnit values.
     * 
     * @return known QuotaUnit values.
     */
    public static Collection<QuotaUnit> values() {
        return values(QuotaUnit.class);
    }
}
