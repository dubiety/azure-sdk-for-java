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
import com.azure.resourcemanager.machinelearning.models.Feature;
import com.azure.resourcemanager.machinelearning.models.FeatureDataType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FeaturesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"featureName\":\"lcldoyohu\",\"dataType\":\"Long\",\"description\":\"lop\",\"tags\":{\"wfrgdmbgbht\":\"sylwsmdo\"},\"properties\":{\"lgrrsk\":\"iustkqywab\",\"dxgdjudek\":\"tzbkeeohpf\",\"zmehcdfdxthqnz\":\"xh\",\"ueweivaje\":\"ukirdedijdhzkw\"}},\"id\":\"wlxdknxctglzbcxd\",\"name\":\"sgw\",\"type\":\"gyiw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Feature response = manager.features()
            .getWithResponse("bizxq", "dmhzbcujdzl", "yermjemny", "hoqpbfjfcbweabpt", "mkuquvcgvn",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lop", response.properties().description());
        Assertions.assertEquals("sylwsmdo", response.properties().tags().get("wfrgdmbgbht"));
        Assertions.assertEquals("iustkqywab", response.properties().properties().get("lgrrsk"));
        Assertions.assertEquals("lcldoyohu", response.properties().featureName());
        Assertions.assertEquals(FeatureDataType.LONG, response.properties().dataType());
    }
}
