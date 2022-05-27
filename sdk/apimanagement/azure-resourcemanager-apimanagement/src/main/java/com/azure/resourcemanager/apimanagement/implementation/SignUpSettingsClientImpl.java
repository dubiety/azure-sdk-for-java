// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.resourcemanager.apimanagement.fluent.SignUpSettingsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSignupSettingsInner;
import com.azure.resourcemanager.apimanagement.models.SignUpSettingsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.SignUpSettingsGetResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SignUpSettingsClient. */
public final class SignUpSettingsClientImpl implements SignUpSettingsClient {
    /** The proxy service used to perform REST calls. */
    private final SignUpSettingsService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of SignUpSettingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SignUpSettingsClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(SignUpSettingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientSignUpSettings to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientS")
    private interface SignUpSettingsService {
        @Headers({"Content-Type: application/json"})
        @Head(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/portalsettings/signup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SignUpSettingsGetEntityTagResponse> getEntityTag(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/portalsettings/signup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SignUpSettingsGetResponse> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/portalsettings/signup")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @HeaderParam("If-Match") String ifMatch,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") PortalSignupSettingsInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/portalsettings/signup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PortalSignupSettingsInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @HeaderParam("If-Match") String ifMatch,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") PortalSignupSettingsInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the entity state (Etag) version of the SignUpSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the SignUpSettings on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignUpSettingsGetEntityTagResponse> getEntityTagWithResponseAsync(
        String resourceGroupName, String serviceName) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
                        .getEntityTag(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the entity state (Etag) version of the SignUpSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the SignUpSettings on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignUpSettingsGetEntityTagResponse> getEntityTagWithResponseAsync(
        String resourceGroupName, String serviceName, Context context) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
            .getEntityTag(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the entity state (Etag) version of the SignUpSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the SignUpSettings on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> getEntityTagAsync(String resourceGroupName, String serviceName) {
        return getEntityTagWithResponseAsync(resourceGroupName, serviceName)
            .flatMap((SignUpSettingsGetEntityTagResponse res) -> Mono.empty());
    }

    /**
     * Gets the entity state (Etag) version of the SignUpSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getEntityTag(String resourceGroupName, String serviceName) {
        getEntityTagAsync(resourceGroupName, serviceName).block();
    }

    /**
     * Gets the entity state (Etag) version of the SignUpSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the SignUpSettings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignUpSettingsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        return getEntityTagWithResponseAsync(resourceGroupName, serviceName, context).block();
    }

    /**
     * Get Sign Up Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign Up Settings for the Portal on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignUpSettingsGetResponse> getWithResponseAsync(String resourceGroupName, String serviceName) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Sign Up Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign Up Settings for the Portal on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignUpSettingsGetResponse> getWithResponseAsync(
        String resourceGroupName, String serviceName, Context context) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
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
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get Sign Up Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign Up Settings for the Portal on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PortalSignupSettingsInner> getAsync(String resourceGroupName, String serviceName) {
        return getWithResponseAsync(resourceGroupName, serviceName)
            .flatMap(
                (SignUpSettingsGetResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Sign Up Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign Up Settings for the Portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PortalSignupSettingsInner get(String resourceGroupName, String serviceName) {
        return getAsync(resourceGroupName, serviceName).block();
    }

    /**
     * Get Sign Up Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign Up Settings for the Portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignUpSettingsGetResponse getWithResponse(String resourceGroupName, String serviceName, Context context) {
        return getWithResponseAsync(resourceGroupName, serviceName, context).block();
    }

    /**
     * Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Sign-Up settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> updateWithResponseAsync(
        String resourceGroupName, String serviceName, String ifMatch, PortalSignupSettingsInner parameters) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            ifMatch,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Sign-Up settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> updateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String ifMatch,
        PortalSignupSettingsInner parameters,
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                ifMatch,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Sign-Up settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> updateAsync(
        String resourceGroupName, String serviceName, String ifMatch, PortalSignupSettingsInner parameters) {
        return updateWithResponseAsync(resourceGroupName, serviceName, ifMatch, parameters)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Sign-Up settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(
        String resourceGroupName, String serviceName, String ifMatch, PortalSignupSettingsInner parameters) {
        updateAsync(resourceGroupName, serviceName, ifMatch, parameters).block();
    }

    /**
     * Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Sign-Up settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String ifMatch,
        PortalSignupSettingsInner parameters,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, serviceName, ifMatch, parameters, context).block();
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PortalSignupSettingsInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters, String ifMatch) {
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            ifMatch,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PortalSignupSettingsInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        PortalSignupSettingsInner parameters,
        String ifMatch,
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
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                ifMatch,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PortalSignupSettingsInner> createOrUpdateAsync(
        String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters, String ifMatch) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serviceName, parameters, ifMatch)
            .flatMap(
                (Response<PortalSignupSettingsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PortalSignupSettingsInner> createOrUpdateAsync(
        String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters) {
        final String ifMatch = null;
        return createOrUpdateWithResponseAsync(resourceGroupName, serviceName, parameters, ifMatch)
            .flatMap(
                (Response<PortalSignupSettingsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PortalSignupSettingsInner createOrUpdate(
        String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters) {
        final String ifMatch = null;
        return createOrUpdateAsync(resourceGroupName, serviceName, parameters, ifMatch).block();
    }

    /**
     * Create or Update Sign-Up settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sign-Up settings for a developer portal along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PortalSignupSettingsInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        PortalSignupSettingsInner parameters,
        String ifMatch,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serviceName, parameters, ifMatch, context).block();
    }
}
