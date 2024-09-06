// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.Beneficiary;
import com.azure.resourcemanager.billing.models.SystemOverrides;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BillingSubscriptionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingSubscriptionInner model = BinaryData.fromString(
            "{\"properties\":{\"autoRenew\":\"On\",\"beneficiaryTenantId\":\"ecj\",\"beneficiary\":{\"tenantId\":\"slstvasy\",\"objectId\":\"xdza\"},\"billingFrequency\":\"weoohguufuzboyj\",\"billingProfileId\":\"hwtzolb\",\"billingPolicies\":{\"xmeb\":\"wm\",\"veabfqxnmwmqtib\":\"jscjpahl\",\"jaeukmrsieekpn\":\"yijddtvqcttad\",\"pibudqwyxebeybpm\":\"zaapmudqmeqwi\"},\"billingProfileDisplayName\":\"nrtffyaqi\",\"billingProfileName\":\"hheioqaqhvseuf\",\"consumptionCostCenter\":\"yrxpdlcgqls\",\"customerId\":\"mjqfrddgamquhio\",\"customerDisplayName\":\"sjuivfcdisyir\",\"customerName\":\"zhczexrxzbujrtrh\",\"displayName\":\"wrevkhgnlnzon\",\"enrollmentAccountId\":\"rpiqywncv\",\"enrollmentAccountDisplayName\":\"szcofizeht\",\"enrollmentAccountSubscriptionDetails\":{\"enrollmentAccountStartDate\":\"2021-05-18T17:24:34Z\",\"subscriptionEnrollmentAccountStatus\":\"TransferredOut\"},\"invoiceSectionId\":\"reljeamur\",\"invoiceSectionDisplayName\":\"mlovuanashcxl\",\"invoiceSectionName\":\"jerbdkelvidizozs\",\"lastMonthCharges\":{\"currency\":\"cxjmonfdgnwncyp\",\"value\":0.45065284},\"monthToDateCharges\":{\"currency\":\"tvuqjctzenkeifzz\",\"value\":98.14635},\"nextBillingCycleDetails\":{\"billingFrequency\":\"svflyhbxcudch\"},\"offerId\":\"srboldforobw\",\"productCategory\":\"vizbfhfo\",\"productType\":\"acqpbtuodxesza\",\"productTypeId\":\"elawumu\",\"purchaseDate\":\"2021-04-03T06:57:50Z\",\"quantity\":5864829114525781017,\"reseller\":{\"resellerId\":\"woycqucwyha\",\"description\":\"omd\"},\"renewalTermDetails\":{\"billingFrequency\":\"wuhpsvfuur\",\"productId\":\"lwexxwl\",\"productTypeId\":\"niexzsrzpgepq\",\"skuId\":\"bb\",\"termDuration\":\"pgdakchzyvli\",\"quantity\":7764041210336820295,\"termEndDate\":\"2021-03-27T20:06:12Z\"},\"skuId\":\"kjibnxmysuxswqrn\",\"skuDescription\":\"lwi\",\"systemOverrides\":{\"cancellation\":\"Allowed\",\"cancellationAllowedEndDate\":\"2021-02-24T02:17:19Z\"},\"resourceUri\":\"oqq\",\"termDuration\":\"cyyufmh\",\"termStartDate\":\"2021-04-21T16:04:02Z\",\"termEndDate\":\"2021-03-08T03:10:04Z\",\"provisioningTenantId\":\"mqspkcdqzhlctdd\",\"status\":\"Cancelled\",\"operationStatus\":\"Other\",\"provisioningState\":\"ConfirmedBilling\",\"subscriptionId\":\"chrqb\",\"suspensionReasons\":[\"rcgegydcwboxjum\"],\"suspensionReasonDetails\":[{\"effectiveDate\":\"2021-10-07T14:13:44Z\",\"reason\":\"Transferred\"}]},\"tags\":{\"oq\":\"aiouaubrjt\",\"rzpasccbiuimzdly\":\"fuojrngif\",\"fdvruz\":\"dfqwmkyoq\"},\"id\":\"zojhpctfnmd\",\"name\":\"otngfdgu\",\"type\":\"eyzihgrky\"}")
            .toObject(BillingSubscriptionInner.class);
        Assertions.assertEquals("aiouaubrjt", model.tags().get("oq"));
        Assertions.assertEquals(AutoRenew.ON, model.autoRenew());
        Assertions.assertEquals("ecj", model.beneficiaryTenantId());
        Assertions.assertEquals("slstvasy", model.beneficiary().tenantId());
        Assertions.assertEquals("xdza", model.beneficiary().objectId());
        Assertions.assertEquals("weoohguufuzboyj", model.billingFrequency());
        Assertions.assertEquals("hwtzolb", model.billingProfileId());
        Assertions.assertEquals("yrxpdlcgqls", model.consumptionCostCenter());
        Assertions.assertEquals("mjqfrddgamquhio", model.customerId());
        Assertions.assertEquals("wrevkhgnlnzon", model.displayName());
        Assertions.assertEquals("reljeamur", model.invoiceSectionId());
        Assertions.assertEquals("elawumu", model.productTypeId());
        Assertions.assertEquals(5864829114525781017L, model.quantity());
        Assertions.assertEquals("kjibnxmysuxswqrn", model.skuId());
        Assertions.assertEquals("cyyufmh", model.termDuration());
        Assertions.assertEquals("mqspkcdqzhlctdd", model.provisioningTenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingSubscriptionInner model = new BillingSubscriptionInner()
            .withTags(mapOf("oq", "aiouaubrjt", "rzpasccbiuimzdly", "fuojrngif", "fdvruz", "dfqwmkyoq"))
            .withAutoRenew(AutoRenew.ON)
            .withBeneficiaryTenantId("ecj")
            .withBeneficiary(new Beneficiary().withTenantId("slstvasy").withObjectId("xdza"))
            .withBillingFrequency("weoohguufuzboyj")
            .withBillingProfileId("hwtzolb")
            .withConsumptionCostCenter("yrxpdlcgqls")
            .withCustomerId("mjqfrddgamquhio")
            .withDisplayName("wrevkhgnlnzon")
            .withInvoiceSectionId("reljeamur")
            .withProductTypeId("elawumu")
            .withQuantity(5864829114525781017L)
            .withSkuId("kjibnxmysuxswqrn")
            .withSystemOverrides(new SystemOverrides())
            .withTermDuration("cyyufmh")
            .withProvisioningTenantId("mqspkcdqzhlctdd");
        model = BinaryData.fromObject(model).toObject(BillingSubscriptionInner.class);
        Assertions.assertEquals("aiouaubrjt", model.tags().get("oq"));
        Assertions.assertEquals(AutoRenew.ON, model.autoRenew());
        Assertions.assertEquals("ecj", model.beneficiaryTenantId());
        Assertions.assertEquals("slstvasy", model.beneficiary().tenantId());
        Assertions.assertEquals("xdza", model.beneficiary().objectId());
        Assertions.assertEquals("weoohguufuzboyj", model.billingFrequency());
        Assertions.assertEquals("hwtzolb", model.billingProfileId());
        Assertions.assertEquals("yrxpdlcgqls", model.consumptionCostCenter());
        Assertions.assertEquals("mjqfrddgamquhio", model.customerId());
        Assertions.assertEquals("wrevkhgnlnzon", model.displayName());
        Assertions.assertEquals("reljeamur", model.invoiceSectionId());
        Assertions.assertEquals("elawumu", model.productTypeId());
        Assertions.assertEquals(5864829114525781017L, model.quantity());
        Assertions.assertEquals("kjibnxmysuxswqrn", model.skuId());
        Assertions.assertEquals("cyyufmh", model.termDuration());
        Assertions.assertEquals("mqspkcdqzhlctdd", model.provisioningTenantId());
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
