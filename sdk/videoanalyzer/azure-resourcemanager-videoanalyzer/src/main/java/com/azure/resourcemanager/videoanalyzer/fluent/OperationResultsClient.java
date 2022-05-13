// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.PrivateEndpointConnectionInner;

/** An instance of this class provides access to all the operations defined in OperationResultsClient. */
public interface OperationResultsClient {
    /**
     * Get private endpoint connection operation result.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(String resourceGroupName, String accountName, String name, String operationId);

    /**
     * Get private endpoint connection operation result.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String accountName, String name, String operationId, Context context);
}
