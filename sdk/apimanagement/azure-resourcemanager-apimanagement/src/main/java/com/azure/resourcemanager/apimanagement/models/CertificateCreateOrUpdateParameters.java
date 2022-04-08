// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.CertificateCreateOrUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate create or update details. */
@Fluent
public final class CertificateCreateOrUpdateParameters {
    /*
     * Certificate create or update properties details.
     */
    @JsonProperty(value = "properties")
    private CertificateCreateOrUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: Certificate create or update properties details.
     *
     * @return the innerProperties value.
     */
    private CertificateCreateOrUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the data property: Base 64 encoded certificate using the application/x-pkcs12 representation.
     *
     * @return the data value.
     */
    public String data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Base 64 encoded certificate using the application/x-pkcs12 representation.
     *
     * @param data the data value to set.
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withData(String data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateCreateOrUpdateProperties();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the password property: Password for the Certificate.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: Password for the Certificate.
     *
     * @param password the password value to set.
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateCreateOrUpdateProperties();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the keyVault property: KeyVault location details of the certificate.
     *
     * @return the keyVault value.
     */
    public KeyVaultContractCreateProperties keyVault() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVault();
    }

    /**
     * Set the keyVault property: KeyVault location details of the certificate.
     *
     * @param keyVault the keyVault value to set.
     * @return the CertificateCreateOrUpdateParameters object itself.
     */
    public CertificateCreateOrUpdateParameters withKeyVault(KeyVaultContractCreateProperties keyVault) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateCreateOrUpdateProperties();
        }
        this.innerProperties().withKeyVault(keyVault);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
