// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.resourcemanager.machinelearning.fluent.models.ManagedNetworkProvisionStatusInner;

/**
 * An immutable client-side representation of ManagedNetworkProvisionStatus.
 */
public interface ManagedNetworkProvisionStatus {
    /**
     * Gets the sparkReady property: The sparkReady property.
     * 
     * @return the sparkReady value.
     */
    Boolean sparkReady();

    /**
     * Gets the status property: Status for the managed network of a machine learning workspace.
     * 
     * @return the status value.
     */
    ManagedNetworkStatus status();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.ManagedNetworkProvisionStatusInner object.
     * 
     * @return the inner object.
     */
    ManagedNetworkProvisionStatusInner innerModel();
}
