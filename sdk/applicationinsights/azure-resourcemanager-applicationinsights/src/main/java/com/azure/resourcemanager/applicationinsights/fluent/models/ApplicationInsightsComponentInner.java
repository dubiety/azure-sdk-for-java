// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.models.ApplicationType;
import com.azure.resourcemanager.applicationinsights.models.ComponentsResource;
import com.azure.resourcemanager.applicationinsights.models.FlowType;
import com.azure.resourcemanager.applicationinsights.models.IngestionMode;
import com.azure.resourcemanager.applicationinsights.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.applicationinsights.models.PublicNetworkAccessType;
import com.azure.resourcemanager.applicationinsights.models.RequestSource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An Application Insights component definition. */
@Fluent
public final class ApplicationInsightsComponentInner extends ComponentsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationInsightsComponentInner.class);

    /*
     * The kind of application that this component refers to, used to customize
     * UI. This value is a freeform string, values should typically be one of
     * the following: web, ios, other, store, java, phone.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /*
     * Properties that define an Application Insights component resource.
     */
    @JsonProperty(value = "properties")
    private ApplicationInsightsComponentProperties innerProperties;

    /**
     * Get the kind property: The kind of application that this component refers to, used to customize UI. This value is
     * a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of application that this component refers to, used to customize UI. This value is
     * a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     *
     * @param kind the kind value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the innerProperties property: Properties that define an Application Insights component resource.
     *
     * @return the innerProperties value.
     */
    private ApplicationInsightsComponentProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInsightsComponentInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationInsightsComponentInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the applicationId property: The unique ID of your application. This field mirrors the 'Name' field and cannot
     * be changed.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationId();
    }

    /**
     * Get the appId property: Application Insights Unique ID for your Application.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.innerProperties() == null ? null : this.innerProperties().appId();
    }

    /**
     * Get the applicationType property: Type of application being monitored.
     *
     * @return the applicationType value.
     */
    public ApplicationType applicationType() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationType();
    }

    /**
     * Set the applicationType property: Type of application being monitored.
     *
     * @param applicationType the applicationType value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withApplicationType(ApplicationType applicationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withApplicationType(applicationType);
        return this;
    }

    /**
     * Get the flowType property: Used by the Application Insights system to determine what kind of flow this component
     * was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     *
     * @return the flowType value.
     */
    public FlowType flowType() {
        return this.innerProperties() == null ? null : this.innerProperties().flowType();
    }

    /**
     * Set the flowType property: Used by the Application Insights system to determine what kind of flow this component
     * was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     *
     * @param flowType the flowType value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withFlowType(FlowType flowType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withFlowType(flowType);
        return this;
    }

    /**
     * Get the requestSource property: Describes what tool created this Application Insights component. Customers using
     * this API should set this to the default 'rest'.
     *
     * @return the requestSource value.
     */
    public RequestSource requestSource() {
        return this.innerProperties() == null ? null : this.innerProperties().requestSource();
    }

    /**
     * Set the requestSource property: Describes what tool created this Application Insights component. Customers using
     * this API should set this to the default 'rest'.
     *
     * @param requestSource the requestSource value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withRequestSource(RequestSource requestSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withRequestSource(requestSource);
        return this;
    }

    /**
     * Get the instrumentationKey property: Application Insights Instrumentation key. A read-only value that
     * applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value
     * will be supplied upon construction of each new Application Insights component.
     *
     * @return the instrumentationKey value.
     */
    public String instrumentationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().instrumentationKey();
    }

    /**
     * Get the creationDate property: Creation Date for the Application Insights component, in ISO 8601 format.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the tenantId property: Azure Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the hockeyAppId property: The unique application ID created when a new application is added to HockeyApp,
     * used for communications with HockeyApp.
     *
     * @return the hockeyAppId value.
     */
    public String hockeyAppId() {
        return this.innerProperties() == null ? null : this.innerProperties().hockeyAppId();
    }

    /**
     * Set the hockeyAppId property: The unique application ID created when a new application is added to HockeyApp,
     * used for communications with HockeyApp.
     *
     * @param hockeyAppId the hockeyAppId value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withHockeyAppId(String hockeyAppId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withHockeyAppId(hockeyAppId);
        return this;
    }

    /**
     * Get the hockeyAppToken property: Token used to authenticate communications with between Application Insights and
     * HockeyApp.
     *
     * @return the hockeyAppToken value.
     */
    public String hockeyAppToken() {
        return this.innerProperties() == null ? null : this.innerProperties().hockeyAppToken();
    }

    /**
     * Get the provisioningState property: Current state of this component: whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values will
     * include Succeeded, Deploying, Canceled, and Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the samplingPercentage property: Percentage of the data produced by the application being monitored that is
     * being sampled for Application Insights telemetry.
     *
     * @return the samplingPercentage value.
     */
    public Double samplingPercentage() {
        return this.innerProperties() == null ? null : this.innerProperties().samplingPercentage();
    }

    /**
     * Set the samplingPercentage property: Percentage of the data produced by the application being monitored that is
     * being sampled for Application Insights telemetry.
     *
     * @param samplingPercentage the samplingPercentage value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withSamplingPercentage(Double samplingPercentage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withSamplingPercentage(samplingPercentage);
        return this;
    }

    /**
     * Get the connectionString property: Application Insights component connection string.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Get the retentionInDays property: Retention period in days.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionInDays();
    }

    /**
     * Set the retentionInDays property: Retention period in days.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withRetentionInDays(Integer retentionInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withRetentionInDays(retentionInDays);
        return this;
    }

    /**
     * Get the disableIpMasking property: Disable IP masking.
     *
     * @return the disableIpMasking value.
     */
    public Boolean disableIpMasking() {
        return this.innerProperties() == null ? null : this.innerProperties().disableIpMasking();
    }

    /**
     * Set the disableIpMasking property: Disable IP masking.
     *
     * @param disableIpMasking the disableIpMasking value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withDisableIpMasking(Boolean disableIpMasking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withDisableIpMasking(disableIpMasking);
        return this;
    }

    /**
     * Get the immediatePurgeDataOn30Days property: Purge data immediately after 30 days.
     *
     * @return the immediatePurgeDataOn30Days value.
     */
    public Boolean immediatePurgeDataOn30Days() {
        return this.innerProperties() == null ? null : this.innerProperties().immediatePurgeDataOn30Days();
    }

    /**
     * Set the immediatePurgeDataOn30Days property: Purge data immediately after 30 days.
     *
     * @param immediatePurgeDataOn30Days the immediatePurgeDataOn30Days value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withImmediatePurgeDataOn30Days(immediatePurgeDataOn30Days);
        return this;
    }

    /**
     * Get the privateLinkScopedResources property: List of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value.
     */
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkScopedResources();
    }

    /**
     * Get the publicNetworkAccessForIngestion property: The network access type for accessing Application Insights
     * ingestion.
     *
     * @return the publicNetworkAccessForIngestion value.
     */
    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccessForIngestion();
    }

    /**
     * Set the publicNetworkAccessForIngestion property: The network access type for accessing Application Insights
     * ingestion.
     *
     * @param publicNetworkAccessForIngestion the publicNetworkAccessForIngestion value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withPublicNetworkAccessForIngestion(
        PublicNetworkAccessType publicNetworkAccessForIngestion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
        return this;
    }

    /**
     * Get the publicNetworkAccessForQuery property: The network access type for accessing Application Insights query.
     *
     * @return the publicNetworkAccessForQuery value.
     */
    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccessForQuery();
    }

    /**
     * Set the publicNetworkAccessForQuery property: The network access type for accessing Application Insights query.
     *
     * @param publicNetworkAccessForQuery the publicNetworkAccessForQuery value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withPublicNetworkAccessForQuery(
        PublicNetworkAccessType publicNetworkAccessForQuery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
        return this;
    }

    /**
     * Get the ingestionMode property: Indicates the flow of the ingestion.
     *
     * @return the ingestionMode value.
     */
    public IngestionMode ingestionMode() {
        return this.innerProperties() == null ? null : this.innerProperties().ingestionMode();
    }

    /**
     * Set the ingestionMode property: Indicates the flow of the ingestion.
     *
     * @param ingestionMode the ingestionMode value to set.
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withIngestionMode(IngestionMode ingestionMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationInsightsComponentProperties();
        }
        this.innerProperties().withIngestionMode(ingestionMode);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kind in model ApplicationInsightsComponentInner"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
