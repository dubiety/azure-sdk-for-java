// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.storage.file.datalake.implementation.models.FileSystemsCreateHeaders;
import com.azure.storage.file.datalake.implementation.models.FileSystemsDeleteHeaders;
import com.azure.storage.file.datalake.implementation.models.FileSystemsGetPropertiesHeaders;
import com.azure.storage.file.datalake.implementation.models.FileSystemsListBlobHierarchySegmentHeaders;
import com.azure.storage.file.datalake.implementation.models.FileSystemsListPathsHeaders;
import com.azure.storage.file.datalake.implementation.models.FileSystemsSetPropertiesHeaders;
import com.azure.storage.file.datalake.implementation.models.ListBlobsHierarchySegmentResponse;
import com.azure.storage.file.datalake.implementation.models.ListBlobsIncludeItem;
import com.azure.storage.file.datalake.implementation.models.ListBlobsShowOnly;
import com.azure.storage.file.datalake.implementation.models.ModifiedAccessConditions;
import com.azure.storage.file.datalake.implementation.models.PathList;
import com.azure.storage.file.datalake.models.DataLakeStorageException;
import java.time.OffsetDateTime;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FileSystems. */
public final class FileSystemsImpl {
    /** The proxy service used to perform REST calls. */
    private final FileSystemsService service;

    /** The service client containing this operation class. */
    private final AzureDataLakeStorageRestAPIImpl client;

