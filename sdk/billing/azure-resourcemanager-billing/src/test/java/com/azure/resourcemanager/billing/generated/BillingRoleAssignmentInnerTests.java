// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner;
import com.azure.resourcemanager.billing.models.BillingRoleAssignmentProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BillingRoleAssignmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingRoleAssignmentInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"New\",\"createdOn\":\"2021-04-01T03:56:35Z\",\"createdByPrincipalTenantId\":\"kvpbjxbkzbz\",\"createdByPrincipalId\":\"vncjabudurgk\",\"createdByPrincipalPuid\":\"mokzhjjklf\",\"createdByUserEmailAddress\":\"mouwqlgzrfzeey\",\"modifiedOn\":\"2021-05-25T08:30:43Z\",\"modifiedByPrincipalPuid\":\"ikayuhqlbjbsybb\",\"modifiedByUserEmailAddress\":\"r\",\"modifiedByPrincipalId\":\"ldgmfpgvmpip\",\"modifiedByPrincipalTenantId\":\"ltha\",\"principalPuid\":\"x\",\"principalId\":\"mwutwbdsre\",\"principalTenantId\":\"drhneuyow\",\"roleDefinitionId\":\"kdw\",\"scope\":\"i\",\"userAuthenticationType\":\"bi\",\"userEmailAddress\":\"gpikpzimejza\",\"principalTenantName\":\"fzxiavrmb\",\"principalDisplayName\":\"nokixrjqcirgz\",\"principalType\":\"DirectoryRole\",\"billingRequestId\":\"azszrnwoiindfpw\",\"billingAccountId\":\"ylwbtlhflsjcdhsz\",\"billingAccountDisplayName\":\"vfbgofeljagrqmqh\",\"billingProfileId\":\"vriiio\",\"billingProfileDisplayName\":\"al\",\"invoiceSectionId\":\"fk\",\"invoiceSectionDisplayName\":\"vsexsowuelu\",\"customerId\":\"hahhxvrhmzkwpj\",\"customerDisplayName\":\"wspughftqsxhqx\"},\"tags\":{\"fzdm\":\"ukndxdigrjgu\",\"otzi\":\"yqtfihwh\",\"phoszqz\":\"gamv\"},\"id\":\"phqamvdkfwynwcvt\",\"name\":\"vkay\",\"type\":\"mtnvyq\"}")
            .toObject(BillingRoleAssignmentInner.class);
        Assertions.assertEquals("ukndxdigrjgu", model.tags().get("fzdm"));
        Assertions.assertEquals("x", model.properties().principalPuid());
        Assertions.assertEquals("mwutwbdsre", model.properties().principalId());
        Assertions.assertEquals("drhneuyow", model.properties().principalTenantId());
        Assertions.assertEquals("kdw", model.properties().roleDefinitionId());
        Assertions.assertEquals("i", model.properties().scope());
        Assertions.assertEquals("bi", model.properties().userAuthenticationType());
        Assertions.assertEquals("gpikpzimejza", model.properties().userEmailAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingRoleAssignmentInner model = new BillingRoleAssignmentInner()
            .withTags(mapOf("fzdm", "ukndxdigrjgu", "otzi", "yqtfihwh", "phoszqz", "gamv"))
            .withProperties(new BillingRoleAssignmentProperties().withPrincipalPuid("x")
                .withPrincipalId("mwutwbdsre")
                .withPrincipalTenantId("drhneuyow")
                .withRoleDefinitionId("kdw")
                .withScope("i")
                .withUserAuthenticationType("bi")
                .withUserEmailAddress("gpikpzimejza"));
        model = BinaryData.fromObject(model).toObject(BillingRoleAssignmentInner.class);
        Assertions.assertEquals("ukndxdigrjgu", model.tags().get("fzdm"));
        Assertions.assertEquals("x", model.properties().principalPuid());
        Assertions.assertEquals("mwutwbdsre", model.properties().principalId());
        Assertions.assertEquals("drhneuyow", model.properties().principalTenantId());
        Assertions.assertEquals("kdw", model.properties().roleDefinitionId());
        Assertions.assertEquals("i", model.properties().scope());
        Assertions.assertEquals("bi", model.properties().userAuthenticationType());
        Assertions.assertEquals("gpikpzimejza", model.properties().userEmailAddress());
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
