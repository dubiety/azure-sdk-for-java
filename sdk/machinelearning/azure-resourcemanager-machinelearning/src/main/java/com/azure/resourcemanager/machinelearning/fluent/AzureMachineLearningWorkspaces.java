// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AzureMachineLearningWorkspaces class.
 */
public interface AzureMachineLearningWorkspaces {
    /**
     * Gets The ID of the target subscription.
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
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

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
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the WorkspacesClient object to access its operations.
     * 
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     * 
     * @return the VirtualMachineSizesClient object.
     */
    VirtualMachineSizesClient getVirtualMachineSizes();

    /**
     * Gets the QuotasClient object to access its operations.
     * 
     * @return the QuotasClient object.
     */
    QuotasClient getQuotas();

    /**
     * Gets the ComputesClient object to access its operations.
     * 
     * @return the ComputesClient object.
     */
    ComputesClient getComputes();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the WorkspaceConnectionsClient object to access its operations.
     * 
     * @return the WorkspaceConnectionsClient object.
     */
    WorkspaceConnectionsClient getWorkspaceConnections();

    /**
     * Gets the ManagedNetworkSettingsRulesClient object to access its operations.
     * 
     * @return the ManagedNetworkSettingsRulesClient object.
     */
    ManagedNetworkSettingsRulesClient getManagedNetworkSettingsRules();

    /**
     * Gets the ManagedNetworkProvisionsClient object to access its operations.
     * 
     * @return the ManagedNetworkProvisionsClient object.
     */
    ManagedNetworkProvisionsClient getManagedNetworkProvisions();

    /**
     * Gets the RegistryCodeContainersClient object to access its operations.
     * 
     * @return the RegistryCodeContainersClient object.
     */
    RegistryCodeContainersClient getRegistryCodeContainers();

    /**
     * Gets the RegistryCodeVersionsClient object to access its operations.
     * 
     * @return the RegistryCodeVersionsClient object.
     */
    RegistryCodeVersionsClient getRegistryCodeVersions();

    /**
     * Gets the RegistryComponentContainersClient object to access its operations.
     * 
     * @return the RegistryComponentContainersClient object.
     */
    RegistryComponentContainersClient getRegistryComponentContainers();

    /**
     * Gets the RegistryComponentVersionsClient object to access its operations.
     * 
     * @return the RegistryComponentVersionsClient object.
     */
    RegistryComponentVersionsClient getRegistryComponentVersions();

    /**
     * Gets the RegistryDataContainersClient object to access its operations.
     * 
     * @return the RegistryDataContainersClient object.
     */
    RegistryDataContainersClient getRegistryDataContainers();

    /**
     * Gets the RegistryDataVersionsClient object to access its operations.
     * 
     * @return the RegistryDataVersionsClient object.
     */
    RegistryDataVersionsClient getRegistryDataVersions();

    /**
     * Gets the RegistryDataReferencesClient object to access its operations.
     * 
     * @return the RegistryDataReferencesClient object.
     */
    RegistryDataReferencesClient getRegistryDataReferences();

    /**
     * Gets the RegistryEnvironmentContainersClient object to access its operations.
     * 
     * @return the RegistryEnvironmentContainersClient object.
     */
    RegistryEnvironmentContainersClient getRegistryEnvironmentContainers();

    /**
     * Gets the RegistryEnvironmentVersionsClient object to access its operations.
     * 
     * @return the RegistryEnvironmentVersionsClient object.
     */
    RegistryEnvironmentVersionsClient getRegistryEnvironmentVersions();

    /**
     * Gets the RegistryModelContainersClient object to access its operations.
     * 
     * @return the RegistryModelContainersClient object.
     */
    RegistryModelContainersClient getRegistryModelContainers();

    /**
     * Gets the RegistryModelVersionsClient object to access its operations.
     * 
     * @return the RegistryModelVersionsClient object.
     */
    RegistryModelVersionsClient getRegistryModelVersions();

    /**
     * Gets the BatchEndpointsClient object to access its operations.
     * 
     * @return the BatchEndpointsClient object.
     */
    BatchEndpointsClient getBatchEndpoints();

    /**
     * Gets the BatchDeploymentsClient object to access its operations.
     * 
     * @return the BatchDeploymentsClient object.
     */
    BatchDeploymentsClient getBatchDeployments();

    /**
     * Gets the CodeContainersClient object to access its operations.
     * 
     * @return the CodeContainersClient object.
     */
    CodeContainersClient getCodeContainers();

