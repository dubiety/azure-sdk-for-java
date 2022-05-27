// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.models.AccessTier;
import com.azure.resourcemanager.storage.models.AllowedCopyScope;
import com.azure.resourcemanager.storage.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.storage.models.CustomDomain;
import com.azure.resourcemanager.storage.models.DnsEndpointType;
import com.azure.resourcemanager.storage.models.Encryption;
import com.azure.resourcemanager.storage.models.ImmutableStorageAccount;
import com.azure.resourcemanager.storage.models.KeyPolicy;
import com.azure.resourcemanager.storage.models.LargeFileSharesState;
import com.azure.resourcemanager.storage.models.MinimumTlsVersion;
import com.azure.resourcemanager.storage.models.NetworkRuleSet;
import com.azure.resourcemanager.storage.models.PublicNetworkAccess;
import com.azure.resourcemanager.storage.models.RoutingPreference;
import com.azure.resourcemanager.storage.models.SasPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to create the storage account. */
@Fluent
public final class StorageAccountPropertiesCreateParameters {
    /*
     * Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     */
    @JsonProperty(value = "allowedCopyScope")
    private AllowedCopyScope allowedCopyScope;

    /*
     * Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * SasPolicy assigned to the storage account.
     */
    @JsonProperty(value = "sasPolicy")
    private SasPolicy sasPolicy;

    /*
     * KeyPolicy assigned to the storage account.
     */
    @JsonProperty(value = "keyPolicy")
    private KeyPolicy keyPolicy;

    /*
     * User domain assigned to the storage account. Name is the CNAME source.
     * Only one custom domain is supported per storage account at this time. To
     * clear the existing custom domain, use an empty string for the custom
     * domain name property.
     */
    @JsonProperty(value = "customDomain")
    private CustomDomain customDomain;

    /*
     * Encryption settings to be used for server-side encryption for the
     * storage account.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * Network rule set
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkRuleSet;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * is used for billing. The 'Premium' access tier is the default value for
     * premium block blobs storage account type and it cannot be changed for
     * the premium block blobs storage account type.
     */
    @JsonProperty(value = "accessTier")
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     */
    @JsonProperty(value = "supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Enables Secure File Transfer Protocol, if set to true
     */
    @JsonProperty(value = "isSftpEnabled")
    private Boolean isSftpEnabled;

    /*
     * Enables local users feature, if set to true
     */
    @JsonProperty(value = "isLocalUserEnabled")
    private Boolean isLocalUserEnabled;

    /*
     * Account HierarchicalNamespace enabled if sets to true.
     */
    @JsonProperty(value = "isHnsEnabled")
    private Boolean isHnsEnabled;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "routingPreference")
    private RoutingPreference routingPreference;

    /*
     * Allow or disallow public access to all blobs or containers in the
     * storage account. The default interpretation is true for this property.
     */
    @JsonProperty(value = "allowBlobPublicAccess")
    private Boolean allowBlobPublicAccess;

    /*
     * Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     */
    @JsonProperty(value = "minimumTlsVersion")
    private MinimumTlsVersion minimumTlsVersion;

    /*
     * Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests,
     * including shared access signatures, must be authorized with Azure Active
     * Directory (Azure AD). The default value is null, which is equivalent to
     * true.
     */
    @JsonProperty(value = "allowSharedKeyAccess")
    private Boolean allowSharedKeyAccess;

    /*
     * NFS 3.0 protocol support enabled if set to true.
     */
    @JsonProperty(value = "isNfsV3Enabled")
    private Boolean enableNfsV3;

    /*
     * Allow or disallow cross AAD tenant object replication. The default
     * interpretation is true for this property.
     */
    @JsonProperty(value = "allowCrossTenantReplication")
    private Boolean allowCrossTenantReplication;

    /*
     * A boolean flag which indicates whether the default authentication is
     * OAuth or not. The default interpretation is false for this property.
     */
    @JsonProperty(value = "defaultToOAuthAuthentication")
    private Boolean defaultToOAuthAuthentication;

    /*
     * The property is immutable and can only be set to true at the account
     * creation time. When set to true, it enables object level immutability
     * for all the new containers in the account by default.
     */
    @JsonProperty(value = "immutableStorageWithVersioning")
    private ImmutableStorageAccount immutableStorageWithVersioning;

    /*
     * Allows you to specify the type of endpoint. Set this to AzureDNSZone to
     * create a large number of accounts in a single subscription, which
     * creates accounts in an Azure DNS Zone and the endpoint URL will have an
     * alphanumeric DNS Zone identifier.
     */
    @JsonProperty(value = "dnsEndpointType")
    private DnsEndpointType dnsEndpointType;

    /**
     * Get the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     *
     * @return the allowedCopyScope value.
     */
    public AllowedCopyScope allowedCopyScope() {
        return this.allowedCopyScope;
    }

    /**
     * Set the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     *
     * @param allowedCopyScope the allowedCopyScope value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAllowedCopyScope(AllowedCopyScope allowedCopyScope) {
        this.allowedCopyScope = allowedCopyScope;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the sasPolicy property: SasPolicy assigned to the storage account.
     *
     * @return the sasPolicy value.
     */
    public SasPolicy sasPolicy() {
        return this.sasPolicy;
    }

    /**
     * Set the sasPolicy property: SasPolicy assigned to the storage account.
     *
     * @param sasPolicy the sasPolicy value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withSasPolicy(SasPolicy sasPolicy) {
        this.sasPolicy = sasPolicy;
        return this;
    }

    /**
     * Get the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @return the keyPolicy value.
     */
    public KeyPolicy keyPolicy() {
        return this.keyPolicy;
    }

