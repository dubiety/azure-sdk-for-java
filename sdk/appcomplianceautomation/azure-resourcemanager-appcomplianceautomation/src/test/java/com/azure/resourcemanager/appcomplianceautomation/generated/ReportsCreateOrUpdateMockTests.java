// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportResource;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceMetadata;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceOrigin;
import com.azure.resourcemanager.appcomplianceautomation.models.StorageInfo;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"triggerTime\":\"2021-09-04T20:01:09Z\",\"timeZone\":\"s\",\"resources\":[{\"resourceId\":\"nbtgkbugrjqctoj\",\"resourceType\":\"isofieypefojyqd\",\"resourceKind\":\"u\",\"resourceOrigin\":\"AWS\",\"accountId\":\"lcwkhihihlhz\"}],\"status\":\"Active\",\"errors\":[\"bsrgnowc\",\"hfgmvecactxm\",\"oteyowc\"],\"tenantId\":\"qovekqvgqou\",\"offerGuid\":\"fzmpjwyivq\",\"nextTriggerTime\":\"2021-03-25T17:15:32Z\",\"lastTriggerTime\":\"2021-08-25T08:05:15Z\",\"subscriptions\":[\"rfsphuagrt\",\"ikteusqczkvyk\",\"xubyjaffmmfblcqc\",\"ubgq\"],\"complianceStatus\":{\"m365\":{\"passedCount\":75239046,\"failedCount\":2109412730,\"manualCount\":1066879045,\"notApplicableCount\":38344578,\"pendingCount\":1081428420}},\"storageInfo\":{\"subscriptionId\":\"lqxihhrmooiz\",\"resourceGroup\":\"eypxiutcxapzhyr\",\"accountName\":\"togebjoxsl\",\"location\":\"nhl\"},\"certRecords\":[{\"offerGuid\":\"nk\",\"certificationStatus\":\"jcjbt\",\"ingestionStatus\":\"aehvvibrxjjstoq\",\"controls\":[{}]},{\"offerGuid\":\"pkxztmoobkl\",\"certificationStatus\":\"idgfc\",\"ingestionStatus\":\"mpimaqxzhemjyh\",\"controls\":[{}]},{\"offerGuid\":\"swtwkozzwc\",\"certificationStatus\":\"kb\",\"ingestionStatus\":\"pfajnjwltlwtjj\",\"controls\":[{},{},{},{}]}],\"provisioningState\":\"Succeeded\"},\"id\":\"hsnvkcdmxzrp\",\"name\":\"aimlnwiaaom\",\"type\":\"l\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ReportResource response = manager.reports()
            .createOrUpdate("raauzzpt",
                new ReportResourceInner()
                    .withProperties(new ReportProperties().withTriggerTime(OffsetDateTime.parse("2021-02-18T00:50:05Z"))
                        .withTimeZone("zysdzh")
                        .withResources(Arrays.asList(
                            new ResourceMetadata().withResourceId("wwvaiqyuvvfonk")
                                .withResourceType("hqyikvy")
                                .withResourceKind("uyav")
                                .withResourceOrigin(ResourceOrigin.AZURE)
                                .withAccountId("ncstt"),
                            new ResourceMetadata().withResourceId("jfybvpoekrsgsgb")
                                .withResourceType("uzqgnjdgkynsc")
                                .withResourceKind("qhzvhxnkomt")
                                .withResourceOrigin(ResourceOrigin.GCP)
                                .withAccountId("tppn")))
                        .withOfferGuid("xvd")
                        .withStorageInfo(new StorageInfo().withSubscriptionId("xg")
                            .withResourceGroup("oyxcdyuib")
                            .withAccountName("fdn")
                            .withLocation("ydvfvfcjnae"))),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-09-04T20:01:09Z"), response.properties().triggerTime());
        Assertions.assertEquals("s", response.properties().timeZone());
        Assertions.assertEquals("nbtgkbugrjqctoj", response.properties().resources().get(0).resourceId());
        Assertions.assertEquals("isofieypefojyqd", response.properties().resources().get(0).resourceType());
        Assertions.assertEquals("u", response.properties().resources().get(0).resourceKind());
        Assertions.assertEquals(ResourceOrigin.AWS, response.properties().resources().get(0).resourceOrigin());
        Assertions.assertEquals("lcwkhihihlhz", response.properties().resources().get(0).accountId());
        Assertions.assertEquals("fzmpjwyivq", response.properties().offerGuid());
        Assertions.assertEquals("lqxihhrmooiz", response.properties().storageInfo().subscriptionId());
        Assertions.assertEquals("eypxiutcxapzhyr", response.properties().storageInfo().resourceGroup());
        Assertions.assertEquals("togebjoxsl", response.properties().storageInfo().accountName());
        Assertions.assertEquals("nhl", response.properties().storageInfo().location());
    }
}
