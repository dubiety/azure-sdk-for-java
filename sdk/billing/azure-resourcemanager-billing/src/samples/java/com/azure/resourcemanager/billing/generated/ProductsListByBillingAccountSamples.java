// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for Products ListByBillingAccount.
 */
public final class ProductsListByBillingAccountSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/productsListByBillingAccount.
     * json
     */
    /**
     * Sample code: ProductsListByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products()
            .listByBillingAccount(
                "00000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31", null, null,
                null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
