// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.servicebus.properties;

import com.azure.spring.cloud.autoconfigure.implementation.properties.core.AbstractAzureAmqpConfigurationProperties;
import com.azure.spring.cloud.core.implementation.connectionstring.ServiceBusConnectionString;
import com.azure.spring.cloud.service.servicebus.properties.ServiceBusEntityType;

/**
 *
 */
public abstract class AzureServiceBusCommonProperties extends AbstractAzureAmqpConfigurationProperties {

    // https://help.boomi.com/bundle/connectors/page/r-atm-Microsoft_Azure_Service_Bus_connection.html
    // https://docs.microsoft.com/rest/api/servicebus/addressing-and-protocol
    /**
     * The domain name of a Service Bus namespace.
     */
    private String domainName;
    /**
     * The namespace of a service bus, which is the prefix of the FQDN. A FQDN should be composed of &lt;NamespaceName&gt;.&lt;DomainName&gt;
     */
    private String namespace;
    /**
     * Connection string to connect to a service bus.
     */
    private String connectionString;
    /**
     * The name of a Service Bus Queue or Topic.
     */
    private String entityName;
    /**
     * The type of Service Bus entity, which is a Queue or a Topic.
     */
    private ServiceBusEntityType entityType;

    /**
     * Sets a custom endpoint address when connecting to the Service Bus service. This can be useful when your network
     * does not allow connecting to the standard Azure Service Bus endpoint address, but does allow connecting through
     * an intermediary. For example: {@literal https://my.custom.endpoint.com:55300}.
     */
    private String customEndpointAddress;

    private String extractFqdnFromConnectionString() {
        if (this.connectionString == null) {
            return null;
        }
        return new ServiceBusConnectionString(this.connectionString).getFullyQualifiedNamespace();
    }

    public String getFullyQualifiedNamespace() {
        return this.namespace == null ? extractFqdnFromConnectionString() : buildFqdnFromNamespace();
    }

    private String buildFqdnFromNamespace() {
        if (namespace == null || getDomainName() == null) {
            return null;
        }
        return this.namespace + "." + getDomainName();
    }

    public String getDomainName() {
        return this.domainName == null ? this.getProfile().getEnvironment().getServiceBusDomainName() : domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String name) {
        this.entityName = name;
    }

    public ServiceBusEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(ServiceBusEntityType type) {
        this.entityType = type;
    }

    public String getCustomEndpointAddress() {
        return customEndpointAddress;
    }

    public void setCustomEndpointAddress(String customEndpointAddress) {
        this.customEndpointAddress = customEndpointAddress;
    }
}
