// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for IotDpsResource ListValidSkus. */
public final class IotDpsResourceListValidSkusSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSGetValidSku.json
     */
    /**
     * Sample code: DPSGetValidSku.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetValidSku(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources().listValidSkus("myFirstProvisioningService", "myResourceGroup", Context.NONE);
    }
}
