// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.MaterializationComputeResource;
import org.junit.jupiter.api.Assertions;

public final class MaterializationComputeResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaterializationComputeResource model
            = BinaryData.fromString("{\"instanceType\":\"emv\"}").toObject(MaterializationComputeResource.class);
        Assertions.assertEquals("emv", model.instanceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaterializationComputeResource model = new MaterializationComputeResource().withInstanceType("emv");
        model = BinaryData.fromObject(model).toObject(MaterializationComputeResource.class);
        Assertions.assertEquals("emv", model.instanceType());
    }
}
