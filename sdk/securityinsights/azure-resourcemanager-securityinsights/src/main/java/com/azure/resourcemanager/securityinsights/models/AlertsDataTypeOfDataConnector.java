// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Alerts data type for data connectors. */
@Fluent
public class AlertsDataTypeOfDataConnector {
    /*
     * Alerts data type connection.
     */
    @JsonProperty(value = "alerts", required = true)
    private DataConnectorDataTypeCommon alerts;

    /**
     * Get the alerts property: Alerts data type connection.
     *
     * @return the alerts value.
     */
    public DataConnectorDataTypeCommon alerts() {
        return this.alerts;
    }

    /**
     * Set the alerts property: Alerts data type connection.
     *
     * @param alerts the alerts value to set.
     * @return the AlertsDataTypeOfDataConnector object itself.
     */
    public AlertsDataTypeOfDataConnector withAlerts(DataConnectorDataTypeCommon alerts) {
        this.alerts = alerts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alerts() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alerts in model AlertsDataTypeOfDataConnector"));
        } else {
            alerts().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AlertsDataTypeOfDataConnector.class);
}
