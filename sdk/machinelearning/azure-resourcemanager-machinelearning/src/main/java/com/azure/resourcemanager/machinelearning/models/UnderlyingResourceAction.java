// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for UnderlyingResourceAction.
 */
public final class UnderlyingResourceAction extends ExpandableStringEnum<UnderlyingResourceAction> {
    /**
     * Static value Delete for UnderlyingResourceAction.
     */
    public static final UnderlyingResourceAction DELETE = fromString("Delete");

    /**
     * Static value Detach for UnderlyingResourceAction.
     */
    public static final UnderlyingResourceAction DETACH = fromString("Detach");

    /**
     * Creates a new instance of UnderlyingResourceAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UnderlyingResourceAction() {
    }

    /**
     * Creates or finds a UnderlyingResourceAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UnderlyingResourceAction.
     */
    public static UnderlyingResourceAction fromString(String name) {
        return fromString(name, UnderlyingResourceAction.class);
    }

    /**
     * Gets known UnderlyingResourceAction values.
     * 
     * @return known UnderlyingResourceAction values.
     */
    public static Collection<UnderlyingResourceAction> values() {
        return values(UnderlyingResourceAction.class);
    }
}
