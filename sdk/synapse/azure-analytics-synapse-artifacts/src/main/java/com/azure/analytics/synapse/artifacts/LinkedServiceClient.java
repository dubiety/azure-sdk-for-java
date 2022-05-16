// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LinkedServicesImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.LinkedServiceResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class LinkedServiceClient {
    @Generated private final LinkedServicesImpl serviceClient;

    /**
     * Initializes an instance of LinkedServiceClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    LinkedServiceClient(LinkedServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists linked services.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LinkedServiceResource> getLinkedServicesByWorkspace() {
        return this.serviceClient.getLinkedServicesByWorkspace();
    }

    /**
     * Lists linked services.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LinkedServiceResource> getLinkedServicesByWorkspace(Context context) {
        return this.serviceClient.getLinkedServicesByWorkspace(context);
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
     * @param ifMatch ETag of the linkedService entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkedServiceResource createOrUpdateLinkedService(
            String linkedServiceName, LinkedServiceResource linkedService, String ifMatch) {
        return this.serviceClient.createOrUpdateLinkedService(linkedServiceName, linkedService, ifMatch);
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkedServiceResource createOrUpdateLinkedService(
            String linkedServiceName, LinkedServiceResource linkedService) {
        return this.serviceClient.createOrUpdateLinkedService(linkedServiceName, linkedService);
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
     * @param ifMatch ETag of the linkedService entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkedServiceResource> createOrUpdateLinkedServiceWithResponse(
            String linkedServiceName, LinkedServiceResource linkedService, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateLinkedServiceWithResponse(
                linkedServiceName, linkedService, ifMatch, context);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkedServiceResource getLinkedService(String linkedServiceName, String ifNoneMatch) {
        return this.serviceClient.getLinkedService(linkedServiceName, ifNoneMatch);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkedServiceResource getLinkedService(String linkedServiceName) {
        return this.serviceClient.getLinkedService(linkedServiceName);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkedServiceResource> getLinkedServiceWithResponse(
            String linkedServiceName, String ifNoneMatch, Context context) {
        return this.serviceClient.getLinkedServiceWithResponse(linkedServiceName, ifNoneMatch, context);
    }

    /**
     * Deletes a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteLinkedService(String linkedServiceName) {
        this.serviceClient.deleteLinkedService(linkedServiceName);
    }

    /**
     * Deletes a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteLinkedServiceWithResponse(String linkedServiceName, Context context) {
        return this.serviceClient.deleteLinkedServiceWithResponse(linkedServiceName, context);
    }

    /**
     * Renames a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameLinkedService(String linkedServiceName, ArtifactRenameRequest request) {
        this.serviceClient.renameLinkedService(linkedServiceName, request);
    }

    /**
     * Renames a linked service.
     *
     * @param linkedServiceName The linked service name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameLinkedServiceWithResponse(
            String linkedServiceName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renameLinkedServiceWithResponse(linkedServiceName, request, context);
    }
}
