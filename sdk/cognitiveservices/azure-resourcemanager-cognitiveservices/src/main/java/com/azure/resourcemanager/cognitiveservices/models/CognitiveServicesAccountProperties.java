// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Cognitive Services account. */
@Fluent
public final class CognitiveServicesAccountProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CognitiveServicesAccountProperties.class);

    /*
     * Gets the status of the cognitive services account at the time the
     * operation was called.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Endpoint of the created account.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * The internal identifier.
     */
    @JsonProperty(value = "internalId", access = JsonProperty.Access.WRITE_ONLY)
    private String internalId;

    /*
     * Gets the capabilities of the cognitive services account. Each item
     * indicates the capability of a specific feature. The values are read-only
     * and for reference only.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuCapability> capabilities;

    /*
     * If the resource is migrated from an existing key.
     */
    @JsonProperty(value = "isMigrated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isMigrated;

    /*
     * Sku change info of account.
     */
    @JsonProperty(value = "skuChangeInfo", access = JsonProperty.Access.WRITE_ONLY)
    private CognitiveServicesAccountSkuChangeInfo skuChangeInfo;

    /*
     * Optional subdomain name used for token-based authentication.
     */
    @JsonProperty(value = "customSubDomainName")
    private String customSubDomainName;

    /*
     * A collection of rules governing the accessibility from specific network
     * locations.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /*
     * The encryption properties for this resource.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "userOwnedStorage")
    private List<UserOwnedStorage> userOwnedStorage;

    /*
     * The private endpoint connection associated with the Cognitive Services
     * account.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Whether or not public endpoint access is allowed for this account. Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The api properties for special APIs.
     */
    @JsonProperty(value = "apiProperties")
    private CognitiveServicesAccountApiProperties apiProperties;

    /*
     * Gets the date of cognitive services account creation.
     */
    @JsonProperty(value = "dateCreated", access = JsonProperty.Access.WRITE_ONLY)
    private String dateCreated;

    /**
     * Get the provisioningState property: Gets the status of the cognitive services account at the time the operation
     * was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the endpoint property: Endpoint of the created account.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the internalId property: The internal identifier.
     *
     * @return the internalId value.
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Get the capabilities property: Gets the capabilities of the cognitive services account. Each item indicates the
     * capability of a specific feature. The values are read-only and for reference only.
     *
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the isMigrated property: If the resource is migrated from an existing key.
     *
     * @return the isMigrated value.
     */
    public Boolean isMigrated() {
        return this.isMigrated;
    }

    /**
     * Get the skuChangeInfo property: Sku change info of account.
     *
     * @return the skuChangeInfo value.
     */
    public CognitiveServicesAccountSkuChangeInfo skuChangeInfo() {
        return this.skuChangeInfo;
    }

    /**
     * Get the customSubDomainName property: Optional subdomain name used for token-based authentication.
     *
     * @return the customSubDomainName value.
     */
    public String customSubDomainName() {
        return this.customSubDomainName;
    }

    /**
     * Set the customSubDomainName property: Optional subdomain name used for token-based authentication.
     *
     * @param customSubDomainName the customSubDomainName value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withCustomSubDomainName(String customSubDomainName) {
        this.customSubDomainName = customSubDomainName;
        return this;
    }

    /**
     * Get the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the encryption property: The encryption properties for this resource.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption properties for this resource.
     *
     * @param encryption the encryption value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the userOwnedStorage property: The storage accounts for this resource.
     *
     * @return the userOwnedStorage value.
     */
    public List<UserOwnedStorage> userOwnedStorage() {
        return this.userOwnedStorage;
    }

    /**
     * Set the userOwnedStorage property: The storage accounts for this resource.
     *
     * @param userOwnedStorage the userOwnedStorage value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withUserOwnedStorage(List<UserOwnedStorage> userOwnedStorage) {
        this.userOwnedStorage = userOwnedStorage;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The private endpoint connection associated with the Cognitive
     * Services account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: The private endpoint connection associated with the Cognitive
     * Services account.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the apiProperties property: The api properties for special APIs.
     *
     * @return the apiProperties value.
     */
    public CognitiveServicesAccountApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: The api properties for special APIs.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the CognitiveServicesAccountProperties object itself.
     */
    public CognitiveServicesAccountProperties withApiProperties(CognitiveServicesAccountApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the dateCreated property: Gets the date of cognitive services account creation.
     *
     * @return the dateCreated value.
     */
    public String dateCreated() {
        return this.dateCreated;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (skuChangeInfo() != null) {
            skuChangeInfo().validate();
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (userOwnedStorage() != null) {
            userOwnedStorage().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
    }
}
