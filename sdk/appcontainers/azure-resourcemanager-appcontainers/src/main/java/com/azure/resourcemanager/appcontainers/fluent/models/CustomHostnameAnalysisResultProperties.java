// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseError;
import com.azure.resourcemanager.appcontainers.models.DnsVerificationTestResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CustomHostnameAnalysisResult resource specific properties. */
@Fluent
public final class CustomHostnameAnalysisResultProperties {
    /*
     * Host name that was analyzed
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * <code>true</code> if hostname is already verified; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isHostnameAlreadyVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isHostnameAlreadyVerified;

    /*
     * DNS verification test result.
     */
    @JsonProperty(value = "customDomainVerificationTest", access = JsonProperty.Access.WRITE_ONLY)
    private DnsVerificationTestResult customDomainVerificationTest;

    /*
     * Raw failure information if DNS verification fails.
     */
    @JsonProperty(value = "customDomainVerificationFailureInfo", access = JsonProperty.Access.WRITE_ONLY)
    private DefaultErrorResponseError customDomainVerificationFailureInfo;

    /*
     * <code>true</code> if there is a conflict on the Container App's managed
     * environment; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "hasConflictOnManagedEnvironment", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasConflictOnManagedEnvironment;

    /*
     * Name of the conflicting Container App on the Managed Environment if it's
     * within the same subscription.
     */
    @JsonProperty(value = "conflictingContainerAppResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String conflictingContainerAppResourceId;

    /*
     * CName records visible for this hostname.
     */
    @JsonProperty(value = "cNameRecords")
    private List<String> cNameRecords;

    /*
     * TXT records visible for this hostname.
     */
    @JsonProperty(value = "txtRecords")
    private List<String> txtRecords;

    /*
     * A records visible for this hostname.
     */
    @JsonProperty(value = "aRecords")
    private List<String> aRecords;

    /*
     * Alternate CName records visible for this hostname.
     */
    @JsonProperty(value = "alternateCNameRecords")
    private List<String> alternateCNameRecords;

    /*
     * Alternate TXT records visible for this hostname.
     */
    @JsonProperty(value = "alternateTxtRecords")
    private List<String> alternateTxtRecords;

    /**
     * Get the hostname property: Host name that was analyzed.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the isHostnameAlreadyVerified property: &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isHostnameAlreadyVerified value.
     */
    public Boolean isHostnameAlreadyVerified() {
        return this.isHostnameAlreadyVerified;
    }

    /**
     * Get the customDomainVerificationTest property: DNS verification test result.
     *
     * @return the customDomainVerificationTest value.
     */
    public DnsVerificationTestResult customDomainVerificationTest() {
        return this.customDomainVerificationTest;
    }

    /**
     * Get the customDomainVerificationFailureInfo property: Raw failure information if DNS verification fails.
     *
     * @return the customDomainVerificationFailureInfo value.
     */
    public DefaultErrorResponseError customDomainVerificationFailureInfo() {
        return this.customDomainVerificationFailureInfo;
    }

    /**
     * Get the hasConflictOnManagedEnvironment property: &lt;code&gt;true&lt;/code&gt; if there is a conflict on the
     * Container App's managed environment; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the hasConflictOnManagedEnvironment value.
     */
    public Boolean hasConflictOnManagedEnvironment() {
        return this.hasConflictOnManagedEnvironment;
    }

    /**
     * Get the conflictingContainerAppResourceId property: Name of the conflicting Container App on the Managed
     * Environment if it's within the same subscription.
     *
     * @return the conflictingContainerAppResourceId value.
     */
    public String conflictingContainerAppResourceId() {
        return this.conflictingContainerAppResourceId;
    }

    /**
     * Get the cNameRecords property: CName records visible for this hostname.
     *
     * @return the cNameRecords value.
     */
    public List<String> cNameRecords() {
        return this.cNameRecords;
    }

    /**
     * Set the cNameRecords property: CName records visible for this hostname.
     *
     * @param cNameRecords the cNameRecords value to set.
     * @return the CustomHostnameAnalysisResultProperties object itself.
     */
    public CustomHostnameAnalysisResultProperties withCNameRecords(List<String> cNameRecords) {
        this.cNameRecords = cNameRecords;
        return this;
    }

    /**
     * Get the txtRecords property: TXT records visible for this hostname.
     *
     * @return the txtRecords value.
     */
    public List<String> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set the txtRecords property: TXT records visible for this hostname.
     *
     * @param txtRecords the txtRecords value to set.
     * @return the CustomHostnameAnalysisResultProperties object itself.
     */
    public CustomHostnameAnalysisResultProperties withTxtRecords(List<String> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

    /**
     * Get the aRecords property: A records visible for this hostname.
     *
     * @return the aRecords value.
     */
    public List<String> aRecords() {
        return this.aRecords;
    }

    /**
     * Set the aRecords property: A records visible for this hostname.
     *
     * @param aRecords the aRecords value to set.
     * @return the CustomHostnameAnalysisResultProperties object itself.
     */
    public CustomHostnameAnalysisResultProperties withARecords(List<String> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get the alternateCNameRecords property: Alternate CName records visible for this hostname.
     *
     * @return the alternateCNameRecords value.
     */
    public List<String> alternateCNameRecords() {
        return this.alternateCNameRecords;
    }

    /**
     * Set the alternateCNameRecords property: Alternate CName records visible for this hostname.
     *
     * @param alternateCNameRecords the alternateCNameRecords value to set.
     * @return the CustomHostnameAnalysisResultProperties object itself.
     */
    public CustomHostnameAnalysisResultProperties withAlternateCNameRecords(List<String> alternateCNameRecords) {
        this.alternateCNameRecords = alternateCNameRecords;
        return this;
    }

    /**
     * Get the alternateTxtRecords property: Alternate TXT records visible for this hostname.
     *
     * @return the alternateTxtRecords value.
     */
    public List<String> alternateTxtRecords() {
        return this.alternateTxtRecords;
    }

    /**
     * Set the alternateTxtRecords property: Alternate TXT records visible for this hostname.
     *
     * @param alternateTxtRecords the alternateTxtRecords value to set.
     * @return the CustomHostnameAnalysisResultProperties object itself.
     */
    public CustomHostnameAnalysisResultProperties withAlternateTxtRecords(List<String> alternateTxtRecords) {
        this.alternateTxtRecords = alternateTxtRecords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDomainVerificationFailureInfo() != null) {
            customDomainVerificationFailureInfo().validate();
        }
    }
}
