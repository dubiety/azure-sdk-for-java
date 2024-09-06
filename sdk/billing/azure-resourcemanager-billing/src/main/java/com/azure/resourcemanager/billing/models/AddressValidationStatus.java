// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of the address validation.
 */
public final class AddressValidationStatus extends ExpandableStringEnum<AddressValidationStatus> {
    /**
     * Static value Other for AddressValidationStatus.
     */
    public static final AddressValidationStatus OTHER = fromString("Other");

    /**
     * Static value Valid for AddressValidationStatus.
     */
    public static final AddressValidationStatus VALID = fromString("Valid");

    /**
     * Static value Invalid for AddressValidationStatus.
     */
    public static final AddressValidationStatus INVALID = fromString("Invalid");

    /**
     * Creates a new instance of AddressValidationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AddressValidationStatus() {
    }

    /**
     * Creates or finds a AddressValidationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AddressValidationStatus.
     */
    public static AddressValidationStatus fromString(String name) {
        return fromString(name, AddressValidationStatus.class);
    }

    /**
     * Gets known AddressValidationStatus values.
     * 
     * @return known AddressValidationStatus values.
     */
    public static Collection<AddressValidationStatus> values() {
        return values(AddressValidationStatus.class);
    }
}
