// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingRoleDefinitionProperties;
import org.junit.jupiter.api.Assertions;

public final class BillingRoleDefinitionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingRoleDefinitionProperties model = BinaryData.fromString(
            "{\"description\":\"jfsmlmbtxhwgfwsr\",\"permissions\":[{\"actions\":[\"ezbrhubskh\",\"dyg\",\"ookk\"],\"notActions\":[\"jb\",\"leorfmluiqtqz\",\"avyvnqqyba\"]},{\"actions\":[\"uayjkqa\",\"qgzsles\",\"cbhernntiewdj\",\"vbquwr\"],\"notActions\":[\"wagohbuffk\",\"rqemvvhmxt\",\"rjfut\",\"coebjvewzcj\"]},{\"actions\":[\"wcpmguaadraufac\"],\"notActions\":[\"hzovaj\",\"ziuxxpshnee\",\"ulfgslqu\",\"kwdlenrdsutujba\"]}],\"roleName\":\"pjuohminyfl\"}")
            .toObject(BillingRoleDefinitionProperties.class);
        Assertions.assertEquals("pjuohminyfl", model.roleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingRoleDefinitionProperties model = new BillingRoleDefinitionProperties().withRoleName("pjuohminyfl");
        model = BinaryData.fromObject(model).toObject(BillingRoleDefinitionProperties.class);
        Assertions.assertEquals("pjuohminyfl", model.roleName());
    }
}
