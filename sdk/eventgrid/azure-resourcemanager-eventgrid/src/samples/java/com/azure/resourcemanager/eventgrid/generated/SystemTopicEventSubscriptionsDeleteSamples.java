// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for SystemTopicEventSubscriptions Delete. */
public final class SystemTopicEventSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/SystemTopicEventSubscriptions_Delete.json
     */
    /**
     * Sample code: SystemTopicEventSubscriptions_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void systemTopicEventSubscriptionsDelete(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .systemTopicEventSubscriptions()
            .delete("examplerg", "exampleSystemTopic1", "examplesubscription1", Context.NONE);
    }
}
