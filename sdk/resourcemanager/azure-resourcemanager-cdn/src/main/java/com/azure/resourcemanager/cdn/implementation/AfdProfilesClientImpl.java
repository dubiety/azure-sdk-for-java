// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.cdn.fluent.AfdProfilesClient;
import com.azure.resourcemanager.cdn.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.models.CheckHostnameAvailabilityInput;
import com.azure.resourcemanager.cdn.models.UsagesListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AfdProfilesClient. */
public final class AfdProfilesClientImpl implements AfdProfilesClient {
    private final ClientLogger logger = new ClientLogger(AfdProfilesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AfdProfilesService service;

    /** The service client containing this operation class. */
    private final CdnManagementClientImpl client;

    /**
     * Initializes an instance of AfdProfilesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AfdProfilesClientImpl(CdnManagementClientImpl client) {
        this.service =
            RestProxy.create(AfdProfilesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CdnManagementClientAfdProfiles to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CdnManagementClientA")
    private interface AfdProfilesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cdn/profiles"
                + "/{profileName}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsagesListResult>> listResourceUsage(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("profileName") String profileName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cdn/profiles"
                + "/{profileName}/checkHostNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityOutputInner>> checkHostnameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("profileName") String profileName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckHostnameAvailabilityInput checkHostnameAvailabilityInput,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsagesListResult>> listResourceUsageNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listResourceUsageSinglePageAsync(
        String resourceGroupName, String profileName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listResourceUsage(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            profileName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<UsageInner>>map(
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
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listResourceUsageSinglePageAsync(
        String resourceGroupName, String profileName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listResourceUsage(
                this.client.getEndpoint(),
                resourceGroupName,
                profileName,
                this.client.getSubscriptionId(),
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
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UsageInner> listResourceUsageAsync(String resourceGroupName, String profileName) {
        return new PagedFlux<>(
            () -> listResourceUsageSinglePageAsync(resourceGroupName, profileName),
            nextLink -> listResourceUsageNextSinglePageAsync(nextLink));
    }

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> listResourceUsageAsync(
        String resourceGroupName, String profileName, Context context) {
        return new PagedFlux<>(
            () -> listResourceUsageSinglePageAsync(resourceGroupName, profileName, context),
            nextLink -> listResourceUsageNextSinglePageAsync(nextLink, context));
    }

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName) {
        return new PagedIterable<>(listResourceUsageAsync(resourceGroupName, profileName));
    }

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName, Context context) {
        return new PagedIterable<>(listResourceUsageAsync(resourceGroupName, profileName, context));
    }

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckNameAvailabilityOutputInner>> checkHostnameAvailabilityWithResponseAsync(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (checkHostnameAvailabilityInput == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkHostnameAvailabilityInput is required and cannot be null."));
        } else {
            checkHostnameAvailabilityInput.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkHostnameAvailability(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            profileName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            checkHostnameAvailabilityInput,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityOutputInner>> checkHostnameAvailabilityWithResponseAsync(
        String resourceGroupName,
        String profileName,
        CheckHostnameAvailabilityInput checkHostnameAvailabilityInput,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (profileName == null) {
            return Mono.error(new IllegalArgumentException("Parameter profileName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (checkHostnameAvailabilityInput == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkHostnameAvailabilityInput is required and cannot be null."));
        } else {
            checkHostnameAvailabilityInput.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkHostnameAvailability(
                this.client.getEndpoint(),
                resourceGroupName,
                profileName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                checkHostnameAvailabilityInput,
                accept,
                context);
    }

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityOutputInner> checkHostnameAvailabilityAsync(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput) {
        return checkHostnameAvailabilityWithResponseAsync(
                resourceGroupName, profileName, checkHostnameAvailabilityInput)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner checkHostnameAvailability(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput) {
        return checkHostnameAvailabilityAsync(resourceGroupName, profileName, checkHostnameAvailabilityInput).block();
    }

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityOutputInner> checkHostnameAvailabilityWithResponse(
        String resourceGroupName,
        String profileName,
        CheckHostnameAvailabilityInput checkHostnameAvailabilityInput,
        Context context) {
        return checkHostnameAvailabilityWithResponseAsync(
                resourceGroupName, profileName, checkHostnameAvailabilityInput, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listResourceUsageNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listResourceUsageNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<UsageInner>>map(
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
     * @return the list usages operation response along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listResourceUsageNextSinglePageAsync(String nextLink, Context context) {
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
            .listResourceUsageNext(nextLink, this.client.getEndpoint(), accept, context)
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
