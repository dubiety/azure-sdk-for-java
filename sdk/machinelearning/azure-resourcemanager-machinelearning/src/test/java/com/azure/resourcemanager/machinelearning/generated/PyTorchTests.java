// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PyTorch;
import org.junit.jupiter.api.Assertions;

public final class PyTorchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PyTorch model
            = BinaryData.fromString("{\"distributionType\":\"PyTorch\",\"processCountPerInstance\":409553371}")
                .toObject(PyTorch.class);
        Assertions.assertEquals(409553371, model.processCountPerInstance());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PyTorch model = new PyTorch().withProcessCountPerInstance(409553371);
        model = BinaryData.fromObject(model).toObject(PyTorch.class);
        Assertions.assertEquals(409553371, model.processCountPerInstance());
    }
}
