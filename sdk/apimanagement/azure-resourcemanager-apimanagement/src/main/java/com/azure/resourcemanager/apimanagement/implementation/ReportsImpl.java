// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ReportsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ReportRecordContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.RequestReportRecordContractInner;
import com.azure.resourcemanager.apimanagement.models.ReportRecordContract;
import com.azure.resourcemanager.apimanagement.models.Reports;
import com.azure.resourcemanager.apimanagement.models.RequestReportRecordContract;
import java.time.Duration;

public final class ReportsImpl implements Reports {
    private static final ClientLogger LOGGER = new ClientLogger(ReportsImpl.class);

    private final ReportsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ReportsImpl(
        ReportsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReportRecordContract> listByApi(String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByApi(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByApi(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByApi(resourceGroupName, serviceName, filter, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByUser(String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByUser(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByUser(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByUser(resourceGroupName, serviceName, filter, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByOperation(
        String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByOperation(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByOperation(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByOperation(resourceGroupName, serviceName, filter, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByProduct(
        String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByProduct(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, filter, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByGeo(String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByGeo(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByGeo(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByGeo(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listBySubscription(
        String resourceGroupName, String serviceName, String filter) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listBySubscription(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listBySubscription(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this
                .serviceClient()
                .listBySubscription(resourceGroupName, serviceName, filter, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByTime(
        String resourceGroupName, String serviceName, String filter, Duration interval) {
        PagedIterable<ReportRecordContractInner> inner =
            this.serviceClient().listByTime(resourceGroupName, serviceName, filter, interval);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportRecordContract> listByTime(
        String resourceGroupName,
        String serviceName,
        String filter,
        Duration interval,
        Integer top,
        Integer skip,
        String orderby,
        Context context) {
        PagedIterable<ReportRecordContractInner> inner =
            this
                .serviceClient()
                .listByTime(resourceGroupName, serviceName, filter, interval, top, skip, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<RequestReportRecordContract> listByRequest(
        String resourceGroupName, String serviceName, String filter) {
        PagedIterable<RequestReportRecordContractInner> inner =
            this.serviceClient().listByRequest(resourceGroupName, serviceName, filter);
        return Utils.mapPage(inner, inner1 -> new RequestReportRecordContractImpl(inner1, this.manager()));
    }

    public PagedIterable<RequestReportRecordContract> listByRequest(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<RequestReportRecordContractInner> inner =
            this.serviceClient().listByRequest(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new RequestReportRecordContractImpl(inner1, this.manager()));
    }

    private ReportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
