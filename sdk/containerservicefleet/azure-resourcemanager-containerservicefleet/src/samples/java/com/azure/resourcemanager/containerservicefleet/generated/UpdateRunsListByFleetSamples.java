// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/** Samples for UpdateRuns ListByFleet. */
public final class UpdateRunsListByFleetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2023-06-15-preview/examples/UpdateRuns_ListByFleet.json
     */
    /**
     * Sample code: Lists the UpdateRun resources by fleet.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void listsTheUpdateRunResourcesByFleet(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.updateRuns().listByFleet("rg1", "fleet1", com.azure.core.util.Context.NONE);
    }
}
