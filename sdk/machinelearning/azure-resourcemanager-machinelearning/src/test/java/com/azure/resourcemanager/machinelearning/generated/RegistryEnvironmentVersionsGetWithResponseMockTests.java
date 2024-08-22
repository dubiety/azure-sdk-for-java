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
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersion;
import com.azure.resourcemanager.machinelearning.models.OperatingSystemType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegistryEnvironmentVersionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"environmentType\":\"Curated\",\"image\":\"jlwwef\",\"condaFile\":\"twllqypmjc\",\"build\":{\"contextUri\":\"vfwgkz\",\"dockerfilePath\":\"kshxjkckwb\"},\"osType\":\"Windows\",\"inferenceConfig\":{\"livenessRoute\":{\"path\":\"mmkwahrooy\",\"port\":677197142},\"readinessRoute\":{\"path\":\"bnvy\",\"port\":658844384},\"scoringRoute\":{\"path\":\"a\",\"port\":1415322253}},\"autoRebuild\":\"OnBaseImageUpdate\",\"provisioningState\":\"Updating\",\"stage\":\"xtigukfkbsyc\",\"isArchived\":true,\"isAnonymous\":false,\"description\":\"peenlqtqyvlfbsav\",\"tags\":{\"phtoshqtuarjwgu\":\"fjdsq\"},\"properties\":{\"q\":\"nxaeyp\",\"bwscjwyye\":\"izfyasydd\"}},\"id\":\"iflrvfeowctshw\",\"name\":\"rhhasabvauz\",\"type\":\"wwumkbpgcilbwtp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        EnvironmentVersion response = manager.registryEnvironmentVersions()
            .getWithResponse("xdjspnonxe", "hq", "zhn", "twvgc", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("peenlqtqyvlfbsav", response.properties().description());
        Assertions.assertEquals("fjdsq", response.properties().tags().get("phtoshqtuarjwgu"));
        Assertions.assertEquals("nxaeyp", response.properties().properties().get("q"));
        Assertions.assertEquals(true, response.properties().isArchived());
        Assertions.assertEquals(false, response.properties().isAnonymous());
        Assertions.assertEquals("jlwwef", response.properties().image());
        Assertions.assertEquals("twllqypmjc", response.properties().condaFile());
        Assertions.assertEquals("vfwgkz", response.properties().build().contextUri());
        Assertions.assertEquals("kshxjkckwb", response.properties().build().dockerfilePath());
        Assertions.assertEquals(OperatingSystemType.WINDOWS, response.properties().osType());
        Assertions.assertEquals("mmkwahrooy", response.properties().inferenceConfig().livenessRoute().path());
        Assertions.assertEquals(677197142, response.properties().inferenceConfig().livenessRoute().port());
        Assertions.assertEquals("bnvy", response.properties().inferenceConfig().readinessRoute().path());
        Assertions.assertEquals(658844384, response.properties().inferenceConfig().readinessRoute().port());
        Assertions.assertEquals("a", response.properties().inferenceConfig().scoringRoute().path());
        Assertions.assertEquals(1415322253, response.properties().inferenceConfig().scoringRoute().port());
        Assertions.assertEquals(AutoRebuildSetting.ON_BASE_IMAGE_UPDATE, response.properties().autoRebuild());
        Assertions.assertEquals("xtigukfkbsyc", response.properties().stage());
    }
}
