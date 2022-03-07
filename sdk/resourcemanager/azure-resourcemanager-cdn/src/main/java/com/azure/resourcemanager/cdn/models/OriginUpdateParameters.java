// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.fluent.models.OriginUpdatePropertiesParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Origin properties needed for origin update. */
@Fluent
public final class OriginUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OriginUpdateParameters.class);

    /*
     * The JSON object that contains the properties of the origin.
     */
    @JsonProperty(value = "properties")
    private OriginUpdatePropertiesParameters innerProperties;

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin.
     *
     * @return the innerProperties value.
     */
    private OriginUpdatePropertiesParameters innerProperties() {
        return this.innerProperties;
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
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
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
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHttpPort(Integer httpPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
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
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withHttpsPort(Integer httpsPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withHttpsPort(httpsPort);
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.innerProperties() == null ? null : this.innerProperties().originHostHeader();
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @param originHostHeader the originHostHeader value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withOriginHostHeader(String originHostHeader) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
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
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
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
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withWeight(Integer weight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withWeight(weight);
        return this;
    }

    /**
     * Get the enabled property: Origin is enabled for load balancing or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Origin is enabled for load balancing or not.
     *
     * @param enabled the enabled value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'.
     *
     * @return the privateLinkAlias value.
     */
    public String privateLinkAlias() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkAlias();
    }

    /**
     * Set the privateLinkAlias property: The Alias of the Private Link resource. Populating this optional field
     * indicates that this origin is 'Private'.
     *
     * @param privateLinkAlias the privateLinkAlias value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkAlias(String privateLinkAlias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withPrivateLinkAlias(privateLinkAlias);
        return this;
    }

    /**
     * Get the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkResourceId();
    }

    /**
     * Set the privateLinkResourceId property: The Resource Id of the Private Link resource. Populating this optional
     * field indicates that this backend is 'Private'.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkResourceId(String privateLinkResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    /**
     * Get the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     *
     * @return the privateLinkLocation value.
     */
    public String privateLinkLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkLocation();
    }

    /**
     * Set the privateLinkLocation property: The location of the Private Link resource. Required only if
     * 'privateLinkResourceId' is populated.
     *
     * @param privateLinkLocation the privateLinkLocation value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkLocation(String privateLinkLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withPrivateLinkLocation(privateLinkLocation);
        return this;
    }

    /**
     * Get the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     *
     * @return the privateLinkApprovalMessage value.
     */
    public String privateLinkApprovalMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkApprovalMessage();
    }

    /**
     * Set the privateLinkApprovalMessage property: A custom message to be included in the approval request to connect
     * to the Private Link.
     *
     * @param privateLinkApprovalMessage the privateLinkApprovalMessage value to set.
     * @return the OriginUpdateParameters object itself.
     */
    public OriginUpdateParameters withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginUpdatePropertiesParameters();
        }
        this.innerProperties().withPrivateLinkApprovalMessage(privateLinkApprovalMessage);
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
