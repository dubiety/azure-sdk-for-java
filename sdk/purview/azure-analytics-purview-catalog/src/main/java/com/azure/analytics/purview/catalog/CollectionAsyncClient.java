// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.analytics.purview.catalog.implementation.CollectionsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous PurviewCatalogClient type. */
@ServiceClient(builder = PurviewCatalogClientBuilder.class, isAsync = true)
public final class CollectionAsyncClient {
    @Generated private final CollectionsImpl serviceClient;

    /**
     * Initializes an instance of Collections client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    CollectionAsyncClient(CollectionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates or updates an entity to a collection. Existing entity is matched using its unique guid if supplied or by
     * its unique attributes eg: qualifiedName. Map and array of collections are not well supported. E.g.,
     * array&lt;array&lt;int&gt;&gt;, array&lt;map&lt;string, int&gt;&gt;.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             createTime: Float
     *             createdBy: String
     *             guid: String
     *             homeId: String
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             provenanceType: Float
     *             proxy: Boolean
     *             relationshipAttributes: {
     *                 String: Object
     *             }
     *             status: String(ACTIVE/DELETED)
     *             updateTime: Float
     *             updatedBy: String
     *             version: Float
     *             source: String
     *             sourceDetails: {
     *                 String: Object
     *             }
     *             contacts: {
     *                 String: [
     *                     {
     *                         id: String
     *                         info: String
     *                     }
     *                 ]
     *             }
     *         }
     *     }
     *     entity: (recursive schema, see entity above)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     guidAssignments: {
     *         String: String
     *     }
     *     mutatedEntities: {
     *         String: [
     *             {
     *                 attributes: {
     *                     String: Object
     *                 }
     *                 typeName: String
     *                 lastModifiedTS: String
     *                 classificationNames: [
     *                     String
     *                 ]
     *                 classifications: [
     *                     {
     *                         attributes: {
     *                             String: Object
     *                         }
     *                         typeName: String
     *                         lastModifiedTS: String
     *                         entityGuid: String
     *                         entityStatus: String(ACTIVE/DELETED)
     *                         removePropagationsOnEntityDelete: Boolean
     *                         validityPeriods: [
     *                             {
     *                                 endTime: String
     *                                 startTime: String
     *                                 timeZone: String
     *                             }
     *                         ]
     *                         source: String
     *                         sourceDetails: {
     *                             String: Object
     *                         }
     *                     }
     *                 ]
     *                 displayText: String
     *                 guid: String
     *                 meaningNames: [
     *                     String
     *                 ]
     *                 meanings: [
     *                     {
     *                         confidence: Integer
     *                         createdBy: String
     *                         description: String
     *                         displayText: String
     *                         expression: String
     *                         relationGuid: String
     *                         source: String
     *                         status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                         steward: String
     *                         termGuid: String
     *                     }
     *                 ]
     *                 status: String(ACTIVE/DELETED)
     *             }
     *         ]
     *     }
     *     partialUpdatedEntities: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param collection the collection unique name.
     * @param entity Atlas entity with extended information.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return entityMutationResponse along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String collection, BinaryData entity, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(collection, entity, requestOptions);
    }

    /**
     * Creates or updates entities in bulk to a collection. Existing entity is matched using its unique guid if supplied
     * or by its unique attributes eg: qualifiedName. Map and array of collections are not well supported. E.g.,
     * array&lt;array&lt;int&gt;&gt;, array&lt;map&lt;string, int&gt;&gt;.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             createTime: Float
     *             createdBy: String
     *             guid: String
     *             homeId: String
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             provenanceType: Float
     *             proxy: Boolean
     *             relationshipAttributes: {
     *                 String: Object
     *             }
     *             status: String(ACTIVE/DELETED)
     *             updateTime: Float
     *             updatedBy: String
     *             version: Float
     *             source: String
     *             sourceDetails: {
     *                 String: Object
     *             }
     *             contacts: {
     *                 String: [
     *                     {
     *                         id: String
     *                         info: String
     *                     }
     *                 ]
     *             }
     *         }
     *     }
     *     entities: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     guidAssignments: {
     *         String: String
     *     }
     *     mutatedEntities: {
     *         String: [
     *             {
     *                 attributes: {
     *                     String: Object
     *                 }
     *                 typeName: String
     *                 lastModifiedTS: String
     *                 classificationNames: [
     *                     String
     *                 ]
     *                 classifications: [
     *                     {
     *                         attributes: {
     *                             String: Object
     *                         }
     *                         typeName: String
     *                         lastModifiedTS: String
     *                         entityGuid: String
     *                         entityStatus: String(ACTIVE/DELETED)
     *                         removePropagationsOnEntityDelete: Boolean
     *                         validityPeriods: [
     *                             {
     *                                 endTime: String
     *                                 startTime: String
     *                                 timeZone: String
     *                             }
     *                         ]
     *                         source: String
     *                         sourceDetails: {
     *                             String: Object
     *                         }
     *                     }
     *                 ]
     *                 displayText: String
     *                 guid: String
     *                 meaningNames: [
     *                     String
     *                 ]
     *                 meanings: [
     *                     {
     *                         confidence: Integer
     *                         createdBy: String
     *                         description: String
     *                         displayText: String
     *                         expression: String
     *                         relationGuid: String
     *                         source: String
     *                         status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                         steward: String
     *                         termGuid: String
     *                     }
     *                 ]
     *                 status: String(ACTIVE/DELETED)
     *             }
     *         ]
     *     }
     *     partialUpdatedEntities: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param collection the collection unique name.
     * @param entities Atlas entities with extended information.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return entityMutationResponse along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateBulkWithResponse(
            String collection, BinaryData entities, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateBulkWithResponseAsync(collection, entities, requestOptions);
    }

    /**
     * Move existing entities to the target collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     entityGuids: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     guidAssignments: {
     *         String: String
     *     }
     *     mutatedEntities: {
     *         String: [
     *             {
     *                 attributes: {
     *                     String: Object
     *                 }
     *                 typeName: String
     *                 lastModifiedTS: String
     *                 classificationNames: [
     *                     String
     *                 ]
     *                 classifications: [
     *                     {
     *                         attributes: {
     *                             String: Object
     *                         }
     *                         typeName: String
     *                         lastModifiedTS: String
     *                         entityGuid: String
     *                         entityStatus: String(ACTIVE/DELETED)
     *                         removePropagationsOnEntityDelete: Boolean
     *                         validityPeriods: [
     *                             {
     *                                 endTime: String
     *                                 startTime: String
     *                                 timeZone: String
     *                             }
     *                         ]
     *                         source: String
     *                         sourceDetails: {
     *                             String: Object
     *                         }
     *                     }
     *                 ]
     *                 displayText: String
     *                 guid: String
     *                 meaningNames: [
     *                     String
     *                 ]
     *                 meanings: [
     *                     {
     *                         confidence: Integer
     *                         createdBy: String
     *                         description: String
     *                         displayText: String
     *                         expression: String
     *                         relationGuid: String
     *                         source: String
     *                         status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                         steward: String
     *                         termGuid: String
     *                     }
     *                 ]
     *                 status: String(ACTIVE/DELETED)
     *             }
     *         ]
     *     }
     *     partialUpdatedEntities: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param collection the collection unique name.
     * @param moveEntitiesRequest Entity guids to be moved to target collection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return entityMutationResponse along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> moveEntitiesToCollectionWithResponse(
            String collection, BinaryData moveEntitiesRequest, RequestOptions requestOptions) {
        return this.serviceClient.moveEntitiesToCollectionWithResponseAsync(
                collection, moveEntitiesRequest, requestOptions);
    }
}
