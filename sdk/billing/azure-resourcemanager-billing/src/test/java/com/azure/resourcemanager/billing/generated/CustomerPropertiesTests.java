// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.AzurePlan;
import com.azure.resourcemanager.billing.models.CustomerProperties;
import com.azure.resourcemanager.billing.models.Reseller;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomerProperties model = BinaryData.fromString(
            "{\"billingProfileDisplayName\":\"upbezqccydrt\",\"billingProfileId\":\"ukdqkkyihztg\",\"displayName\":\"mgqzgwldoyc\",\"systemId\":\"llcecfehuwaoa\",\"status\":\"UnderReview\",\"enabledAzurePlans\":[{\"productId\":\"llizs\",\"skuId\":\"csjvhrwef\",\"skuDescription\":\"wqejpmvsse\"},{\"productId\":\"epwamcxtcz\",\"skuId\":\"peuknijd\",\"skuDescription\":\"yespydjfbocyv\"}],\"resellers\":[{\"resellerId\":\"rtywi\",\"description\":\"mhlaku\"},{\"resellerId\":\"gbhgau\",\"description\":\"dixmxufrsryjq\"},{\"resellerId\":\"kfnozoeoqbvj\",\"description\":\"efgwbmqjc\"}],\"tags\":{\"lbm\":\"asfaymxbulpze\",\"btsuahxs\":\"kyojwyvfk\",\"biwsd\":\"xjcmmzrrsc\",\"fjxcjrmmuabwibv\":\"npxqwodi\"}}")
            .toObject(CustomerProperties.class);
        Assertions.assertEquals("llizs", model.enabledAzurePlans().get(0).productId());
        Assertions.assertEquals("csjvhrwef", model.enabledAzurePlans().get(0).skuId());
        Assertions.assertEquals("wqejpmvsse", model.enabledAzurePlans().get(0).skuDescription());
        Assertions.assertEquals("asfaymxbulpze", model.tags().get("lbm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomerProperties model = new CustomerProperties()
            .withEnabledAzurePlans(Arrays.asList(
                new AzurePlan().withProductId("llizs").withSkuId("csjvhrwef").withSkuDescription("wqejpmvsse"),
                new AzurePlan().withProductId("epwamcxtcz").withSkuId("peuknijd").withSkuDescription("yespydjfbocyv")))
            .withResellers(Arrays.asList(new Reseller(), new Reseller(), new Reseller()))
            .withTags(mapOf("lbm", "asfaymxbulpze", "btsuahxs", "kyojwyvfk", "biwsd", "xjcmmzrrsc", "fjxcjrmmuabwibv",
                "npxqwodi"));
        model = BinaryData.fromObject(model).toObject(CustomerProperties.class);
        Assertions.assertEquals("llizs", model.enabledAzurePlans().get(0).productId());
        Assertions.assertEquals("csjvhrwef", model.enabledAzurePlans().get(0).skuId());
        Assertions.assertEquals("wqejpmvsse", model.enabledAzurePlans().get(0).skuDescription());
        Assertions.assertEquals("asfaymxbulpze", model.tags().get("lbm"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
