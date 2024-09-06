// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.CustomerPolicyProperties;
import com.azure.resourcemanager.billing.models.PolicySummary;
import com.azure.resourcemanager.billing.models.PolicyType;
import com.azure.resourcemanager.billing.models.ViewChargesPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomerPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomerPolicyProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Created\",\"viewCharges\":\"Allowed\",\"policies\":[{\"name\":\"gwzsf\",\"value\":\"edous\",\"policyType\":\"Other\",\"scope\":\"tgravaqogf\"},{\"name\":\"ebauzlqbtx\",\"value\":\"pfhnjzudrt\",\"policyType\":\"UserControlled\",\"scope\":\"meboywhczzq\"}]}")
            .toObject(CustomerPolicyProperties.class);
        Assertions.assertEquals(ViewChargesPolicy.ALLOWED, model.viewCharges());
        Assertions.assertEquals("gwzsf", model.policies().get(0).name());
        Assertions.assertEquals("edous", model.policies().get(0).value());
        Assertions.assertEquals(PolicyType.OTHER, model.policies().get(0).policyType());
        Assertions.assertEquals("tgravaqogf", model.policies().get(0).scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomerPolicyProperties model = new CustomerPolicyProperties().withViewCharges(ViewChargesPolicy.ALLOWED)
            .withPolicies(Arrays.asList(
                new PolicySummary().withName("gwzsf")
                    .withValue("edous")
                    .withPolicyType(PolicyType.OTHER)
                    .withScope("tgravaqogf"),
                new PolicySummary().withName("ebauzlqbtx")
                    .withValue("pfhnjzudrt")
                    .withPolicyType(PolicyType.USER_CONTROLLED)
                    .withScope("meboywhczzq")));
        model = BinaryData.fromObject(model).toObject(CustomerPolicyProperties.class);
        Assertions.assertEquals(ViewChargesPolicy.ALLOWED, model.viewCharges());
        Assertions.assertEquals("gwzsf", model.policies().get(0).name());
        Assertions.assertEquals("edous", model.policies().get(0).value());
        Assertions.assertEquals(PolicyType.OTHER, model.policies().get(0).policyType());
        Assertions.assertEquals("tgravaqogf", model.policies().get(0).scope());
    }
}
