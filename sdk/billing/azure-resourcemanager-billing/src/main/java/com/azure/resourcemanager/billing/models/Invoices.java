// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.LocalDate;
import java.util.List;

/**
 * Resource collection API of Invoices.
 */
public interface Invoices {
    /**
     * Lists the invoices for a billing profile for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the invoices for a billing profile for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param periodStartDate The start date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
     * @param periodEndDate The end date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
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
    PagedIterable<Invoice> listByBillingProfile(String billingAccountName, String billingProfileName,
        LocalDate periodStartDate, LocalDate periodEndDate, String filter, String orderBy, Long top, Long skip,
        Boolean count, String search, Context context);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters A list of download details for individual documents.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DocumentDownloadResult downloadDocumentsByBillingAccount(String billingAccountName,
        List<DocumentDownloadRequest> parameters);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters A list of download details for individual documents.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DocumentDownloadResult downloadDocumentsByBillingAccount(String billingAccountName,
        List<DocumentDownloadRequest> parameters, Context context);

    /**
     * Regenerate an invoice by billing account name and invoice name. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void amend(String billingAccountName, String invoiceName);

    /**
     * Regenerate an invoice by billing account name and invoice name. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void amend(String billingAccountName, String invoiceName, Context context);

    /**
     * Gets a URL to download an invoice document. The operation is supported for billing accounts with agreement type
     * Microsoft Partner Agreement, Microsoft Customer Agreement or Enterprise Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice document.
     */
    DocumentDownloadResult downloadByBillingAccount(String billingAccountName, String invoiceName);

    /**
     * Gets a URL to download an invoice document. The operation is supported for billing accounts with agreement type
     * Microsoft Partner Agreement, Microsoft Customer Agreement or Enterprise Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param documentName The ID that uniquely identifies an invoice document. This ID may be an identifier for an
     * invoice PDF, a credit note, or a tax receipt.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice document.
     */
    DocumentDownloadResult downloadByBillingAccount(String billingAccountName, String invoiceName, String documentName,
        Context context);

    /**
     * Gets a URL to download the summary document for an invoice. The operation is supported for billing accounts with
     * agreement type Enterprise Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the summary document for an invoice.
     */
    DocumentDownloadResult downloadSummaryByBillingAccount(String billingAccountName, String invoiceName);

    /**
     * Gets a URL to download the summary document for an invoice. The operation is supported for billing accounts with
     * agreement type Enterprise Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download the summary document for an invoice.
     */
    DocumentDownloadResult downloadSummaryByBillingAccount(String billingAccountName, String invoiceName,
        Context context);

    /**
     * Gets an invoice by billing account name and ID. The operation is supported for all billing account types.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by billing account name and ID along with {@link Response}.
     */
    Response<Invoice> getByBillingAccountWithResponse(String billingAccountName, String invoiceName, Context context);

    /**
     * Gets an invoice by billing account name and ID. The operation is supported for all billing account types.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by billing account name and ID.
     */
    Invoice getByBillingAccount(String billingAccountName, String invoiceName);

    /**
     * Lists the invoices for a billing account for a given start date and end date. The operation is supported for all
     * billing account types.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingAccount(String billingAccountName);

    /**
     * Lists the invoices for a billing account for a given start date and end date. The operation is supported for all
     * billing account types.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param periodStartDate The start date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
     * @param periodEndDate The end date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
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
    PagedIterable<Invoice> listByBillingAccount(String billingAccountName, LocalDate periodStartDate,
        LocalDate periodEndDate, String filter, String orderBy, Long top, Long skip, Boolean count, String search,
        Context context);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     * 
     * @param parameters A list of download details for individual documents.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DocumentDownloadResult downloadDocumentsByBillingSubscription(List<DocumentDownloadRequest> parameters);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     * 
     * @param parameters A list of download details for individual documents.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DocumentDownloadResult downloadDocumentsByBillingSubscription(List<DocumentDownloadRequest> parameters,
        Context context);

    /**
     * Gets a URL to download an invoice by billing subscription. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice by billing subscription.
     */
    DocumentDownloadResult downloadByBillingSubscription(String invoiceName);

    /**
     * Gets a URL to download an invoice by billing subscription. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param documentName The ID that uniquely identifies an invoice document. This ID may be an identifier for an
     * invoice PDF, a credit note, or a tax receipt.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice by billing subscription.
     */
    DocumentDownloadResult downloadByBillingSubscription(String invoiceName, String documentName, Context context);

    /**
     * Gets an invoice by subscription ID and invoice ID. The operation is supported for billing accounts with agreement
     * type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by subscription ID and invoice ID along with {@link Response}.
     */
    Response<Invoice> getByBillingSubscriptionWithResponse(String invoiceName, Context context);

    /**
     * Gets an invoice by subscription ID and invoice ID. The operation is supported for billing accounts with agreement
     * type Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by subscription ID and invoice ID.
     */
    Invoice getByBillingSubscription(String invoiceName);

    /**
     * Lists the invoices for a subscription. The operation is supported for billing accounts with agreement type
     * Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingSubscription();

    /**
     * Lists the invoices for a subscription. The operation is supported for billing accounts with agreement type
     * Microsoft Partner Agreement or Microsoft Customer Agreement.
     * 
     * @param periodStartDate The start date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
     * @param periodEndDate The end date of the billing period for which the invoice is generated. The date is in
     * MM-DD-YYYY format.
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
    PagedIterable<Invoice> listByBillingSubscription(LocalDate periodStartDate, LocalDate periodEndDate, String filter,
        String orderBy, Long top, Long skip, Boolean count, String search, Context context);

    /**
     * Gets an invoice by ID. The operation is supported for billing accounts with agreement type Microsoft Partner
     * Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by ID along with {@link Response}.
     */
    Response<Invoice> getWithResponse(String invoiceName, Context context);

    /**
     * Gets an invoice by ID. The operation is supported for billing accounts with agreement type Microsoft Partner
     * Agreement or Microsoft Customer Agreement.
     * 
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by ID.
     */
    Invoice get(String invoiceName);
}
