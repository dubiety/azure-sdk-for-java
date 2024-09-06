// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Customers.
 */
public interface Customers {
    /**
     * Gets a customer by its ID. The operation is supported only for billing accounts with agreement type Microsoft
     * Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a customer by its ID along with {@link Response}.
     */
    Response<Customer> getWithResponse(String billingAccountName, String billingProfileName, String customerName,
        Context context);

    /**
     * Gets a customer by its ID. The operation is supported only for billing accounts with agreement type Microsoft
     * Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a customer by its ID.
     */
    Customer get(String billingAccountName, String billingProfileName, String customerName);

    /**
     * Lists the customers that are billed to a billing profile. The operation is supported only for billing accounts
     * with agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Customer> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the customers that are billed to a billing profile. The operation is supported only for billing accounts
     * with agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param expand May be used to expand enabledAzurePlans and resellers.
     * @param filter The filter query option allows clients to filter a collection of resources that are addressed by a
     * request URL.
     * @param orderBy The orderby query option allows clients to request resources in a particular order.
     * @param top The top query option requests the number of items in the queried collection to be included in the
     * result. The maximum supported value for top is 50.
     * @param skip The skip query option requests the number of items in the queried collection that are to be skipped
     * and not included in the result.
     * @param count The count query option allows clients to request a count of the matching resources included with the
     * resources in the response.
     * @param search The search query option allows clients to request items within a collection matching a free-text
     * search expression. search is only supported for string fields.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Customer> listByBillingProfile(String billingAccountName, String billingProfileName, String expand,
        String filter, String orderBy, Long top, Long skip, Boolean count, String search, Context context);

    /**
     * Gets a customer by its ID at billing account level. The operation is supported only for billing accounts with
     * agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a customer by its ID at billing account level along with {@link Response}.
     */
    Response<Customer> getByBillingAccountWithResponse(String billingAccountName, String customerName, Context context);

    /**
     * Gets a customer by its ID at billing account level. The operation is supported only for billing accounts with
     * agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a customer by its ID at billing account level.
     */
    Customer getByBillingAccount(String billingAccountName, String customerName);

    /**
     * Lists the customers that are billed to a billing account. The operation is supported only for billing accounts
     * with agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Customer> listByBillingAccount(String billingAccountName);

    /**
     * Lists the customers that are billed to a billing account. The operation is supported only for billing accounts
     * with agreement type Microsoft Partner Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand enabledAzurePlans and resellers.
     * @param filter The filter query option allows clients to filter a collection of resources that are addressed by a
     * request URL.
     * @param orderBy The orderby query option allows clients to request resources in a particular order.
     * @param top The top query option requests the number of items in the queried collection to be included in the
     * result. The maximum supported value for top is 50.
     * @param skip The skip query option requests the number of items in the queried collection that are to be skipped
     * and not included in the result.
     * @param count The count query option allows clients to request a count of the matching resources included with the
     * resources in the response.
     * @param search The search query option allows clients to request items within a collection matching a free-text
     * search expression. search is only supported for string fields.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Customer> listByBillingAccount(String billingAccountName, String expand, String filter,
        String orderBy, Long top, Long skip, Boolean count, String search, Context context);
}
