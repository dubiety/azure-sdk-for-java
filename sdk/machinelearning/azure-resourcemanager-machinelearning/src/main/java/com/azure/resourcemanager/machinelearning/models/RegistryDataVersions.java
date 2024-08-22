// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DataVersionBaseInner;

/**
 * Resource collection API of RegistryDataVersions.
 */
public interface RegistryDataVersions {
    /**
     * List data versions in the data container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Data container's name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of DataVersionBase entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataVersionBase> list(String resourceGroupName, String registryName, String name);

    /**
     * List data versions in the data container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Data container's name.
     * @param orderBy Please choose OrderBy value from ['createdtime', 'modifiedtime'].
     * @param top Top count of results, top count cannot be greater than the page size.
     * If topCount &gt; page size, results with be default page size count will be returned.
     * @param skip Continuation token for pagination.
     * @param tags Comma-separated list of tag names (and optionally values). Example: tag1,tag2=value2.
     * @param listViewType [ListViewType.ActiveOnly, ListViewType.ArchivedOnly, ListViewType.All]View type for
     * including/excluding (for example) archived entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of DataVersionBase entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataVersionBase> list(String resourceGroupName, String registryName, String name, String orderBy,
        Integer top, String skip, String tags, ListViewType listViewType, Context context);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String registryName, String name, String version);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String registryName, String name, String version, Context context);

    /**
     * Get version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version along with {@link Response}.
     */
    Response<DataVersionBase> getWithResponse(String resourceGroupName, String registryName, String name,
        String version, Context context);

    /**
     * Get version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    DataVersionBase get(String resourceGroupName, String registryName, String name, String version);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @param body Version entity to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    DataVersionBase createOrUpdate(String resourceGroupName, String registryName, String name, String version,
        DataVersionBaseInner body);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Container name.
     * @param version Version identifier.
     * @param body Version entity to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    DataVersionBase createOrUpdate(String resourceGroupName, String registryName, String name, String version,
        DataVersionBaseInner body, Context context);

    /**
     * Generate a storage location and credential for the client to upload a data asset to.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Data asset name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Pending upload request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<PendingUploadResponseDto> createOrGetStartPendingUploadWithResponse(String resourceGroupName,
        String registryName, String name, String version, PendingUploadRequestDto body, Context context);

    /**
     * Generate a storage location and credential for the client to upload a data asset to.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName Name of Azure Machine Learning registry. This is case-insensitive.
     * @param name Data asset name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Pending upload request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PendingUploadResponseDto createOrGetStartPendingUpload(String resourceGroupName, String registryName, String name,
        String version, PendingUploadRequestDto body);
}
