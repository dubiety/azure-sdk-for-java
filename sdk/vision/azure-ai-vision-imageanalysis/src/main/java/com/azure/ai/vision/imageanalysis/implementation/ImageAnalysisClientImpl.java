// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.imageanalysis.implementation;

import com.azure.ai.vision.imageanalysis.ImageAnalysisServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the ImageAnalysisClient type.
 */
public final class ImageAnalysisClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ImageAnalysisClientService service;

    /**
     * Azure AI Computer Vision endpoint (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     */
    private final String endpoint;

    /**
     * Gets Azure AI Computer Vision endpoint (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final ImageAnalysisServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public ImageAnalysisServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of ImageAnalysisClient client.
     * 
     * @param endpoint Azure AI Computer Vision endpoint (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ImageAnalysisClientImpl(String endpoint, ImageAnalysisServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ImageAnalysisClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Azure AI Computer Vision endpoint (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ImageAnalysisClientImpl(HttpPipeline httpPipeline, String endpoint,
        ImageAnalysisServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ImageAnalysisClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Azure AI Computer Vision endpoint (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ImageAnalysisClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        ImageAnalysisServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service
            = RestProxy.create(ImageAnalysisClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for ImageAnalysisClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}/computervision")
    @ServiceInterface(name = "ImageAnalysisClient")
    public interface ImageAnalysisClientService {
        @Post("/imageanalysis:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeFromImageData(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("content-type") String contentType,
            @QueryParam("features") String visualFeatures, @HeaderParam("Accept") String accept,
            @BodyParam("application/octet-stream") BinaryData imageData, RequestOptions requestOptions,
            Context context);

        @Post("/imageanalysis:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> analyzeFromImageDataSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("content-type") String contentType,
            @QueryParam("features") String visualFeatures, @HeaderParam("Accept") String accept,
            @BodyParam("application/octet-stream") BinaryData imageData, RequestOptions requestOptions,
            Context context);

        @Post("/imageanalysis:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeFromUrl(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("content-type") String contentType,
            @QueryParam("features") String visualFeatures, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") BinaryData imageUrl, RequestOptions requestOptions, Context context);

        @Post("/imageanalysis:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> analyzeFromUrlSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("content-type") String contentType,
            @QueryParam("features") String visualFeatures, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") BinaryData imageUrl, RequestOptions requestOptions, Context context);
    }

    /**
     * Performs a single Image Analysis operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>language</td><td>String</td><td>No</td><td>The desired language for result generation (a two-letter
     * language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td></tr>
     * <tr><td>gender-neutral-caption</td><td>Boolean</td><td>No</td><td>Boolean flag for enabling gender-neutral
     * captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td></tr>
     * <tr><td>smartcrops-aspect-ratios</td><td>List&lt;Double&gt;</td><td>No</td><td>A list of aspect ratios to use for
     * smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td></tr>
     * <tr><td>model-version</td><td>String</td><td>No</td><td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     * 
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageData The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeFromImageDataWithResponseAsync(List<String> visualFeatures,
        BinaryData imageData, RequestOptions requestOptions) {
        final String contentType = "application/octet-stream";
        final String accept = "application/json";
        String visualFeaturesConverted = visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, ""))
            .collect(Collectors.joining(","));
        return FluxUtil.withContext(
            context -> service.analyzeFromImageData(this.getEndpoint(), this.getServiceVersion().getVersion(),
                contentType, visualFeaturesConverted, accept, imageData, requestOptions, context));
    }

    /**
     * Performs a single Image Analysis operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>language</td><td>String</td><td>No</td><td>The desired language for result generation (a two-letter
     * language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td></tr>
     * <tr><td>gender-neutral-caption</td><td>Boolean</td><td>No</td><td>Boolean flag for enabling gender-neutral
     * captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td></tr>
     * <tr><td>smartcrops-aspect-ratios</td><td>List&lt;Double&gt;</td><td>No</td><td>A list of aspect ratios to use for
     * smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td></tr>
     * <tr><td>model-version</td><td>String</td><td>No</td><td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     * 
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageData The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeFromImageDataWithResponse(List<String> visualFeatures, BinaryData imageData,
        RequestOptions requestOptions) {
        final String contentType = "application/octet-stream";
        final String accept = "application/json";
        String visualFeaturesConverted = visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, ""))
            .collect(Collectors.joining(","));
        return service.analyzeFromImageDataSync(this.getEndpoint(), this.getServiceVersion().getVersion(), contentType,
            visualFeaturesConverted, accept, imageData, requestOptions, Context.NONE);
    }

    /**
     * Performs a single Image Analysis operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>language</td><td>String</td><td>No</td><td>The desired language for result generation (a two-letter
     * language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td></tr>
     * <tr><td>gender-neutral-caption</td><td>Boolean</td><td>No</td><td>Boolean flag for enabling gender-neutral
     * captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td></tr>
     * <tr><td>smartcrops-aspect-ratios</td><td>List&lt;Double&gt;</td><td>No</td><td>A list of aspect ratios to use for
     * smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td></tr>
     * <tr><td>model-version</td><td>String</td><td>No</td><td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     url: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     * 
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageUrl The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeFromUrlWithResponseAsync(List<String> visualFeatures, BinaryData imageUrl,
        RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        String visualFeaturesConverted = visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, ""))
            .collect(Collectors.joining(","));
        return FluxUtil
            .withContext(context -> service.analyzeFromUrl(this.getEndpoint(), this.getServiceVersion().getVersion(),
                contentType, visualFeaturesConverted, accept, imageUrl, requestOptions, context));
    }

    /**
     * Performs a single Image Analysis operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>language</td><td>String</td><td>No</td><td>The desired language for result generation (a two-letter
     * language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td></tr>
     * <tr><td>gender-neutral-caption</td><td>Boolean</td><td>No</td><td>Boolean flag for enabling gender-neutral
     * captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td></tr>
     * <tr><td>smartcrops-aspect-ratios</td><td>List&lt;Double&gt;</td><td>No</td><td>A list of aspect ratios to use for
     * smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td></tr>
     * <tr><td>model-version</td><td>String</td><td>No</td><td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     url: String (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     * 
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageUrl The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeFromUrlWithResponse(List<String> visualFeatures, BinaryData imageUrl,
        RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        String visualFeaturesConverted = visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, ""))
            .collect(Collectors.joining(","));
        return service.analyzeFromUrlSync(this.getEndpoint(), this.getServiceVersion().getVersion(), contentType,
            visualFeaturesConverted, accept, imageUrl, requestOptions, Context.NONE);
    }
}
