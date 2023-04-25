// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

/** Samples for TestLines ListByCommunicationsGateway. */
public final class TestLinesListByCommunicationsGatewaySamples {
    /*
     * x-ms-original-file: specification/voiceservices/resource-manager/Microsoft.VoiceServices/stable/2023-01-31/examples/TestLines_ListByCommunicationsGateway.json
     */
    /**
     * Sample code: ListTestLineResource.
     *
     * @param manager Entry point to VoiceServicesManager.
     */
    public static void listTestLineResource(com.azure.resourcemanager.voiceservices.VoiceServicesManager manager) {
        manager.testLines().listByCommunicationsGateway("testrg", "myname", com.azure.core.util.Context.NONE);
    }
}
