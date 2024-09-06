// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.resourcemanager.billing.models.CheckAccessRequest;
import java.util.Arrays;

/**
 * Samples for BillingPermissions CheckAccessByBillingAccount.
 */
public final class BillingPermissionsCheckAccessByBillingAccountSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/checkAccessByBillingAccount.
     * json
     */
    /**
     * Sample code: CheckAccessByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void checkAccessByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingPermissions()
            .checkAccessByBillingAccountWithResponse(
                "10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                new CheckAccessRequest().withActions(Arrays.asList("Microsoft.Billing/billingAccounts/read",
                    "Microsoft.Subscription/subscriptions/write")),
                com.azure.core.util.Context.NONE);
    }
}
