// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OpenIdConnectConfig model. */
@JsonFlatten
@Fluent
public class OpenIdConnectConfig extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenIdConnectConfig.class);

    /*
     * The authorizationEndpoint property.
     */
    @JsonProperty(value = "properties.authorizationEndpoint")
    private String authorizationEndpoint;

    /*
     * The tokenEndpoint property.
     */
    @JsonProperty(value = "properties.tokenEndpoint")
    private String tokenEndpoint;

    /*
     * The issuer property.
     */
    @JsonProperty(value = "properties.issuer")
    private String issuer;

    /*
     * The certificationUri property.
     */
    @JsonProperty(value = "properties.certificationUri")
    private String certificationUri;

    /*
     * The wellKnownOpenIdConfiguration property.
     */
    @JsonProperty(value = "properties.wellKnownOpenIdConfiguration")
    private String wellKnownOpenIdConfiguration;

    /**
     * Get the authorizationEndpoint property: The authorizationEndpoint property.
     *
     * @return the authorizationEndpoint value.
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Set the authorizationEndpoint property: The authorizationEndpoint property.
     *
     * @param authorizationEndpoint the authorizationEndpoint value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * Get the tokenEndpoint property: The tokenEndpoint property.
     *
     * @return the tokenEndpoint value.
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set the tokenEndpoint property: The tokenEndpoint property.
     *
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get the issuer property: The issuer property.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: The issuer property.
     *
     * @param issuer the issuer value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the certificationUri property: The certificationUri property.
     *
     * @return the certificationUri value.
     */
    public String certificationUri() {
        return this.certificationUri;
    }

    /**
     * Set the certificationUri property: The certificationUri property.
     *
     * @param certificationUri the certificationUri value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withCertificationUri(String certificationUri) {
        this.certificationUri = certificationUri;
        return this;
    }

    /**
     * Get the wellKnownOpenIdConfiguration property: The wellKnownOpenIdConfiguration property.
     *
     * @return the wellKnownOpenIdConfiguration value.
     */
    public String wellKnownOpenIdConfiguration() {
        return this.wellKnownOpenIdConfiguration;
    }

    /**
     * Set the wellKnownOpenIdConfiguration property: The wellKnownOpenIdConfiguration property.
     *
     * @param wellKnownOpenIdConfiguration the wellKnownOpenIdConfiguration value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withWellKnownOpenIdConfiguration(String wellKnownOpenIdConfiguration) {
        this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OpenIdConnectConfig withKind(String kind) {
        super.withKind(kind);
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
    }
}
