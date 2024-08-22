// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.JobLimits;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class JobLimitsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobLimits model = BinaryData.fromString("{\"jobLimitsType\":\"JobLimits\",\"timeout\":\"PT90H5M41S\"}")
            .toObject(JobLimits.class);
        Assertions.assertEquals(Duration.parse("PT90H5M41S"), model.timeout());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobLimits model = new JobLimits().withTimeout(Duration.parse("PT90H5M41S"));
        model = BinaryData.fromObject(model).toObject(JobLimits.class);
        Assertions.assertEquals(Duration.parse("PT90H5M41S"), model.timeout());
    }
}
