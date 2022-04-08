// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.models.ImmutableStorageWithVersioning;

/** Samples for BlobContainers Create. */
public final class BlobContainersCreateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutDefaultEncryptionScope.json
     */
    /**
     * Sample code: PutContainerWithDefaultEncryptionScope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putContainerWithDefaultEncryptionScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .createWithResponse(
                "res3376",
                "sto328",
                "container6185",
                new BlobContainerInner()
                    .withDefaultEncryptionScope("encryptionscope185")
                    .withDenyEncryptionScopeOverride(true),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPutObjectLevelWorm.json
     */
    /**
     * Sample code: PutContainerWithObjectLevelWorm.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putContainerWithObjectLevelWorm(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .createWithResponse(
                "res3376",
                "sto328",
                "container6185",
                new BlobContainerInner()
                    .withImmutableStorageWithVersioning(new ImmutableStorageWithVersioning().withEnabled(true)),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/BlobContainersPut.json
     */
    /**
     * Sample code: PutContainers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putContainers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .createWithResponse("res3376", "sto328", "container6185", new BlobContainerInner(), Context.NONE);
    }
}
