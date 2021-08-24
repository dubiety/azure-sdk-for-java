// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.test.annotation.DoNotRecord;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.hdinsight.models.Cluster;
import com.azure.resourcemanager.hdinsight.models.ClusterCreateProperties;
import com.azure.resourcemanager.hdinsight.models.ClusterDefinition;
import com.azure.resourcemanager.hdinsight.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.models.HardwareProfile;
import com.azure.resourcemanager.hdinsight.models.LinuxOperatingSystemProfile;
import com.azure.resourcemanager.hdinsight.models.OSType;
import com.azure.resourcemanager.hdinsight.models.OsProfile;
import com.azure.resourcemanager.hdinsight.models.Role;
import com.azure.resourcemanager.hdinsight.models.StorageAccount;
import com.azure.resourcemanager.hdinsight.models.StorageProfile;
import com.azure.resourcemanager.hdinsight.models.Tier;
import com.azure.resourcemanager.hdinsight.models.VirtualNetworkProfile;
import com.azure.resourcemanager.network.NetworkManager;
import com.azure.resourcemanager.network.models.Network;
import com.azure.resourcemanager.network.models.Subnet;
import com.azure.resourcemanager.storage.StorageManager;
import com.azure.resourcemanager.storage.models.PublicAccess;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class HDInsightTests extends TestBase {

    private static final Region REGION = Region.US_EAST2;

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void clusterTest() throws MalformedURLException {
        StorageManager storageManager = StorageManager
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE));

        NetworkManager networkManager = NetworkManager
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE));

        HDInsightManager manager = HDInsightManager
            .configure().withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE));

        String resourceGroupName = "rg" + randomPadding();
        String storageAccountName = "sa" + randomPadding();

        storageManager.resourceManager().resourceGroups().define(resourceGroupName)
            .withRegion(REGION)
            .create();

        try {
            // @embedmeStart
            // network
            Network network = networkManager.networks().define("vn1")
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroupName)
                .withAddressSpace("10.0.0.0/24")
                .withSubnet("default", "10.0.0.0/24")
                .create();
            Subnet subnet = network.subnets().values().iterator().next();

            // storage account
            com.azure.resourcemanager.storage.models.StorageAccount storageAccount = storageManager.storageAccounts().define(storageAccountName)
                .withRegion(REGION)
                .withExistingResourceGroup(resourceGroupName)
                .create();
            final String storageAccountKey = storageAccount.getKeys().iterator().next().value();

            // container
            final String containerName = "hdinsight";
            storageManager.blobContainers().defineContainer(containerName)
                .withExistingBlobService(resourceGroupName, storageAccountName)
                .withPublicAccess(PublicAccess.NONE)
                .create();

            Map<String, Map<String, String>> clusterDefinition = new HashMap<>(1);
            Map<String, String> clusterProperties = new HashMap<>(3);
            clusterProperties.put("restAuthCredential.isEnabled", "true");
            clusterProperties.put("restAuthCredential.username", "admin");
            clusterProperties.put("restAuthCredential.password", "Pa$s" + randomPadding());
            clusterDefinition.put("gateway", Collections.unmodifiableMap(clusterProperties));

            // cluster
            Cluster cluster = manager.clusters().define("cluster" + randomPadding())
                .withExistingResourceGroup(resourceGroupName)
                .withRegion(REGION)
                .withProperties(new ClusterCreateProperties()
                    .withClusterVersion("3.6")
                    .withOsType(OSType.LINUX)
                    .withTier(Tier.STANDARD)
                    .withClusterDefinition(new ClusterDefinition()
                        .withKind("Spark")
                        .withConfigurations(Collections.unmodifiableMap(clusterDefinition))
                    )
                    .withComputeProfile(new ComputeProfile()
                        .withRoles(Collections.unmodifiableList(new LinkedList<>(Arrays.asList(
                            new Role().withName("headnode")
                                .withTargetInstanceCount(2)
                                .withHardwareProfile(new HardwareProfile()
                                    .withVmSize("Large")
                                )
                                .withOsProfile(new OsProfile()
                                    .withLinuxOperatingSystemProfile(
                                        new LinuxOperatingSystemProfile()
                                            .withUsername("sshuser")
                                            .withPassword("Pa$s" + randomPadding())
                                    )
                                )
                                .withVirtualNetworkProfile(new VirtualNetworkProfile()
                                    .withId(network.id())
                                    .withSubnet(subnet.id())
                                ),
                            new Role().withName("workernode")
                                .withTargetInstanceCount(3)
                                .withHardwareProfile(new HardwareProfile()
                                    .withVmSize("Large")
                                )
                                .withOsProfile(new OsProfile()
                                    .withLinuxOperatingSystemProfile(
                                        new LinuxOperatingSystemProfile()
                                            .withUsername("sshuser")
                                            .withPassword("Pa$s" + randomPadding())
                                    )
                                )
                                .withVirtualNetworkProfile(new VirtualNetworkProfile()
                                    .withId(network.id())
                                    .withSubnet(subnet.id())
                                )
                        ))))
                    )
                    .withStorageProfile(new StorageProfile()
                        .withStorageaccounts(Collections.unmodifiableList(Arrays.asList(
                            new StorageAccount()
                                .withName(new URL(storageAccount.endPoints().primary().blob()).getHost())
                                .withKey(storageAccountKey)
                                .withContainer(containerName)
                                .withIsDefault(true)
                        )))
                    ))
                .create();
            // @embedmeEnd

            manager.clusters().deleteById(cluster.id());
        } finally {
            storageManager.resourceManager().resourceGroups().beginDeleteByName(resourceGroupName);
        }
    }

    private static final Random RANDOM = new Random();

    private static String randomPadding() {
        return String.format("%05d", Math.abs(RANDOM.nextInt() % 100000));
    }
}
