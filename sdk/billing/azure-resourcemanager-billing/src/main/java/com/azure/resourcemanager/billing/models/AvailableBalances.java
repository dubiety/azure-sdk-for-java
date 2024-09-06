// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AvailableBalances.
 */
public interface AvailableBalances {
    /**
     * The Available Credit or Payment on Account Balance for a billing account. The credit balance can be used to
     * settle due or past due invoices and is supported for billing accounts with agreement type Microsoft Customer
     * Agreement. The payment on account balance is supported for billing accounts with agreement type Microsoft
     * Customer Agreement or Microsoft Online Services Program.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Available Credit or Payment on Account Balance along with {@link Response}.
     */
    Response<AvailableBalance> getByBillingAccountWithResponse(String billingAccountName, Context context);

    /**
     * The Available Credit or Payment on Account Balance for a billing account. The credit balance can be used to
     * settle due or past due invoices and is supported for billing accounts with agreement type Microsoft Customer
     * Agreement. The payment on account balance is supported for billing accounts with agreement type Microsoft
     * Customer Agreement or Microsoft Online Services Program.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Available Credit or Payment on Account Balance.
     */
    AvailableBalance getByBillingAccount(String billingAccountName);

    /**
     * The Available Credit or Payment on Account Balance for a billing profile. The credit balance can be used to
     * settle due or past due invoices and is supported for billing accounts with agreement type Microsoft Customer
     * Agreement. The payment on account balance is supported for billing accounts with agreement type Microsoft
     * Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Available Credit or Payment on Account Balance along with {@link Response}.
     */
    Response<AvailableBalance> getByBillingProfileWithResponse(String billingAccountName, String billingProfileName,
        Context context);

    /**
     * The Available Credit or Payment on Account Balance for a billing profile. The credit balance can be used to
     * settle due or past due invoices and is supported for billing accounts with agreement type Microsoft Customer
     * Agreement. The payment on account balance is supported for billing accounts with agreement type Microsoft
     * Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Available Credit or Payment on Account Balance.
     */
    AvailableBalance getByBillingProfile(String billingAccountName, String billingProfileName);
}
