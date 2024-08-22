// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.RegistryModelVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.ModelVersionInner;
import com.azure.resourcemanager.machinelearning.fluent.models.PendingUploadResponseDtoInner;
import com.azure.resourcemanager.machinelearning.models.ListViewType;
import com.azure.resourcemanager.machinelearning.models.ModelVersion;
import com.azure.resourcemanager.machinelearning.models.PendingUploadRequestDto;
import com.azure.resourcemanager.machinelearning.models.PendingUploadResponseDto;
import com.azure.resourcemanager.machinelearning.models.RegistryModelVersions;

public final class RegistryModelVersionsImpl implements RegistryModelVersions {
    private static final ClientLogger LOGGER = new ClientLogger(RegistryModelVersionsImpl.class);

    private final RegistryModelVersionsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public RegistryModelVersionsImpl(RegistryModelVersionsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ModelVersion> list(String resourceGroupName, String registryName, String modelName) {
        PagedIterable<ModelVersionInner> inner = this.serviceClient().list(resourceGroupName, registryName, modelName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ModelVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<ModelVersion> list(String resourceGroupName, String registryName, String modelName,
        String skip, String orderBy, Integer top, String version, String description, String tags, String properties,
        ListViewType listViewType, Context context) {
        PagedIterable<ModelVersionInner> inner = this.serviceClient()
            .list(resourceGroupName, registryName, modelName, skip, orderBy, top, version, description, tags,
                properties, listViewType, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ModelVersionImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String registryName, String modelName, String version) {
        this.serviceClient().delete(resourceGroupName, registryName, modelName, version);
    }

    public void delete(String resourceGroupName, String registryName, String modelName, String version,
        Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, modelName, version, context);
    }

    public Response<ModelVersion> getWithResponse(String resourceGroupName, String registryName, String modelName,
        String version, Context context) {
        Response<ModelVersionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, registryName, modelName, version, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ModelVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ModelVersion get(String resourceGroupName, String registryName, String modelName, String version) {
        ModelVersionInner inner = this.serviceClient().get(resourceGroupName, registryName, modelName, version);
        if (inner != null) {
            return new ModelVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ModelVersion createOrUpdate(String resourceGroupName, String registryName, String modelName, String version,
        ModelVersionInner body) {
        ModelVersionInner inner
            = this.serviceClient().createOrUpdate(resourceGroupName, registryName, modelName, version, body);
        if (inner != null) {
            return new ModelVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ModelVersion createOrUpdate(String resourceGroupName, String registryName, String modelName, String version,
        ModelVersionInner body, Context context) {
        ModelVersionInner inner
            = this.serviceClient().createOrUpdate(resourceGroupName, registryName, modelName, version, body, context);
        if (inner != null) {
            return new ModelVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PendingUploadResponseDto> createOrGetStartPendingUploadWithResponse(String resourceGroupName,
        String registryName, String modelName, String version, PendingUploadRequestDto body, Context context) {
        Response<PendingUploadResponseDtoInner> inner = this.serviceClient()
            .createOrGetStartPendingUploadWithResponse(resourceGroupName, registryName, modelName, version, body,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PendingUploadResponseDtoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PendingUploadResponseDto createOrGetStartPendingUpload(String resourceGroupName, String registryName,
        String modelName, String version, PendingUploadRequestDto body) {
        PendingUploadResponseDtoInner inner = this.serviceClient()
            .createOrGetStartPendingUpload(resourceGroupName, registryName, modelName, version, body);
        if (inner != null) {
            return new PendingUploadResponseDtoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private RegistryModelVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}
