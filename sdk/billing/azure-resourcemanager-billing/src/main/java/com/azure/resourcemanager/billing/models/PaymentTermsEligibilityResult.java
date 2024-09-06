// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.PaymentTermsEligibilityResultInner;
import java.util.List;

/**
 * An immutable client-side representation of PaymentTermsEligibilityResult.
 */
public interface PaymentTermsEligibilityResult {
    /**
     * Gets the eligibilityStatus property: Indicates the eligibility status of the payment terms.
     * 
     * @return the eligibilityStatus value.
     */
    PaymentTermsEligibilityStatus eligibilityStatus();

    /**
     * Gets the eligibilityDetails property: Details of the payment terms eligibility.
     * 
     * @return the eligibilityDetails value.
     */
    List<PaymentTermsEligibilityDetail> eligibilityDetails();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.PaymentTermsEligibilityResultInner object.
     * 
     * @return the inner object.
     */
    PaymentTermsEligibilityResultInner innerModel();
}
