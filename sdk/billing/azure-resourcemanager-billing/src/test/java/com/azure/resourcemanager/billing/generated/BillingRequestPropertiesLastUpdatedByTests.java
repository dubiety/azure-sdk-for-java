// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingRequestPropertiesLastUpdatedBy;
import org.junit.jupiter.api.Assertions;

public final class BillingRequestPropertiesLastUpdatedByTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingRequestPropertiesLastUpdatedBy model
            = BinaryData.fromString("{\"tenantId\":\"wkqnyhg\",\"objectId\":\"j\",\"upn\":\"ivfxzsjabibsyst\"}")
                .toObject(BillingRequestPropertiesLastUpdatedBy.class);
        Assertions.assertEquals("wkqnyhg", model.tenantId());
        Assertions.assertEquals("j", model.objectId());
        Assertions.assertEquals("ivfxzsjabibsyst", model.upn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingRequestPropertiesLastUpdatedBy model
            = new BillingRequestPropertiesLastUpdatedBy().withTenantId("wkqnyhg")
                .withObjectId("j")
                .withUpn("ivfxzsjabibsyst");
        model = BinaryData.fromObject(model).toObject(BillingRequestPropertiesLastUpdatedBy.class);
        Assertions.assertEquals("wkqnyhg", model.tenantId());
        Assertions.assertEquals("j", model.objectId());
        Assertions.assertEquals("ivfxzsjabibsyst", model.upn());
    }
}
