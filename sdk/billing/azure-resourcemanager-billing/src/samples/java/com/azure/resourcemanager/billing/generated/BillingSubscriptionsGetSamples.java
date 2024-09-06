// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for BillingSubscriptions Get.
 */
public final class BillingSubscriptionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/billingSubscriptionsGet.json
     */
    /**
     * Sample code: BillingSubscriptionsGet.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingSubscriptions()
            .getWithResponse("00000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                "11111111-1111-1111-1111-111111111111", null, com.azure.core.util.Context.NONE);
    }
}
