// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.SqlAlwaysEncryptedProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure SQL Managed Instance linked service properties. */
@Fluent
public final class AzureSqlMILinkedServiceTypeProperties {
    /*
     * The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString", required = true)
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "password")
    private AzureKeyVaultSecretReference password;

    /*
     * The ID of the service principal used to authenticate against Azure SQL
     * Managed Instance. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure SQL
     * Managed Instance.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tenant")
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed
     * values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany.
     * Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "azureCloudType")
    private Object azureCloudType;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * Sql always encrypted properties.
     */
    @JsonProperty(value = "alwaysEncryptedSettings")
    private SqlAlwaysEncryptedProperties alwaysEncryptedSettings;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     *
     * @return the password value.
     */
    public AzureKeyVaultSecretReference password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     *
     * @param password the password value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL
     * Managed Instance. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL
     * Managed Instance. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Managed Instance.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Managed Instance.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
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
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the alwaysEncryptedSettings property: Sql always encrypted properties.
     *
     * @return the alwaysEncryptedSettings value.
     */
    public SqlAlwaysEncryptedProperties alwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings;
    }

    /**
     * Set the alwaysEncryptedSettings property: Sql always encrypted properties.
     *
     * @param alwaysEncryptedSettings the alwaysEncryptedSettings value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withAlwaysEncryptedSettings(
        SqlAlwaysEncryptedProperties alwaysEncryptedSettings) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureSqlMILinkedServiceTypeProperties object itself.
     */
    public AzureSqlMILinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model AzureSqlMILinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (alwaysEncryptedSettings() != null) {
            alwaysEncryptedSettings().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSqlMILinkedServiceTypeProperties.class);
}
