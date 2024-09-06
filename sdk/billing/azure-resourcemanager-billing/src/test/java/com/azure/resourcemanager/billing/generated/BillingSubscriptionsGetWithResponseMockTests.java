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
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.BillingSubscription;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"autoRenew\":\"Off\",\"beneficiaryTenantId\":\"qwojdz\",\"beneficiary\":{\"tenantId\":\"twsrbfbsd\",\"objectId\":\"cdzfbvexrv\"},\"billingFrequency\":\"hmfsnqp\",\"billingProfileId\":\"tsh\",\"billingPolicies\":{\"fbwoetxi\":\"rsksdzmhwtsypp\",\"gdungaypx\":\"rfwxhf\",\"bxsnx\":\"a\"},\"billingProfileDisplayName\":\"sznfstmprvgra\",\"billingProfileName\":\"zktwomlpc\",\"consumptionCostCenter\":\"qboomzgmr\",\"customerId\":\"hsfddkhxvevwxm\",\"customerDisplayName\":\"waxadxgn\",\"customerName\":\"htuhalpq\",\"displayName\":\"dnao\",\"enrollmentAccountId\":\"xznpnytkqja\",\"enrollmentAccountDisplayName\":\"azbtgtzp\",\"enrollmentAccountSubscriptionDetails\":{\"enrollmentAccountStartDate\":\"2021-11-28T20:04:59Z\",\"subscriptionEnrollmentAccountStatus\":\"Inactive\"},\"invoiceSectionId\":\"ujfgtg\",\"invoiceSectionDisplayName\":\"upczegqn\",\"invoiceSectionName\":\"dvssvg\",\"lastMonthCharges\":{\"currency\":\"gkztzttjnknpbq\",\"value\":98.50168},\"monthToDateCharges\":{\"currency\":\"bclobnaqe\",\"value\":48.010868},\"nextBillingCycleDetails\":{\"billingFrequency\":\"q\"},\"offerId\":\"ugpnnhzjm\",\"productCategory\":\"feonmnvmujyiqywl\",\"productType\":\"mliytdegcrunbkil\",\"productTypeId\":\"tekbirhyvsy\",\"purchaseDate\":\"2021-05-04T14:52:01Z\",\"quantity\":7031355623994805057,\"reseller\":{\"resellerId\":\"szffiu\",\"description\":\"trvgioguox\"},\"renewalTermDetails\":{\"billingFrequency\":\"qo\",\"productId\":\"denmjogx\",\"productTypeId\":\"ggyciwbnqi\",\"skuId\":\"sx\",\"termDuration\":\"mrnjrdijo\",\"quantity\":8714787440142236452,\"termEndDate\":\"2021-06-21T09:51:24Z\"},\"skuId\":\"hdcjggcm\",\"skuDescription\":\"cjqbgbnoq\",\"systemOverrides\":{\"cancellation\":\"NotAllowed\",\"cancellationAllowedEndDate\":\"2021-04-18T18:54:13Z\"},\"resourceUri\":\"ytzgwjekyqirv\",\"termDuration\":\"o\",\"termStartDate\":\"2021-05-31T15:30:09Z\",\"termEndDate\":\"2021-11-01T05:48:44Z\",\"provisioningTenantId\":\"pdilbdvxlfhlzzg\",\"status\":\"Failed\",\"operationStatus\":\"LockedForUpdate\",\"provisioningState\":\"Failed\",\"subscriptionId\":\"lscrm\",\"suspensionReasons\":[\"uz\",\"wkgouxnro\",\"ht\",\"esywywnvgy\"],\"suspensionReasonDetails\":[{\"effectiveDate\":\"2021-03-13T05:15:54Z\",\"reason\":\"Expired\"}]},\"tags\":{\"xlfzlnzyrgrl\":\"uej\",\"jovlxqtvmvzpniq\":\"chrau\"},\"id\":\"mrgm\",\"name\":\"kgtlhzkrazki\",\"type\":\"iy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingSubscription response = manager.billingSubscriptions()
            .getWithResponse("glmnlbnatln", "hzzcdkxortdzzvhb", "jk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("uej", response.tags().get("xlfzlnzyrgrl"));
        Assertions.assertEquals(AutoRenew.OFF, response.autoRenew());
        Assertions.assertEquals("qwojdz", response.beneficiaryTenantId());
        Assertions.assertEquals("twsrbfbsd", response.beneficiary().tenantId());
        Assertions.assertEquals("cdzfbvexrv", response.beneficiary().objectId());
        Assertions.assertEquals("hmfsnqp", response.billingFrequency());
        Assertions.assertEquals("tsh", response.billingProfileId());
        Assertions.assertEquals("qboomzgmr", response.consumptionCostCenter());
        Assertions.assertEquals("hsfddkhxvevwxm", response.customerId());
        Assertions.assertEquals("dnao", response.displayName());
        Assertions.assertEquals("ujfgtg", response.invoiceSectionId());
        Assertions.assertEquals("tekbirhyvsy", response.productTypeId());
        Assertions.assertEquals(7031355623994805057L, response.quantity());
        Assertions.assertEquals("hdcjggcm", response.skuId());
        Assertions.assertEquals("o", response.termDuration());
        Assertions.assertEquals("pdilbdvxlfhlzzg", response.provisioningTenantId());
    }
}
