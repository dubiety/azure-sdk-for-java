// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiCreateOrUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API Create or Update Parameters. */
@Fluent
public final class ApiCreateOrUpdateParameter {
    /*
     * API entity create of update properties.
     */
    @JsonProperty(value = "properties")
    private ApiCreateOrUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: API entity create of update properties.
     *
     * @return the innerProperties value.
     */
    private ApiCreateOrUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the value property: Content value when Importing an API.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Content value when Importing an API.
     *
     * @param value the value value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the format property: Format of the Content in which the API is getting imported.
     *
     * @return the format value.
     */
    public ContentFormat format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: Format of the Content in which the API is getting imported.
     *
     * @param format the format value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withFormat(ContentFormat format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Get the wsdlSelector property: Criteria to limit import of WSDL to a subset of the document.
     *
     * @return the wsdlSelector value.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector() {
        return this.innerProperties() == null ? null : this.innerProperties().wsdlSelector();
    }

    /**
     * Set the wsdlSelector property: Criteria to limit import of WSDL to a subset of the document.
     *
     * @param wsdlSelector the wsdlSelector value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withWsdlSelector(ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withWsdlSelector(wsdlSelector);
        return this;
    }

    /**
     * Get the soapApiType property: Type of API to create. * `http` creates a REST API * `soap` creates a SOAP
     * pass-through API * `websocket` creates websocket API * `graphql` creates GraphQL API.
     *
     * @return the soapApiType value.
     */
    public SoapApiType soapApiType() {
        return this.innerProperties() == null ? null : this.innerProperties().soapApiType();
    }

    /**
     * Set the soapApiType property: Type of API to create. * `http` creates a REST API * `soap` creates a SOAP
     * pass-through API * `websocket` creates websocket API * `graphql` creates GraphQL API.
     *
     * @param soapApiType the soapApiType value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withSoapApiType(SoapApiType soapApiType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withSoapApiType(soapApiType);
        return this;
    }

    /**
     * Get the sourceApiId property: API identifier of the source API.
     *
     * @return the sourceApiId value.
     */
    public String sourceApiId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceApiId();
    }

    /**
     * Set the sourceApiId property: API identifier of the source API.
     *
     * @param sourceApiId the sourceApiId value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withSourceApiId(String sourceApiId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withSourceApiId(sourceApiId);
        return this;
    }

    /**
     * Get the displayName property: API name. Must be 1 to 300 characters long.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: API name. Must be 1 to 300 characters long.
     *
     * @param displayName the displayName value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the serviceUrl property: Absolute URL of the backend service implementing this API. Cannot be more than 2000
     * characters long.
     *
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceUrl();
    }

    /**
     * Set the serviceUrl property: Absolute URL of the backend service implementing this API. Cannot be more than 2000
     * characters long.
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withServiceUrl(String serviceUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withServiceUrl(serviceUrl);
        return this;
    }

    /**
     * Get the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @param path the path value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.innerProperties() == null ? null : this.innerProperties().protocols();
    }

    /**
     * Set the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @param protocols the protocols value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withProtocols(List<Protocol> protocols) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withProtocols(protocols);
        return this;
    }

    /**
     * Get the apiVersionSet property: Version set details.
     *
     * @return the apiVersionSet value.
     */
    public ApiVersionSetContractDetails apiVersionSet() {
        return this.innerProperties() == null ? null : this.innerProperties().apiVersionSet();
    }

