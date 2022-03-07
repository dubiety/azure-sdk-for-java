// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.DeletedAccountInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedAccountsClient. */
public interface DeletedAccountsClient {
    /**
     * Lists deleted accounts under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Deleted Accounts operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DeletedAccountInner> listAsync();

    /**
     * Lists deleted accounts under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Deleted Accounts operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedAccountInner> list();

    /**
     * Lists deleted accounts under the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Deleted Accounts operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedAccountInner> list(Context context);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DeletedAccountInner>> getWithResponseAsync(String deletedAccountName, String location);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DeletedAccountInner> getAsync(String deletedAccountName, String location);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedAccountInner get(String deletedAccountName, String location);

    /**
     * Get properties of specified deleted account resource.
     *
     * @param deletedAccountName Name of the deleted storage account.
     * @param location The location of the deleted storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of specified deleted account resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedAccountInner> getWithResponse(String deletedAccountName, String location, Context context);
}
