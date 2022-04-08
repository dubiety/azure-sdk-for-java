// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ClientSecretContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.OpenidConnectProviderContractInner;
import com.azure.resourcemanager.apimanagement.models.OpenIdConnectProvidersCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.OpenIdConnectProvidersGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.OpenIdConnectProvidersGetResponse;
import com.azure.resourcemanager.apimanagement.models.OpenIdConnectProvidersListSecretsResponse;
import com.azure.resourcemanager.apimanagement.models.OpenIdConnectProvidersUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.OpenidConnectProviderUpdateContract;

/** An instance of this class provides access to all the operations defined in OpenIdConnectProvidersClient. */
public interface OpenIdConnectProvidersClient {
    /**
     * Lists of all the OpenId Connect Providers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged OpenIdProviders list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenidConnectProviderContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists of all the OpenId Connect Providers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged OpenIdProviders list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenidConnectProviderContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the openIdConnectProvider specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String opid);

    /**
     * Gets the entity state (Etag) version of the openIdConnectProvider specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the openIdConnectProvider specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenIdConnectProvidersGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String opid, Context context);

    /**
     * Gets specific OpenID Connect Provider without secrets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific OpenID Connect Provider without secrets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenidConnectProviderContractInner get(String resourceGroupName, String serviceName, String opid);

    /**
     * Gets specific OpenID Connect Provider without secrets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific OpenID Connect Provider without secrets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenIdConnectProvidersGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String opid, Context context);

    /**
     * Creates or updates the OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openId Connect Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenidConnectProviderContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String opid, OpenidConnectProviderContractInner parameters);

    /**
     * Creates or updates the OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openId Connect Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenIdConnectProvidersCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String opid,
        OpenidConnectProviderContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the specific OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openId Connect Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenidConnectProviderContractInner update(
        String resourceGroupName,
        String serviceName,
        String opid,
        String ifMatch,
        OpenidConnectProviderUpdateContract parameters);

    /**
     * Updates the specific OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openId Connect Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenIdConnectProvidersUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String opid,
        String ifMatch,
        OpenidConnectProviderUpdateContract parameters,
        Context context);

    /**
     * Deletes specific OpenID Connect Provider of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String opid, String ifMatch);

    /**
     * Deletes specific OpenID Connect Provider of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String opid, String ifMatch, Context context);

    /**
     * Gets the client secret details of the OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the OpenID Connect Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClientSecretContractInner listSecrets(String resourceGroupName, String serviceName, String opid);

    /**
     * Gets the client secret details of the OpenID Connect Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param opid Identifier of the OpenID Connect Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the OpenID Connect Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenIdConnectProvidersListSecretsResponse listSecretsWithResponse(
        String resourceGroupName, String serviceName, String opid, Context context);
}
