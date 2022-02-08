// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnectionsPrivateLinkHubs. */
public interface PrivateEndpointConnectionsPrivateLinkHubs {
    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    PagedIterable<PrivateEndpointConnectionForPrivateLinkHub> list(String resourceGroupName, String privateLinkHubName);

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    PagedIterable<PrivateEndpointConnectionForPrivateLinkHub> list(
        String resourceGroupName, String privateLinkHubName, Context context);

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    PrivateEndpointConnectionForPrivateLinkHub get(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName);

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name along with {@link Response}.
     */
    Response<PrivateEndpointConnectionForPrivateLinkHub> getWithResponse(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName, Context context);
}
