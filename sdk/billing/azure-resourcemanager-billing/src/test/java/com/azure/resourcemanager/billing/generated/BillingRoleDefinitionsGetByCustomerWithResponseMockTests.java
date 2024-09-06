// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.BillingRoleDefinition;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingRoleDefinitionsGetByCustomerWithResponseMockTests {
    @Test
    public void testGetByCustomerWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"atktwjrppifeyrq\",\"permissions\":[{\"actions\":[\"dcizhvksb\",\"jklwjp\"],\"notActions\":[\"ncw\",\"smpyeyzolbfnfly\"]},{\"actions\":[\"uduiqoom\"],\"notActions\":[\"kqwopws\",\"liyznghuqzgp\"]},{\"actions\":[\"kfv\"],\"notActions\":[\"gavtfy\",\"sedfmzu\",\"ryxpi\"]}],\"roleName\":\"vapeakfdmc\"},\"tags\":{\"doqkanqtr\":\"iklxkyo\"},\"id\":\"cwhqyrgqmndkrw\",\"name\":\"murh\",\"type\":\"ifqeqfsr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingRoleDefinition response = manager.billingRoleDefinitions()
            .getByCustomerWithResponse("xdifbwblijhp", "ukxgoyxontbwdq", "xr", "suqrrldxfuaef",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("iklxkyo", response.tags().get("doqkanqtr"));
        Assertions.assertEquals("vapeakfdmc", response.properties().roleName());
    }
}
