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
import com.azure.resourcemanager.billing.models.DocumentDownloadResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class InvoicesDownloadByBillingAccountMockTests {
    @Test
    public void testDownloadByBillingAccount() throws Exception {
        String responseStr = "{\"expiryTime\":\"ndprwruexhgdhpkp\",\"url\":\"seyltqxfpfop\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DocumentDownloadResult response = manager.invoices()
            .downloadByBillingAccount("aeqbo", "gwjxatwxiyarfhi", "sytidz", com.azure.core.util.Context.NONE);

    }
}