    /**
     * Set the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @param keyPolicy the keyPolicy value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withKeyPolicy(KeyPolicy keyPolicy) {
        this.keyPolicy = keyPolicy;
        return this;
    }

    /**
     * Get the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption property: Encryption settings to be used for server-side encryption for the storage account.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption settings to be used for server-side encryption for the storage account.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier is used for
     * billing. The 'Premium' access tier is the default value for premium block blobs storage account type and it
     * cannot be changed for the premium block blobs storage account type.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier is used for
     * billing. The 'Premium' access tier is the default value for premium block blobs storage account type and it
     * cannot be changed for the premium block blobs storage account type.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     *
     * @return the isSftpEnabled value.
     */
    public Boolean isSftpEnabled() {
        return this.isSftpEnabled;
    }

    /**
     * Set the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     *
     * @param isSftpEnabled the isSftpEnabled value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withIsSftpEnabled(Boolean isSftpEnabled) {
        this.isSftpEnabled = isSftpEnabled;
        return this;
    }

    /**
     * Get the isLocalUserEnabled property: Enables local users feature, if set to true.
     *
     * @return the isLocalUserEnabled value.
     */
    public Boolean isLocalUserEnabled() {
        return this.isLocalUserEnabled;
    }

    /**
     * Set the isLocalUserEnabled property: Enables local users feature, if set to true.
     *
     * @param isLocalUserEnabled the isLocalUserEnabled value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withIsLocalUserEnabled(Boolean isLocalUserEnabled) {
        this.isLocalUserEnabled = isLocalUserEnabled;
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.isHnsEnabled;
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withIsHnsEnabled(Boolean isHnsEnabled) {
        this.isHnsEnabled = isHnsEnabled;
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.largeFileSharesState;
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withLargeFileSharesState(
        LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.routingPreference;
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.allowSharedKeyAccess;
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        return this;
    }

    /**
     * Get the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @return the enableNfsV3 value.
     */
    public Boolean enableNfsV3() {
        return this.enableNfsV3;
    }

    /**
     * Set the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     *
     * @param enableNfsV3 the enableNfsV3 value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withEnableNfsV3(Boolean enableNfsV3) {
        this.enableNfsV3 = enableNfsV3;
        return this;
    }

    /**
     * Get the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. The default
     * interpretation is true for this property.
     *
     * @return the allowCrossTenantReplication value.
     */
    public Boolean allowCrossTenantReplication() {
        return this.allowCrossTenantReplication;
    }

    /**
     * Set the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. The default
     * interpretation is true for this property.
     *
     * @param allowCrossTenantReplication the allowCrossTenantReplication value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withAllowCrossTenantReplication(
        Boolean allowCrossTenantReplication) {
        this.allowCrossTenantReplication = allowCrossTenantReplication;
        return this;
    }

    /**
     * Get the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     *
     * @return the defaultToOAuthAuthentication value.
     */
    public Boolean defaultToOAuthAuthentication() {
        return this.defaultToOAuthAuthentication;
    }

    /**
     * Set the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     *
     * @param defaultToOAuthAuthentication the defaultToOAuthAuthentication value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withDefaultToOAuthAuthentication(
        Boolean defaultToOAuthAuthentication) {
        this.defaultToOAuthAuthentication = defaultToOAuthAuthentication;
        return this;
    }

    /**
     * Get the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the new containers in the
     * account by default.
     *
     * @return the immutableStorageWithVersioning value.
     */
    public ImmutableStorageAccount immutableStorageWithVersioning() {
        return this.immutableStorageWithVersioning;
    }

    /**
     * Set the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the new containers in the
     * account by default.
     *
     * @param immutableStorageWithVersioning the immutableStorageWithVersioning value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withImmutableStorageWithVersioning(
        ImmutableStorageAccount immutableStorageWithVersioning) {
        this.immutableStorageWithVersioning = immutableStorageWithVersioning;
        return this;
    }

    /**
     * Get the dnsEndpointType property: Allows you to specify the type of endpoint. Set this to AzureDNSZone to create
     * a large number of accounts in a single subscription, which creates accounts in an Azure DNS Zone and the endpoint
     * URL will have an alphanumeric DNS Zone identifier.
     *
     * @return the dnsEndpointType value.
     */
    public DnsEndpointType dnsEndpointType() {
        return this.dnsEndpointType;
    }

    /**
     * Set the dnsEndpointType property: Allows you to specify the type of endpoint. Set this to AzureDNSZone to create
     * a large number of accounts in a single subscription, which creates accounts in an Azure DNS Zone and the endpoint
     * URL will have an alphanumeric DNS Zone identifier.
     *
     * @param dnsEndpointType the dnsEndpointType value to set.
     * @return the StorageAccountPropertiesCreateParameters object itself.
     */
    public StorageAccountPropertiesCreateParameters withDnsEndpointType(DnsEndpointType dnsEndpointType) {
        this.dnsEndpointType = dnsEndpointType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasPolicy() != null) {
            sasPolicy().validate();
        }
        if (keyPolicy() != null) {
            keyPolicy().validate();
        }
        if (customDomain() != null) {
            customDomain().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (azureFilesIdentityBasedAuthentication() != null) {
            azureFilesIdentityBasedAuthentication().validate();
        }
        if (routingPreference() != null) {
            routingPreference().validate();
        }
        if (immutableStorageWithVersioning() != null) {
            immutableStorageWithVersioning().validate();
        }
    }
}
