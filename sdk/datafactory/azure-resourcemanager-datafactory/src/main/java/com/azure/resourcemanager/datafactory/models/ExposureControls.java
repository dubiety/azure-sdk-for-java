// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExposureControls. */
public interface ExposureControls {
    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    ExposureControlResponse getFeatureValue(String locationId, ExposureControlRequest exposureControlRequest);

    /**
     * Get exposure control feature for specific location.
     *
     * @param locationId The location identifier.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific location.
     */
    Response<ExposureControlResponse> getFeatureValueWithResponse(
        String locationId, ExposureControlRequest exposureControlRequest, Context context);

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    ExposureControlResponse getFeatureValueByFactory(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest);

    /**
     * Get exposure control feature for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlRequest The exposure control request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return exposure control feature for specific factory.
     */
    Response<ExposureControlResponse> getFeatureValueByFactoryWithResponse(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest, Context context);

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    ExposureControlBatchResponse queryFeatureValuesByFactory(
        String resourceGroupName, String factoryName, ExposureControlBatchRequest exposureControlBatchRequest);

    /**
     * Get list of exposure control features for specific factory.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param exposureControlBatchRequest The exposure control request for list of features.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of exposure control features for specific factory.
     */
    Response<ExposureControlBatchResponse> queryFeatureValuesByFactoryWithResponse(
        String resourceGroupName,
        String factoryName,
        ExposureControlBatchRequest exposureControlBatchRequest,
        Context context);
}
