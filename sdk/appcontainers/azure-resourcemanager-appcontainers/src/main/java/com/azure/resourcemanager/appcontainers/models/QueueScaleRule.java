// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container App container Azure Queue based scaling rule. */
@Fluent
public final class QueueScaleRule {
    /*
     * Queue name.
     */
    @JsonProperty(value = "queueName")
    private String queueName;

    /*
     * Queue length.
     */
    @JsonProperty(value = "queueLength")
    private Integer queueLength;

    /*
     * Authentication secrets for the queue scale rule.
     */
    @JsonProperty(value = "auth")
    private List<ScaleRuleAuth> auth;

    /**
     * Get the queueName property: Queue name.
     *
     * @return the queueName value.
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the queueName property: Queue name.
     *
     * @param queueName the queueName value to set.
     * @return the QueueScaleRule object itself.
     */
    public QueueScaleRule withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get the queueLength property: Queue length.
     *
     * @return the queueLength value.
     */
    public Integer queueLength() {
        return this.queueLength;
    }

    /**
     * Set the queueLength property: Queue length.
     *
     * @param queueLength the queueLength value to set.
     * @return the QueueScaleRule object itself.
     */
    public QueueScaleRule withQueueLength(Integer queueLength) {
        this.queueLength = queueLength;
        return this;
    }

    /**
     * Get the auth property: Authentication secrets for the queue scale rule.
     *
     * @return the auth value.
     */
    public List<ScaleRuleAuth> auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Authentication secrets for the queue scale rule.
     *
     * @param auth the auth value to set.
     * @return the QueueScaleRule object itself.
     */
    public QueueScaleRule withAuth(List<ScaleRuleAuth> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (auth() != null) {
            auth().forEach(e -> e.validate());
        }
    }
}
