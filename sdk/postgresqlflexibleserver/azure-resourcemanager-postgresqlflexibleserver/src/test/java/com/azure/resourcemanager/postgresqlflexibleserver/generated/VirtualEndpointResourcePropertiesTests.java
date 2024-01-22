// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.VirtualEndpointResourceProperties;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualEndpointResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualEndpointResourceProperties model = BinaryData
            .fromString(
                "{\"endpointType\":\"ReadWrite\",\"members\":[\"fz\"],\"virtualEndpoints\":[\"yxgtczh\",\"ydbsd\"]}")
            .toObject(VirtualEndpointResourceProperties.class);
        Assertions.assertEquals(VirtualEndpointType.READ_WRITE, model.endpointType());
        Assertions.assertEquals("fz", model.members().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualEndpointResourceProperties model = new VirtualEndpointResourceProperties()
            .withEndpointType(VirtualEndpointType.READ_WRITE).withMembers(Arrays.asList("fz"));
        model = BinaryData.fromObject(model).toObject(VirtualEndpointResourceProperties.class);
        Assertions.assertEquals(VirtualEndpointType.READ_WRITE, model.endpointType());
        Assertions.assertEquals("fz", model.members().get(0));
    }
}
