// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.TritonModelJobInput;
import org.junit.jupiter.api.Assertions;

public final class TritonModelJobInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TritonModelJobInput model = BinaryData.fromString(
            "{\"jobInputType\":\"triton_model\",\"uri\":\"zhdtrsyfe\",\"mode\":\"ReadWriteMount\",\"description\":\"yljdzyyrwnmwt\"}")
            .toObject(TritonModelJobInput.class);
        Assertions.assertEquals("yljdzyyrwnmwt", model.description());
        Assertions.assertEquals("zhdtrsyfe", model.uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TritonModelJobInput model = new TritonModelJobInput().withDescription("yljdzyyrwnmwt")
            .withUri("zhdtrsyfe")
            .withMode(InputDeliveryMode.READ_WRITE_MOUNT);
        model = BinaryData.fromObject(model).toObject(TritonModelJobInput.class);
        Assertions.assertEquals("yljdzyyrwnmwt", model.description());
        Assertions.assertEquals("zhdtrsyfe", model.uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.mode());
    }
}
