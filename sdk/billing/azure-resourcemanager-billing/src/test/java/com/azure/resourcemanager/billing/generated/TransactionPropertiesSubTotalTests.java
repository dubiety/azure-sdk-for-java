// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.TransactionPropertiesSubTotal;

public final class TransactionPropertiesSubTotalTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransactionPropertiesSubTotal model
            = BinaryData.fromString("{\"currency\":\"hkkyowltjouw\",\"value\":90.42876}")
                .toObject(TransactionPropertiesSubTotal.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransactionPropertiesSubTotal model = new TransactionPropertiesSubTotal();
        model = BinaryData.fromObject(model).toObject(TransactionPropertiesSubTotal.class);
    }
}
