// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner;
import com.azure.resourcemanager.billing.models.BillingRoleAssignmentProperties;

/**
 * Samples for BillingRoleAssignments CreateOrUpdateByBillingAccount.
 */
public final class BillingRoleAssignmentsCreateOrUpdateByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingRoleAssignmentCreateOrUpdateByBillingAccount.json
     */
    /**
     * Sample code: BillingRoleAssignmentCreateOrUpdateByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingRoleAssignmentCreateOrUpdateByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleAssignments()
            .createOrUpdateByBillingAccount("7898901", "9dfd08c2-62a3-4d47-85bd-1cdba1408402",
                new BillingRoleAssignmentInner().withProperties(new BillingRoleAssignmentProperties()
                    .withPrincipalId("00000000-0000-0000-0000-000000000000")
                    .withPrincipalTenantId("076915e7-de10-4323-bb34-a58c904068bb")
                    .withRoleDefinitionId(
                        "/providers/Microsoft.Billing/billingAccounts/7898901/billingRoleDefinitions/9f1983cb-2574-400c-87e9-34cf8e2280db")
                    .withUserEmailAddress("john@contoso.com")),
                com.azure.core.util.Context.NONE);
    }
}
