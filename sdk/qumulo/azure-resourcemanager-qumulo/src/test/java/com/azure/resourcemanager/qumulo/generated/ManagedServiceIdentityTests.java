// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.qumulo.models.ManagedServiceIdentity;
import com.azure.resourcemanager.qumulo.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.qumulo.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"430fdafa-685c-47a0-9207-256f7a3f733f\",\"tenantId\":\"61148715-7c6c-4d39-ab9d-3f120b0083d7\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"fpdvhpfxxypi\":{\"principalId\":\"f303c62e-a982-4906-94de-8e2fe0cf98c3\",\"clientId\":\"0e4d64e7-97bf-4779-8d67-61f00202f0cf\"},\"mayhuybbkpodepoo\":{\"principalId\":\"f6f92209-0ed3-4325-a5cc-bb7c647870a5\",\"clientId\":\"b660fb94-0806-48af-b142-145e927dc1ca\"},\"uvamiheognarxzxt\":{\"principalId\":\"f8afff78-00d6-4548-909f-b9d9ecf5e90d\",\"clientId\":\"bbbb6fe4-691a-4183-8508-37bb0d7c5558\"},\"tusivyevcciqihn\":{\"principalId\":\"b372b273-1765-46dc-9405-c1a830f81e06\",\"clientId\":\"3722fcab-09c1-4998-bf36-14c084cb6b62\"}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "fpdvhpfxxypi",
                        new UserAssignedIdentity(),
                        "mayhuybbkpodepoo",
                        new UserAssignedIdentity(),
                        "uvamiheognarxzxt",
                        new UserAssignedIdentity(),
                        "tusivyevcciqihn",
                        new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
    }

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
