// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Certificates. */
public interface Certificates {
    /**
     * Lists all of the certificates in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Certificate> listByBatchAccount(String resourceGroupName, String accountName);

    /**
     * Lists all of the certificates in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param select Comma separated list of properties that should be returned. e.g. "properties/provisioningState".
     *     Only top level properties under properties/ are valid for selection.
     * @param filter OData filter expression. Valid properties for filtering are "properties/provisioningState",
     *     "properties/provisioningStateTransitionTime", "name".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Certificate> listByBatchAccount(
        String resourceGroupName,
        String accountName,
        Integer maxresults,
        String select,
        String filter,
        Context context);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String certificateName);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * Gets information about the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    Certificate get(String resourceGroupName, String accountName, String certificateName);

    /**
     * Gets information about the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    Response<Certificate> getWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * If you try to delete a certificate that is being used by a pool or compute node, the status of the certificate
     * changes to deleteFailed. If you decide that you want to continue using the certificate, you can use this
     * operation to set the status of the certificate back to active. If you intend to delete the certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the certificate is not being
     * used by any resources, and then you can try again to delete the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    Certificate cancelDeletion(String resourceGroupName, String accountName, String certificateName);

    /**
     * If you try to delete a certificate that is being used by a pool or compute node, the status of the certificate
     * changes to deleteFailed. If you decide that you want to continue using the certificate, you can use this
     * operation to set the status of the certificate back to active. If you intend to delete the certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the certificate is not being
     * used by any resources, and then you can try again to delete the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    Response<Certificate> cancelDeletionWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * Gets information about the specified certificate.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    Certificate getById(String id);

    /**
     * Gets information about the specified certificate.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    Response<Certificate> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified certificate.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified certificate.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Certificate resource.
     *
     * @param name resource name.
     * @return the first stage of the new Certificate definition.
     */
    Certificate.DefinitionStages.Blank define(String name);
}
