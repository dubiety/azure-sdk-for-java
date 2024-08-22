// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.resourcemanager.machinelearning.fluent.models.ExternalFqdnResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of ExternalFqdnResponse.
 */
public interface ExternalFqdnResponse {
    /**
     * Gets the value property: The value property.
     * 
     * @return the value value.
     */
    List<FqdnEndpoints> value();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.ExternalFqdnResponseInner object.
     * 
     * @return the inner object.
     */
    ExternalFqdnResponseInner innerModel();
}
