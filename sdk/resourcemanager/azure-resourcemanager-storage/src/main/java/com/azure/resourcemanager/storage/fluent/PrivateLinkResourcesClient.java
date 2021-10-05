// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.PrivateLinkResourceListResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PrivateLinkResourcesClient.
 */
public interface PrivateLinkResourcesClient {
    /**
     * Gets the private link resources that need to be created for a storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateLinkResourceListResultInner>> listByStorageAccountWithResponseAsync(String resourceGroupName, String accountName);

    /**
     * Gets the private link resources that need to be created for a storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateLinkResourceListResultInner> listByStorageAccountAsync(String resourceGroupName, String accountName);

    /**
     * Gets the private link resources that need to be created for a storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceListResultInner listByStorageAccount(String resourceGroupName, String accountName);

    /**
     * Gets the private link resources that need to be created for a storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceListResultInner> listByStorageAccountWithResponse(String resourceGroupName, String accountName, Context context);
}