    /**
     * Initializes an instance of FileSystemsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FileSystemsImpl(AzureDataLakeStorageRestAPIImpl client) {
        this.service =
                RestProxy.create(FileSystemsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDataLakeStorageRestAPIFileSystems to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureDataLakeStorage")
    public interface FileSystemsService {
        @Put("/{filesystem}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsCreateHeaders, Void>> create(
                @HostParam("url") String url,
                @PathParam("filesystem") String fileSystem,
                @QueryParam("resource") String resource,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-properties") String properties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Patch("/{filesystem}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsSetPropertiesHeaders, Void>> setProperties(
                @HostParam("url") String url,
                @PathParam("filesystem") String fileSystem,
                @QueryParam("resource") String resource,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-properties") String properties,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("Accept") String accept,
                Context context);

        @Head("/{filesystem}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsGetPropertiesHeaders, Void>> getProperties(
                @HostParam("url") String url,
                @PathParam("filesystem") String fileSystem,
                @QueryParam("resource") String resource,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/{filesystem}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsDeleteHeaders, Void>> delete(
                @HostParam("url") String url,
                @PathParam("filesystem") String fileSystem,
                @QueryParam("resource") String resource,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{filesystem}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsListPathsHeaders, PathList>> listPaths(
                @HostParam("url") String url,
                @PathParam("filesystem") String fileSystem,
                @QueryParam("resource") String resource,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @QueryParam("continuation") String continuation,
                @QueryParam("directory") String path,
                @QueryParam("recursive") boolean recursive,
                @QueryParam("maxResults") Integer maxResults,
                @QueryParam("upn") Boolean upn,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{filesystem}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<FileSystemsListBlobHierarchySegmentHeaders, ListBlobsHierarchySegmentResponse>>
                listBlobHierarchySegment(
                        @HostParam("url") String url,
                        @PathParam("filesystem") String fileSystem,
                        @QueryParam("restype") String restype,
                        @QueryParam("comp") String comp,
                        @QueryParam("prefix") String prefix,
                        @QueryParam("delimiter") String delimiter,
                        @QueryParam("marker") String marker,
                        @QueryParam("maxResults") Integer maxResults,
                        @QueryParam("include") String include,
                        @QueryParam("showonly") ListBlobsShowOnly showonly,
                        @QueryParam("timeout") Integer timeout,
                        @HeaderParam("x-ms-version") String version,
                        @HeaderParam("x-ms-client-request-id") String requestId,
                        @HeaderParam("Accept") String accept,
                        Context context);
    }

    /**
     * Create a FileSystem rooted at the specified location. If the FileSystem already exists, the operation fails. This
     * operation does not support conditional HTTP requests.
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param properties Optional. User-defined properties to be stored with the filesystem, in the format of a
     *     comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is a base64 encoded
     *     string. Note that the string may only contain ASCII characters in the ISO-8859-1 character set. If the
     *     filesystem exists, any properties not included in the list will be removed. All properties are removed if the
     *     header is omitted. To merge new and existing properties, first get all existing properties and the current
     *     E-Tag, then make a conditional request with the E-Tag and include values for all properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsCreateHeaders, Void>> createWithResponseAsync(
            String requestId, Integer timeout, String properties, Context context) {
        final String accept = "application/json";
        return service.create(
                this.client.getUrl(),
                this.client.getFileSystem(),
                this.client.getResource(),
                requestId,
                timeout,
                this.client.getVersion(),
                properties,
                accept,
                context);
    }

    /**
     * Set properties for the FileSystem. This operation supports conditional HTTP requests. For more information, see
     * [Specifying Conditional Headers for Blob Service
     * Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param properties Optional. User-defined properties to be stored with the filesystem, in the format of a
     *     comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is a base64 encoded
     *     string. Note that the string may only contain ASCII characters in the ISO-8859-1 character set. If the
     *     filesystem exists, any properties not included in the list will be removed. All properties are removed if the
     *     header is omitted. To merge new and existing properties, first get all existing properties and the current
     *     E-Tag, then make a conditional request with the E-Tag and include values for all properties.
     * @param modifiedAccessConditions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsSetPropertiesHeaders, Void>> setPropertiesWithResponseAsync(
            String requestId,
            Integer timeout,
            String properties,
            ModifiedAccessConditions modifiedAccessConditions,
            Context context) {
        final String accept = "application/json";
        OffsetDateTime ifModifiedSinceInternal = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSinceInternal = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifModifiedSince = ifModifiedSinceInternal;
        OffsetDateTime ifUnmodifiedSinceInternal = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSinceInternal = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = ifUnmodifiedSinceInternal;
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setProperties(
                this.client.getUrl(),
                this.client.getFileSystem(),
                this.client.getResource(),
                requestId,
                timeout,
                this.client.getVersion(),
                properties,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                accept,
                context);
    }

    /**
     * All system and user-defined filesystem properties are specified in the response headers.
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsGetPropertiesHeaders, Void>> getPropertiesWithResponseAsync(
            String requestId, Integer timeout, Context context) {
        final String accept = "application/json";
        return service.getProperties(
                this.client.getUrl(),
                this.client.getFileSystem(),
                this.client.getResource(),
                requestId,
                timeout,
                this.client.getVersion(),
                accept,
                context);
    }

    /**
     * Marks the FileSystem for deletion. When a FileSystem is deleted, a FileSystem with the same identifier cannot be
     * created for at least 30 seconds. While the filesystem is being deleted, attempts to create a filesystem with the
     * same identifier will fail with status code 409 (Conflict), with the service returning additional error
     * information indicating that the filesystem is being deleted. All other operations, including operations on any
     * files or directories within the filesystem, will fail with status code 404 (Not Found) while the filesystem is
     * being deleted. This operation supports conditional HTTP requests. For more information, see [Specifying
     * Conditional Headers for Blob Service
     * Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param modifiedAccessConditions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsDeleteHeaders, Void>> deleteWithResponseAsync(
            String requestId, Integer timeout, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String accept = "application/json";
        OffsetDateTime ifModifiedSinceInternal = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSinceInternal = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifModifiedSince = ifModifiedSinceInternal;
        OffsetDateTime ifUnmodifiedSinceInternal = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSinceInternal = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = ifUnmodifiedSinceInternal;
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(
                this.client.getUrl(),
                this.client.getFileSystem(),
                this.client.getResource(),
                requestId,
                timeout,
                this.client.getVersion(),
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                accept,
                context);
    }

    /**
     * List FileSystem paths and their properties.
     *
     * @param recursive Required.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param path Optional. Filters results to paths within the specified directory. An error occurs if the directory
     *     does not exist.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param upn Optional. Valid only when Hierarchical Namespace is enabled for the account. If "true", the user
     *     identity values returned in the x-ms-owner, x-ms-group, and x-ms-acl response headers will be transformed
     *     from Azure Active Directory Object IDs to User Principal Names. If "false", the values will be returned as
     *     Azure Active Directory Object IDs. The default value is false. Note that group and application Object IDs are
     *     not translated because they do not have unique friendly names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsListPathsHeaders, PathList>> listPathsWithResponseAsync(
            boolean recursive,
            String requestId,
            Integer timeout,
            String continuation,
            String path,
            Integer maxResults,
            Boolean upn,
            Context context) {
        final String accept = "application/json";
        return service.listPaths(
                this.client.getUrl(),
                this.client.getFileSystem(),
                this.client.getResource(),
                requestId,
                timeout,
                this.client.getVersion(),
                continuation,
                path,
                recursive,
                maxResults,
                upn,
                accept,
                context);
    }

    /**
     * The List Blobs operation returns a list of the blobs under the specified container.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param delimiter When the request includes this parameter, the operation returns a BlobPrefix element in the
     *     response body that acts as a placeholder for all blobs whose names begin with the same substring up to the
     *     appearance of the delimiter character. The delimiter may be a single character or a string.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next
     *     listing operation. The operation returns the NextMarker value within the response body if the listing
     *     operation did not return all containers remaining to be listed with the current page. The NextMarker value
     *     can be used as the value for the marker parameter in a subsequent call to request the next page of list
     *     items. The marker value is opaque to the client.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param include Include this parameter to specify one or more datasets to include in the response.
     * @param showonly Include this parameter to specify one or more datasets to include in the response.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an enumeration of blobs along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<FileSystemsListBlobHierarchySegmentHeaders, ListBlobsHierarchySegmentResponse>>
            listBlobHierarchySegmentWithResponseAsync(
                    String prefix,
                    String delimiter,
                    String marker,
                    Integer maxResults,
                    List<ListBlobsIncludeItem> include,
                    ListBlobsShowOnly showonly,
                    Integer timeout,
                    String requestId,
                    Context context) {
        final String restype = "container";
        final String comp = "list";
        final String accept = "application/xml";
        String includeConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listBlobHierarchySegment(
                this.client.getUrl(),
                this.client.getFileSystem(),
                restype,
                comp,
                prefix,
                delimiter,
                marker,
                maxResults,
                includeConverted,
                showonly,
                timeout,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }
}
