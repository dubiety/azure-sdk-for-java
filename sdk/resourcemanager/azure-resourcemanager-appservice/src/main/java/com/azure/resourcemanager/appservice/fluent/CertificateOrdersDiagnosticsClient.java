// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.DetectorResponseInner;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CertificateOrdersDiagnosticsClient. */
public interface CertificateOrdersDiagnosticsClient {
    /**
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponseAsync(
        String resourceGroupName, String certificateOrderName);

    /**
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponse(
        String resourceGroupName, String certificateOrderName);

    /**
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponse(
        String resourceGroupName, String certificateOrderName, Context context);

    /**
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DetectorResponseInner>> getAppServiceCertificateOrderDetectorResponseWithResponseAsync(
        String resourceGroupName,
        String certificateOrderName,
        String detectorName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain);

    /**
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DetectorResponseInner> getAppServiceCertificateOrderDetectorResponseAsync(
        String resourceGroupName,
        String certificateOrderName,
        String detectorName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain);

    /**
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DetectorResponseInner> getAppServiceCertificateOrderDetectorResponseAsync(
        String resourceGroupName, String certificateOrderName, String detectorName);

    /**
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DetectorResponseInner getAppServiceCertificateOrderDetectorResponse(
        String resourceGroupName, String certificateOrderName, String detectorName);

    /**
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DetectorResponseInner> getAppServiceCertificateOrderDetectorResponseWithResponse(
        String resourceGroupName,
        String certificateOrderName,
        String detectorName,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String timeGrain,
        Context context);
}
