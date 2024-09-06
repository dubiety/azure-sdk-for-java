// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.RecipientTransferDetailsInner;
import com.azure.resourcemanager.billing.fluent.models.ValidateTransferListResponseInner;
import com.azure.resourcemanager.billing.models.AcceptTransferRequest;

/**
 * An instance of this class provides access to all the operations defined in RecipientTransfersClient.
 */
public interface RecipientTransfersClient {
    /**
     * Accepts a transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param parameters Request parameters that are provided to the accept transfer operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the transfer along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecipientTransferDetailsInner> acceptWithResponse(String transferName, AcceptTransferRequest parameters,
        Context context);

    /**
     * Accepts a transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param parameters Request parameters that are provided to the accept transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the transfer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecipientTransferDetailsInner accept(String transferName, AcceptTransferRequest parameters);

    /**
     * Validates if a subscription or a reservation can be transferred. Use this operation to validate your
     * subscriptions or reservation before using the accept transfer operation.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param parameters Request parameters that are provided to the validate transfer operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of transfer validation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateTransferListResponseInner> validateWithResponse(String transferName,
        AcceptTransferRequest parameters, Context context);

    /**
     * Validates if a subscription or a reservation can be transferred. Use this operation to validate your
     * subscriptions or reservation before using the accept transfer operation.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param parameters Request parameters that are provided to the validate transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of transfer validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateTransferListResponseInner validate(String transferName, AcceptTransferRequest parameters);

    /**
     * Declines a transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the transfer along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecipientTransferDetailsInner> declineWithResponse(String transferName, Context context);

    /**
     * Declines a transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the transfer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecipientTransferDetailsInner decline(String transferName);

    /**
     * Gets a transfer request by ID. The caller must be the recipient of the transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transfer request by ID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecipientTransferDetailsInner> getWithResponse(String transferName, Context context);

    /**
     * Gets a transfer request by ID. The caller must be the recipient of the transfer request.
     * 
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a transfer request by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecipientTransferDetailsInner get(String transferName);

    /**
     * Lists the transfer requests received by the caller.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transfers received by caller as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecipientTransferDetailsInner> list();

    /**
     * Lists the transfer requests received by the caller.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transfers received by caller as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecipientTransferDetailsInner> list(Context context);
}
