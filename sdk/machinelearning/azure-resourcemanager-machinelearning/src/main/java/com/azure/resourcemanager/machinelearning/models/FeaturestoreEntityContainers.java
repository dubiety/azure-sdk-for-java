// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of FeaturestoreEntityContainers.
 */
public interface FeaturestoreEntityContainers {
    /**
     * List featurestore entity containers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of FeaturestoreEntityContainer entities as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<FeaturestoreEntityContainer> list(String resourceGroupName, String workspaceName);

    /**
     * List featurestore entity containers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param skip Continuation token for pagination.
     * @param tags Comma-separated list of tag names (and optionally values). Example: tag1,tag2=value2.
     * @param listViewType [ListViewType.ActiveOnly, ListViewType.ArchivedOnly, ListViewType.All]View type for
     * including/excluding (for example) archived entities.
     * @param pageSize page size.
     * @param name name for the featurestore entity.
     * @param description description for the featurestore entity.
     * @param createdBy createdBy user name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of FeaturestoreEntityContainer entities as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<FeaturestoreEntityContainer> list(String resourceGroupName, String workspaceName, String skip,
        String tags, ListViewType listViewType, Integer pageSize, String name, String description, String createdBy,
        Context context);

    /**
     * Delete container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String name);

    /**
     * Delete container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String name, Context context);

    /**
     * Get container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container along with {@link Response}.
     */
    Response<FeaturestoreEntityContainer> getEntityWithResponse(String resourceGroupName, String workspaceName,
        String name, Context context);

    /**
     * Get container.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container.
     */
    FeaturestoreEntityContainer getEntity(String resourceGroupName, String workspaceName, String name);

    /**
     * Get container.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container along with {@link Response}.
     */
    FeaturestoreEntityContainer getEntityById(String id);

    /**
     * Get container.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container along with {@link Response}.
     */
    Response<FeaturestoreEntityContainer> getEntityByIdWithResponse(String id, Context context);

    /**
     * Delete container.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete container.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FeaturestoreEntityContainer resource.
     * 
     * @param name resource name.
     * @return the first stage of the new FeaturestoreEntityContainer definition.
     */
    FeaturestoreEntityContainer.DefinitionStages.Blank define(String name);
}
