// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.JobRunResourceIdInner;

public final class JobRunResourceIdInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobRunResourceIdInner model =
            BinaryData.fromString("{\"jobRunResourceId\":\"tpngjcrcczsqpjh\"}").toObject(JobRunResourceIdInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobRunResourceIdInner model = new JobRunResourceIdInner();
        model = BinaryData.fromObject(model).toObject(JobRunResourceIdInner.class);
    }
}
