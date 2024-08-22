// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpoint;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"privateEndpoint\":{\"id\":\"gispemvtzfkufubl\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"qeof\",\"actionsRequired\":\"e\"},\"provisioningState\":\"Deleting\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qeof", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("e", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("qeof")
                        .withActionsRequired("e"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qeof", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("e", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
