// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The policy that controls whether Azure reservation purchases are allowed.
 */
public final class ReservationPurchasesPolicy extends ExpandableStringEnum<ReservationPurchasesPolicy> {
    /**
     * Static value Other for ReservationPurchasesPolicy.
     */
    public static final ReservationPurchasesPolicy OTHER = fromString("Other");

    /**
     * Static value Allowed for ReservationPurchasesPolicy.
     */
    public static final ReservationPurchasesPolicy ALLOWED = fromString("Allowed");

    /**
     * Static value Disabled for ReservationPurchasesPolicy.
     */
    public static final ReservationPurchasesPolicy DISABLED = fromString("Disabled");

    /**
     * Static value NotAllowed for ReservationPurchasesPolicy.
     */
    public static final ReservationPurchasesPolicy NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates a new instance of ReservationPurchasesPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReservationPurchasesPolicy() {
    }

    /**
     * Creates or finds a ReservationPurchasesPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReservationPurchasesPolicy.
     */
    public static ReservationPurchasesPolicy fromString(String name) {
        return fromString(name, ReservationPurchasesPolicy.class);
    }

    /**
     * Gets known ReservationPurchasesPolicy values.
     * 
     * @return known ReservationPurchasesPolicy values.
     */
    public static Collection<ReservationPurchasesPolicy> values() {
        return values(ReservationPurchasesPolicy.class);
    }
}
