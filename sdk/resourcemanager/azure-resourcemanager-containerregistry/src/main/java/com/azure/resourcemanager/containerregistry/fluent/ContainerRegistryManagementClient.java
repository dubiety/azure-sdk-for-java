// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ContainerRegistryManagementClient class. */
public interface ContainerRegistryManagementClient {
    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the RegistriesClient object to access its operations.
     *
     * @return the RegistriesClient object.
     */
    RegistriesClient getRegistries();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the ReplicationsClient object to access its operations.
     *
     * @return the ReplicationsClient object.
     */
    ReplicationsClient getReplications();

    /**
     * Gets the WebhooksClient object to access its operations.
     *
     * @return the WebhooksClient object.
     */
    WebhooksClient getWebhooks();

    /**
     * Gets the AgentPoolsClient object to access its operations.
     *
     * @return the AgentPoolsClient object.
     */
    AgentPoolsClient getAgentPools();

    /**
     * Gets the RunsClient object to access its operations.
     *
     * @return the RunsClient object.
     */
    RunsClient getRuns();

    /**
     * Gets the TaskRunsClient object to access its operations.
     *
     * @return the TaskRunsClient object.
     */
    TaskRunsClient getTaskRuns();

    /**
     * Gets the TasksClient object to access its operations.
     *
     * @return the TasksClient object.
     */
    TasksClient getTasks();
}
