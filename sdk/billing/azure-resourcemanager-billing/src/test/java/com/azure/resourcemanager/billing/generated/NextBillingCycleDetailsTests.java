// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.NextBillingCycleDetails;

public final class NextBillingCycleDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NextBillingCycleDetails model
            = BinaryData.fromString("{\"billingFrequency\":\"k\"}").toObject(NextBillingCycleDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NextBillingCycleDetails model = new NextBillingCycleDetails();
        model = BinaryData.fromObject(model).toObject(NextBillingCycleDetails.class);
    }
}
