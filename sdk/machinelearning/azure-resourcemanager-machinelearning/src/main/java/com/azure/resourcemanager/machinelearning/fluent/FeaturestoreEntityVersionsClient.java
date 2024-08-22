// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturestoreEntityVersionInner;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

/**
 * An instance of this class provides access to all the operations defined in FeaturestoreEntityVersionsClient.
 */
public interface FeaturestoreEntityVersionsClient {
    /**
     * List versions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Feature entity name. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of FeaturestoreEntityVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FeaturestoreEntityVersionInner> list(String resourceGroupName, String workspaceName, String name);

    /**
     * List versions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Feature entity name. This is case-sensitive.
     * @param skip Continuation token for pagination.
     * @param tags Comma-separated list of tag names (and optionally values). Example: tag1,tag2=value2.
     * @param listViewType [ListViewType.ActiveOnly, ListViewType.ArchivedOnly, ListViewType.All]View type for
     * including/excluding (for example) archived entities.
     * @param pageSize page size.
     * @param versionName name for the featurestore entity version.
     * @param version featurestore entity version.
     * @param description description for the feature entity version.
     * @param createdBy createdBy user name.
     * @param stage Specifies the featurestore stage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of FeaturestoreEntityVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FeaturestoreEntityVersionInner> list(String resourceGroupName, String workspaceName, String name,
        String skip, String tags, ListViewType listViewType, Integer pageSize, String versionName, String version,
        String description, String createdBy, String stage, Context context);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, String name,
        String version);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, String name,
        String version, Context context);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Delete version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String name, String version, Context context);

    /**
     * Get version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FeaturestoreEntityVersionInner> getWithResponse(String resourceGroupName, String workspaceName,
        String name, String version, Context context);

    /**
     * Get version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FeaturestoreEntityVersionInner get(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FeaturestoreEntityVersionInner>, FeaturestoreEntityVersionInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String name, String version,
        FeaturestoreEntityVersionInner body);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FeaturestoreEntityVersionInner>, FeaturestoreEntityVersionInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String name, String version,
        FeaturestoreEntityVersionInner body, Context context);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FeaturestoreEntityVersionInner createOrUpdate(String resourceGroupName, String workspaceName, String name,
        String version, FeaturestoreEntityVersionInner body);

    /**
     * Create or update version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name. This is case-sensitive.
     * @param version Version identifier. This is case-sensitive.
     * @param body Version entity to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FeaturestoreEntityVersionInner createOrUpdate(String resourceGroupName, String workspaceName, String name,
        String version, FeaturestoreEntityVersionInner body, Context context);
}
