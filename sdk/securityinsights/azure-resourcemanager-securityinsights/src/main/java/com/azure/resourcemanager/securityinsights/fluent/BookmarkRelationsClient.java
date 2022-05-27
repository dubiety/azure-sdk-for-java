// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.RelationInner;

/** An instance of this class provides access to all the operations defined in BookmarkRelationsClient. */
public interface BookmarkRelationsClient {
    /**
     * Gets all bookmark relations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all bookmark relations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RelationInner> list(String resourceGroupName, String workspaceName, String bookmarkId);

    /**
     * Gets all bookmark relations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param filter Filters the results, based on a Boolean condition. Optional.
     * @param orderby Sorts the results. Optional.
     * @param top Returns only the first n results. Optional.
     * @param skipToken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all bookmark relations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RelationInner> list(
        String resourceGroupName,
        String workspaceName,
        String bookmarkId,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context);

    /**
     * Gets a bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a bookmark relation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RelationInner get(String resourceGroupName, String workspaceName, String bookmarkId, String relationName);

    /**
     * Gets a bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a bookmark relation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RelationInner> getWithResponse(
        String resourceGroupName, String workspaceName, String bookmarkId, String relationName, Context context);

    /**
     * Creates the bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @param relation The relation model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a relation between two resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RelationInner createOrUpdate(
        String resourceGroupName, String workspaceName, String bookmarkId, String relationName, RelationInner relation);

    /**
     * Creates the bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @param relation The relation model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a relation between two resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RelationInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String bookmarkId,
        String relationName,
        RelationInner relation,
        Context context);

    /**
     * Delete the bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String bookmarkId, String relationName);

    /**
     * Delete the bookmark relation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param bookmarkId Bookmark ID.
     * @param relationName Relation Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String bookmarkId, String relationName, Context context);
}
