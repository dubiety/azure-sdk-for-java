// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for PacketCoreControlPlanes Delete. */
public final class PacketCoreControlPlanesDeleteSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-03-01-preview/examples/PacketCoreControlPlaneDelete.json
     */
    /**
     * Sample code: Delete packet core control plane.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void deletePacketCoreControlPlane(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlanes().delete("rg1", "TestPacketCoreCP", Context.NONE);
    }
}
