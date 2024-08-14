// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.AfdDomainUpdatePropertiesParameters;
import java.io.IOException;

/**
 * The domain JSON object required for domain creation or update.
 */
@Fluent
public final class AfdDomainUpdateParameters implements JsonSerializable<AfdDomainUpdateParameters> {
    /*
     * The JSON object that contains the properties of the domain to create.
     */
    private AfdDomainUpdatePropertiesParameters innerProperties;

    /**
     * Creates an instance of AfdDomainUpdateParameters class.
     */
    public AfdDomainUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the domain to create.
     * 
     * @return the innerProperties value.
     */
    private AfdDomainUpdatePropertiesParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the profileName property: The name of the profile which holds the domain.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     * 
     * @return the tlsSettings value.
     */
    public AfdDomainHttpsParameters tlsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().tlsSettings();
    }

    /**
     * Set the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     * 
     * @param tlsSettings the tlsSettings value to set.
     * @return the AfdDomainUpdateParameters object itself.
     */
    public AfdDomainUpdateParameters withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdDomainUpdatePropertiesParameters();
        }
        this.innerProperties().withTlsSettings(tlsSettings);
        return this;
    }

    /**
     * Get the azureDnsZone property: Resource reference to the Azure DNS zone.
     * 
     * @return the azureDnsZone value.
     */
    public ResourceReference azureDnsZone() {
        return this.innerProperties() == null ? null : this.innerProperties().azureDnsZone();
    }

    /**
     * Set the azureDnsZone property: Resource reference to the Azure DNS zone.
     * 
     * @param azureDnsZone the azureDnsZone value to set.
     * @return the AfdDomainUpdateParameters object itself.
     */
    public AfdDomainUpdateParameters withAzureDnsZone(ResourceReference azureDnsZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdDomainUpdatePropertiesParameters();
        }
        this.innerProperties().withAzureDnsZone(azureDnsZone);
        return this;
    }

    /**
     * Get the preValidatedCustomDomainResourceId property: Resource reference to the Azure resource where custom domain
     * ownership was prevalidated.
     * 
     * @return the preValidatedCustomDomainResourceId value.
     */
    public ResourceReference preValidatedCustomDomainResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().preValidatedCustomDomainResourceId();
    }

    /**
     * Set the preValidatedCustomDomainResourceId property: Resource reference to the Azure resource where custom domain
     * ownership was prevalidated.
     * 
     * @param preValidatedCustomDomainResourceId the preValidatedCustomDomainResourceId value to set.
     * @return the AfdDomainUpdateParameters object itself.
     */
    public AfdDomainUpdateParameters
        withPreValidatedCustomDomainResourceId(ResourceReference preValidatedCustomDomainResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdDomainUpdatePropertiesParameters();
        }
        this.innerProperties().withPreValidatedCustomDomainResourceId(preValidatedCustomDomainResourceId);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdDomainUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdDomainUpdateParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdDomainUpdateParameters.
     */
    public static AfdDomainUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdDomainUpdateParameters deserializedAfdDomainUpdateParameters = new AfdDomainUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAfdDomainUpdateParameters.innerProperties
                        = AfdDomainUpdatePropertiesParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdDomainUpdateParameters;
        });
    }
}
