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
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainer;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainerProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FeaturesetContainersCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"isArchived\":false,\"latestVersion\":\"d\",\"nextVersion\":\"bjzxrpxji\",\"description\":\"upirvdonka\",\"tags\":{\"n\":\"vgjgcwwuusjjhtcy\",\"svwq\":\"highnxhgmfrnk\"},\"properties\":{\"auksttximeztasf\":\"jteqlujmmkn\"}},\"id\":\"mecweohlerpt\",\"name\":\"wvzapybdeea\",\"type\":\"igbpabacp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FeaturesetContainer response = manager.featuresetContainers()
            .define("xy")
            .withExistingWorkspace("iweyuigyzsebk", "fykgmwurcxxj")
            .withProperties(new FeaturesetContainerProperties().withDescription("nk")
                .withTags(mapOf("lwujobdqi", "pmqffgjsqqqairoo", "v", "pp", "trwgljfatezdxq", "ovijpmegnkrvtfbi"))
                .withProperties(mapOf("lgnieeqjdfxxxnn", "phgimyomje", "rijbiterqfu", "uxkepga", "dd", "errcanlpf",
                    "qawupqkvmy", "wpg"))
                .withIsArchived(false))
            .create();

        Assertions.assertEquals("upirvdonka", response.properties().description());
        Assertions.assertEquals("vgjgcwwuusjjhtcy", response.properties().tags().get("n"));
        Assertions.assertEquals("jteqlujmmkn", response.properties().properties().get("auksttximeztasf"));
        Assertions.assertEquals(false, response.properties().isArchived());
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
