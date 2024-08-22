// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ListUsagesResult;

public final class ListUsagesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListUsagesResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"qn\",\"amlWorkspaceLocation\":\"oczvy\",\"type\":\"qrvkdv\",\"unit\":\"Count\",\"currentValue\":2186677248457800483,\"limit\":135145213418293643,\"name\":{\"value\":\"atkpnp\",\"localizedValue\":\"exxbczwtr\"}},{\"id\":\"iqzbq\",\"amlWorkspaceLocation\":\"sovmyokacspkwl\",\"type\":\"dobpxjmflbvvn\",\"unit\":\"Count\",\"currentValue\":3490424163698610193,\"limit\":8548098953378232008,\"name\":{\"value\":\"uqkhrsajiwku\",\"localizedValue\":\"oskg\"}},{\"id\":\"auu\",\"amlWorkspaceLocation\":\"jmvxie\",\"type\":\"ugidyjrr\",\"unit\":\"Count\",\"currentValue\":7621842593771814376,\"limit\":122532505466115624,\"name\":{\"value\":\"onpc\",\"localizedValue\":\"ocohslkevleg\"}},{\"id\":\"fbuhfmvfaxkffe\",\"amlWorkspaceLocation\":\"th\",\"type\":\"m\",\"unit\":\"Count\",\"currentValue\":9115490458846755949,\"limit\":3938193441578010473,\"name\":{\"value\":\"bzoggigrx\",\"localizedValue\":\"ur\"}}],\"nextLink\":\"xxjnspydptk\"}")
            .toObject(ListUsagesResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListUsagesResult model = new ListUsagesResult();
        model = BinaryData.fromObject(model).toObject(ListUsagesResult.class);
    }
}
