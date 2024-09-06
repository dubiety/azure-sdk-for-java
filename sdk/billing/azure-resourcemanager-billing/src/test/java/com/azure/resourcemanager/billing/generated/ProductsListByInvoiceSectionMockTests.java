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
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.Product;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProductsListByInvoiceSectionMockTests {
    @Test
    public void testListByInvoiceSection() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"autoRenew\":\"On\",\"availabilityId\":\"vj\",\"billingFrequency\":\"wrvtflot\",\"billingProfileId\":\"zviswix\",\"billingProfileDisplayName\":\"nwznfxapylsllbd\",\"customerId\":\"wkpelyglfwmajll\",\"customerDisplayName\":\"bldhcfhw\",\"displayName\":\"thxnai\",\"endDate\":\"svr\",\"invoiceSectionId\":\"slylioguwsh\",\"invoiceSectionDisplayName\":\"cpbmyghq\",\"lastCharge\":{\"currency\":\"sbb\",\"value\":78.72579},\"lastChargeDate\":\"ztqrnreyjfmnrwee\",\"productType\":\"unjdclug\",\"productTypeId\":\"jfpsyqvgaaymfk\",\"skuId\":\"hiwmklj\",\"skuDescription\":\"gxcewz\",\"purchaseDate\":\"xz\",\"quantity\":3819250844731645650,\"status\":\"AutoRenew\",\"tenantId\":\"ttedzyzbvsjuths\",\"reseller\":{\"resellerId\":\"filnc\",\"description\":\"nkpxefmpzdwer\"}},\"tags\":{\"bfoi\":\"zxdlupgtptmnd\",\"sdxy\":\"vpglntnsiuxyitj\"},\"id\":\"rrllzxx\",\"name\":\"omhenqnovt\",\"type\":\"kobxvexusjfjuphj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Product> response = manager.products()
            .listByInvoiceSection("jmvvkodkqffhuxo", "qtgzvzcfmwfogjr", "mtbpnhjo", "lvfzwt", "rmp",
                4298151096087392704L, 6179884327864393416L, false, "esginpixhulf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zxdlupgtptmnd", response.iterator().next().tags().get("bfoi"));
        Assertions.assertEquals(AutoRenew.ON, response.iterator().next().properties().autoRenew());
    }
}
