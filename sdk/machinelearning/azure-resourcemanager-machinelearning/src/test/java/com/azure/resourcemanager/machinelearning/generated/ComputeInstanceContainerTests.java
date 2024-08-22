// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Autosave;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceContainer;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceEnvironmentInfo;
import com.azure.resourcemanager.machinelearning.models.Network;
import org.junit.jupiter.api.Assertions;

public final class ComputeInstanceContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeInstanceContainer model = BinaryData.fromString(
            "{\"name\":\"fxlapjajodmkrrw\",\"autosave\":\"Remote\",\"gpu\":\"vqokql\",\"network\":\"Bridge\",\"environment\":{\"name\":\"rabwlyvxc\",\"version\":\"qvctsfa\"},\"services\":[\"datawwsknstvzu\",\"datahasupmlppdpgzvz\"]}")
            .toObject(ComputeInstanceContainer.class);
        Assertions.assertEquals("fxlapjajodmkrrw", model.name());
        Assertions.assertEquals(Autosave.REMOTE, model.autosave());
        Assertions.assertEquals("vqokql", model.gpu());
        Assertions.assertEquals(Network.BRIDGE, model.network());
        Assertions.assertEquals("rabwlyvxc", model.environment().name());
        Assertions.assertEquals("qvctsfa", model.environment().version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputeInstanceContainer model = new ComputeInstanceContainer().withName("fxlapjajodmkrrw")
            .withAutosave(Autosave.REMOTE)
            .withGpu("vqokql")
            .withNetwork(Network.BRIDGE)
            .withEnvironment(new ComputeInstanceEnvironmentInfo().withName("rabwlyvxc").withVersion("qvctsfa"));
        model = BinaryData.fromObject(model).toObject(ComputeInstanceContainer.class);
        Assertions.assertEquals("fxlapjajodmkrrw", model.name());
        Assertions.assertEquals(Autosave.REMOTE, model.autosave());
        Assertions.assertEquals("vqokql", model.gpu());
        Assertions.assertEquals(Network.BRIDGE, model.network());
        Assertions.assertEquals("rabwlyvxc", model.environment().name());
        Assertions.assertEquals("qvctsfa", model.environment().version());
    }
}
