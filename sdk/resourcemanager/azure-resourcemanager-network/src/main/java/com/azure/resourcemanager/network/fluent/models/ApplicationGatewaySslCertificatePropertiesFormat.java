// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of SSL certificates of an application gateway. */
@Fluent
public final class ApplicationGatewaySslCertificatePropertiesFormat {
    /*
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     */
    @JsonProperty(value = "data")
    private String data;

    /*
     * Password for the pfx file specified in data. Only applicable in PUT
     * request.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Base-64 encoded Public cert data corresponding to pfx specified in data.
     * Only applicable in GET request.
     */
    @JsonProperty(value = "publicCertData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicCertData;

    /*
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     */
    @JsonProperty(value = "keyVaultSecretId")
    private String keyVaultSecretId;

    /*
     * The provisioning state of the SSL certificate resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @param password the password value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicCertData property: Base-64 encoded Public cert data corresponding to pfx specified in data. Only
     * applicable in GET request.
     *
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     *
     * @return the keyVaultSecretId value.
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the SSL certificate resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
