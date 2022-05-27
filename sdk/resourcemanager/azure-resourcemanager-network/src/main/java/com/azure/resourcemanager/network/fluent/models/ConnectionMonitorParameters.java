// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ConnectionMonitorDestination;
import com.azure.resourcemanager.network.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.models.ConnectionMonitorOutput;
import com.azure.resourcemanager.network.models.ConnectionMonitorSource;
import com.azure.resourcemanager.network.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.models.ConnectionMonitorTestGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters that define the operation to create a connection monitor. */
@Fluent
public class ConnectionMonitorParameters {
    /*
     * Describes the source of connection monitor.
     */
    @JsonProperty(value = "source")
    private ConnectionMonitorSource source;

    /*
     * Describes the destination of connection monitor.
     */
    @JsonProperty(value = "destination")
    private ConnectionMonitorDestination destination;

    /*
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "autoStart")
    private Boolean autoStart;

    /*
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /*
     * List of connection monitor endpoints.
     */
    @JsonProperty(value = "endpoints")
    private List<ConnectionMonitorEndpoint> endpoints;

    /*
     * List of connection monitor test configurations.
     */
    @JsonProperty(value = "testConfigurations")
    private List<ConnectionMonitorTestConfiguration> testConfigurations;

    /*
     * List of connection monitor test groups.
     */
    @JsonProperty(value = "testGroups")
    private List<ConnectionMonitorTestGroup> testGroups;

    /*
     * List of connection monitor outputs.
     */
    @JsonProperty(value = "outputs")
    private List<ConnectionMonitorOutput> outputs;

    /*
     * Optional notes to be associated with the connection monitor.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /**
     * Get the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set the source property: Describes the source of connection monitor.
     *
     * @param source the source value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Describes the destination of connection monitor.
     *
     * @param destination the destination value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

    /**
     * Get the endpoints property: List of connection monitor endpoints.
     *
     * @return the endpoints value.
     */
    public List<ConnectionMonitorEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: List of connection monitor endpoints.
     *
     * @param endpoints the endpoints value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the testConfigurations property: List of connection monitor test configurations.
     *
     * @return the testConfigurations value.
     */
    public List<ConnectionMonitorTestConfiguration> testConfigurations() {
        return this.testConfigurations;
    }

    /**
     * Set the testConfigurations property: List of connection monitor test configurations.
     *
     * @param testConfigurations the testConfigurations value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withTestConfigurations(
        List<ConnectionMonitorTestConfiguration> testConfigurations) {
        this.testConfigurations = testConfigurations;
        return this;
    }

    /**
     * Get the testGroups property: List of connection monitor test groups.
     *
     * @return the testGroups value.
     */
    public List<ConnectionMonitorTestGroup> testGroups() {
        return this.testGroups;
    }

    /**
     * Set the testGroups property: List of connection monitor test groups.
     *
     * @param testGroups the testGroups value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        this.testGroups = testGroups;
        return this;
    }

    /**
     * Get the outputs property: List of connection monitor outputs.
     *
     * @return the outputs value.
     */
    public List<ConnectionMonitorOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: List of connection monitor outputs.
     *
     * @param outputs the outputs value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withOutputs(List<ConnectionMonitorOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the notes property: Optional notes to be associated with the connection monitor.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: Optional notes to be associated with the connection monitor.
     *
     * @param notes the notes value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (destination() != null) {
            destination().validate();
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (testConfigurations() != null) {
            testConfigurations().forEach(e -> e.validate());
        }
        if (testGroups() != null) {
            testGroups().forEach(e -> e.validate());
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
    }
}
