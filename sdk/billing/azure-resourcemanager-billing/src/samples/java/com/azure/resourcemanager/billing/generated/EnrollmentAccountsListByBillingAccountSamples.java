// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for EnrollmentAccounts ListByBillingAccount.
 */
public final class EnrollmentAccountsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * enrollmentAccountsListByBillingAccount.json
     */
    /**
     * Sample code: EnrollmentAccountsListByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        enrollmentAccountsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.enrollmentAccounts()
            .listByBillingAccount("6564892", null, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
