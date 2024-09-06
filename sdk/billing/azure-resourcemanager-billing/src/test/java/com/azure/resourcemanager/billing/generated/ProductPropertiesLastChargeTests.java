// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.ProductPropertiesLastCharge;

public final class ProductPropertiesLastChargeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductPropertiesLastCharge model = BinaryData.fromString("{\"currency\":\"lobvv\",\"value\":19.954985}")
            .toObject(ProductPropertiesLastCharge.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductPropertiesLastCharge model = new ProductPropertiesLastCharge();
        model = BinaryData.fromObject(model).toObject(ProductPropertiesLastCharge.class);
    }
}
