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
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.models.PrepareNetworkPoliciesRequest;
import com.azure.resourcemanager.network.models.UnprepareNetworkPoliciesRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubnetsClient. */
public interface SubnetsClient {
    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String subnetName, Context context);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkName, String subnetName, Context context);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SubnetInner>> getWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName, String expand);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SubnetInner> getAsync(String resourceGroupName, String virtualNetworkName, String subnetName, String expand);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SubnetInner> getAsync(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubnetInner get(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubnetInner> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String subnetName, String expand, Context context);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of subnet in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<SubnetInner>, SubnetInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subnet in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubnetInner>, SubnetInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subnet in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubnetInner>, SubnetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        SubnetInner subnetParameters,
        Context context);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SubnetInner> createOrUpdateAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubnetInner createOrUpdate(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubnetInner createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        SubnetInner subnetParameters,
        Context context);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> prepareNetworkPoliciesWithResponseAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginPrepareNetworkPoliciesAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPrepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPrepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> prepareNetworkPoliciesAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void prepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void prepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> unprepareNetworkPoliciesWithResponseAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginUnprepareNetworkPoliciesAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUnprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUnprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> unprepareNetworkPoliciesAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void unprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void unprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subnets in a virtual network as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SubnetInner> listAsync(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subnets in a virtual network as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubnetInner> list(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subnets in a virtual network as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubnetInner> list(String resourceGroupName, String virtualNetworkName, Context context);
}
