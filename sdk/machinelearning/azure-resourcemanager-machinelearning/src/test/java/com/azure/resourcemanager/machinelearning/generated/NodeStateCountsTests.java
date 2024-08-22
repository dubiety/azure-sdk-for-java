// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.NodeStateCounts;

public final class NodeStateCountsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NodeStateCounts model = BinaryData.fromString(
            "{\"idleNodeCount\":17437062,\"runningNodeCount\":194546120,\"preparingNodeCount\":863569272,\"unusableNodeCount\":765041265,\"leavingNodeCount\":232651506,\"preemptedNodeCount\":1489395185}")
            .toObject(NodeStateCounts.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NodeStateCounts model = new NodeStateCounts();
        model = BinaryData.fromObject(model).toObject(NodeStateCounts.class);
    }
}
