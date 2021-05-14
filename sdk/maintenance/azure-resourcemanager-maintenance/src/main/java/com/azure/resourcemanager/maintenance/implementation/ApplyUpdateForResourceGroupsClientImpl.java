// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.ApplyUpdateForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.ListApplyUpdate;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ApplyUpdateForResourceGroupsClient. */
public final class ApplyUpdateForResourceGroupsClientImpl implements ApplyUpdateForResourceGroupsClient {
    private final ClientLogger logger = new ClientLogger(ApplyUpdateForResourceGroupsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ApplyUpdateForResourceGroupsService service;

    /** The service client containing this operation class. */
    private final MaintenanceManagementClientImpl client;

    /**
     * Initializes an instance of ApplyUpdateForResourceGroupsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApplyUpdateForResourceGroupsClientImpl(MaintenanceManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ApplyUpdateForResourceGroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MaintenanceManagementClientApplyUpdateForResourceGroups to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MaintenanceManagemen")
    private interface ApplyUpdateForResourceGroupsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Maintenance"
                + "/applyUpdates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListApplyUpdate>> listByResourceGroup(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplyUpdateInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResourceGroup(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<ApplyUpdateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplyUpdateInner>> listByResourceGroupSinglePageAsync(
        String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResourceGroup(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApplyUpdateInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(() -> listByResourceGroupSinglePageAsync(resourceGroupName));
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApplyUpdateInner> listByResourceGroupAsync(String resourceGroupName, Context context) {
        return new PagedFlux<>(() -> listByResourceGroupSinglePageAsync(resourceGroupName, context));
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplyUpdateInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplyUpdateInner> listByResourceGroup(String resourceGroupName, Context context) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, context));
    }
}
