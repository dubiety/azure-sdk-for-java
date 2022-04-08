// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Databricks Notebook activity properties. */
@Fluent
public final class DatabricksNotebookActivityTypeProperties {
    /*
     * The absolute path of the notebook to be run in the Databricks Workspace.
     * This path must begin with a slash. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "notebookPath", required = true)
    private Object notebookPath;

    /*
     * Base parameters to be used for each run of this job.If the notebook
     * takes a parameter that is not specified, the default value from the
     * notebook will be used.
     */
    @JsonProperty(value = "baseParameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> baseParameters;

    /*
     * A list of libraries to be installed on the cluster that will execute the
     * job.
     */
    @JsonProperty(value = "libraries")
    private List<Map<String, Object>> libraries;

    /**
     * Get the notebookPath property: The absolute path of the notebook to be run in the Databricks Workspace. This path
     * must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @return the notebookPath value.
     */
    public Object notebookPath() {
        return this.notebookPath;
    }

    /**
     * Set the notebookPath property: The absolute path of the notebook to be run in the Databricks Workspace. This path
     * must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @param notebookPath the notebookPath value to set.
     * @return the DatabricksNotebookActivityTypeProperties object itself.
     */
    public DatabricksNotebookActivityTypeProperties withNotebookPath(Object notebookPath) {
        this.notebookPath = notebookPath;
        return this;
    }

    /**
     * Get the baseParameters property: Base parameters to be used for each run of this job.If the notebook takes a
     * parameter that is not specified, the default value from the notebook will be used.
     *
     * @return the baseParameters value.
     */
    public Map<String, Object> baseParameters() {
        return this.baseParameters;
    }

    /**
     * Set the baseParameters property: Base parameters to be used for each run of this job.If the notebook takes a
     * parameter that is not specified, the default value from the notebook will be used.
     *
     * @param baseParameters the baseParameters value to set.
     * @return the DatabricksNotebookActivityTypeProperties object itself.
     */
    public DatabricksNotebookActivityTypeProperties withBaseParameters(Map<String, Object> baseParameters) {
        this.baseParameters = baseParameters;
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @return the libraries value.
     */
    public List<Map<String, Object>> libraries() {
        return this.libraries;
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @param libraries the libraries value to set.
     * @return the DatabricksNotebookActivityTypeProperties object itself.
     */
    public DatabricksNotebookActivityTypeProperties withLibraries(List<Map<String, Object>> libraries) {
        this.libraries = libraries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (notebookPath() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property notebookPath in model DatabricksNotebookActivityTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabricksNotebookActivityTypeProperties.class);
}
