// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.DataFactoryManagementClient;
import com.azure.resourcemanager.datafactory.implementation.ActivityRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.DataFactoryManagementClientBuilder;
import com.azure.resourcemanager.datafactory.implementation.DataFlowDebugSessionsImpl;
import com.azure.resourcemanager.datafactory.implementation.DataFlowsImpl;
import com.azure.resourcemanager.datafactory.implementation.DatasetsImpl;
import com.azure.resourcemanager.datafactory.implementation.ExposureControlsImpl;
import com.azure.resourcemanager.datafactory.implementation.FactoriesImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimeNodesImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimeObjectMetadatasImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimesImpl;
import com.azure.resourcemanager.datafactory.implementation.LinkedServicesImpl;
import com.azure.resourcemanager.datafactory.implementation.ManagedPrivateEndpointsImpl;
import com.azure.resourcemanager.datafactory.implementation.ManagedVirtualNetworksImpl;
import com.azure.resourcemanager.datafactory.implementation.OperationsImpl;
import com.azure.resourcemanager.datafactory.implementation.PipelineRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.PipelinesImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateEndPointConnectionsImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateEndpointConnectionOperationsImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.datafactory.implementation.TriggerRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.TriggersImpl;
import com.azure.resourcemanager.datafactory.models.ActivityRuns;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugSessions;
import com.azure.resourcemanager.datafactory.models.DataFlows;
import com.azure.resourcemanager.datafactory.models.Datasets;
import com.azure.resourcemanager.datafactory.models.ExposureControls;
import com.azure.resourcemanager.datafactory.models.Factories;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeNodes;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeObjectMetadatas;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimes;
import com.azure.resourcemanager.datafactory.models.LinkedServices;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoints;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworks;
import com.azure.resourcemanager.datafactory.models.Operations;
import com.azure.resourcemanager.datafactory.models.PipelineRuns;
import com.azure.resourcemanager.datafactory.models.Pipelines;
import com.azure.resourcemanager.datafactory.models.PrivateEndPointConnections;
import com.azure.resourcemanager.datafactory.models.PrivateEndpointConnectionOperations;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResources;
import com.azure.resourcemanager.datafactory.models.TriggerRuns;
import com.azure.resourcemanager.datafactory.models.Triggers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a RESTful set of web services
 * that interact with Azure Data Factory V2 services.
 */
public final class DataFactoryManager {
    private Operations operations;

    private Factories factories;

    private ExposureControls exposureControls;

    private IntegrationRuntimes integrationRuntimes;

    private IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas;

    private IntegrationRuntimeNodes integrationRuntimeNodes;

    private LinkedServices linkedServices;

    private Datasets datasets;

    private Pipelines pipelines;

    private PipelineRuns pipelineRuns;

    private ActivityRuns activityRuns;

    private Triggers triggers;

    private TriggerRuns triggerRuns;

    private DataFlows dataFlows;

    private DataFlowDebugSessions dataFlowDebugSessions;

    private ManagedVirtualNetworks managedVirtualNetworks;

    private ManagedPrivateEndpoints managedPrivateEndpoints;

    private PrivateEndPointConnections privateEndPointConnections;

    private PrivateEndpointConnectionOperations privateEndpointConnectionOperations;

    private PrivateLinkResources privateLinkResources;

    private final DataFactoryManagementClient clientObject;

    private DataFactoryManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataFactoryManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataFactory service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataFactory service API instance.
     */
    public static DataFactoryManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of DataFactory service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the DataFactory service API instance.
     */
    public static DataFactoryManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new DataFactoryManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create DataFactoryManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataFactoryManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DataFactory service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataFactory service API instance.
         */
        public DataFactoryManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.datafactory")
                .append("/")
                .append("1.0.0-beta.15");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DataFactoryManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Factories.
     *
     * @return Resource collection API of Factories.
     */
    public Factories factories() {
        if (this.factories == null) {
            this.factories = new FactoriesImpl(clientObject.getFactories(), this);
        }
        return factories;
    }

    /**
     * Gets the resource collection API of ExposureControls.
     *
     * @return Resource collection API of ExposureControls.
     */
    public ExposureControls exposureControls() {
        if (this.exposureControls == null) {
            this.exposureControls = new ExposureControlsImpl(clientObject.getExposureControls(), this);
        }
        return exposureControls;
    }

    /**
     * Gets the resource collection API of IntegrationRuntimes.
     *
     * @return Resource collection API of IntegrationRuntimes.
     */
    public IntegrationRuntimes integrationRuntimes() {
        if (this.integrationRuntimes == null) {
            this.integrationRuntimes = new IntegrationRuntimesImpl(clientObject.getIntegrationRuntimes(), this);
        }
        return integrationRuntimes;
    }

    /**
     * Gets the resource collection API of IntegrationRuntimeObjectMetadatas.
     *
     * @return Resource collection API of IntegrationRuntimeObjectMetadatas.
     */
    public IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas() {
        if (this.integrationRuntimeObjectMetadatas == null) {
            this.integrationRuntimeObjectMetadatas =
                new IntegrationRuntimeObjectMetadatasImpl(clientObject.getIntegrationRuntimeObjectMetadatas(), this);
        }
        return integrationRuntimeObjectMetadatas;
    }

