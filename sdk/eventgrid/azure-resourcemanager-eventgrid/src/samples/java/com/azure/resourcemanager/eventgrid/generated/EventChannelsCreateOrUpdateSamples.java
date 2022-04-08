// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.models.EventChannelDestination;
import com.azure.resourcemanager.eventgrid.models.EventChannelSource;

/** Samples for EventChannels CreateOrUpdate. */
public final class EventChannelsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventChannels_CreateOrUpdate.json
     */
    /**
     * Sample code: EventChannels_CreateOrUpdate.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventChannelsCreateOrUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .eventChannels()
            .define("exampleEventChannelName1")
            .withExistingPartnerNamespace("examplerg", "examplePartnerNamespaceName1")
            .withSource(new EventChannelSource().withSource("ContosoCorp.Accounts.User1"))
            .withDestination(
                new EventChannelDestination()
                    .withAzureSubscriptionId("5b4b650e-28b9-4790-b3ab-ddbd88d727c4")
                    .withResourceGroup("examplerg2")
                    .withPartnerTopicName("examplePartnerTopic1"))
            .create();
    }
}
