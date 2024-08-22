// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.MarketplaceSubscription;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MarketplaceSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"modelId\":\"nssvrkzslyliog\",\"marketplacePlan\":{\"publisherId\":\"hrmcpbmyghqtth\",\"offerId\":\"blwkqztqrnre\",\"planId\":\"fmnrweevtun\"},\"marketplaceSubscriptionStatus\":\"Unsubscribed\",\"provisioningState\":\"Canceled\"},\"id\":\"vsjfpsyqvgaaymfk\",\"name\":\"xhiwmkljhk\",\"type\":\"xcewzgoxz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MarketplaceSubscription response = manager.marketplaceSubscriptions()
            .getWithResponse("a", "bldhcfhw", "ithxna", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nssvrkzslyliog", response.properties().modelId());
    }
}
