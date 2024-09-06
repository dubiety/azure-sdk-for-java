// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of BillingSubscription.
 */
public interface BillingSubscription {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the tags property: Dictionary of metadata associated with the resource. It may not be populated for all
     * resource types. Maximum key/value length supported of 256 characters. Keys/value should not empty value nor null.
     * Keys can not contain &lt; &gt; % &amp; \ ? /.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the autoRenew property: Indicates whether auto renewal is turned on or off for a product.
     * 
     * @return the autoRenew value.
     */
    AutoRenew autoRenew();

    /**
     * Gets the beneficiaryTenantId property: The provisioning tenant of the subscription.
     * 
     * @return the beneficiaryTenantId value.
     */
    String beneficiaryTenantId();

    /**
     * Gets the beneficiary property: The beneficiary of the billing subscription.
     * 
     * @return the beneficiary value.
     */
    Beneficiary beneficiary();

    /**
     * Gets the billingFrequency property: The billing frequency in ISO8601 format of product in the subscription.
     * Example: P1M, P3M, P1Y.
     * 
     * @return the billingFrequency value.
     */
    String billingFrequency();

    /**
     * Gets the billingProfileId property: The fully qualified ID that uniquely identifies a billing profile.
     * 
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * Gets the billingPolicies property: Dictionary of billing policies associated with the subscription.
     * 
     * @return the billingPolicies value.
     */
    Map<String, String> billingPolicies();

    /**
     * Gets the billingProfileDisplayName property: The name of the billing profile.
     * 
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * Gets the billingProfileName property: The ID that uniquely identifies a billing profile.
     * 
     * @return the billingProfileName value.
     */
    String billingProfileName();

    /**
     * Gets the consumptionCostCenter property: The cost center applied to the subscription. This field is only
     * available for consumption subscriptions of Microsoft Customer Agreement or Enterprise Agreement Type billing
     * accounts.
     * 
     * @return the consumptionCostCenter value.
     */
    String consumptionCostCenter();

    /**
     * Gets the customerId property: The fully qualified ID that uniquely identifies a customer.
     * 
     * @return the customerId value.
     */
    String customerId();

    /**
     * Gets the customerDisplayName property: The name of the customer.
     * 
     * @return the customerDisplayName value.
     */
    String customerDisplayName();

    /**
     * Gets the customerName property: The ID that uniquely identifies a customer.
     * 
     * @return the customerName value.
     */
    String customerName();

    /**
     * Gets the displayName property: The name of the billing subscription.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the enrollmentAccountId property: The enrollment Account ID associated with the subscription. This field is
     * available only for the Enterprise Agreement Type billing accounts.
     * 
     * @return the enrollmentAccountId value.
     */
    String enrollmentAccountId();

    /**
     * Gets the enrollmentAccountDisplayName property: The enrollment Account name associated with the subscription.
     * This field is available only for the Enterprise Agreement Type billing accounts.
     * 
     * @return the enrollmentAccountDisplayName value.
     */
    String enrollmentAccountDisplayName();

    /**
     * Gets the invoiceSectionId property: The fully qualified ID that uniquely identifies an invoice section.
     * 
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * Gets the invoiceSectionDisplayName property: The name of the invoice section.
     * 
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * Gets the invoiceSectionName property: The ID that uniquely identifies an invoice section.
     * 
     * @return the invoiceSectionName value.
     */
    String invoiceSectionName();

    /**
     * Gets the lastMonthCharges property: The last month's charges. This field is only available for usage based
     * subscriptions of Microsoft Customer Agreement billing accounts.
     * 
     * @return the lastMonthCharges value.
     */
    Amount lastMonthCharges();

    /**
     * Gets the monthToDateCharges property: The current month to date charges. This field is only available for usage
     * based subscriptions of Microsoft Customer Agreement billing accounts.
     * 
     * @return the monthToDateCharges value.
     */
    Amount monthToDateCharges();

    /**
     * Gets the nextBillingCycleDetails property: Next billing cycle details of the subscription.
     * 
     * @return the nextBillingCycleDetails value.
     */
    NextBillingCycleDetails nextBillingCycleDetails();

    /**
     * Gets the offerId property: The offer ID for the subscription. This field is only available for the Microsoft
     * Online Services Program billing accounts.
     * 
     * @return the offerId value.
     */
    String offerId();

    /**
     * Gets the productCategory property: The category of the product for which the subscription is purchased. Possible
     * values include: AzureSupport, Hardware, ReservationOrder, SaaS, SavingsPlanOrder, Software, UsageBased, Other.
     * 
     * @return the productCategory value.
     */
    String productCategory();

