// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.DataMaskingPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.DataMaskingPolicyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataMaskingPoliciesClient. */
public final class DataMaskingPoliciesClientImpl implements DataMaskingPoliciesClient {
    private final ClientLogger logger = new ClientLogger(DataMaskingPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DataMaskingPoliciesService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of DataMaskingPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DataMaskingPoliciesClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy.create(DataMaskingPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientDataMaskingPolicies to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface DataMaskingPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/dataMaskingPolicies/{dataMaskingPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataMaskingPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("dataMaskingPolicyName") String dataMaskingPolicyName,
            @BodyParam("application/json") DataMaskingPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/dataMaskingPolicies/{dataMaskingPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataMaskingPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("dataMaskingPolicyName") String dataMaskingPolicyName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Creates or updates a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters Parameters for creating or updating a data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataMaskingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, DataMaskingPolicyInner parameters) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-06-01";
        final String dataMaskingPolicyName = "Default";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            dataMaskingPolicyName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters Parameters for creating or updating a data masking policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataMaskingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataMaskingPolicyInner parameters,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-06-01";
        final String dataMaskingPolicyName = "Default";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                dataMaskingPolicyName,
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters Parameters for creating or updating a data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataMaskingPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, DataMaskingPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters)
            .flatMap(
                (Response<DataMaskingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters Parameters for creating or updating a data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataMaskingPolicyInner createOrUpdate(
        String resourceGroupName, String workspaceName, String sqlPoolName, DataMaskingPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, workspaceName, sqlPoolName, parameters).block();
    }

    /**
     * Creates or updates a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters Parameters for creating or updating a data masking policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataMaskingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataMaskingPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters, context)
            .block();
    }

    /**
     * Gets a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool data masking policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataMaskingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String dataMaskingPolicyName = "Default";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            dataMaskingPolicyName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool data masking policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataMaskingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String dataMaskingPolicyName = "Default";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                dataMaskingPolicyName,
                accept,
                context);
    }

    /**
     * Gets a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool data masking policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataMaskingPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName)
            .flatMap(
                (Response<DataMaskingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataMaskingPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getAsync(resourceGroupName, workspaceName, sqlPoolName).block();
    }

    /**
     * Gets a Sql pool data masking policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool data masking policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataMaskingPolicyInner> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, context).block();
    }
}
