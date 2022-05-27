// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

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
import com.azure.resourcemanager.kubernetesconfiguration.fluent.OperationStatusClient;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.OperationStatusList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationStatusClient. */
public final class OperationStatusClientImpl implements OperationStatusClient {
    /** The proxy service used to perform REST calls. */
    private final OperationStatusService service;

    /** The service client containing this operation class. */
    private final SourceControlConfigurationClientImpl client;

    /**
     * Initializes an instance of OperationStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationStatusClientImpl(SourceControlConfigurationClientImpl client) {
        this.service =
            RestProxy.create(OperationStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SourceControlConfigurationClientOperationStatus to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SourceControlConfigu")
    private interface OperationStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{clusterRp}"
                + "/{clusterResourceName}/{clusterName}/providers/Microsoft.KubernetesConfiguration/extensions"
                + "/{extensionName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusResultInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterRp") String clusterRp,
            @PathParam("clusterResourceName") String clusterResourceName,
            @PathParam("clusterName") String clusterName,
            @PathParam("extensionName") String extensionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{clusterRp}"
                + "/{clusterResourceName}/{clusterName}/providers/Microsoft.KubernetesConfiguration/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterRp") String clusterRp,
            @PathParam("clusterResourceName") String clusterResourceName,
            @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get Async Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async Operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusResultInner>> getWithResponseAsync(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        String operationId) {
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
        if (clusterRp == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterRp is required and cannot be null."));
        }
        if (clusterResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter clusterResourceName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (extensionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter extensionName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterRp,
                            clusterResourceName,
                            clusterName,
                            extensionName,
                            this.client.getApiVersion(),
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Async Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param operationId operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async Operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusResultInner>> getWithResponseAsync(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        String operationId,
        Context context) {
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
        if (clusterRp == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterRp is required and cannot be null."));
        }
        if (clusterResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter clusterResourceName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (extensionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter extensionName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterRp,
                clusterResourceName,
                clusterName,
                extensionName,
                this.client.getApiVersion(),
                operationId,
                accept,
                context);
    }

    /**
     * Get Async Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async Operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusResultInner> getAsync(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        String operationId) {
        return getWithResponseAsync(
                resourceGroupName, clusterRp, clusterResourceName, clusterName, extensionName, operationId)
            .flatMap(
                (Response<OperationStatusResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Async Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async Operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusResultInner get(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        String operationId) {
        return getAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName, extensionName, operationId)
            .block();
    }

    /**
     * Get Async Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionName Name of the Extension.
     * @param operationId operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async Operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusResultInner> getWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String extensionName,
        String operationId,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, clusterRp, clusterResourceName, clusterName, extensionName, operationId, context)
            .block();
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationStatusResultInner>> listSinglePageAsync(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName) {
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
        if (clusterRp == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterRp is required and cannot be null."));
        }
        if (clusterResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter clusterResourceName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterRp,
                            clusterResourceName,
                            clusterName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<OperationStatusResultInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationStatusResultInner>> listSinglePageAsync(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context) {
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
        if (clusterRp == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterRp is required and cannot be null."));
        }
        if (clusterResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter clusterResourceName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterRp,
                clusterResourceName,
                clusterName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationStatusResultInner> listAsync(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationStatusResultInner> listAsync(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationStatusResultInner> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName) {
        return new PagedIterable<>(listAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName));
    }

    /**
     * List Async Operations, currently in progress, in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - i.e. Microsoft.ContainerService, Microsoft.Kubernetes,
     *     Microsoft.HybridContainerService.
     * @param clusterResourceName The Kubernetes cluster resource name - i.e. managedClusters, connectedClusters,
     *     provisionedClusters.
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationStatusResultInner> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationStatusResultInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<OperationStatusResultInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operations in progress, in the cluster along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationStatusResultInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
