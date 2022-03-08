// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupResourceEncryptionConfigs Get. */
public final class BackupResourceEncryptionConfigsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-12-01/examples/BackupResourceEncryptionConfig_Get.json
     */
    /**
     * Sample code: Get Vault Encryption Configuration.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getVaultEncryptionConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceEncryptionConfigs().getWithResponse("rishTestVault", "rishgrp", Context.NONE);
    }
}
