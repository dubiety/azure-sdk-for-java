// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
 */
public final class CustomHttpsProvisioningSubstate extends ExpandableStringEnum<CustomHttpsProvisioningSubstate> {
    /**
     * Static value SubmittingDomainControlValidationRequest for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate SUBMITTING_DOMAIN_CONTROL_VALIDATION_REQUEST
        = fromString("SubmittingDomainControlValidationRequest");

    /**
     * Static value PendingDomainControlValidationREquestApproval for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate PENDING_DOMAIN_CONTROL_VALIDATION_REQUEST_APPROVAL
        = fromString("PendingDomainControlValidationREquestApproval");

    /**
     * Static value DomainControlValidationRequestApproved for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate DOMAIN_CONTROL_VALIDATION_REQUEST_APPROVED
        = fromString("DomainControlValidationRequestApproved");

    /**
     * Static value DomainControlValidationRequestRejected for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate DOMAIN_CONTROL_VALIDATION_REQUEST_REJECTED
        = fromString("DomainControlValidationRequestRejected");

    /**
     * Static value DomainControlValidationRequestTimedOut for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate DOMAIN_CONTROL_VALIDATION_REQUEST_TIMED_OUT
        = fromString("DomainControlValidationRequestTimedOut");

    /**
     * Static value IssuingCertificate for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate ISSUING_CERTIFICATE = fromString("IssuingCertificate");

    /**
     * Static value DeployingCertificate for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate DEPLOYING_CERTIFICATE = fromString("DeployingCertificate");

    /**
     * Static value CertificateDeployed for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate CERTIFICATE_DEPLOYED = fromString("CertificateDeployed");

    /**
     * Static value DeletingCertificate for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate DELETING_CERTIFICATE = fromString("DeletingCertificate");

    /**
     * Static value CertificateDeleted for CustomHttpsProvisioningSubstate.
     */
    public static final CustomHttpsProvisioningSubstate CERTIFICATE_DELETED = fromString("CertificateDeleted");

    /**
     * Creates a new instance of CustomHttpsProvisioningSubstate value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomHttpsProvisioningSubstate() {
    }

    /**
     * Creates or finds a CustomHttpsProvisioningSubstate from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CustomHttpsProvisioningSubstate.
     */
    public static CustomHttpsProvisioningSubstate fromString(String name) {
        return fromString(name, CustomHttpsProvisioningSubstate.class);
    }

    /**
     * Gets known CustomHttpsProvisioningSubstate values.
     * 
     * @return known CustomHttpsProvisioningSubstate values.
     */
    public static Collection<CustomHttpsProvisioningSubstate> values() {
        return values(CustomHttpsProvisioningSubstate.class);
    }
}
