// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/** Samples for UpdateRuns Start. */
public final class UpdateRunsStartSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2023-06-15-preview/examples/UpdateRuns_Start.json
     */
    /**
     * Sample code: Starts an UpdateRun.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void startsAnUpdateRun(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.updateRuns().start("rg1", "fleet1", "run1", null, com.azure.core.util.Context.NONE);
    }
}
