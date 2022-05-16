// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.ConfigurationServiceResourceInner;
import com.azure.resourcemanager.appplatform.fluent.models.ConfigurationServiceSettingsValidateResultInner;
import com.azure.resourcemanager.appplatform.models.ConfigurationServiceSettings;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ConfigurationServicesClient. */
public interface ConfigurationServicesClient {
    /**
     * Get the Application Configuration Service and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Configuration Service and its properties along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ConfigurationServiceResourceInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Get the Application Configuration Service and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Configuration Service and its properties on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConfigurationServiceResourceInner> getAsync(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Get the Application Configuration Service and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Configuration Service and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationServiceResourceInner get(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Get the Application Configuration Service and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Configuration Service and its properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationServiceResourceInner> getWithResponse(
        String resourceGroupName, String serviceName, String configurationServiceName, Context context);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Configuration Service resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of application Configuration Service resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ConfigurationServiceResourceInner>, ConfigurationServiceResourceInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String serviceName,
            String configurationServiceName,
            ConfigurationServiceResourceInner configurationServiceResource);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application Configuration Service resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationServiceResourceInner>, ConfigurationServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application Configuration Service resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConfigurationServiceResourceInner>, ConfigurationServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource,
        Context context);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Configuration Service resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConfigurationServiceResourceInner> createOrUpdateAsync(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Configuration Service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationServiceResourceInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource);

    /**
     * Create the default Application Configuration Service or update the existing Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param configurationServiceResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Configuration Service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationServiceResourceInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceResourceInner configurationServiceResource,
        Context context);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, String configurationServiceName, Context context);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String configurationServiceName);

    /**
     * Disable the default Application Configuration Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String configurationServiceName, Context context);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of configuration service resources and a possible link for next set as
     *     paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ConfigurationServiceResourceInner> listAsync(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of configuration service resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationServiceResourceInner> list(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of configuration service resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationServiceResourceInner> list(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> validateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of validation result for configuration service settings.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<
            PollResult<ConfigurationServiceSettingsValidateResultInner>,
            ConfigurationServiceSettingsValidateResultInner>
        beginValidateAsync(
            String resourceGroupName,
            String serviceName,
            String configurationServiceName,
            ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of validation result for configuration service settings.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ConfigurationServiceSettingsValidateResultInner>,
            ConfigurationServiceSettingsValidateResultInner>
        beginValidate(
            String resourceGroupName,
            String serviceName,
            String configurationServiceName,
            ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of validation result for configuration service settings.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<
            PollResult<ConfigurationServiceSettingsValidateResultInner>,
            ConfigurationServiceSettingsValidateResultInner>
        beginValidate(
            String resourceGroupName,
            String serviceName,
            String configurationServiceName,
            ConfigurationServiceSettings settings,
            Context context);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConfigurationServiceSettingsValidateResultInner> validateAsync(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationServiceSettingsValidateResultInner validate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceSettings settings);

    /**
     * Check if the Application Configuration Service settings are valid.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param configurationServiceName The name of Application Configuration Service.
     * @param settings Application Configuration Service settings to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for configuration service settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationServiceSettingsValidateResultInner validate(
        String resourceGroupName,
        String serviceName,
        String configurationServiceName,
        ConfigurationServiceSettings settings,
        Context context);
}
