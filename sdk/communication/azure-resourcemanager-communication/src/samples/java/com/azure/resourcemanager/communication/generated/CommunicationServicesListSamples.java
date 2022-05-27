// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.Context;

/** Samples for CommunicationServices List. */
public final class CommunicationServicesListSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2021-10-01-preview/examples/communicationServices/listBySubscription.json
     */
    /**
     * Sample code: List by subscription.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listBySubscription(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.communicationServices().list(Context.NONE);
    }
}
