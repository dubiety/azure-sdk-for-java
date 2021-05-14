// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes an image source from [Azure Gallery
 * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("PlatformImage")
@Fluent
public final class ImageTemplatePlatformImageSource extends ImageTemplateSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageTemplatePlatformImageSource.class);

    /*
     * Image Publisher in [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Image offer from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * Image sku from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * Image version from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * If 'latest' is specified here, the version is evaluated when the image
     * build takes place, not when the template is submitted. Specifying
     * 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be
     * fixed.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Optional configuration of purchase plan for platform image.
     */
    @JsonProperty(value = "planInfo")
    private PlatformImagePurchasePlan planInfo;

    /**
     * Get the publisher property: Image Publisher in [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: Image Publisher in [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param publisher the publisher value to set.
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: Image offer from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: Image offer from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param offer the offer value to set.
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: Image sku from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Image sku from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param sku the sku value to set.
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: Image version from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If 'latest' is specified here,
     * the version is evaluated when the image build takes place, not when the template is submitted. Specifying
     * 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Image version from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If 'latest' is specified here,
     * the version is evaluated when the image build takes place, not when the template is submitted. Specifying
     * 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     *
     * @param version the version value to set.
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the planInfo property: Optional configuration of purchase plan for platform image.
     *
     * @return the planInfo value.
     */
    public PlatformImagePurchasePlan planInfo() {
        return this.planInfo;
    }

    /**
     * Set the planInfo property: Optional configuration of purchase plan for platform image.
     *
     * @param planInfo the planInfo value to set.
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withPlanInfo(PlatformImagePurchasePlan planInfo) {
        this.planInfo = planInfo;
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
        if (planInfo() != null) {
            planInfo().validate();
        }
    }
}
