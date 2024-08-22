// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceDataMount;
import com.azure.resourcemanager.machinelearning.models.MountAction;
import com.azure.resourcemanager.machinelearning.models.MountState;
import com.azure.resourcemanager.machinelearning.models.SourceType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ComputeInstanceDataMountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeInstanceDataMount model = BinaryData.fromString(
            "{\"source\":\"y\",\"sourceType\":\"Datastore\",\"mountName\":\"enigbe\",\"mountAction\":\"Unmount\",\"createdBy\":\"ba\",\"mountPath\":\"jdeayscse\",\"mountState\":\"Unmounted\",\"mountedOn\":\"2021-06-04T19:11:23Z\",\"error\":\"exmnv\"}")
            .toObject(ComputeInstanceDataMount.class);
        Assertions.assertEquals("y", model.source());
        Assertions.assertEquals(SourceType.DATASTORE, model.sourceType());
        Assertions.assertEquals("enigbe", model.mountName());
        Assertions.assertEquals(MountAction.UNMOUNT, model.mountAction());
        Assertions.assertEquals("ba", model.createdBy());
        Assertions.assertEquals("jdeayscse", model.mountPath());
        Assertions.assertEquals(MountState.UNMOUNTED, model.mountState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-04T19:11:23Z"), model.mountedOn());
        Assertions.assertEquals("exmnv", model.error());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputeInstanceDataMount model = new ComputeInstanceDataMount().withSource("y")
            .withSourceType(SourceType.DATASTORE)
            .withMountName("enigbe")
            .withMountAction(MountAction.UNMOUNT)
            .withCreatedBy("ba")
            .withMountPath("jdeayscse")
            .withMountState(MountState.UNMOUNTED)
            .withMountedOn(OffsetDateTime.parse("2021-06-04T19:11:23Z"))
            .withError("exmnv");
        model = BinaryData.fromObject(model).toObject(ComputeInstanceDataMount.class);
        Assertions.assertEquals("y", model.source());
        Assertions.assertEquals(SourceType.DATASTORE, model.sourceType());
        Assertions.assertEquals("enigbe", model.mountName());
        Assertions.assertEquals(MountAction.UNMOUNT, model.mountAction());
        Assertions.assertEquals("ba", model.createdBy());
        Assertions.assertEquals("jdeayscse", model.mountPath());
        Assertions.assertEquals(MountState.UNMOUNTED, model.mountState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-04T19:11:23Z"), model.mountedOn());
        Assertions.assertEquals("exmnv", model.error());
    }
}
