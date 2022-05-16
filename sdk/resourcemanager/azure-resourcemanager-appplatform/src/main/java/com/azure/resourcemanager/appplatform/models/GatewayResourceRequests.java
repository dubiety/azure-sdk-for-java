// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource request payload of Spring Cloud Gateway. */
@Fluent
public final class GatewayResourceRequests {
    /*
     * Cpu allocated to each Spring Cloud Gateway instance.
     */
    @JsonProperty(value = "cpu")
    private String cpu;

    /*
     * Memory allocated to each Spring Cloud Gateway instance.
     */
    @JsonProperty(value = "memory")
    private String memory;

    /**
     * Get the cpu property: Cpu allocated to each Spring Cloud Gateway instance.
     *
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Cpu allocated to each Spring Cloud Gateway instance.
     *
     * @param cpu the cpu value to set.
     * @return the GatewayResourceRequests object itself.
     */
    public GatewayResourceRequests withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the memory property: Memory allocated to each Spring Cloud Gateway instance.
     *
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Memory allocated to each Spring Cloud Gateway instance.
     *
     * @param memory the memory value to set.
     * @return the GatewayResourceRequests object itself.
     */
    public GatewayResourceRequests withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
