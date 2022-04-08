// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobFSLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Data Lake Storage Gen2 linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFS")
@Fluent
public final class AzureBlobFSLinkedService extends LinkedService {
    /*
     * Azure Data Lake Storage Gen2 linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureBlobFSLinkedServiceTypeProperties innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Azure Data Lake Storage Gen2 linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureBlobFSLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with
     * resultType string).
     *
     * @param url the url value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @return the accountKey value.
     */
    public Object accountKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountKey();
    }

    /**
     * Set the accountKey property: Account key for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withAccountKey(Object accountKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Storage Gen2 account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().azureCloudType();
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withAzureCloudType(Object azureCloudType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAzureCloudType(azureCloudType);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredentialType();
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredentialType(servicePrincipalCredentialType);
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredential();
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredential(servicePrincipalCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AzureBlobFSLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBlobFSLinkedService.class);
}
