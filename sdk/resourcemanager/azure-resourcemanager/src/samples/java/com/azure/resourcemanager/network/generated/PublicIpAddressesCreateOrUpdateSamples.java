// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.models.PublicIpAddressDnsSettingsDomainNameLabelScope;
import com.azure.resourcemanager.network.models.PublicIpAddressSku;
import com.azure.resourcemanager.network.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.network.models.PublicIpAddressSkuTier;

/** Samples for PublicIpAddresses CreateOrUpdate. */
public final class PublicIpAddressesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/PublicIpAddressCreateDns.json
     */
    /**
     * Sample code: Create public IP address DNS.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPublicIPAddressDNS(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(
                "rg1",
                "test-ip",
                new PublicIpAddressInner()
                    .withLocation("eastus")
                    .withDnsSettings(new PublicIpAddressDnsSettings().withDomainNameLabel("dnslbl")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/PublicIpAddressCreateCustomizedValues.json
     */
    /**
     * Sample code: Create public IP address allocation method.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPublicIPAddressAllocationMethod(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(
                "rg1",
                "test-ip",
                new PublicIpAddressInner()
                    .withLocation("eastus")
                    .withSku(
                        new PublicIpAddressSku()
                            .withName(PublicIpAddressSkuName.STANDARD)
                            .withTier(PublicIpAddressSkuTier.GLOBAL))
                    .withPublicIpAllocationMethod(IpAllocationMethod.STATIC)
                    .withPublicIpAddressVersion(IpVersion.IPV4)
                    .withIdleTimeoutInMinutes(10),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/PublicIpAddressCreateDefaults.json
     */
    /**
     * Sample code: Create public IP address defaults.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPublicIPAddressDefaults(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(
                "rg1", "test-ip", new PublicIpAddressInner().withLocation("eastus"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/PublicIpAddressCreateDnsWithDomainNameLabelScope.json
     */
    /**
     * Sample code: Create public IP address DNS with Domain Name Label Scope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPublicIPAddressDNSWithDomainNameLabelScope(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(
                "rg1",
                "test-ip",
                new PublicIpAddressInner()
                    .withLocation("eastus")
                    .withDnsSettings(
                        new PublicIpAddressDnsSettings()
                            .withDomainNameLabel("dnslbl")
                            .withDomainNameLabelScope(PublicIpAddressDnsSettingsDomainNameLabelScope.TENANT_REUSE)),
                com.azure.core.util.Context.NONE);
    }
}
