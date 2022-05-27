// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Dynamics AX linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAX")
@JsonFlatten
@Fluent
public class DynamicsAXLinkedService extends LinkedService {
    /*
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData
     * endpoint.
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /*
     * Specify the application's key. Mark this field as a SecureString to
     * store it securely in Data Factory, or reference a secret stored in Azure
     * Key Vault. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /*
     * Specify the tenant information (domain name or tenant ID) under which
     * your application resides. Retrieve it by hovering the mouse in the
     * top-right corner of the Azure portal. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /*
     * Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.aadResourceId", required = true)
    private Object aadResourceId;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     *
     * @param url the url value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     *
     * @return the aadResourceId value.
     */
    public Object getAadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     *
     * @param aadResourceId the aadResourceId value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the DynamicsAXLinkedService object itself.
     */
    public DynamicsAXLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
