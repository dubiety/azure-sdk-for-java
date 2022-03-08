// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-02-01/examples/KustoPrivateEndpointConnectionsList.json
     */
    /**
     * Sample code: KustoPrivateEndpointConnectionsList.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoPrivateEndpointConnectionsList(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.privateEndpointConnections().list("kustorptest", "kustoCluster", Context.NONE);
    }
}