    /**
     * Gets the productType property: Type of the product for which the subscription is purchased.
     * 
     * @return the productType value.
     */
    String productType();

    /**
     * Gets the productTypeId property: Id of the product for which the subscription is purchased.
     * 
     * @return the productTypeId value.
     */
    String productTypeId();

    /**
     * Gets the purchaseDate property: Purchase date of the product in UTC time.
     * 
     * @return the purchaseDate value.
     */
    OffsetDateTime purchaseDate();

    /**
     * Gets the quantity property: The quantity of licenses or fulfillment units for the subscription.
     * 
     * @return the quantity value.
     */
    Long quantity();

    /**
     * Gets the reseller property: Reseller for this subscription. The fields is not available for Microsoft Partner
     * Agreement billing accounts.
     * 
     * @return the reseller value.
     */
    Reseller reseller();

    /**
     * Gets the renewalTermDetails property: Details for the next renewal term of a subscription.
     * 
     * @return the renewalTermDetails value.
     */
    RenewalTermDetails renewalTermDetails();

    /**
     * Gets the skuId property: The SKU ID of the product for which the subscription is purchased. This field is is only
     * available for Microsoft Customer Agreement billing accounts.
     * 
     * @return the skuId value.
     */
    String skuId();

    /**
     * Gets the skuDescription property: The SKU description of the product for which the subscription is purchased.
     * This field is is only available for billing accounts with agreement type Microsoft Customer Agreement and
     * Microsoft Partner Agreement.
     * 
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * Gets the systemOverrides property: System imposed policies that regulate behavior of the subscription.
     * 
     * @return the systemOverrides value.
     */
    SystemOverrides systemOverrides();

    /**
     * Gets the resourceUri property: Unique identifier of the linked resource.
     * 
     * @return the resourceUri value.
     */
    String resourceUri();

    /**
     * Gets the termDuration property: The duration in ISO8601 format for which you can use the subscription. Example:
     * P1M, P3M, P1Y.
     * 
     * @return the termDuration value.
     */
    String termDuration();

    /**
     * Gets the termStartDate property: Start date of the term in UTC time.
     * 
     * @return the termStartDate value.
     */
    OffsetDateTime termStartDate();

    /**
     * Gets the termEndDate property: End date of the term in UTC time.
     * 
     * @return the termEndDate value.
     */
    OffsetDateTime termEndDate();

    /**
     * Gets the provisioningTenantId property: The tenant in which the subscription is provisioned.
     * 
     * @return the provisioningTenantId value.
     */
    String provisioningTenantId();

    /**
     * Gets the status property: The status of the subscription. This field is not available for Enterprise Agreement
     * billing accounts.
     * 
     * @return the status value.
     */
    BillingSubscriptionStatus status();

    /**
     * Gets the operationStatus property: The status of an operation on the subscription. When None, there is no ongoing
     * operation. When LockedForUpdate, write operations will be blocked on the Billing Subscription. Other is the
     * default value and you may need to refer to the latest API version for more details.
     * 
     * @return the operationStatus value.
     */
    BillingSubscriptionOperationStatus operationStatus();

    /**
     * Gets the provisioningState property: The provisioning state of the resource during a long-running operation.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the subscriptionId property: The ID of the subscription.
     * 
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Gets the suspensionReasons property: The suspension reason for a subscription. This field is not available for
     * Enterprise Agreement billing accounts.
     * 
     * @return the suspensionReasons value.
     */
    List<String> suspensionReasons();

    /**
     * Gets the suspensionReasonDetails property: The suspension details for a subscription. This field is not available
     * for Enterprise Agreement billing accounts.
     * 
     * @return the suspensionReasonDetails value.
     */
    List<BillingSubscriptionStatusDetails> suspensionReasonDetails();

    /**
     * Gets the enrollmentAccountStartDate property: The enrollment Account and the subscription association start date.
     * This field is available only for the Enterprise Agreement Type.
     * 
     * @return the enrollmentAccountStartDate value.
     */
    OffsetDateTime enrollmentAccountStartDate();

    /**
     * Gets the subscriptionEnrollmentAccountStatus property: The current enrollment account status of the subscription.
     * This field is available only for the Enterprise Agreement Type.
     * 
     * @return the subscriptionEnrollmentAccountStatus value.
     */
    SubscriptionEnrollmentAccountStatus subscriptionEnrollmentAccountStatus();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner object.
     * 
     * @return the inner object.
     */
    BillingSubscriptionInner innerModel();
}
