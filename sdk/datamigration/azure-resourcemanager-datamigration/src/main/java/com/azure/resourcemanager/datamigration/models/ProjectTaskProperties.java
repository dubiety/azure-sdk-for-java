// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Base class for all types of DMS task properties. If task is not supported by current client, this object is returned.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "taskType",
    defaultImpl = ProjectTaskProperties.class)
@JsonTypeName("ProjectTaskProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ConnectToSource.MySql", value = ConnectToSourceMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer", value = ConnectToSourceSqlServerTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ConnectToSource.SqlServer.Sync",
        value = ConnectToSourceSqlServerSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ConnectToSource.PostgreSql.Sync",
        value = ConnectToSourcePostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb", value = ConnectToTargetSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb.Sync", value = ConnectToTargetSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ConnectToTarget.AzureDbForPostgreSql.Sync",
        value = ConnectToTargetAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.Sql", value = GetUserTablesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.AzureSqlDb.Sync", value = GetUserTablesSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureSqlDbMI", value = ConnectToTargetSqlMITaskProperties.class),
    @JsonSubTypes.Type(
        name = "ConnectToTarget.AzureSqlDbMI.Sync.LRS",
        value = ConnectToTargetSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ConnectToTarget.AzureDbForMySql",
        value = ConnectToTargetAzureDbForMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDbMI", value = MigrateSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(
        name = "Migrate.SqlServer.AzureSqlDbMI.Sync.LRS",
        value = MigrateSqlServerSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.SqlDb", value = MigrateSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(
        name = "Migrate.SqlServer.AzureSqlDb.Sync",
        value = MigrateSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "Migrate.MySql.AzureDbForMySql.Sync",
        value = MigrateMySqlAzureDbForMySqlSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "Migrate.PostgreSql.AzureDbForPostgreSql.Sync",
        value = MigratePostgreSqlAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateMigrationInput.SqlServer.SqlDb.Sync",
        value = ValidateMigrationInputSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI",
        value = ValidateMigrationInputSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI.Sync.LRS",
        value = ValidateMigrationInputSqlServerSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(name = "GetTDECertificates.Sql", value = GetTdeCertificatesSqlTaskProperties.class)
})
@Immutable
public class ProjectTaskProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProjectTaskProperties.class);

    /*
     * Array of errors. This is ignored if submitted.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagementError> errors;

    /*
     * The state of the task. This is ignored if submitted.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private TaskState state;

    /*
     * Array of command properties.
     */
    @JsonProperty(value = "commands", access = JsonProperty.Access.WRITE_ONLY)
    private List<CommandProperties> commands;

    /**
     * Get the errors property: Array of errors. This is ignored if submitted.
     *
     * @return the errors value.
     */
    public List<ManagementError> errors() {
        return this.errors;
    }

    /**
     * Get the state property: The state of the task. This is ignored if submitted.
     *
     * @return the state value.
     */
    public TaskState state() {
        return this.state;
    }

    /**
     * Get the commands property: Array of command properties.
     *
     * @return the commands value.
     */
    public List<CommandProperties> commands() {
        return this.commands;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (commands() != null) {
            commands().forEach(e -> e.validate());
        }
    }
}
