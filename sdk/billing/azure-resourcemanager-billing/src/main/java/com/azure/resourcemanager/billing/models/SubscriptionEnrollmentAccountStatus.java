// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The current enrollment account status of the subscription. This field is available only for the Enterprise Agreement
 * Type.
 */
public final class SubscriptionEnrollmentAccountStatus
    extends ExpandableStringEnum<SubscriptionEnrollmentAccountStatus> {
    /**
     * Static value Active for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus ACTIVE = fromString("Active");

    /**
     * Static value Cancelled for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus CANCELLED = fromString("Cancelled");

    /**
     * Static value Expired for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus EXPIRED = fromString("Expired");

    /**
     * Static value Deleted for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus DELETED = fromString("Deleted");

    /**
     * Static value TransferredOut for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus TRANSFERRED_OUT = fromString("TransferredOut");

    /**
     * Static value Transferring for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus TRANSFERRING = fromString("Transferring");

    /**
     * Static value Inactive for SubscriptionEnrollmentAccountStatus.
     */
    public static final SubscriptionEnrollmentAccountStatus INACTIVE = fromString("Inactive");

    /**
     * Creates a new instance of SubscriptionEnrollmentAccountStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SubscriptionEnrollmentAccountStatus() {
    }

    /**
     * Creates or finds a SubscriptionEnrollmentAccountStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SubscriptionEnrollmentAccountStatus.
     */
    public static SubscriptionEnrollmentAccountStatus fromString(String name) {
        return fromString(name, SubscriptionEnrollmentAccountStatus.class);
    }

    /**
     * Gets known SubscriptionEnrollmentAccountStatus values.
     * 
     * @return known SubscriptionEnrollmentAccountStatus values.
     */
    public static Collection<SubscriptionEnrollmentAccountStatus> values() {
        return values(SubscriptionEnrollmentAccountStatus.class);
    }
}
