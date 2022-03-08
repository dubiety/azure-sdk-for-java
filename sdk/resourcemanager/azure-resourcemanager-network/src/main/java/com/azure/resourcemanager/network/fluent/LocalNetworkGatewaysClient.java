// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocalNetworkGatewaysClient. */
public interface LocalNetworkGatewaysClient
    extends InnerSupportsGet<LocalNetworkGatewayInner>, InnerSupportsDelete<Void> {
    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<LocalNetworkGatewayInner>, LocalNetworkGatewayInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LocalNetworkGatewayInner>, LocalNetworkGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LocalNetworkGatewayInner>, LocalNetworkGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, Context context);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalNetworkGatewayInner> createOrUpdateAsync(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner createOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters);

    /**
     * Creates or updates a local network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the create or update local network gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner createOrUpdate(
        String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters, Context context);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalNetworkGatewayInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String localNetworkGatewayName);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalNetworkGatewayInner> getByResourceGroupAsync(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner getByResourceGroup(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Gets the specified local network gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified local network gateway in a resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalNetworkGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String localNetworkGatewayName);

    /**
     * Deletes the specified local network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String localNetworkGatewayName, Context context);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalNetworkGatewayInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalNetworkGatewayInner> updateTagsAsync(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalNetworkGatewayInner updateTags(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters);

    /**
     * Updates a local network gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to update local network gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalNetworkGatewayInner> updateTagsWithResponse(
        String resourceGroupName, String localNetworkGatewayName, TagsObject parameters, Context context);

    /**
     * Gets all the local network gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the local network gateways in a resource group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LocalNetworkGatewayInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all the local network gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the local network gateways in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalNetworkGatewayInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the local network gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the local network gateways in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalNetworkGatewayInner> listByResourceGroup(String resourceGroupName, Context context);
}
