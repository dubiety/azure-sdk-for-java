// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VirtualMachineSizes.
 */
public interface VirtualMachineSizes {
    /**
     * Returns supported VM Sizes in a location.
     * 
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response along with {@link Response}.
     */
    Response<VirtualMachineSizeListResult> listWithResponse(String location, Context context);

    /**
     * Returns supported VM Sizes in a location.
     * 
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response.
     */
    VirtualMachineSizeListResult list(String location);
}
