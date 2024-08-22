// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.LiteralJobInput;
import org.junit.jupiter.api.Assertions;

public final class LiteralJobInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiteralJobInput model = BinaryData
            .fromString("{\"jobInputType\":\"literal\",\"value\":\"ntqrcjqpzj\",\"description\":\"pjrrhpgsjbioag\"}")
            .toObject(LiteralJobInput.class);
        Assertions.assertEquals("pjrrhpgsjbioag", model.description());
        Assertions.assertEquals("ntqrcjqpzj", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiteralJobInput model = new LiteralJobInput().withDescription("pjrrhpgsjbioag").withValue("ntqrcjqpzj");
        model = BinaryData.fromObject(model).toObject(LiteralJobInput.class);
        Assertions.assertEquals("pjrrhpgsjbioag", model.description());
        Assertions.assertEquals("ntqrcjqpzj", model.value());
    }
}