    /**
     * Gets the CodeVersionsClient object to access its operations.
     * 
     * @return the CodeVersionsClient object.
     */
    CodeVersionsClient getCodeVersions();

    /**
     * Gets the ComponentContainersClient object to access its operations.
     * 
     * @return the ComponentContainersClient object.
     */
    ComponentContainersClient getComponentContainers();

    /**
     * Gets the ComponentVersionsClient object to access its operations.
     * 
     * @return the ComponentVersionsClient object.
     */
    ComponentVersionsClient getComponentVersions();

    /**
     * Gets the DataContainersClient object to access its operations.
     * 
     * @return the DataContainersClient object.
     */
    DataContainersClient getDataContainers();

    /**
     * Gets the DataVersionsClient object to access its operations.
     * 
     * @return the DataVersionsClient object.
     */
    DataVersionsClient getDataVersions();

    /**
     * Gets the DatastoresClient object to access its operations.
     * 
     * @return the DatastoresClient object.
     */
    DatastoresClient getDatastores();

    /**
     * Gets the EnvironmentContainersClient object to access its operations.
     * 
     * @return the EnvironmentContainersClient object.
     */
    EnvironmentContainersClient getEnvironmentContainers();

    /**
     * Gets the EnvironmentVersionsClient object to access its operations.
     * 
     * @return the EnvironmentVersionsClient object.
     */
    EnvironmentVersionsClient getEnvironmentVersions();

    /**
     * Gets the FeaturesetContainersClient object to access its operations.
     * 
     * @return the FeaturesetContainersClient object.
     */
    FeaturesetContainersClient getFeaturesetContainers();

    /**
     * Gets the FeaturesClient object to access its operations.
     * 
     * @return the FeaturesClient object.
     */
    FeaturesClient getFeatures();

    /**
     * Gets the FeaturesetVersionsClient object to access its operations.
     * 
     * @return the FeaturesetVersionsClient object.
     */
    FeaturesetVersionsClient getFeaturesetVersions();

    /**
     * Gets the FeaturestoreEntityContainersClient object to access its operations.
     * 
     * @return the FeaturestoreEntityContainersClient object.
     */
    FeaturestoreEntityContainersClient getFeaturestoreEntityContainers();

    /**
     * Gets the FeaturestoreEntityVersionsClient object to access its operations.
     * 
     * @return the FeaturestoreEntityVersionsClient object.
     */
    FeaturestoreEntityVersionsClient getFeaturestoreEntityVersions();

    /**
     * Gets the JobsClient object to access its operations.
     * 
     * @return the JobsClient object.
     */
    JobsClient getJobs();

    /**
     * Gets the MarketplaceSubscriptionsClient object to access its operations.
     * 
     * @return the MarketplaceSubscriptionsClient object.
     */
    MarketplaceSubscriptionsClient getMarketplaceSubscriptions();

    /**
     * Gets the ModelContainersClient object to access its operations.
     * 
     * @return the ModelContainersClient object.
     */
    ModelContainersClient getModelContainers();

    /**
     * Gets the ModelVersionsClient object to access its operations.
     * 
     * @return the ModelVersionsClient object.
     */
    ModelVersionsClient getModelVersions();

    /**
     * Gets the OnlineEndpointsClient object to access its operations.
     * 
     * @return the OnlineEndpointsClient object.
     */
    OnlineEndpointsClient getOnlineEndpoints();

    /**
     * Gets the OnlineDeploymentsClient object to access its operations.
     * 
     * @return the OnlineDeploymentsClient object.
     */
    OnlineDeploymentsClient getOnlineDeployments();

    /**
     * Gets the SchedulesClient object to access its operations.
     * 
     * @return the SchedulesClient object.
     */
    SchedulesClient getSchedules();

    /**
     * Gets the ServerlessEndpointsClient object to access its operations.
     * 
     * @return the ServerlessEndpointsClient object.
     */
    ServerlessEndpointsClient getServerlessEndpoints();

    /**
     * Gets the RegistriesClient object to access its operations.
     * 
     * @return the RegistriesClient object.
     */
    RegistriesClient getRegistries();

    /**
     * Gets the WorkspaceFeaturesClient object to access its operations.
     * 
     * @return the WorkspaceFeaturesClient object.
     */
    WorkspaceFeaturesClient getWorkspaceFeatures();
}
