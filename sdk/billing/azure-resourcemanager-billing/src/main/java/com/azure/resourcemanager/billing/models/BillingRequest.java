// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.BillingRequestInner;
import java.util.Map;

/**
 * An immutable client-side representation of BillingRequest.
 */
public interface BillingRequest {
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
     * Gets the properties property: A request submitted by a user to manage billing. Users with an owner role on the
     * scope can approve or decline these requests.
     * 
     * @return the properties value.
     */
    BillingRequestProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingRequestInner object.
     * 
     * @return the inner object.
     */
    BillingRequestInner innerModel();
}
