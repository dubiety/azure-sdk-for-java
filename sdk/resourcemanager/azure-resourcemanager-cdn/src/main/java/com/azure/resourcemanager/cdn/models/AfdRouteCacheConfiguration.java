// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object. */
@Fluent
public final class AfdRouteCacheConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdRouteCacheConfiguration.class);

    /*
     * Defines how Frontdoor caches requests that include query strings. You
     * can ignore any query strings when caching, ignore specific query
     * strings, cache every request with a unique URL, or cache specific query
     * strings.
     */
    @JsonProperty(value = "queryStringCachingBehavior")
    private AfdQueryStringCachingBehavior queryStringCachingBehavior;

    /*
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /*
     * compression settings.
     */
    @JsonProperty(value = "compressionSettings")
    private Object compressionSettings;

    /**
     * Get the queryStringCachingBehavior property: Defines how Frontdoor caches requests that include query strings.
     * You can ignore any query strings when caching, ignore specific query strings, cache every request with a unique
     * URL, or cache specific query strings.
     *
     * @return the queryStringCachingBehavior value.
     */
    public AfdQueryStringCachingBehavior queryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }

    /**
     * Set the queryStringCachingBehavior property: Defines how Frontdoor caches requests that include query strings.
     * You can ignore any query strings when caching, ignore specific query strings, cache every request with a unique
     * URL, or cache specific query strings.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set.
     * @return the AfdRouteCacheConfiguration object itself.
     */
    public AfdRouteCacheConfiguration withQueryStringCachingBehavior(
        AfdQueryStringCachingBehavior queryStringCachingBehavior) {
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        return this;
    }

    /**
     * Get the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @return the queryParameters value.
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @param queryParameters the queryParameters value to set.
     * @return the AfdRouteCacheConfiguration object itself.
     */
    public AfdRouteCacheConfiguration withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get the compressionSettings property: compression settings.
     *
     * @return the compressionSettings value.
     */
    public Object compressionSettings() {
        return this.compressionSettings;
    }

    /**
     * Set the compressionSettings property: compression settings.
     *
     * @param compressionSettings the compressionSettings value to set.
     * @return the AfdRouteCacheConfiguration object itself.
     */
    public AfdRouteCacheConfiguration withCompressionSettings(Object compressionSettings) {
        this.compressionSettings = compressionSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
