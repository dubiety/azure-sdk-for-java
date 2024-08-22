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
import com.azure.resourcemanager.machinelearning.models.AutoRebuildSetting;
import com.azure.resourcemanager.machinelearning.models.BuildContext;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersion;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersionProperties;
import com.azure.resourcemanager.machinelearning.models.InferenceContainerProperties;
import com.azure.resourcemanager.machinelearning.models.OperatingSystemType;
import com.azure.resourcemanager.machinelearning.models.Route;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EnvironmentVersionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"environmentType\":\"UserCreated\",\"image\":\"jgrepbrbmc\",\"condaFile\":\"vxjwpvqrexlui\",\"build\":{\"contextUri\":\"lqwbrfiovpdl\",\"dockerfilePath\":\"drfiwerlbcetrvir\"},\"osType\":\"Linux\",\"inferenceConfig\":{\"livenessRoute\":{\"path\":\"wpvnloop\",\"port\":940990727},\"readinessRoute\":{\"path\":\"egchtabhacjlf\",\"port\":856600088},\"scoringRoute\":{\"path\":\"klvvwvpfqtpvzhml\",\"port\":474864730}},\"autoRebuild\":\"Disabled\",\"provisioningState\":\"Failed\",\"stage\":\"ffnsdmhawbx\",\"isArchived\":true,\"isAnonymous\":true,\"description\":\"hlewyroksayehf\",\"tags\":{\"tmdhbctk\":\"py\"},\"properties\":{\"hxope\":\"xzlphzujkqaxbe\",\"sykhdapxdiibjj\":\"el\",\"yhx\":\"uekhh\",\"ffajh\":\"uhhnrmmfzfkhfnz\"}},\"id\":\"bskgciedlqvpd\",\"name\":\"rlsmsrwlfgbu\",\"type\":\"gchjtpszcawf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        EnvironmentVersion response = manager.environmentVersions()
            .define("lcbbu")
            .withExistingEnvironment("vgjynuwcque", "anqdmmrodpgtblm", "blcbwvsqpea")
            .withProperties(new EnvironmentVersionProperties().withDescription("oafdvxrlrsrfrxyl")
                .withTags(mapOf("asnc", "pspipkpcvhqadj", "tkvoivcktjscjkex", "quixuqvat"))
                .withProperties(mapOf("yunwmbfjjs", "yrcjgptxvz", "s", "eqvefnzvhmiwba", "ktytrivf", "fm"))
                .withIsArchived(false)
                .withIsAnonymous(true)
                .withImage("girsfilxusyzcn")
                .withCondaFile("vipeh")
                .withBuild(new BuildContext().withContextUri("bburbxovgjipbnn").withDockerfilePath("sjxwjnw"))
                .withOsType(OperatingSystemType.WINDOWS)
                .withInferenceConfig(new InferenceContainerProperties()
                    .withLivenessRoute(new Route().withPath("hpyixibr").withPort(987704652))
                    .withReadinessRoute(new Route().withPath("uzsojblyygftic").withPort(644261840))
                    .withScoringRoute(new Route().withPath("rswqmteu").withPort(155856060)))
                .withAutoRebuild(AutoRebuildSetting.DISABLED)
                .withStage("otrbnvoe"))
            .create();

        Assertions.assertEquals("hlewyroksayehf", response.properties().description());
        Assertions.assertEquals("py", response.properties().tags().get("tmdhbctk"));
        Assertions.assertEquals("xzlphzujkqaxbe", response.properties().properties().get("hxope"));
        Assertions.assertEquals(true, response.properties().isArchived());
        Assertions.assertEquals(true, response.properties().isAnonymous());
        Assertions.assertEquals("jgrepbrbmc", response.properties().image());
        Assertions.assertEquals("vxjwpvqrexlui", response.properties().condaFile());
        Assertions.assertEquals("lqwbrfiovpdl", response.properties().build().contextUri());
        Assertions.assertEquals("drfiwerlbcetrvir", response.properties().build().dockerfilePath());
        Assertions.assertEquals(OperatingSystemType.LINUX, response.properties().osType());
        Assertions.assertEquals("wpvnloop", response.properties().inferenceConfig().livenessRoute().path());
        Assertions.assertEquals(940990727, response.properties().inferenceConfig().livenessRoute().port());
        Assertions.assertEquals("egchtabhacjlf", response.properties().inferenceConfig().readinessRoute().path());
        Assertions.assertEquals(856600088, response.properties().inferenceConfig().readinessRoute().port());
        Assertions.assertEquals("klvvwvpfqtpvzhml", response.properties().inferenceConfig().scoringRoute().path());
        Assertions.assertEquals(474864730, response.properties().inferenceConfig().scoringRoute().port());
        Assertions.assertEquals(AutoRebuildSetting.DISABLED, response.properties().autoRebuild());
        Assertions.assertEquals("ffnsdmhawbx", response.properties().stage());
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
