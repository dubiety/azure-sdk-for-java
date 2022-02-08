// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.resourcemanager.postgresql.models.GeoRedundantBackup;
import com.azure.resourcemanager.postgresql.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.postgresql.models.ServerPropertiesForDefaultCreate;
import com.azure.resourcemanager.postgresql.models.ServerPropertiesForGeoRestore;
import com.azure.resourcemanager.postgresql.models.ServerPropertiesForReplica;
import com.azure.resourcemanager.postgresql.models.ServerPropertiesForRestore;
import com.azure.resourcemanager.postgresql.models.Sku;
import com.azure.resourcemanager.postgresql.models.SkuTier;
import com.azure.resourcemanager.postgresql.models.SslEnforcementEnum;
import com.azure.resourcemanager.postgresql.models.StorageProfile;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for Servers Create. */
public final class ServersCreateSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerCreateReplicaMode.json
     */
    /**
     * Sample code: Create a replica server.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createAReplicaServer(com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager
            .servers()
            .define("testserver-replica1")
            .withRegion("westcentralus")
            .withExistingResourceGroup("TestGroup_WestCentralUS")
            .withProperties(
                new ServerPropertiesForReplica()
                    .withSourceServerId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup_WestCentralUS/providers/Microsoft.DBforPostgreSQL/servers/testserver-master"))
            .withSku(
                new Sku().withName("GP_Gen5_2").withTier(SkuTier.GENERAL_PURPOSE).withCapacity(2).withFamily("Gen5"))
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerCreateGeoRestoreMode.json
     */
    /**
     * Sample code: Create a server as a geo restore.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createAServerAsAGeoRestore(com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager
            .servers()
            .define("targetserver")
            .withRegion("westus")
            .withExistingResourceGroup("TargetResourceGroup")
            .withProperties(
                new ServerPropertiesForGeoRestore()
                    .withSourceServerId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/SourceResourceGroup/providers/Microsoft.DBforPostgreSQL/servers/sourceserver"))
            .withTags(mapOf("ElasticServer", "1"))
            .withSku(
                new Sku().withName("GP_Gen5_2").withTier(SkuTier.GENERAL_PURPOSE).withCapacity(2).withFamily("Gen5"))
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerCreate.json
     */
    /**
     * Sample code: Create a new server.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createANewServer(com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager
            .servers()
            .define("pgtestsvc4")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withProperties(
                new ServerPropertiesForDefaultCreate()
                    .withSslEnforcement(SslEnforcementEnum.ENABLED)
                    .withMinimalTlsVersion(MinimalTlsVersionEnum.TLS1_2)
                    .withStorageProfile(
                        new StorageProfile()
                            .withBackupRetentionDays(7)
                            .withGeoRedundantBackup(GeoRedundantBackup.DISABLED)
                            .withStorageMB(128000))
                    .withAdministratorLogin("cloudsa")
                    .withAdministratorLoginPassword("<administratorLoginPassword>"))
            .withTags(mapOf("ElasticServer", "1"))
            .withSku(new Sku().withName("B_Gen5_2").withTier(SkuTier.BASIC).withCapacity(2).withFamily("Gen5"))
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerCreatePointInTimeRestore.json
     */
    /**
     * Sample code: Create a database as a point in time restore.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createADatabaseAsAPointInTimeRestore(
        com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager
            .servers()
            .define("targetserver")
            .withRegion("brazilsouth")
            .withExistingResourceGroup("TargetResourceGroup")
            .withProperties(
                new ServerPropertiesForRestore()
                    .withSourceServerId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/SourceResourceGroup/providers/Microsoft.DBforPostgreSQL/servers/sourceserver")
                    .withRestorePointInTime(OffsetDateTime.parse("2017-12-14T00:00:37.467Z")))
            .withTags(mapOf("ElasticServer", "1"))
            .withSku(new Sku().withName("B_Gen5_2").withTier(SkuTier.BASIC).withCapacity(2).withFamily("Gen5"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
