// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for Agreements ListByBillingAccount.
 */
public final class AgreementsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * agreementsListByBillingAccount.json
     */
    /**
     * Sample code: AgreementsListByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void agreementsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.agreements()
            .listByBillingAccount(
                "10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31", "Participants",
                com.azure.core.util.Context.NONE);
    }
}
