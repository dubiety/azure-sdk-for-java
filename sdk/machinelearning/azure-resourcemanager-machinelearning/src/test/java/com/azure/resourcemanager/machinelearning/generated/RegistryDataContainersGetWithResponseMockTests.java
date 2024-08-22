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
import com.azure.resourcemanager.machinelearning.models.DataContainer;
import com.azure.resourcemanager.machinelearning.models.DataType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegistryDataContainersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"dataType\":\"uri_file\",\"isArchived\":false,\"latestVersion\":\"ywab\",\"nextVersion\":\"tnipaptgv\",\"description\":\"qyjukkajn\",\"tags\":{\"femiwfhhawbabhz\":\"ltonop\",\"qnxyd\":\"fcdi\",\"zsuspaywvslq\":\"zfoi\"},\"properties\":{\"kxfmu\":\"nzea\",\"v\":\"dbvytq\",\"axgbiwpgop\":\"uymkdeuqxlvzpfd\"}},\"id\":\"ktthbmrrmtrx\",\"name\":\"jmpdvrjzwaw\",\"type\":\"ewajccsdjuz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DataContainer response = manager.registryDataContainers()
            .getWithResponse("wjsba", "xaxtuxirppbiichl", "gkvuixwonkr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qyjukkajn", response.properties().description());
        Assertions.assertEquals("ltonop", response.properties().tags().get("femiwfhhawbabhz"));
        Assertions.assertEquals("nzea", response.properties().properties().get("kxfmu"));
        Assertions.assertEquals(false, response.properties().isArchived());
        Assertions.assertEquals(DataType.URI_FILE, response.properties().dataType());
    }
}
