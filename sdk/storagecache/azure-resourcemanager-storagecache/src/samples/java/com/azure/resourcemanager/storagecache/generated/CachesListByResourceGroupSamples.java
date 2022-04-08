// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.Context;

/** Samples for Caches ListByResourceGroup. */
public final class CachesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2022-01-01/examples/Caches_ListByResourceGroup.json
     */
    /**
     * Sample code: Caches_ListByResourceGroup.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesListByResourceGroup(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.caches().listByResourceGroup("scgroup", Context.NONE);
    }
}
