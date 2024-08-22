// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model = BinaryData
            .fromString(
                "{\"status\":\"Disconnected\",\"description\":\"ybkzgcwr\",\"actionsRequired\":\"lxxwrljdouskc\"}")
            .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("ybkzgcwr", model.description());
        Assertions.assertEquals("lxxwrljdouskc", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model
            = new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.DISCONNECTED)
                .withDescription("ybkzgcwr")
                .withActionsRequired("lxxwrljdouskc");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("ybkzgcwr", model.description());
        Assertions.assertEquals("lxxwrljdouskc", model.actionsRequired());
    }
}
