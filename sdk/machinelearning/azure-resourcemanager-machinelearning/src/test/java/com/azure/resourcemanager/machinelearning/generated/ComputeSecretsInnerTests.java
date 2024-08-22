// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeSecretsInner;

public final class ComputeSecretsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeSecretsInner model
            = BinaryData.fromString("{\"computeType\":\"ComputeSecrets\"}").toObject(ComputeSecretsInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputeSecretsInner model = new ComputeSecretsInner();
        model = BinaryData.fromObject(model).toObject(ComputeSecretsInner.class);
    }
}
