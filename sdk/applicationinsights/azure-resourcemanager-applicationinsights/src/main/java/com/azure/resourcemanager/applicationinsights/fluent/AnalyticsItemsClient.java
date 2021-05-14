// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAnalyticsItemInner;
import com.azure.resourcemanager.applicationinsights.models.ItemScope;
import com.azure.resourcemanager.applicationinsights.models.ItemScopePath;
import com.azure.resourcemanager.applicationinsights.models.ItemTypeParameter;
import java.util.List;

/** An instance of this class provides access to all the operations defined in AnalyticsItemsClient. */
public interface AnalyticsItemsClient {
    /**
     * Gets a list of Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Analytics Items defined within an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ApplicationInsightsComponentAnalyticsItemInner> list(
        String resourceGroupName, String resourceName, ItemScopePath scopePath);

    /**
     * Gets a list of Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @param scope Enum indicating if this item definition is owned by a specific user or is shared between all users
     *     with access to the Application Insights component.
     * @param type Enum indicating the type of the Analytics item.
     * @param includeContent Flag indicating whether or not to return the content of each applicable item. If false,
     *     only return the item information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Analytics Items defined within an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<ApplicationInsightsComponentAnalyticsItemInner>> listWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ItemScope scope,
        ItemTypeParameter type,
        Boolean includeContent,
        Context context);

    /**
     * Gets a specific Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Analytics Items defined within an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentAnalyticsItemInner get(
        String resourceGroupName, String resourceName, ItemScopePath scopePath);

    /**
     * Gets a specific Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @param id The Id of a specific item defined in the Application Insights component.
     * @param name The name of a specific item defined in the Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Analytics Items defined within an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentAnalyticsItemInner> getWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        String id,
        String name,
        Context context);

    /**
     * Adds or Updates a specific Analytics Item within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @param itemProperties Properties that need to be specified to create a new item and add it to an Application
     *     Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an Analytics item that is associated to an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentAnalyticsItemInner put(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ApplicationInsightsComponentAnalyticsItemInner itemProperties);

    /**
     * Adds or Updates a specific Analytics Item within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @param itemProperties Properties that need to be specified to create a new item and add it to an Application
     *     Insights component.
     * @param overrideItem Flag indicating whether or not to force save an item. This allows overriding an item if it
     *     already exists.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an Analytics item that is associated to an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentAnalyticsItemInner> putWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ApplicationInsightsComponentAnalyticsItemInner itemProperties,
        Boolean overrideItem,
        Context context);

    /**
     * Deletes a specific Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, ItemScopePath scopePath);

    /**
     * Deletes a specific Analytics Items defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param scopePath Enum indicating if this item definition is owned by a specific user or is shared between all
     *     users with access to the Application Insights component.
     * @param id The Id of a specific item defined in the Application Insights component.
     * @param name The name of a specific item defined in the Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        String id,
        String name,
        Context context);
}
