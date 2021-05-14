// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema model. */
@Fluent
public final class PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema {
    /*
     * Grant type is expected to be refresh_token
     */
    @JsonProperty(value = "grant_type", required = true)
    private String grantType;

    /*
     * Indicates the name of your Azure container registry.
     */
    @JsonProperty(value = "service", required = true)
    private String service;

    /*
     * Which is expected to be a valid scope, and can be specified more than
     * once for multiple scope requests. You obtained this from the
     * Www-Authenticate response header from the challenge.
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /*
     * Must be a valid ACR refresh token
     */
    @JsonProperty(value = "refresh_token", required = true)
    private String acrRefreshToken;

    /** Creates an instance of PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema class. */
    public PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema() {
        grantType = "refresh_token";
    }

    /**
     * Get the grantType property: Grant type is expected to be refresh_token.
     *
     * @return the grantType value.
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * Set the grantType property: Grant type is expected to be refresh_token.
     *
     * @param grantType the grantType value to set.
     * @return the PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema setGrantType(
            String grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * Get the service property: Indicates the name of your Azure container registry.
     *
     * @return the service value.
     */
    public String getService() {
        return this.service;
    }

    /**
     * Set the service property: Indicates the name of your Azure container registry.
     *
     * @param service the service value to set.
     * @return the PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the scope property: Which is expected to be a valid scope, and can be specified more than once for multiple
     * scope requests. You obtained this from the Www-Authenticate response header from the challenge.
     *
     * @return the scope value.
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: Which is expected to be a valid scope, and can be specified more than once for multiple
     * scope requests. You obtained this from the Www-Authenticate response header from the challenge.
     *
     * @param scope the scope value to set.
     * @return the PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the acrRefreshToken property: Must be a valid ACR refresh token.
     *
     * @return the acrRefreshToken value.
     */
    public String getAcrRefreshToken() {
        return this.acrRefreshToken;
    }

    /**
     * Set the acrRefreshToken property: Must be a valid ACR refresh token.
     *
     * @param acrRefreshToken the acrRefreshToken value to set.
     * @return the PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema setAcrRefreshToken(
            String acrRefreshToken) {
        this.acrRefreshToken = acrRefreshToken;
        return this;
    }
}
