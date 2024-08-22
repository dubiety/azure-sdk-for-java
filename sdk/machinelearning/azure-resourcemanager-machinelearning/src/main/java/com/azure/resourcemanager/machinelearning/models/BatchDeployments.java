// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of BatchDeployments.
 */
public interface BatchDeployments {
    /**
     * Lists Batch inference deployments in the workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchDeployment entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BatchDeployment> list(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Lists Batch inference deployments in the workspace.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param orderBy Ordering of list.
     * @param top Top of list.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchDeployment entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BatchDeployment> list(String resourceGroupName, String workspaceName, String endpointName,
        String orderBy, Integer top, String skip, Context context);

    /**
     * Delete Batch Inference deployment (asynchronous).
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Batch Inference deployment (asynchronous).
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName,
        Context context);

    /**
     * Gets a batch inference deployment by id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName The identifier for the Batch deployments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id along with {@link Response}.
     */
    Response<BatchDeployment> getWithResponse(String resourceGroupName, String workspaceName, String endpointName,
        String deploymentName, Context context);

    /**
     * Gets a batch inference deployment by id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName The identifier for the Batch deployments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id.
     */
    BatchDeployment get(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Gets a batch inference deployment by id.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id along with {@link Response}.
     */
    BatchDeployment getById(String id);

    /**
     * Gets a batch inference deployment by id.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id along with {@link Response}.
     */
    Response<BatchDeployment> getByIdWithResponse(String id, Context context);

    /**
     * Delete Batch Inference deployment (asynchronous).
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Batch Inference deployment (asynchronous).
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BatchDeployment resource.
     * 
     * @param name resource name.
     * @return the first stage of the new BatchDeployment definition.
     */
    BatchDeployment.DefinitionStages.Blank define(String name);
}
