// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.management.SubResource;
import java.util.Arrays;

/** Samples for Sites CreateOrUpdate. */
public final class SitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-03-01-preview/examples/SiteCreate.json
     */
    /**
     * Sample code: Create mobile network site.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void createMobileNetworkSite(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager
            .sites()
            .define("testSite")
            .withRegion("testLocation")
            .withExistingMobileNetwork("rg1", "testMobileNetwork")
            .withNetworkFunctions(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.HybridNetwork/networkFunctions/testNf")))
            .create();
    }
}
