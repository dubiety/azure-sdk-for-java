// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Gets or sets the SQL server provider properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "providerType")
@JsonTypeName("MsSqlServer")
@Fluent
public final class MsSqlServerProviderInstanceProperties extends ProviderSpecificProperties {
    /*
     * Gets or sets the SQL server host name.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * Gets or sets the database sql port.
     */
    @JsonProperty(value = "dbPort")
    private String dbPort;

    /*
     * Gets or sets the database user name.
     */
    @JsonProperty(value = "dbUsername")
    private String dbUsername;

    /*
     * Gets or sets the database password.
     */
    @JsonProperty(value = "dbPassword")
    private String dbPassword;

    /*
     * Gets or sets the key vault URI to secret with the database password.
     */
    @JsonProperty(value = "dbPasswordUri")
    private String dbPasswordUri;

    /*
     * Gets or sets the SAP System Identifier
     */
    @JsonProperty(value = "sapSid")
    private String sapSid;

    /**
     * Get the hostname property: Gets or sets the SQL server host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Gets or sets the SQL server host name.
     *
     * @param hostname the hostname value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the dbPort property: Gets or sets the database sql port.
     *
     * @return the dbPort value.
     */
    public String dbPort() {
        return this.dbPort;
    }

    /**
     * Set the dbPort property: Gets or sets the database sql port.
     *
     * @param dbPort the dbPort value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * Get the dbUsername property: Gets or sets the database user name.
     *
     * @return the dbUsername value.
     */
    public String dbUsername() {
        return this.dbUsername;
    }

    /**
     * Set the dbUsername property: Gets or sets the database user name.
     *
     * @param dbUsername the dbUsername value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }

    /**
     * Get the dbPassword property: Gets or sets the database password.
     *
     * @return the dbPassword value.
     */
    public String dbPassword() {
        return this.dbPassword;
    }

    /**
     * Set the dbPassword property: Gets or sets the database password.
     *
     * @param dbPassword the dbPassword value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * Get the dbPasswordUri property: Gets or sets the key vault URI to secret with the database password.
     *
     * @return the dbPasswordUri value.
     */
    public String dbPasswordUri() {
        return this.dbPasswordUri;
    }

    /**
     * Set the dbPasswordUri property: Gets or sets the key vault URI to secret with the database password.
     *
     * @param dbPasswordUri the dbPasswordUri value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withDbPasswordUri(String dbPasswordUri) {
        this.dbPasswordUri = dbPasswordUri;
        return this;
    }

    /**
     * Get the sapSid property: Gets or sets the SAP System Identifier.
     *
     * @return the sapSid value.
     */
    public String sapSid() {
        return this.sapSid;
    }

    /**
     * Set the sapSid property: Gets or sets the SAP System Identifier.
     *
     * @param sapSid the sapSid value to set.
     * @return the MsSqlServerProviderInstanceProperties object itself.
     */
    public MsSqlServerProviderInstanceProperties withSapSid(String sapSid) {
        this.sapSid = sapSid;
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
