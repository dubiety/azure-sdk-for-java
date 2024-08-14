// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the source of the SSL certificate.
 */
public final class AfdCertificateType extends ExpandableStringEnum<AfdCertificateType> {
    /**
     * Static value CustomerCertificate for AfdCertificateType.
     */
    public static final AfdCertificateType CUSTOMER_CERTIFICATE = fromString("CustomerCertificate");

    /**
     * Static value ManagedCertificate for AfdCertificateType.
     */
    public static final AfdCertificateType MANAGED_CERTIFICATE = fromString("ManagedCertificate");

    /**
     * Static value AzureFirstPartyManagedCertificate for AfdCertificateType.
     */
    public static final AfdCertificateType AZURE_FIRST_PARTY_MANAGED_CERTIFICATE
        = fromString("AzureFirstPartyManagedCertificate");

    /**
     * Creates a new instance of AfdCertificateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AfdCertificateType() {
    }

    /**
     * Creates or finds a AfdCertificateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AfdCertificateType.
     */
    public static AfdCertificateType fromString(String name) {
        return fromString(name, AfdCertificateType.class);
    }

    /**
     * Gets known AfdCertificateType values.
     * 
     * @return known AfdCertificateType values.
     */
    public static Collection<AfdCertificateType> values() {
        return values(AfdCertificateType.class);
    }
}