    /**
     * Set the apiVersionSet property: Version set details.
     *
     * @param apiVersionSet the apiVersionSet value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiVersionSet(ApiVersionSetContractDetails apiVersionSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiVersionSet(apiVersionSet);
        return this;
    }

    /**
     * Get the description property: Description of the API. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the API. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the authenticationSettings property: Collection of authentication settings included into this API.
     *
     * @return the authenticationSettings value.
     */
    public AuthenticationSettingsContract authenticationSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationSettings();
    }

    /**
     * Set the authenticationSettings property: Collection of authentication settings included into this API.
     *
     * @param authenticationSettings the authenticationSettings value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withAuthenticationSettings(
        AuthenticationSettingsContract authenticationSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /**
     * Get the subscriptionKeyParameterNames property: Protocols over which API is made available.
     *
     * @return the subscriptionKeyParameterNames value.
     */
    public SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionKeyParameterNames();
    }

    /**
     * Set the subscriptionKeyParameterNames property: Protocols over which API is made available.
     *
     * @param subscriptionKeyParameterNames the subscriptionKeyParameterNames value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withSubscriptionKeyParameterNames(
        SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /**
     * Get the apiType property: Type of API.
     *
     * @return the apiType value.
     */
    public ApiType apiType() {
        return this.innerProperties() == null ? null : this.innerProperties().apiType();
    }

    /**
     * Set the apiType property: Type of API.
     *
     * @param apiType the apiType value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiType(ApiType apiType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiType(apiType);
        return this;
    }

    /**
     * Get the apiRevision property: Describes the revision of the API. If no value is provided, default revision 1 is
     * created.
     *
     * @return the apiRevision value.
     */
    public String apiRevision() {
        return this.innerProperties() == null ? null : this.innerProperties().apiRevision();
    }

    /**
     * Set the apiRevision property: Describes the revision of the API. If no value is provided, default revision 1 is
     * created.
     *
     * @param apiRevision the apiRevision value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiRevision(String apiRevision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiRevision(apiRevision);
        return this;
    }

    /**
     * Get the apiVersion property: Indicates the version identifier of the API if the API is versioned.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().apiVersion();
    }

    /**
     * Set the apiVersion property: Indicates the version identifier of the API if the API is versioned.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiVersion(String apiVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiVersion(apiVersion);
        return this;
    }

    /**
     * Get the isCurrent property: Indicates if API revision is current api revision.
     *
     * @return the isCurrent value.
     */
    public Boolean isCurrent() {
        return this.innerProperties() == null ? null : this.innerProperties().isCurrent();
    }

    /**
     * Set the isCurrent property: Indicates if API revision is current api revision.
     *
     * @param isCurrent the isCurrent value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withIsCurrent(Boolean isCurrent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withIsCurrent(isCurrent);
        return this;
    }

    /**
     * Get the isOnline property: Indicates if API revision is accessible via the gateway.
     *
     * @return the isOnline value.
     */
    public Boolean isOnline() {
        return this.innerProperties() == null ? null : this.innerProperties().isOnline();
    }

    /**
     * Get the apiRevisionDescription property: Description of the API Revision.
     *
     * @return the apiRevisionDescription value.
     */
    public String apiRevisionDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().apiRevisionDescription();
    }

    /**
     * Set the apiRevisionDescription property: Description of the API Revision.
     *
     * @param apiRevisionDescription the apiRevisionDescription value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiRevisionDescription(String apiRevisionDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /**
     * Get the apiVersionDescription property: Description of the API Version.
     *
     * @return the apiVersionDescription value.
     */
    public String apiVersionDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().apiVersionDescription();
    }

    /**
     * Set the apiVersionDescription property: Description of the API Version.
     *
     * @param apiVersionDescription the apiVersionDescription value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiVersionDescription(String apiVersionDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /**
     * Get the apiVersionSetId property: A resource identifier for the related ApiVersionSet.
     *
     * @return the apiVersionSetId value.
     */
    public String apiVersionSetId() {
        return this.innerProperties() == null ? null : this.innerProperties().apiVersionSetId();
    }

    /**
     * Set the apiVersionSetId property: A resource identifier for the related ApiVersionSet.
     *
     * @param apiVersionSetId the apiVersionSetId value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withApiVersionSetId(String apiVersionSetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /**
     * Get the subscriptionRequired property: Specifies whether an API or Product subscription is required for accessing
     * the API.
     *
     * @return the subscriptionRequired value.
     */
    public Boolean subscriptionRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionRequired();
    }

    /**
     * Set the subscriptionRequired property: Specifies whether an API or Product subscription is required for accessing
     * the API.
     *
     * @param subscriptionRequired the subscriptionRequired value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withSubscriptionRequired(Boolean subscriptionRequired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /**
     * Get the termsOfServiceUrl property: A URL to the Terms of Service for the API. MUST be in the format of a URL.
     *
     * @return the termsOfServiceUrl value.
     */
    public String termsOfServiceUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().termsOfServiceUrl();
    }

    /**
     * Set the termsOfServiceUrl property: A URL to the Terms of Service for the API. MUST be in the format of a URL.
     *
     * @param termsOfServiceUrl the termsOfServiceUrl value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withTermsOfServiceUrl(String termsOfServiceUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withTermsOfServiceUrl(termsOfServiceUrl);
        return this;
    }

    /**
     * Get the contact property: Contact information for the API.
     *
     * @return the contact value.
     */
    public ApiContactInformation contact() {
        return this.innerProperties() == null ? null : this.innerProperties().contact();
    }

    /**
     * Set the contact property: Contact information for the API.
     *
     * @param contact the contact value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withContact(ApiContactInformation contact) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withContact(contact);
        return this;
    }

    /**
     * Get the license property: License information for the API.
     *
     * @return the license value.
     */
    public ApiLicenseInformation license() {
        return this.innerProperties() == null ? null : this.innerProperties().license();
    }

    /**
     * Set the license property: License information for the API.
     *
     * @param license the license value to set.
     * @return the ApiCreateOrUpdateParameter object itself.
     */
    public ApiCreateOrUpdateParameter withLicense(ApiLicenseInformation license) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiCreateOrUpdateProperties();
        }
        this.innerProperties().withLicense(license);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
