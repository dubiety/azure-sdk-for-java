// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.RegistryProperties;
import com.azure.resourcemanager.machinelearning.models.AcrDetails;
import com.azure.resourcemanager.machinelearning.models.ArmResourceId;
import com.azure.resourcemanager.machinelearning.models.EndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointResource;
import com.azure.resourcemanager.machinelearning.models.RegistryPrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.RegistryPrivateLinkServiceConnectionState;
import com.azure.resourcemanager.machinelearning.models.RegistryRegionArmDetails;
import com.azure.resourcemanager.machinelearning.models.StorageAccountDetails;
import com.azure.resourcemanager.machinelearning.models.SystemCreatedAcrAccount;
import com.azure.resourcemanager.machinelearning.models.SystemCreatedStorageAccount;
import com.azure.resourcemanager.machinelearning.models.UserCreatedAcrAccount;
import com.azure.resourcemanager.machinelearning.models.UserCreatedStorageAccount;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RegistryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegistryProperties model = BinaryData.fromString(
            "{\"discoveryUrl\":\"t\",\"intellectualPropertyPublisher\":\"vhyibdrqrsw\",\"managedResourceGroup\":{\"resourceId\":\"ubpyrow\"},\"mlFlowRegistryUri\":\"oxztfwfqch\",\"registryPrivateEndpointConnections\":[{\"id\":\"vjnn\",\"location\":\"agfyvrtpqpe\",\"properties\":{\"groupIds\":[\"gkrepdqhqyhw\",\"wemvxqabckmze\",\"xin\"],\"privateEndpoint\":{\"subnetArmId\":\"eoh\",\"id\":\"h\"},\"registryPrivateLinkServiceConnectionState\":{\"actionsRequired\":\"zjpcee\",\"description\":\"zangprbfaxyxzlbc\",\"status\":\"Approved\"},\"provisioningState\":\"sexroqrndkt\"}},{\"id\":\"vonfeeqgpkr\",\"location\":\"tbgnixxowwzkyfw\",\"properties\":{\"groupIds\":[\"wxeiicrmpepk\",\"dm\",\"xxij\"],\"privateEndpoint\":{\"subnetArmId\":\"ws\",\"id\":\"kjgyacwrasekwe\"},\"registryPrivateLinkServiceConnectionState\":{\"actionsRequired\":\"o\",\"description\":\"woqartwy\",\"status\":\"Approved\"},\"provisioningState\":\"l\"}},{\"id\":\"vatdavuqmcbymsf\",\"location\":\"jlquvjez\",\"properties\":{\"groupIds\":[\"v\",\"simi\",\"yoi\"],\"privateEndpoint\":{\"subnetArmId\":\"miqwnnrac\",\"id\":\"bbfqpspklady\"},\"registryPrivateLinkServiceConnectionState\":{\"actionsRequired\":\"hautw\",\"description\":\"exzgpmnmabedd\",\"status\":\"Disconnected\"},\"provisioningState\":\"gdfpfqfpcvst\"}}],\"publicNetworkAccess\":\"gq\",\"regionDetails\":[{\"acrDetails\":[{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"xbsmtbljje\",\"acrAccountSku\":\"ci\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}},{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"tbrekqhsqhtf\",\"acrAccountSku\":\"pqbye\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}},{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"dqigmg\",\"acrAccountSku\":\"inztxl\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}}],\"location\":\"jcmrnkfm\",\"storageAccountDetails\":[{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{},\"storageAccountHnsEnabled\":false,\"storageAccountName\":\"jnqtqe\",\"storageAccountType\":\"j\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}},{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":true,\"armResourceId\":{},\"storageAccountHnsEnabled\":false,\"storageAccountName\":\"dxe\",\"storageAccountType\":\"h\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}},{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{},\"storageAccountHnsEnabled\":true,\"storageAccountName\":\"k\",\"storageAccountType\":\"kqynspgbvo\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}},{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{},\"storageAccountHnsEnabled\":true,\"storageAccountName\":\"exqokmy\",\"storageAccountType\":\"jialz\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}}]},{\"acrDetails\":[{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"pbcjtrpzuyudivbx\",\"acrAccountSku\":\"sqeaeonqelwg\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}},{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"y\",\"acrAccountSku\":\"arogatmolji\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}},{\"systemCreatedAcrAccount\":{\"acrAccountName\":\"mzvfkneerz\",\"acrAccountSku\":\"rknsjulug\",\"armResourceId\":{}},\"userCreatedAcrAccount\":{\"armResourceId\":{}}}],\"location\":\"rxle\",\"storageAccountDetails\":[{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{},\"storageAccountHnsEnabled\":false,\"storageAccountName\":\"ihtd\",\"storageAccountType\":\"wjekptycaydbj\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}},{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{},\"storageAccountHnsEnabled\":false,\"storageAccountName\":\"hmhsurlgwqkpm\",\"storageAccountType\":\"pstauol\"},\"userCreatedStorageAccount\":{\"armResourceId\":{}}}]}]}")
            .toObject(RegistryProperties.class);
        Assertions.assertEquals("t", model.discoveryUrl());
        Assertions.assertEquals("vhyibdrqrsw", model.intellectualPropertyPublisher());
        Assertions.assertEquals("ubpyrow", model.managedResourceGroup().resourceId());
        Assertions.assertEquals("oxztfwfqch", model.mlFlowRegistryUri());
        Assertions.assertEquals("vjnn", model.registryPrivateEndpointConnections().get(0).id());
        Assertions.assertEquals("agfyvrtpqpe", model.registryPrivateEndpointConnections().get(0).location());
        Assertions.assertEquals("gkrepdqhqyhw", model.registryPrivateEndpointConnections().get(0).groupIds().get(0));
        Assertions.assertEquals("eoh",
            model.registryPrivateEndpointConnections().get(0).privateEndpoint().subnetArmId());
        Assertions.assertEquals("zjpcee",
            model.registryPrivateEndpointConnections()
                .get(0)
                .registryPrivateLinkServiceConnectionState()
                .actionsRequired());
        Assertions.assertEquals("zangprbfaxyxzlbc",
            model.registryPrivateEndpointConnections()
                .get(0)
                .registryPrivateLinkServiceConnectionState()
                .description());
        Assertions.assertEquals(EndpointServiceConnectionStatus.APPROVED,
            model.registryPrivateEndpointConnections().get(0).registryPrivateLinkServiceConnectionState().status());
        Assertions.assertEquals("sexroqrndkt", model.registryPrivateEndpointConnections().get(0).provisioningState());
        Assertions.assertEquals("gq", model.publicNetworkAccess());
        Assertions.assertEquals("xbsmtbljje",
            model.regionDetails().get(0).acrDetails().get(0).systemCreatedAcrAccount().acrAccountName());
        Assertions.assertEquals("ci",
            model.regionDetails().get(0).acrDetails().get(0).systemCreatedAcrAccount().acrAccountSku());
        Assertions.assertEquals("jcmrnkfm", model.regionDetails().get(0).location());
        Assertions.assertEquals(false,
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .allowBlobPublicAccess());
        Assertions.assertEquals(false,
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountHnsEnabled());
        Assertions.assertEquals("jnqtqe",
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountName());
        Assertions.assertEquals("j",
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegistryProperties model = new RegistryProperties().withDiscoveryUrl("t")
            .withIntellectualPropertyPublisher("vhyibdrqrsw")
            .withManagedResourceGroup(new ArmResourceId().withResourceId("ubpyrow"))
            .withMlFlowRegistryUri("oxztfwfqch")
            .withRegistryPrivateEndpointConnections(Arrays.asList(
                new RegistryPrivateEndpointConnection().withId("vjnn")
                    .withLocation("agfyvrtpqpe")
                    .withGroupIds(Arrays.asList("gkrepdqhqyhw", "wemvxqabckmze", "xin"))
                    .withPrivateEndpoint(new PrivateEndpointResource().withSubnetArmId("eoh"))
                    .withRegistryPrivateLinkServiceConnectionState(
                        new RegistryPrivateLinkServiceConnectionState().withActionsRequired("zjpcee")
                            .withDescription("zangprbfaxyxzlbc")
                            .withStatus(EndpointServiceConnectionStatus.APPROVED))
                    .withProvisioningState("sexroqrndkt"),
                new RegistryPrivateEndpointConnection().withId("vonfeeqgpkr")
                    .withLocation("tbgnixxowwzkyfw")
                    .withGroupIds(Arrays.asList("wxeiicrmpepk", "dm", "xxij"))
                    .withPrivateEndpoint(new PrivateEndpointResource().withSubnetArmId("ws"))
                    .withRegistryPrivateLinkServiceConnectionState(
                        new RegistryPrivateLinkServiceConnectionState().withActionsRequired("o")
                            .withDescription("woqartwy")
                            .withStatus(EndpointServiceConnectionStatus.APPROVED))
                    .withProvisioningState("l"),
                new RegistryPrivateEndpointConnection().withId("vatdavuqmcbymsf")
                    .withLocation("jlquvjez")
                    .withGroupIds(Arrays.asList("v", "simi", "yoi"))
                    .withPrivateEndpoint(new PrivateEndpointResource().withSubnetArmId("miqwnnrac"))
                    .withRegistryPrivateLinkServiceConnectionState(
                        new RegistryPrivateLinkServiceConnectionState().withActionsRequired("hautw")
                            .withDescription("exzgpmnmabedd")
                            .withStatus(EndpointServiceConnectionStatus.DISCONNECTED))
                    .withProvisioningState("gdfpfqfpcvst")))
            .withPublicNetworkAccess("gq")
            .withRegionDetails(Arrays.asList(new RegistryRegionArmDetails()
                .withAcrDetails(Arrays.asList(
                    new AcrDetails()
                        .withSystemCreatedAcrAccount(new SystemCreatedAcrAccount().withAcrAccountName("xbsmtbljje")
                            .withAcrAccountSku("ci")
                            .withArmResourceId(new ArmResourceId()))
                        .withUserCreatedAcrAccount(new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId())),
                    new AcrDetails()
                        .withSystemCreatedAcrAccount(new SystemCreatedAcrAccount().withAcrAccountName("tbrekqhsqhtf")
                            .withAcrAccountSku("pqbye")
                            .withArmResourceId(new ArmResourceId()))
                        .withUserCreatedAcrAccount(new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId())),
                    new AcrDetails()
                        .withSystemCreatedAcrAccount(new SystemCreatedAcrAccount().withAcrAccountName("dqigmg")
                            .withAcrAccountSku("inztxl")
                            .withArmResourceId(new ArmResourceId()))
                        .withUserCreatedAcrAccount(new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId()))))
                .withLocation("jcmrnkfm")
                .withStorageAccountDetails(
                    Arrays
                        .asList(
                            new StorageAccountDetails()
                                .withSystemCreatedStorageAccount(new SystemCreatedStorageAccount()
                                    .withAllowBlobPublicAccess(false)
                                    .withArmResourceId(new ArmResourceId())
                                    .withStorageAccountHnsEnabled(false)
                                    .withStorageAccountName("jnqtqe")
                                    .withStorageAccountType("j"))
                                .withUserCreatedStorageAccount(
                                    new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId())),
                            new StorageAccountDetails()
                                .withSystemCreatedStorageAccount(
                                    new SystemCreatedStorageAccount()
                                        .withAllowBlobPublicAccess(true)
                                        .withArmResourceId(new ArmResourceId())
                                        .withStorageAccountHnsEnabled(false)
                                        .withStorageAccountName("dxe")
                                        .withStorageAccountType("h"))
                                .withUserCreatedStorageAccount(new UserCreatedStorageAccount()
                                    .withArmResourceId(new ArmResourceId())),
                            new StorageAccountDetails()
                                .withSystemCreatedStorageAccount(
                                    new SystemCreatedStorageAccount()
                                        .withAllowBlobPublicAccess(false)
                                        .withArmResourceId(new ArmResourceId())
                                        .withStorageAccountHnsEnabled(true)
                                        .withStorageAccountName("k")
                                        .withStorageAccountType("kqynspgbvo"))
                                .withUserCreatedStorageAccount(
                                    new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId())),
                            new StorageAccountDetails()
                                .withSystemCreatedStorageAccount(
                                    new SystemCreatedStorageAccount().withAllowBlobPublicAccess(false)
                                        .withArmResourceId(new ArmResourceId())
                                        .withStorageAccountHnsEnabled(true)
                                        .withStorageAccountName("exqokmy")
                                        .withStorageAccountType("jialz"))
                                .withUserCreatedStorageAccount(
                                    new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId())))),
                new RegistryRegionArmDetails()
                    .withAcrDetails(Arrays.asList(
                        new AcrDetails()
                            .withSystemCreatedAcrAccount(
                                new SystemCreatedAcrAccount().withAcrAccountName("pbcjtrpzuyudivbx")
                                    .withAcrAccountSku("sqeaeonqelwg")
                                    .withArmResourceId(new ArmResourceId()))
                            .withUserCreatedAcrAccount(
                                new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId())),
                        new AcrDetails()
                            .withSystemCreatedAcrAccount(new SystemCreatedAcrAccount().withAcrAccountName("y")
                                .withAcrAccountSku("arogatmolji")
                                .withArmResourceId(new ArmResourceId()))
                            .withUserCreatedAcrAccount(
                                new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId())),
                        new AcrDetails()
                            .withSystemCreatedAcrAccount(new SystemCreatedAcrAccount().withAcrAccountName("mzvfkneerz")
                                .withAcrAccountSku("rknsjulug")
                                .withArmResourceId(new ArmResourceId()))
                            .withUserCreatedAcrAccount(
                                new UserCreatedAcrAccount().withArmResourceId(new ArmResourceId()))))
                    .withLocation("rxle")
                    .withStorageAccountDetails(Arrays.asList(
                        new StorageAccountDetails()
                            .withSystemCreatedStorageAccount(
                                new SystemCreatedStorageAccount().withAllowBlobPublicAccess(false)
                                    .withArmResourceId(new ArmResourceId())
                                    .withStorageAccountHnsEnabled(false)
                                    .withStorageAccountName("ihtd")
                                    .withStorageAccountType("wjekptycaydbj"))
                            .withUserCreatedStorageAccount(
                                new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId())),
                        new StorageAccountDetails()
                            .withSystemCreatedStorageAccount(
                                new SystemCreatedStorageAccount().withAllowBlobPublicAccess(false)
                                    .withArmResourceId(new ArmResourceId())
                                    .withStorageAccountHnsEnabled(false)
                                    .withStorageAccountName("hmhsurlgwqkpm")
                                    .withStorageAccountType("pstauol"))
                            .withUserCreatedStorageAccount(
                                new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId()))))));
        model = BinaryData.fromObject(model).toObject(RegistryProperties.class);
        Assertions.assertEquals("t", model.discoveryUrl());
        Assertions.assertEquals("vhyibdrqrsw", model.intellectualPropertyPublisher());
        Assertions.assertEquals("ubpyrow", model.managedResourceGroup().resourceId());
        Assertions.assertEquals("oxztfwfqch", model.mlFlowRegistryUri());
        Assertions.assertEquals("vjnn", model.registryPrivateEndpointConnections().get(0).id());
        Assertions.assertEquals("agfyvrtpqpe", model.registryPrivateEndpointConnections().get(0).location());
        Assertions.assertEquals("gkrepdqhqyhw", model.registryPrivateEndpointConnections().get(0).groupIds().get(0));
        Assertions.assertEquals("eoh",
            model.registryPrivateEndpointConnections().get(0).privateEndpoint().subnetArmId());
        Assertions.assertEquals("zjpcee",
            model.registryPrivateEndpointConnections()
                .get(0)
                .registryPrivateLinkServiceConnectionState()
                .actionsRequired());
        Assertions.assertEquals("zangprbfaxyxzlbc",
            model.registryPrivateEndpointConnections()
                .get(0)
                .registryPrivateLinkServiceConnectionState()
                .description());
        Assertions.assertEquals(EndpointServiceConnectionStatus.APPROVED,
            model.registryPrivateEndpointConnections().get(0).registryPrivateLinkServiceConnectionState().status());
        Assertions.assertEquals("sexroqrndkt", model.registryPrivateEndpointConnections().get(0).provisioningState());
        Assertions.assertEquals("gq", model.publicNetworkAccess());
        Assertions.assertEquals("xbsmtbljje",
            model.regionDetails().get(0).acrDetails().get(0).systemCreatedAcrAccount().acrAccountName());
        Assertions.assertEquals("ci",
            model.regionDetails().get(0).acrDetails().get(0).systemCreatedAcrAccount().acrAccountSku());
        Assertions.assertEquals("jcmrnkfm", model.regionDetails().get(0).location());
        Assertions.assertEquals(false,
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .allowBlobPublicAccess());
        Assertions.assertEquals(false,
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountHnsEnabled());
        Assertions.assertEquals("jnqtqe",
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountName());
        Assertions.assertEquals("j",
            model.regionDetails()
                .get(0)
                .storageAccountDetails()
                .get(0)
                .systemCreatedStorageAccount()
                .storageAccountType());
    }
}
