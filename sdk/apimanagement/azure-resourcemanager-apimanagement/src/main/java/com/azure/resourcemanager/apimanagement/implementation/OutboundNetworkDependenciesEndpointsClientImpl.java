// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.apimanagement.fluent.OutboundNetworkDependenciesEndpointsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.OutboundEnvironmentEndpointListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * OutboundNetworkDependenciesEndpointsClient.
 */
public final class OutboundNetworkDependenciesEndpointsClientImpl
    implements OutboundNetworkDependenciesEndpointsClient {
    /** The proxy service used to perform REST calls. */
    private final OutboundNetworkDependenciesEndpointsService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of OutboundNetworkDependenciesEndpointsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OutboundNetworkDependenciesEndpointsClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    OutboundNetworkDependenciesEndpointsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientOutboundNetworkDependenciesEndpoints to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientO")
    private interface OutboundNetworkDependenciesEndpointsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/outboundNetworkDependenciesEndpoints")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OutboundEnvironmentEndpointListInner>> listByService(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the network endpoints of all outbound dependencies of a ApiManagement service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a ApiManagement service along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OutboundEnvironmentEndpointListInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByService(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the network endpoints of all outbound dependencies of a ApiManagement service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a ApiManagement service along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OutboundEnvironmentEndpointListInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, Context context) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByService(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the network endpoints of all outbound dependencies of a ApiManagement service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a ApiManagement service on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OutboundEnvironmentEndpointListInner> listByServiceAsync(
        String resourceGroupName, String serviceName) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName)
            .flatMap(
                (Response<OutboundEnvironmentEndpointListInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the network endpoints of all outbound dependencies of a ApiManagement service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a ApiManagement service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OutboundEnvironmentEndpointListInner listByService(String resourceGroupName, String serviceName) {
        return listByServiceAsync(resourceGroupName, serviceName).block();
    }

    /**
     * Gets the network endpoints of all outbound dependencies of a ApiManagement service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a ApiManagement service along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OutboundEnvironmentEndpointListInner> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, context).block();
    }
}
