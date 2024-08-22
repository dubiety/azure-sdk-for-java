// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Route;
import org.junit.jupiter.api.Assertions;

public final class RouteTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Route model = BinaryData.fromString("{\"path\":\"eranokqgukkjqnv\",\"port\":2004582271}").toObject(Route.class);
        Assertions.assertEquals("eranokqgukkjqnv", model.path());
        Assertions.assertEquals(2004582271, model.port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Route model = new Route().withPath("eranokqgukkjqnv").withPort(2004582271);
        model = BinaryData.fromObject(model).toObject(Route.class);
        Assertions.assertEquals("eranokqgukkjqnv", model.path());
        Assertions.assertEquals(2004582271, model.port());
    }
}
