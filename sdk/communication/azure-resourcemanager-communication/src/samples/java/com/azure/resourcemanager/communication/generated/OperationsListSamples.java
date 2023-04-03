// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/stable/2023-03-31/examples/communicationServices/operationsList.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void operationsList(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
