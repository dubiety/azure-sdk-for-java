// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentConfiguration;

public final class BatchDeploymentConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BatchDeploymentConfiguration model
            = BinaryData.fromString("{\"deploymentConfigurationType\":\"BatchDeploymentConfiguration\"}")
                .toObject(BatchDeploymentConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BatchDeploymentConfiguration model = new BatchDeploymentConfiguration();
        model = BinaryData.fromObject(model).toObject(BatchDeploymentConfiguration.class);
    }
}
