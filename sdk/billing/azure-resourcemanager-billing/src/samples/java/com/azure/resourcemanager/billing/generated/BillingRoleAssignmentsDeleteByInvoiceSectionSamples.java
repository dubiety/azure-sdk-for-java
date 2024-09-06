// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for BillingRoleAssignments DeleteByInvoiceSection.
 */
public final class BillingRoleAssignmentsDeleteByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingRoleAssignmentDeleteByInvoiceSection.json
     */
    /**
     * Sample code: BillingRoleAssignmentDeleteByInvoiceSection.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingRoleAssignmentDeleteByInvoiceSection(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleAssignments()
            .deleteByInvoiceSectionWithResponse(
                "00000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2018-09-30",
                "BKM6-54VH-BG7-PGB", "xxxx-xxxx-xxx-xxx",
                "10000000-aaaa-bbbb-cccc-100000000000_6fd330f6-7d26-4aff-b9cf-7bd699f965b9",
                com.azure.core.util.Context.NONE);
    }
}