    /**
     * Gets the resource collection API of IntegrationRuntimeNodes.
     *
     * @return Resource collection API of IntegrationRuntimeNodes.
     */
    public IntegrationRuntimeNodes integrationRuntimeNodes() {
        if (this.integrationRuntimeNodes == null) {
            this.integrationRuntimeNodes =
                new IntegrationRuntimeNodesImpl(clientObject.getIntegrationRuntimeNodes(), this);
        }
        return integrationRuntimeNodes;
    }

    /**
     * Gets the resource collection API of LinkedServices.
     *
     * @return Resource collection API of LinkedServices.
     */
    public LinkedServices linkedServices() {
        if (this.linkedServices == null) {
            this.linkedServices = new LinkedServicesImpl(clientObject.getLinkedServices(), this);
        }
        return linkedServices;
    }

    /**
     * Gets the resource collection API of Datasets.
     *
     * @return Resource collection API of Datasets.
     */
    public Datasets datasets() {
        if (this.datasets == null) {
            this.datasets = new DatasetsImpl(clientObject.getDatasets(), this);
        }
        return datasets;
    }

    /**
     * Gets the resource collection API of Pipelines.
     *
     * @return Resource collection API of Pipelines.
     */
    public Pipelines pipelines() {
        if (this.pipelines == null) {
            this.pipelines = new PipelinesImpl(clientObject.getPipelines(), this);
        }
        return pipelines;
    }

    /**
     * Gets the resource collection API of PipelineRuns.
     *
     * @return Resource collection API of PipelineRuns.
     */
    public PipelineRuns pipelineRuns() {
        if (this.pipelineRuns == null) {
            this.pipelineRuns = new PipelineRunsImpl(clientObject.getPipelineRuns(), this);
        }
        return pipelineRuns;
    }

    /**
     * Gets the resource collection API of ActivityRuns.
     *
     * @return Resource collection API of ActivityRuns.
     */
    public ActivityRuns activityRuns() {
        if (this.activityRuns == null) {
            this.activityRuns = new ActivityRunsImpl(clientObject.getActivityRuns(), this);
        }
        return activityRuns;
    }

    /**
     * Gets the resource collection API of Triggers.
     *
     * @return Resource collection API of Triggers.
     */
    public Triggers triggers() {
        if (this.triggers == null) {
            this.triggers = new TriggersImpl(clientObject.getTriggers(), this);
        }
        return triggers;
    }

    /**
     * Gets the resource collection API of TriggerRuns.
     *
     * @return Resource collection API of TriggerRuns.
     */
    public TriggerRuns triggerRuns() {
        if (this.triggerRuns == null) {
            this.triggerRuns = new TriggerRunsImpl(clientObject.getTriggerRuns(), this);
        }
        return triggerRuns;
    }

    /**
     * Gets the resource collection API of DataFlows.
     *
     * @return Resource collection API of DataFlows.
     */
    public DataFlows dataFlows() {
        if (this.dataFlows == null) {
            this.dataFlows = new DataFlowsImpl(clientObject.getDataFlows(), this);
        }
        return dataFlows;
    }

    /**
     * Gets the resource collection API of DataFlowDebugSessions.
     *
     * @return Resource collection API of DataFlowDebugSessions.
     */
    public DataFlowDebugSessions dataFlowDebugSessions() {
        if (this.dataFlowDebugSessions == null) {
            this.dataFlowDebugSessions = new DataFlowDebugSessionsImpl(clientObject.getDataFlowDebugSessions(), this);
        }
        return dataFlowDebugSessions;
    }

    /**
     * Gets the resource collection API of ManagedVirtualNetworks.
     *
     * @return Resource collection API of ManagedVirtualNetworks.
     */
    public ManagedVirtualNetworks managedVirtualNetworks() {
        if (this.managedVirtualNetworks == null) {
            this.managedVirtualNetworks =
                new ManagedVirtualNetworksImpl(clientObject.getManagedVirtualNetworks(), this);
        }
        return managedVirtualNetworks;
    }

    /**
     * Gets the resource collection API of ManagedPrivateEndpoints.
     *
     * @return Resource collection API of ManagedPrivateEndpoints.
     */
    public ManagedPrivateEndpoints managedPrivateEndpoints() {
        if (this.managedPrivateEndpoints == null) {
            this.managedPrivateEndpoints =
                new ManagedPrivateEndpointsImpl(clientObject.getManagedPrivateEndpoints(), this);
        }
        return managedPrivateEndpoints;
    }

    /**
     * Gets the resource collection API of PrivateEndPointConnections.
     *
     * @return Resource collection API of PrivateEndPointConnections.
     */
    public PrivateEndPointConnections privateEndPointConnections() {
        if (this.privateEndPointConnections == null) {
            this.privateEndPointConnections =
                new PrivateEndPointConnectionsImpl(clientObject.getPrivateEndPointConnections(), this);
        }
        return privateEndPointConnections;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnectionOperations.
     *
     * @return Resource collection API of PrivateEndpointConnectionOperations.
     */
    public PrivateEndpointConnectionOperations privateEndpointConnectionOperations() {
        if (this.privateEndpointConnectionOperations == null) {
            this.privateEndpointConnectionOperations =
                new PrivateEndpointConnectionOperationsImpl(
                    clientObject.getPrivateEndpointConnectionOperations(), this);
        }
        return privateEndpointConnectionOperations;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     *
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * @return Wrapped service client DataFactoryManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DataFactoryManagementClient serviceClient() {
        return this.clientObject;
    }
}
