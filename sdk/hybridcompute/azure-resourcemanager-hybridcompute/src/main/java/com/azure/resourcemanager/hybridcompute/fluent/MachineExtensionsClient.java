// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionInner;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionUpdate;

/**
 * An instance of this class provides access to all the operations defined in MachineExtensionsClient.
 */
public interface MachineExtensionsClient {
    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MachineExtensionInner>, MachineExtensionInner> beginCreateOrUpdate(String resourceGroupName,
        String machineName, String extensionName, MachineExtensionInner extensionParameters);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MachineExtensionInner>, MachineExtensionInner> beginCreateOrUpdate(String resourceGroupName,
        String machineName, String extensionName, MachineExtensionInner extensionParameters, Context context);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineExtensionInner createOrUpdate(String resourceGroupName, String machineName, String extensionName,
        MachineExtensionInner extensionParameters);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineExtensionInner createOrUpdate(String resourceGroupName, String machineName, String extensionName,
        MachineExtensionInner extensionParameters, Context context);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MachineExtensionInner>, MachineExtensionInner> beginUpdate(String resourceGroupName,
        String machineName, String extensionName, MachineExtensionUpdate extensionParameters);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MachineExtensionInner>, MachineExtensionInner> beginUpdate(String resourceGroupName,
        String machineName, String extensionName, MachineExtensionUpdate extensionParameters, Context context);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineExtensionInner update(String resourceGroupName, String machineName, String extensionName,
        MachineExtensionUpdate extensionParameters);

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be created or updated.
     * @param extensionName The name of the machine extension.
     * @param extensionParameters Parameters supplied to the Create Machine Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineExtensionInner update(String resourceGroupName, String machineName, String extensionName,
        MachineExtensionUpdate extensionParameters, Context context);

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String machineName, String extensionName);

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String machineName, String extensionName,
        Context context);

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String machineName, String extensionName);

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String machineName, String extensionName, Context context);

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine containing the extension.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MachineExtensionInner> getWithResponse(String resourceGroupName, String machineName, String extensionName,
        Context context);

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine containing the extension.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineExtensionInner get(String resourceGroupName, String machineName, String extensionName);

    /**
     * The operation to get all extensions of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Machine Extensions List Result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineExtensionInner> list(String resourceGroupName, String machineName);

    /**
     * The operation to get all extensions of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the machine containing the extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Machine Extensions List Result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineExtensionInner> list(String resourceGroupName, String machineName, String expand,
        Context context);
}
