// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.AfdOriginUpdatePropertiesParameters;
import java.io.IOException;

/**
 * AFDOrigin properties needed for origin update.
 */
@Fluent
public final class AfdOriginUpdateParameters implements JsonSerializable<AfdOriginUpdateParameters> {
    /*
     * The JSON object that contains the properties of the origin.
     */
    private AfdOriginUpdatePropertiesParameters innerProperties;

    /**
     * Creates an instance of AfdOriginUpdateParameters class.
     */
    public AfdOriginUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin.
     * 
     * @return the innerProperties value.
     */
    private AfdOriginUpdatePropertiesParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the originGroupName property: The name of the origin group which contains this origin.
     * 
     * @return the originGroupName value.
     */
    public String originGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().originGroupName();
    }

    /**
     * Get the azureOrigin property: Resource reference to the Azure origin resource.
     * 
     * @return the azureOrigin value.
     */
    public ResourceReference azureOrigin() {
        return this.innerProperties() == null ? null : this.innerProperties().azureOrigin();
    }

    /**
     * Set the azureOrigin property: Resource reference to the Azure origin resource.
     * 
     * @param azureOrigin the azureOrigin value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withAzureOrigin(ResourceReference azureOrigin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withAzureOrigin(azureOrigin);
        return this;
    }

    /**
     * Get the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     * 
     * @param hostname the hostname value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     * 
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.innerProperties() == null ? null : this.innerProperties().httpPort();
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     * 
     * @param httpPort the httpPort value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHttpPort(Integer httpPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withHttpPort(httpPort);
        return this;
    }

    /**
     * Get the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     * 
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.innerProperties() == null ? null : this.innerProperties().httpsPort();
    }

    /**
     * Set the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     * 
     * @param httpsPort the httpsPort value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHttpsPort(Integer httpsPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withHttpsPort(httpsPort);
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure Front Door origins, such as Web Apps, Blob Storage, and
     * Cloud Services require this host header value to match the origin hostname by default. This overrides the host
     * header defined at Endpoint.
     * 
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.innerProperties() == null ? null : this.innerProperties().originHostHeader();
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure Front Door origins, such as Web Apps, Blob Storage, and
     * Cloud Services require this host header value to match the origin hostname by default. This overrides the host
     * header defined at Endpoint.
     * 
     * @param originHostHeader the originHostHeader value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withOriginHostHeader(String originHostHeader) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withOriginHostHeader(originHostHeader);
        return this;
    }

    /**
     * Get the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     * 
     * @param priority the priority value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     * 
     * @return the weight value.
     */
    public Integer weight() {
        return this.innerProperties() == null ? null : this.innerProperties().weight();
    }

    /**
     * Set the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     * 
     * @param weight the weight value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withWeight(Integer weight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withWeight(weight);
        return this;
    }

    /**
     * Get the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     * 
     * @return the sharedPrivateLinkResource value.
     */
    public SharedPrivateLinkResourceProperties sharedPrivateLinkResource() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedPrivateLinkResource();
    }

    /**
     * Set the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     * 
     * @param sharedPrivateLinkResource the sharedPrivateLinkResource value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters
        withSharedPrivateLinkResource(SharedPrivateLinkResourceProperties sharedPrivateLinkResource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withSharedPrivateLinkResource(sharedPrivateLinkResource);
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     * 
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     * 
     * @param enabledState the enabledState value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withEnabledState(EnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Get the enforceCertificateNameCheck property: Whether to enable certificate name check at origin level.
     * 
     * @return the enforceCertificateNameCheck value.
     */
    public Boolean enforceCertificateNameCheck() {
        return this.innerProperties() == null ? null : this.innerProperties().enforceCertificateNameCheck();
    }

    /**
     * Set the enforceCertificateNameCheck property: Whether to enable certificate name check at origin level.
     * 
     * @param enforceCertificateNameCheck the enforceCertificateNameCheck value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withEnforceCertificateNameCheck(Boolean enforceCertificateNameCheck) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginUpdatePropertiesParameters();
        }
        this.innerProperties().withEnforceCertificateNameCheck(enforceCertificateNameCheck);
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
     * Reads an instance of AfdOriginUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdOriginUpdateParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdOriginUpdateParameters.
     */
    public static AfdOriginUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdOriginUpdateParameters deserializedAfdOriginUpdateParameters = new AfdOriginUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAfdOriginUpdateParameters.innerProperties
                        = AfdOriginUpdatePropertiesParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdOriginUpdateParameters;
        });
    }
}
