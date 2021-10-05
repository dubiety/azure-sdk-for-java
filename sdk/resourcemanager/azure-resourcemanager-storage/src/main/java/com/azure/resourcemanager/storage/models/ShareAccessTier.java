// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ShareAccessTier.
 */
public final class ShareAccessTier extends ExpandableStringEnum<ShareAccessTier> {
    /**
     * Static value TransactionOptimized for ShareAccessTier.
     */
    public static final ShareAccessTier TRANSACTION_OPTIMIZED = fromString("TransactionOptimized");

    /**
     * Static value Hot for ShareAccessTier.
     */
    public static final ShareAccessTier HOT = fromString("Hot");

    /**
     * Static value Cool for ShareAccessTier.
     */
    public static final ShareAccessTier COOL = fromString("Cool");

    /**
     * Static value Premium for ShareAccessTier.
     */
    public static final ShareAccessTier PREMIUM = fromString("Premium");

    /**
     * Creates or finds a ShareAccessTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ShareAccessTier.
     */
    @JsonCreator
    public static ShareAccessTier fromString(String name) {
        return fromString(name, ShareAccessTier.class);
    }

    /**
     * @return known ShareAccessTier values.
     */
    public static Collection<ShareAccessTier> values() {
        return values(ShareAccessTier.class);
    }
}
