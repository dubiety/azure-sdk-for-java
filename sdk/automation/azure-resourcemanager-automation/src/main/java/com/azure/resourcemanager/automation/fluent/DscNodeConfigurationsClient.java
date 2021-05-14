// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.automation.fluent.models.DscNodeConfigurationInner;
import com.azure.resourcemanager.automation.models.DscNodeConfigurationCreateOrUpdateParameters;

/** An instance of this class provides access to all the operations defined in DscNodeConfigurationsClient. */
public interface DscNodeConfigurationsClient {
    /**
     * Delete the Dsc node configurations by node configuration.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, String nodeConfigurationName);

    /**
     * Delete the Dsc node configurations by node configuration.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String nodeConfigurationName, Context context);

    /**
     * Retrieve the Dsc node configurations by node configuration.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the dsc node configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DscNodeConfigurationInner get(String resourceGroupName, String automationAccountName, String nodeConfigurationName);

    /**
     * Retrieve the Dsc node configurations by node configuration.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the dsc node configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DscNodeConfigurationInner> getWithResponse(
        String resourceGroupName, String automationAccountName, String nodeConfigurationName, Context context);

    /**
     * Create the node configuration identified by node configuration name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param parameters The create or update parameters for configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DscNodeConfigurationInner>, DscNodeConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String nodeConfigurationName,
        DscNodeConfigurationCreateOrUpdateParameters parameters);

    /**
     * Create the node configuration identified by node configuration name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param parameters The create or update parameters for configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DscNodeConfigurationInner>, DscNodeConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String nodeConfigurationName,
        DscNodeConfigurationCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Create the node configuration identified by node configuration name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param parameters The create or update parameters for configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DscNodeConfigurationInner createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String nodeConfigurationName,
        DscNodeConfigurationCreateOrUpdateParameters parameters);

    /**
     * Create the node configuration identified by node configuration name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param nodeConfigurationName The Dsc node configuration name.
     * @param parameters The create or update parameters for configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DscNodeConfigurationInner createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String nodeConfigurationName,
        DscNodeConfigurationCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Retrieve a list of dsc node configurations.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DscNodeConfigurationInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of dsc node configurations.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param filter The filter to apply on the operation.
     * @param skip The number of rows to skip.
     * @param top The number of rows to take.
     * @param inlinecount Return total rows.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DscNodeConfigurationInner> listByAutomationAccount(
        String resourceGroupName,
        String automationAccountName,
        String filter,
        Integer skip,
        Integer top,
        String inlinecount,
        Context context);
}
