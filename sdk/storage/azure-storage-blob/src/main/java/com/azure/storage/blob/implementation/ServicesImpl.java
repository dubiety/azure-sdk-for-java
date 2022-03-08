// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.storage.blob.implementation.models.ServicesFilterBlobsResponse;
import com.azure.storage.blob.implementation.models.ServicesGetAccountInfoResponse;
import com.azure.storage.blob.implementation.models.ServicesGetPropertiesResponse;
import com.azure.storage.blob.implementation.models.ServicesGetStatisticsResponse;
import com.azure.storage.blob.implementation.models.ServicesGetUserDelegationKeyResponse;
import com.azure.storage.blob.implementation.models.ServicesListBlobContainersSegmentNextResponse;
import com.azure.storage.blob.implementation.models.ServicesListBlobContainersSegmentResponse;
import com.azure.storage.blob.implementation.models.ServicesSetPropertiesResponse;
import com.azure.storage.blob.implementation.models.StorageErrorException;
import com.azure.storage.blob.models.BlobContainerItem;
import com.azure.storage.blob.models.BlobServiceProperties;
import com.azure.storage.blob.models.KeyInfo;
import com.azure.storage.blob.models.ListBlobContainersIncludeType;
import java.nio.ByteBuffer;
import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Services. */
public final class ServicesImpl {
    /** The proxy service used to perform REST calls. */
    private final ServicesService service;

    /** The service client containing this operation class. */
    private final AzureBlobStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServicesImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageServices to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageServ")
    public interface ServicesService {
        @Put("/")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/xml") BlobServiceProperties blobServiceProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesGetStatisticsResponse> getStatistics(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesListBlobContainersSegmentResponse> listBlobContainersSegment(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @QueryParam("prefix") String prefix,
                @QueryParam("marker") String marker,
                @QueryParam("maxresults") Integer maxresults,
                @QueryParam("include") String listBlobContainersIncludeType,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKey(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/xml") KeyInfo keyInfo,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesGetAccountInfoResponse> getAccountInfo(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<StreamResponse> submitBatch(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("Content-Type") String multipartContentType,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/xml") Flux<ByteBuffer> body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(com.azure.storage.blob.models.BlobStorageException.class)
        Mono<ServicesFilterBlobsResponse> filterBlobs(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("where") String where,
                @QueryParam("marker") String marker,
                @QueryParam("maxresults") Integer maxresults,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesListBlobContainersSegmentNextResponse> listBlobContainersSegmentNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and
     * CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param blobServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithResponseAsync(
            BlobServiceProperties blobServiceProperties, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.setProperties(
                this.client.getUrl(),
                restype,
                comp,
                timeout,
                this.client.getVersion(),
                requestId,
                blobServiceProperties,
                accept,
                context);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account's Blob service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithResponseAsync(
            Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.getProperties(
                this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, accept, context);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location
     * endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return statistics for the storage service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetStatisticsResponse> getStatisticsWithResponseAsync(
            Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "stats";
        final String accept = "application/xml";
        return service.getStatistics(
                this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, accept, context);
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next
     *     listing operation. The operation returns the NextMarker value within the response body if the listing
     *     operation did not return all containers remaining to be listed with the current page. The NextMarker value
     *     can be used as the value for the marker parameter in a subsequent call to request the next page of list
     *     items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify
     *     maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the
     *     listing operation crosses a partition boundary, then the service will return a continuation token for
     *     retrieving the remainder of the results. For this reason, it is possible that the service will return fewer
     *     results than specified by maxresults, or than the default of 5000.
     * @param listBlobContainersIncludeType Include this parameter to specify that the container's metadata be returned
     *     as part of the response body.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an enumeration of containers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BlobContainerItem>> listBlobContainersSegmentSinglePageAsync(
            String prefix,
            String marker,
            Integer maxresults,
            List<ListBlobContainersIncludeType> listBlobContainersIncludeType,
            Integer timeout,
            String requestId,
            Context context) {
        final String comp = "list";
        final String accept = "application/xml";
        String listBlobContainersIncludeTypeConverted =
                JacksonAdapter.createDefaultSerializerAdapter()
                        .serializeList(listBlobContainersIncludeType, CollectionFormat.CSV);
        return service.listBlobContainersSegment(
                        this.client.getUrl(),
                        comp,
                        prefix,
                        marker,
                        maxresults,
                        listBlobContainersIncludeTypeConverted,
                        timeout,
                        this.client.getVersion(),
                        requestId,
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getBlobContainerItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token
     * authentication.
     *
     * @param keyInfo Key information.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a user delegation key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKeyWithResponseAsync(
            KeyInfo keyInfo, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "userdelegationkey";
        final String accept = "application/xml";
        return service.getUserDelegationKey(
                this.client.getUrl(),
                restype,
                comp,
                timeout,
                this.client.getVersion(),
                requestId,
                keyInfo,
                accept,
                context);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetAccountInfoResponse> getAccountInfoWithResponseAsync(Context context) {
        final String restype = "account";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.getAccountInfo(this.client.getUrl(), restype, comp, this.client.getVersion(), accept, context);
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     *
     * @param contentLength The length of the request.
     * @param multipartContentType Required. The value of this header must be multipart/mixed with a batch boundary.
     *     Example header value: multipart/mixed; boundary=batch_&lt;GUID&gt;.
     * @param body Initial data.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StreamResponse> submitBatchWithResponseAsync(
            long contentLength,
            String multipartContentType,
            Flux<ByteBuffer> body,
            Integer timeout,
            String requestId,
            Context context) {
        final String comp = "batch";
        final String accept = "application/xml";
        return service.submitBatch(
                this.client.getUrl(),
                comp,
                contentLength,
                multipartContentType,
                timeout,
                this.client.getVersion(),
                requestId,
                body,
                accept,
                context);
    }

    /**
     * The Filter Blobs operation enables callers to list blobs across all containers whose tags match a given search
     * expression. Filter blobs searches across all containers within a storage account but can be scoped within the
     * expression to a single container.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param where Filters the results to return only to return only blobs whose tags match the specified expression.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next
     *     listing operation. The operation returns the NextMarker value within the response body if the listing
     *     operation did not return all containers remaining to be listed with the current page. The NextMarker value
     *     can be used as the value for the marker parameter in a subsequent call to request the next page of list
     *     items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify
     *     maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the
     *     listing operation crosses a partition boundary, then the service will return a continuation token for
     *     retrieving the remainder of the results. For this reason, it is possible that the service will return fewer
     *     results than specified by maxresults, or than the default of 5000.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a Filter Blobs API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesFilterBlobsResponse> filterBlobsWithResponseAsync(
            Integer timeout, String requestId, String where, String marker, Integer maxresults, Context context) {
        final String comp = "blobs";
        final String accept = "application/xml";
        return service.filterBlobs(
                this.client.getUrl(),
                comp,
                timeout,
                this.client.getVersion(),
                requestId,
                where,
                marker,
                maxresults,
                accept,
                context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an enumeration of containers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BlobContainerItem>> listBlobContainersSegmentNextSinglePageAsync(
            String nextLink, String requestId, Context context) {
        final String accept = "application/xml";
        return service.listBlobContainersSegmentNext(
                        nextLink, this.client.getUrl(), this.client.getVersion(), requestId, accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getBlobContainerItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }
}
