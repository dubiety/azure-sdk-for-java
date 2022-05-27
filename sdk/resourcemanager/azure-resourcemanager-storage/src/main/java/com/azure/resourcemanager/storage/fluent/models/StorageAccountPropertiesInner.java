// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.models.AccessTier;
import com.azure.resourcemanager.storage.models.AccountStatus;
import com.azure.resourcemanager.storage.models.AllowedCopyScope;
import com.azure.resourcemanager.storage.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.storage.models.CustomDomain;
import com.azure.resourcemanager.storage.models.DnsEndpointType;
import com.azure.resourcemanager.storage.models.Encryption;
import com.azure.resourcemanager.storage.models.Endpoints;
import com.azure.resourcemanager.storage.models.GeoReplicationStats;
import com.azure.resourcemanager.storage.models.ImmutableStorageAccount;
import com.azure.resourcemanager.storage.models.KeyCreationTime;
import com.azure.resourcemanager.storage.models.KeyPolicy;
import com.azure.resourcemanager.storage.models.LargeFileSharesState;
import com.azure.resourcemanager.storage.models.MinimumTlsVersion;
import com.azure.resourcemanager.storage.models.NetworkRuleSet;
import com.azure.resourcemanager.storage.models.ProvisioningState;
import com.azure.resourcemanager.storage.models.PublicNetworkAccess;
import com.azure.resourcemanager.storage.models.RoutingPreference;
import com.azure.resourcemanager.storage.models.SasPolicy;
import com.azure.resourcemanager.storage.models.StorageAccountSkuConversionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of the storage account. */
@Fluent
public final class StorageAccountPropertiesInner {
    /*
     * Gets the status of the storage account at the time the operation was
     * called.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object. Note that Standard_ZRS and Premium_LRS accounts
     * only return the blob endpoint.
     */
    @JsonProperty(value = "primaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints primaryEndpoints;

    /*
     * Gets the location of the primary data center for the storage account.
     */
    @JsonProperty(value = "primaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryLocation;

    /*
     * Gets the status indicating whether the primary location of the storage
     * account is available or unavailable.
     */
    @JsonProperty(value = "statusOfPrimary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfPrimary;

    /*
     * Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This
     * element is not returned if there has never been a failover instance.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     */
    @JsonProperty(value = "lastGeoFailoverTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastGeoFailoverTime;

    /*
     * Gets the location of the geo-replicated secondary for the storage
     * account. Only available if the accountType is Standard_GRS or
     * Standard_RAGRS.
     */
    @JsonProperty(value = "secondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryLocation;

    /*
     * Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is
     * Standard_GRS or Standard_RAGRS.
     */
    @JsonProperty(value = "statusOfSecondary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfSecondary;

    /*
     * Gets the creation date and time of the storage account in UTC.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the custom domain the user assigned to this storage account.
     */
    @JsonProperty(value = "customDomain", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomain customDomain;

    /*
     * SasPolicy assigned to the storage account.
     */
    @JsonProperty(value = "sasPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private SasPolicy sasPolicy;

    /*
     * KeyPolicy assigned to the storage account.
     */
    @JsonProperty(value = "keyPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private KeyPolicy keyPolicy;

    /*
     * Storage account keys creation time.
     */
    @JsonProperty(value = "keyCreationTime", access = JsonProperty.Access.WRITE_ONLY)
    private KeyCreationTime keyCreationTime;

    /*
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object from the secondary location of the storage
     * account. Only available if the SKU name is Standard_RAGRS.
     */
    @JsonProperty(value = "secondaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints secondaryEndpoints;

    /*
     * Encryption settings to be used for server-side encryption for the
     * storage account.
     */
    @JsonProperty(value = "encryption", access = JsonProperty.Access.WRITE_ONLY)
    private Encryption encryption;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * is used for billing. The 'Premium' access tier is the default value for
     * premium block blobs storage account type and it cannot be changed for
     * the premium block blobs storage account type.
     */
    @JsonProperty(value = "accessTier", access = JsonProperty.Access.WRITE_ONLY)
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Network rule set
     */
    @JsonProperty(value = "networkAcls", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkRuleSet networkRuleSet;

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
     * Geo Replication Stats
     */
    @JsonProperty(value = "geoReplicationStats", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationStats geoReplicationStats;

    /*
     * If the failover is in progress, the value will be true, otherwise, it
     * will be null.
     */
    @JsonProperty(value = "failoverInProgress", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean failoverInProgress;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * List of private endpoint connection associated with the specified
     * storage account
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "routingPreference")
    private RoutingPreference routingPreference;

    /*
     * Blob restore status
     */
    @JsonProperty(value = "blobRestoreStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BlobRestoreStatusInner blobRestoreStatus;

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
     * Allow or disallow public network access to Storage Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The property is immutable and can only be set to true at the account
     * creation time. When set to true, it enables object level immutability
     * for all the containers in the account by default.
     */
    @JsonProperty(value = "immutableStorageWithVersioning")
    private ImmutableStorageAccount immutableStorageWithVersioning;

    /*
     * Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     */
    @JsonProperty(value = "allowedCopyScope")
    private AllowedCopyScope allowedCopyScope;

    /*
     * This property is readOnly and is set by server during asynchronous
     * storage account sku conversion operations.
     */
    @JsonProperty(value = "storageAccountSkuConversionStatus")
    private StorageAccountSkuConversionStatus storageAccountSkuConversionStatus;

    /*
     * Allows you to specify the type of endpoint. Set this to AzureDNSZone to
     * create a large number of accounts in a single subscription, which
     * creates accounts in an Azure DNS Zone and the endpoint URL will have an
     * alphanumeric DNS Zone identifier.
     */
    @JsonProperty(value = "dnsEndpointType")
    private DnsEndpointType dnsEndpointType;

    /**
     * Get the provisioningState property: Gets the status of the storage account at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the primaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue, or
     * table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     *
     * @return the primaryEndpoints value.
     */
    public Endpoints primaryEndpoints() {
        return this.primaryEndpoints;
    }

    /**
     * Get the primaryLocation property: Gets the location of the primary data center for the storage account.
     *
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Get the statusOfPrimary property: Gets the status indicating whether the primary location of the storage account
     * is available or unavailable.
     *
     * @return the statusOfPrimary value.
     */
    public AccountStatus statusOfPrimary() {
        return this.statusOfPrimary;
    }

    /**
     * Get the lastGeoFailoverTime property: Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This element is not returned if there has never
     * been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the lastGeoFailoverTime value.
     */
    public OffsetDateTime lastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }

    /**
     * Get the secondaryLocation property: Gets the location of the geo-replicated secondary for the storage account.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the secondaryLocation value.
     */
    public String secondaryLocation() {
        return this.secondaryLocation;
    }

    /**
     * Get the statusOfSecondary property: Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     *
     * @return the statusOfSecondary value.
     */
    public AccountStatus statusOfSecondary() {
        return this.statusOfSecondary;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the storage account in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the customDomain property: Gets the custom domain the user assigned to this storage account.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.customDomain;
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
     * Get the keyPolicy property: KeyPolicy assigned to the storage account.
     *
     * @return the keyPolicy value.
     */
    public KeyPolicy keyPolicy() {
        return this.keyPolicy;
    }

    /**
     * Get the keyCreationTime property: Storage account keys creation time.
     *
     * @return the keyCreationTime value.
     */
    public KeyCreationTime keyCreationTime() {
        return this.keyCreationTime;
    }

    /**
     * Get the secondaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue,
     * or table object from the secondary location of the storage account. Only available if the SKU name is
     * Standard_RAGRS.
     *
     * @return the secondaryEndpoints value.
     */
    public Endpoints secondaryEndpoints() {
        return this.secondaryEndpoints;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withIsSftpEnabled(Boolean isSftpEnabled) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withIsLocalUserEnabled(Boolean isLocalUserEnabled) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withIsHnsEnabled(Boolean isHnsEnabled) {
        this.isHnsEnabled = isHnsEnabled;
        return this;
    }

    /**
     * Get the geoReplicationStats property: Geo Replication Stats.
     *
     * @return the geoReplicationStats value.
     */
    public GeoReplicationStats geoReplicationStats() {
        return this.geoReplicationStats;
    }

    /**
     * Get the failoverInProgress property: If the failover is in progress, the value will be true, otherwise, it will
     * be null.
     *
     * @return the failoverInProgress value.
     */
    public Boolean failoverInProgress() {
        return this.failoverInProgress;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * storage account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }

    /**
     * Get the blobRestoreStatus property: Blob restore status.
     *
     * @return the blobRestoreStatus value.
     */
    public BlobRestoreStatusInner blobRestoreStatus() {
        return this.blobRestoreStatus;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withEnableNfsV3(Boolean enableNfsV3) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withAllowCrossTenantReplication(Boolean allowCrossTenantReplication) {
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withDefaultToOAuthAuthentication(Boolean defaultToOAuthAuthentication) {
        this.defaultToOAuthAuthentication = defaultToOAuthAuthentication;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the containers in the
     * account by default.
     *
     * @return the immutableStorageWithVersioning value.
     */
    public ImmutableStorageAccount immutableStorageWithVersioning() {
        return this.immutableStorageWithVersioning;
    }

    /**
     * Set the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the containers in the
     * account by default.
     *
     * @param immutableStorageWithVersioning the immutableStorageWithVersioning value to set.
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withImmutableStorageWithVersioning(
        ImmutableStorageAccount immutableStorageWithVersioning) {
        this.immutableStorageWithVersioning = immutableStorageWithVersioning;
        return this;
    }

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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withAllowedCopyScope(AllowedCopyScope allowedCopyScope) {
        this.allowedCopyScope = allowedCopyScope;
        return this;
    }

    /**
     * Get the storageAccountSkuConversionStatus property: This property is readOnly and is set by server during
     * asynchronous storage account sku conversion operations.
     *
     * @return the storageAccountSkuConversionStatus value.
     */
    public StorageAccountSkuConversionStatus storageAccountSkuConversionStatus() {
        return this.storageAccountSkuConversionStatus;
    }

    /**
     * Set the storageAccountSkuConversionStatus property: This property is readOnly and is set by server during
     * asynchronous storage account sku conversion operations.
     *
     * @param storageAccountSkuConversionStatus the storageAccountSkuConversionStatus value to set.
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withStorageAccountSkuConversionStatus(
        StorageAccountSkuConversionStatus storageAccountSkuConversionStatus) {
        this.storageAccountSkuConversionStatus = storageAccountSkuConversionStatus;
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
     * @return the StorageAccountPropertiesInner object itself.
     */
    public StorageAccountPropertiesInner withDnsEndpointType(DnsEndpointType dnsEndpointType) {
        this.dnsEndpointType = dnsEndpointType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (primaryEndpoints() != null) {
            primaryEndpoints().validate();
        }
        if (customDomain() != null) {
            customDomain().validate();
        }
        if (sasPolicy() != null) {
            sasPolicy().validate();
        }
        if (keyPolicy() != null) {
            keyPolicy().validate();
        }
        if (keyCreationTime() != null) {
            keyCreationTime().validate();
        }
        if (secondaryEndpoints() != null) {
            secondaryEndpoints().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (azureFilesIdentityBasedAuthentication() != null) {
            azureFilesIdentityBasedAuthentication().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (geoReplicationStats() != null) {
            geoReplicationStats().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (routingPreference() != null) {
            routingPreference().validate();
        }
        if (blobRestoreStatus() != null) {
            blobRestoreStatus().validate();
        }
        if (immutableStorageWithVersioning() != null) {
            immutableStorageWithVersioning().validate();
        }
        if (storageAccountSkuConversionStatus() != null) {
            storageAccountSkuConversionStatus().validate();
        }
    }
}
