// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingProfilePropertiesCurrentPaymentTerm;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class BillingProfilePropertiesCurrentPaymentTermTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingProfilePropertiesCurrentPaymentTerm model = BinaryData.fromString(
            "{\"term\":\"rfbjf\",\"startDate\":\"2021-07-05T13:20:17Z\",\"endDate\":\"2021-10-31T01:03:52Z\",\"isDefault\":false}")
            .toObject(BillingProfilePropertiesCurrentPaymentTerm.class);
        Assertions.assertEquals("rfbjf", model.term());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T13:20:17Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T01:03:52Z"), model.endDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingProfilePropertiesCurrentPaymentTerm model
            = new BillingProfilePropertiesCurrentPaymentTerm().withTerm("rfbjf")
                .withStartDate(OffsetDateTime.parse("2021-07-05T13:20:17Z"))
                .withEndDate(OffsetDateTime.parse("2021-10-31T01:03:52Z"));
        model = BinaryData.fromObject(model).toObject(BillingProfilePropertiesCurrentPaymentTerm.class);
        Assertions.assertEquals("rfbjf", model.term());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T13:20:17Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T01:03:52Z"), model.endDate());
    }
}
