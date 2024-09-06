// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.PartnerTransferDetailsInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of PartnerTransferDetails.
 */
public interface PartnerTransferDetails {
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
     * Gets the expirationTime property: The time at which the transfer request expires.
     * 
     * @return the expirationTime value.
     */
    OffsetDateTime expirationTime();

    /**
     * Gets the transferStatus property: Overall transfer status.
     * 
     * @return the transferStatus value.
     */
    TransferStatus transferStatus();

    /**
     * Gets the recipientEmailId property: The email ID of the user to whom the transfer request was sent.
     * 
     * @return the recipientEmailId value.
     */
    String recipientEmailId();

    /**
     * Gets the initiatorCustomerType property: The type of customer who sent the transfer request.
     * 
     * @return the initiatorCustomerType value.
     */
    InitiatorCustomerType initiatorCustomerType();

    /**
     * Gets the initiatorEmailId property: The email ID of the user who sent the transfer request.
     * 
     * @return the initiatorEmailId value.
     */
    String initiatorEmailId();

    /**
     * Gets the resellerId property: Optional MPN ID of the reseller for transfer requests that are sent from a
     * Microsoft Partner Agreement billing account.
     * 
     * @return the resellerId value.
     */
    String resellerId();

    /**
     * Gets the resellerName property: Optional name of the reseller for transfer requests that are sent from Microsoft
     * Partner Agreement billing account.
     * 
     * @return the resellerName value.
     */
    String resellerName();

    /**
     * Gets the canceledBy property: The email ID of the user who canceled the transfer request.
     * 
     * @return the canceledBy value.
     */
    String canceledBy();

    /**
     * Gets the detailedTransferStatus property: Detailed transfer status.
     * 
     * @return the detailedTransferStatus value.
     */
    List<DetailedTransferStatus> detailedTransferStatus();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.PartnerTransferDetailsInner object.
     * 
     * @return the inner object.
     */
    PartnerTransferDetailsInner innerModel();
}
