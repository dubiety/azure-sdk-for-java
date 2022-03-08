// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.AcquireStorageAccountLock;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;

/** Samples for ProtectionContainers Register. */
public final class ProtectionContainersRegisterSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-12-01/examples/AzureStorage/ProtectionContainers_Register.json
     */
    /**
     * Sample code: RegisterAzure Storage ProtectionContainers.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void registerAzureStorageProtectionContainers(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionContainers()
            .define("StorageContainer;Storage;SwaggerTestRg;swaggertestsa")
            .withRegion((String) null)
            .withExistingBackupFabric("swaggertestvault", "SwaggerTestRg", "Azure")
            .withProperties(
                new AzureStorageContainer()
                    .withFriendlyName("swaggertestsa")
                    .withBackupManagementType(BackupManagementType.AZURE_STORAGE)
                    .withSourceResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/SwaggerTestRg/providers/Microsoft.Storage/storageAccounts/swaggertestsa")
                    .withAcquireStorageAccountLock(AcquireStorageAccountLock.ACQUIRE))
            .create();
    }
}
