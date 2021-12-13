// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupProtectedItems List. */
public final class BackupProtectedItemsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-07-01/examples/AzureIaasVm/BackupProtectedItems_List.json
     */
    /**
     * Sample code: List protected items with backupManagementType filter as AzureIaasVm.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void listProtectedItemsWithBackupManagementTypeFilterAsAzureIaasVm(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupProtectedItems()
            .list(
                "NetSDKTestRsVault",
                "SwaggerTestRg",
                "backupManagementType eq 'AzureIaasVM' and itemType eq 'VM'",
                null,
                Context.NONE);
    }
}
