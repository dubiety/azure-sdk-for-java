// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.NotebookAccessTokenResultInner;
import com.azure.resourcemanager.machinelearning.models.NotebookAccessTokenResult;

public final class NotebookAccessTokenResultImpl implements NotebookAccessTokenResult {
    private NotebookAccessTokenResultInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    NotebookAccessTokenResultImpl(
        NotebookAccessTokenResultInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String notebookResourceId() {
        return this.innerModel().notebookResourceId();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public String publicDns() {
        return this.innerModel().publicDns();
    }

    public String accessToken() {
        return this.innerModel().accessToken();
    }

    public String tokenType() {
        return this.innerModel().tokenType();
    }

    public Integer expiresIn() {
        return this.innerModel().expiresIn();
    }

    public String refreshToken() {
        return this.innerModel().refreshToken();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public NotebookAccessTokenResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}
