// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * The interface for StorageManagementClient class.
 */
public interface StorageManagementClient {
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
     * Gets the SkusClient object to access its operations.
     * 
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the StorageAccountsClient object to access its operations.
     * 
     * @return the StorageAccountsClient object.
     */
    StorageAccountsClient getStorageAccounts();

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the ManagementPoliciesClient object to access its operations.
     * 
     * @return the ManagementPoliciesClient object.
     */
    ManagementPoliciesClient getManagementPolicies();

    /**
     * Gets the BlobInventoryPoliciesClient object to access its operations.
     * 
     * @return the BlobInventoryPoliciesClient object.
     */
    BlobInventoryPoliciesClient getBlobInventoryPolicies();

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
     * Gets the ObjectReplicationPoliciesOperationsClient object to access its operations.
     * 
     * @return the ObjectReplicationPoliciesOperationsClient object.
     */
    ObjectReplicationPoliciesOperationsClient getObjectReplicationPoliciesOperations();

    /**
     * Gets the EncryptionScopesClient object to access its operations.
     * 
     * @return the EncryptionScopesClient object.
     */
    EncryptionScopesClient getEncryptionScopes();

    /**
     * Gets the BlobServicesClient object to access its operations.
     * 
     * @return the BlobServicesClient object.
     */
    BlobServicesClient getBlobServices();

    /**
     * Gets the BlobContainersClient object to access its operations.
     * 
     * @return the BlobContainersClient object.
     */
    BlobContainersClient getBlobContainers();

    /**
     * Gets the FileServicesClient object to access its operations.
     * 
     * @return the FileServicesClient object.
     */
    FileServicesClient getFileServices();

    /**
     * Gets the FileSharesClient object to access its operations.
     * 
     * @return the FileSharesClient object.
     */
    FileSharesClient getFileShares();

    /**
     * Gets the QueueServicesClient object to access its operations.
     * 
     * @return the QueueServicesClient object.
     */
    QueueServicesClient getQueueServices();

    /**
     * Gets the QueuesClient object to access its operations.
     * 
     * @return the QueuesClient object.
     */
    QueuesClient getQueues();

    /**
     * Gets the TableServicesClient object to access its operations.
     * 
     * @return the TableServicesClient object.
     */
    TableServicesClient getTableServices();

    /**
     * Gets the TablesClient object to access its operations.
     * 
     * @return the TablesClient object.
     */
    TablesClient getTables();
}
