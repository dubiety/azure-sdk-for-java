// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdDomainHttpsParameters;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.DomainValidationProperties;
import com.azure.resourcemanager.cdn.models.DomainValidationState;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import java.io.IOException;
import java.util.Map;

/**
 * The JSON object that contains the properties of the domain to create.
 */
@Fluent
public final class AfdDomainProperties extends AfdDomainUpdatePropertiesParameters {
    /*
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for
     * DomainControlValidation.
     */
    private DomainValidationState domainValidationState;

    /*
     * The host name of the domain. Must be a domain name.
     */
    private String hostname;

    /*
     * Key-Value pair representing migration properties for domains.
     */
    private Map<String, String> extendedProperties;

    /*
     * Values the customer needs to validate domain ownership
     */
    private DomainValidationProperties validationProperties;

    /*
     * Provisioning status
     */
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    private DeploymentStatus deploymentStatus;

    /*
     * The name of the profile which holds the domain.
     */
    private String profileName;

    /**
     * Creates an instance of AfdDomainProperties class.
     */
    public AfdDomainProperties() {
    }

    /**
     * Get the domainValidationState property: Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     * @return the domainValidationState value.
     */
    public DomainValidationState domainValidationState() {
        return this.domainValidationState;
    }

    /**
     * Get the hostname property: The host name of the domain. Must be a domain name.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the domain. Must be a domain name.
     * 
     * @param hostname the hostname value to set.
     * @return the AfdDomainProperties object itself.
     */
    public AfdDomainProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the extendedProperties property: Key-Value pair representing migration properties for domains.
     * 
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: Key-Value pair representing migration properties for domains.
     * 
     * @param extendedProperties the extendedProperties value to set.
     * @return the AfdDomainProperties object itself.
     */
    public AfdDomainProperties withExtendedProperties(Map<String, String> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the validationProperties property: Values the customer needs to validate domain ownership.
     * 
     * @return the validationProperties value.
     */
    public DomainValidationProperties validationProperties() {
        return this.validationProperties;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the profileName property: The name of the profile which holds the domain.
     * 
     * @return the profileName value.
     */
    @Override
    public String profileName() {
        return this.profileName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdDomainProperties withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        super.withTlsSettings(tlsSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdDomainProperties withAzureDnsZone(ResourceReference azureDnsZone) {
        super.withAzureDnsZone(azureDnsZone);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdDomainProperties
        withPreValidatedCustomDomainResourceId(ResourceReference preValidatedCustomDomainResourceId) {
        super.withPreValidatedCustomDomainResourceId(preValidatedCustomDomainResourceId);
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
        if (hostname() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property hostname in model AfdDomainProperties"));
        }
        if (validationProperties() != null) {
            validationProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AfdDomainProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("tlsSettings", tlsSettings());
        jsonWriter.writeJsonField("azureDnsZone", azureDnsZone());
        jsonWriter.writeJsonField("preValidatedCustomDomainResourceId", preValidatedCustomDomainResourceId());
        jsonWriter.writeStringField("hostName", this.hostname);
        jsonWriter.writeMapField("extendedProperties", this.extendedProperties,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdDomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdDomainProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AfdDomainProperties.
     */
    public static AfdDomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdDomainProperties deserializedAfdDomainProperties = new AfdDomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("profileName".equals(fieldName)) {
                    deserializedAfdDomainProperties.profileName = reader.getString();
                } else if ("tlsSettings".equals(fieldName)) {
                    deserializedAfdDomainProperties.withTlsSettings(AfdDomainHttpsParameters.fromJson(reader));
                } else if ("azureDnsZone".equals(fieldName)) {
                    deserializedAfdDomainProperties.withAzureDnsZone(ResourceReference.fromJson(reader));
                } else if ("preValidatedCustomDomainResourceId".equals(fieldName)) {
                    deserializedAfdDomainProperties
                        .withPreValidatedCustomDomainResourceId(ResourceReference.fromJson(reader));
                } else if ("hostName".equals(fieldName)) {
                    deserializedAfdDomainProperties.hostname = reader.getString();
                } else if ("domainValidationState".equals(fieldName)) {
                    deserializedAfdDomainProperties.domainValidationState
                        = DomainValidationState.fromString(reader.getString());
                } else if ("extendedProperties".equals(fieldName)) {
                    Map<String, String> extendedProperties = reader.readMap(reader1 -> reader1.getString());
                    deserializedAfdDomainProperties.extendedProperties = extendedProperties;
                } else if ("validationProperties".equals(fieldName)) {
                    deserializedAfdDomainProperties.validationProperties = DomainValidationProperties.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAfdDomainProperties.provisioningState
                        = AfdProvisioningState.fromString(reader.getString());
                } else if ("deploymentStatus".equals(fieldName)) {
                    deserializedAfdDomainProperties.deploymentStatus = DeploymentStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdDomainProperties;
        });
    }
}
