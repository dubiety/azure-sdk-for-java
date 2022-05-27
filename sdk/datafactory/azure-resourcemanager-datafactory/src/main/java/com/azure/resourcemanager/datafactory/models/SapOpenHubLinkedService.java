// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapOpenHubLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SAP Business Warehouse Open Hub Destination Linked Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHub")
@Fluent
public final class SapOpenHubLinkedService extends LinkedService {
    /*
     * Properties specific to SAP Business Warehouse Open Hub Destination
     * linked service type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapOpenHubLinkedServiceTypeProperties innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Properties specific to SAP Business Warehouse Open Hub Destination linked
     * service type.
     *
     * @return the innerTypeProperties value.
     */
    private SapOpenHubLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @return the systemNumber value.
     */
    public Object systemNumber() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().systemNumber();
    }

    /**
     * Set the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @param systemNumber the systemNumber value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withSystemNumber(Object systemNumber) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSystemNumber(systemNumber);
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @param clientId the clientId value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @return the language value.
     */
    public Object language() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().language();
    }

    /**
     * Set the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @param language the language value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withLanguage(Object language) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLanguage(language);
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @return the systemId value.
     */
    public Object systemId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().systemId();
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @param systemId the systemId value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withSystemId(Object systemId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSystemId(systemId);
        return this;
    }

    /**
     * Get the username property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @param password the password value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @return the messageServer value.
     */
    public Object messageServer() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().messageServer();
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @param messageServer the messageServer value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withMessageServer(Object messageServer) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMessageServer(messageServer);
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @return the messageServerService value.
     */
    public Object messageServerService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().messageServerService();
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @param messageServerService the messageServerService value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withMessageServerService(Object messageServerService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMessageServerService(messageServerService);
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @return the logonGroup value.
     */
    public Object logonGroup() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logonGroup();
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @param logonGroup the logonGroup value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withLogonGroup(Object logonGroup) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLogonGroup(logonGroup);
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
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapOpenHubLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
                        "Missing required property innerTypeProperties in model SapOpenHubLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapOpenHubLinkedService.class);
}
