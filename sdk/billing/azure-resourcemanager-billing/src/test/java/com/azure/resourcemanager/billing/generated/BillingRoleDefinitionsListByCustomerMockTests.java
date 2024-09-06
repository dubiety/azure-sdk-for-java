// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
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

public final class BillingRoleDefinitionsListByCustomerMockTests {
    @Test
    public void testListByCustomer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"description\":\"nijhwcbrds\",\"permissions\":[{\"actions\":[\"pkbvzpkodngvnq\",\"jgsbtwgnld\"],\"notActions\":[\"zlhvbqycz\"]}],\"roleName\":\"rirpi\"},\"tags\":{\"ucqsdgbxcwtvmij\":\"cqoqkq\",\"aih\":\"cpkkjlamyvwprj\"},\"id\":\"nlbhxjppcbqetfz\",\"name\":\"ppvolzayjw\",\"type\":\"unj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BillingRoleDefinition> response = manager.billingRoleDefinitions()
            .listByCustomer("ack", "tlwgebylp", "jeldaqwju", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cqoqkq", response.iterator().next().tags().get("ucqsdgbxcwtvmij"));
        Assertions.assertEquals("rirpi", response.iterator().next().properties().roleName());
    }
}
