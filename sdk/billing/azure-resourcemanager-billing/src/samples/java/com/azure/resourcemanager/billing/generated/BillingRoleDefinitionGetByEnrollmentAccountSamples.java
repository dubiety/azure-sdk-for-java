// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for BillingRoleDefinition GetByEnrollmentAccount.
 */
public final class BillingRoleDefinitionGetByEnrollmentAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingRoleDefinitionGetByEnrollmentAccount.json
     */
    /**
     * Sample code: BillingRoleDefinitionGetByEnrollmentAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingRoleDefinitionGetByEnrollmentAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleDefinitions()
            .getByEnrollmentAccountWithResponse("123456", "4568789", "50000000-aaaa-bbbb-cccc-100000000000",
                com.azure.core.util.Context.NONE);
    }
}
