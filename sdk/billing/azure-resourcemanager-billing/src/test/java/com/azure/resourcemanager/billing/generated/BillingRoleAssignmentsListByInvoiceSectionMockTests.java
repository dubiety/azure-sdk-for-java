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
import com.azure.resourcemanager.billing.models.BillingRoleAssignment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingRoleAssignmentsListByInvoiceSectionMockTests {
    @Test
    public void testListByInvoiceSection() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\",\"createdOn\":\"2021-10-08T14:45:45Z\",\"createdByPrincipalTenantId\":\"wrhulemmqmbwp\",\"createdByPrincipalId\":\"irxbkitzmnhit\",\"createdByPrincipalPuid\":\"jucltjlxsg\",\"createdByUserEmailAddress\":\"megdzd\",\"modifiedOn\":\"2021-07-22T09:25:46Z\",\"modifiedByPrincipalPuid\":\"u\",\"modifiedByUserEmailAddress\":\"f\",\"modifiedByPrincipalId\":\"zufldifnivlutg\",\"modifiedByPrincipalTenantId\":\"aacxauhvc\",\"principalPuid\":\"xhklsqxt\",\"principalId\":\"yygktsrjyxxoxwf\",\"principalTenantId\":\"kvecnxfx\",\"roleDefinitionId\":\"hsowbebsnbwutl\",\"scope\":\"wm\",\"userAuthenticationType\":\"mustih\",\"userEmailAddress\":\"rafjajvkyxmm\",\"principalTenantName\":\"zvogtde\",\"principalDisplayName\":\"ennmkvaeuwqd\",\"principalType\":\"Unknown\",\"billingRequestId\":\"lbmyphfxnrp\",\"billingAccountId\":\"ewokyqsfkxf\",\"billingAccountDisplayName\":\"wbihqbtodjfyxbvk\",\"billingProfileId\":\"zdmvdd\",\"billingProfileDisplayName\":\"cr\",\"invoiceSectionId\":\"yoz\",\"invoiceSectionDisplayName\":\"awnjdvvlrhoc\",\"customerId\":\"kvx\",\"customerDisplayName\":\"dqzbvbpsuvqhx\"},\"tags\":{\"rklpiigfuzk\":\"fgdkwbk\",\"jclzjwaqdzqydewu\":\"utui\"},\"id\":\"yllzzz\",\"name\":\"vtzqw\",\"type\":\"zochwbekmuyn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BillingRoleAssignment> response = manager.billingRoleAssignments()
            .listByInvoiceSection("pqoswgfqv", "mghpakbqyh", "sornfbmeqagkn", "jm", 9197157484428670183L,
                486684540008920384L, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fgdkwbk", response.iterator().next().tags().get("rklpiigfuzk"));
        Assertions.assertEquals("xhklsqxt", response.iterator().next().properties().principalPuid());
        Assertions.assertEquals("yygktsrjyxxoxwf", response.iterator().next().properties().principalId());
        Assertions.assertEquals("kvecnxfx", response.iterator().next().properties().principalTenantId());
        Assertions.assertEquals("hsowbebsnbwutl", response.iterator().next().properties().roleDefinitionId());
        Assertions.assertEquals("wm", response.iterator().next().properties().scope());
        Assertions.assertEquals("mustih", response.iterator().next().properties().userAuthenticationType());
        Assertions.assertEquals("rafjajvkyxmm", response.iterator().next().properties().userEmailAddress());
    }
}
