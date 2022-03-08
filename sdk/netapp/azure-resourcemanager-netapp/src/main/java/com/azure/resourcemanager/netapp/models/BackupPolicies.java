// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupPolicies. */
public interface BackupPolicies {
    /**
     * List backup policies for Netapp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backup Policies as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupPolicy> list(String resourceGroupName, String accountName);

    /**
     * List backup policies for Netapp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backup Policies as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BackupPolicy> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get a particular backup Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup Policy.
     */
    BackupPolicy get(String resourceGroupName, String accountName, String backupPolicyName);

    /**
     * Get a particular backup Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup Policy along with {@link Response}.
     */
    Response<BackupPolicy> getWithResponse(
        String resourceGroupName, String accountName, String backupPolicyName, Context context);

    /**
     * Delete backup policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String backupPolicyName);

    /**
     * Delete backup policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String backupPolicyName, Context context);

    /**
     * Get a particular backup Policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup Policy along with {@link Response}.
     */
    BackupPolicy getById(String id);

    /**
     * Get a particular backup Policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup Policy along with {@link Response}.
     */
    Response<BackupPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Delete backup policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete backup policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BackupPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new BackupPolicy definition.
     */
    BackupPolicy.DefinitionStages.Blank define(String name);
}
