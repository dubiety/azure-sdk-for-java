// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedVirtualNetworks. */
public interface ManagedVirtualNetworks {
    /**
     * Lists managed Virtual Networks.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed Virtual Network resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedVirtualNetworkResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists managed Virtual Networks.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed Virtual Network resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedVirtualNetworkResource> listByFactory(
        String resourceGroupName, String factoryName, Context context);

    /**
     * Gets a managed Virtual Network.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Virtual Network.
     */
    ManagedVirtualNetworkResource get(String resourceGroupName, String factoryName, String managedVirtualNetworkName);

    /**
     * Gets a managed Virtual Network.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param ifNoneMatch ETag of the managed Virtual Network entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Virtual Network along with {@link Response}.
     */
    Response<ManagedVirtualNetworkResource> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String ifNoneMatch,
        Context context);

    /**
     * Gets a managed Virtual Network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Virtual Network along with {@link Response}.
     */
    ManagedVirtualNetworkResource getById(String id);

    /**
     * Gets a managed Virtual Network.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the managed Virtual Network entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Virtual Network along with {@link Response}.
     */
    Response<ManagedVirtualNetworkResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Begins definition for a new ManagedVirtualNetworkResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedVirtualNetworkResource definition.
     */
    ManagedVirtualNetworkResource.DefinitionStages.Blank define(String name);
}
