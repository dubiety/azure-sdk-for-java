// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * Service Principal datastore credentials configuration.
 */
@Fluent
public final class ServicePrincipalDatastoreCredentials extends DatastoreCredentials {
    /*
     * [Required] Credential type used to authentication with storage.
     */
    private CredentialsType credentialsType = CredentialsType.SERVICE_PRINCIPAL;

    /*
     * Authority URL used for authentication.
     */
    private String authorityUrl;

    /*
     * Resource the service principal has access to.
     */
    private String resourceUrl;

    /*
     * [Required] ID of the tenant to which the service principal belongs.
     */
    private UUID tenantId;

    /*
     * [Required] Service principal client ID.
     */
    private UUID clientId;

    /*
     * [Required] Service principal secrets.
     */
    private ServicePrincipalDatastoreSecrets secrets;

    /**
     * Creates an instance of ServicePrincipalDatastoreCredentials class.
     */
    public ServicePrincipalDatastoreCredentials() {
    }

    /**
     * Get the credentialsType property: [Required] Credential type used to authentication with storage.
     * 
     * @return the credentialsType value.
     */
    @Override
    public CredentialsType credentialsType() {
        return this.credentialsType;
    }

    /**
     * Get the authorityUrl property: Authority URL used for authentication.
     * 
     * @return the authorityUrl value.
     */
    public String authorityUrl() {
        return this.authorityUrl;
    }

    /**
     * Set the authorityUrl property: Authority URL used for authentication.
     * 
     * @param authorityUrl the authorityUrl value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
        return this;
    }

    /**
     * Get the resourceUrl property: Resource the service principal has access to.
     * 
     * @return the resourceUrl value.
     */
    public String resourceUrl() {
        return this.resourceUrl;
    }

    /**
     * Set the resourceUrl property: Resource the service principal has access to.
     * 
     * @param resourceUrl the resourceUrl value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }

    /**
     * Get the tenantId property: [Required] ID of the tenant to which the service principal belongs.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: [Required] ID of the tenant to which the service principal belongs.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientId property: [Required] Service principal client ID.
     * 
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: [Required] Service principal client ID.
     * 
     * @param clientId the clientId value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withClientId(UUID clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secrets property: [Required] Service principal secrets.
     * 
     * @return the secrets value.
     */
    public ServicePrincipalDatastoreSecrets secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: [Required] Service principal secrets.
     * 
     * @param secrets the secrets value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withSecrets(ServicePrincipalDatastoreSecrets secrets) {
        this.secrets = secrets;
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
        if (tenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tenantId in model ServicePrincipalDatastoreCredentials"));
        }
        if (clientId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property clientId in model ServicePrincipalDatastoreCredentials"));
        }
        if (secrets() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property secrets in model ServicePrincipalDatastoreCredentials"));
        } else {
            secrets().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicePrincipalDatastoreCredentials.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tenantId", Objects.toString(this.tenantId, null));
        jsonWriter.writeStringField("clientId", Objects.toString(this.clientId, null));
        jsonWriter.writeJsonField("secrets", this.secrets);
        jsonWriter.writeStringField("credentialsType",
            this.credentialsType == null ? null : this.credentialsType.toString());
        jsonWriter.writeStringField("authorityUrl", this.authorityUrl);
        jsonWriter.writeStringField("resourceUrl", this.resourceUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalDatastoreCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalDatastoreCredentials if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServicePrincipalDatastoreCredentials.
     */
    public static ServicePrincipalDatastoreCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalDatastoreCredentials deserializedServicePrincipalDatastoreCredentials
                = new ServicePrincipalDatastoreCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tenantId".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.tenantId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("clientId".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.clientId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("secrets".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.secrets
                        = ServicePrincipalDatastoreSecrets.fromJson(reader);
                } else if ("credentialsType".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.credentialsType
                        = CredentialsType.fromString(reader.getString());
                } else if ("authorityUrl".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.authorityUrl = reader.getString();
                } else if ("resourceUrl".equals(fieldName)) {
                    deserializedServicePrincipalDatastoreCredentials.resourceUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePrincipalDatastoreCredentials;
        });
    }
}
