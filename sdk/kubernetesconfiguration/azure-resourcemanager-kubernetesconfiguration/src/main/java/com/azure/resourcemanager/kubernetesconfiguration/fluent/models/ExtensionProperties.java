// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.kubernetesconfiguration.models.ExtensionPropertiesAksAssignedIdentity;
import com.azure.resourcemanager.kubernetesconfiguration.models.ExtensionStatus;
import com.azure.resourcemanager.kubernetesconfiguration.models.ProvisioningState;
import com.azure.resourcemanager.kubernetesconfiguration.models.Scope;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Properties of an Extension resource. */
@Fluent
public final class ExtensionProperties {
    /*
     * Type of the Extension, of which this resource is an instance of.  It
     * must be one of the Extension Types registered with
     * Microsoft.KubernetesConfiguration by the Extension publisher.
     */
    @JsonProperty(value = "extensionType")
    private String extensionType;

    /*
     * Flag to note if this extension participates in auto upgrade of minor
     * version, or not.
     */
    @JsonProperty(value = "autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * ReleaseTrain this extension participates in for auto-upgrade (e.g.
     * Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     */
    @JsonProperty(value = "releaseTrain")
    private String releaseTrain;

    /*
     * User-specified version of the extension for this extension to 'pin'. To
     * use 'version', autoUpgradeMinorVersion must be 'false'.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Scope at which the extension is installed.
     */
    @JsonProperty(value = "scope")
    private Scope scope;

    /*
     * Configuration settings, as name-value pairs for configuring this
     * extension.
     */
    @JsonProperty(value = "configurationSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> configurationSettings;

    /*
     * Configuration settings that are sensitive, as name-value pairs for
     * configuring this extension.
     */
    @JsonProperty(value = "configurationProtectedSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> configurationProtectedSettings;

    /*
     * Installed version of the extension.
     */
    @JsonProperty(value = "installedVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String installedVersion;

    /*
     * Status of installation of this extension.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Status from this extension.
     */
    @JsonProperty(value = "statuses")
    private List<ExtensionStatus> statuses;

    /*
     * Error information from the Agent - e.g. errors during installation.
     */
    @JsonProperty(value = "errorInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementError errorInfo;

    /*
     * Custom Location settings properties.
     */
    @JsonProperty(value = "customLocationSettings", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customLocationSettings;

    /*
     * Uri of the Helm package
     */
    @JsonProperty(value = "packageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String packageUri;

    /*
     * Identity of the Extension resource in an AKS cluster
     */
    @JsonProperty(value = "aksAssignedIdentity")
    private ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity;

    /**
     * Get the extensionType property: Type of the Extension, of which this resource is an instance of. It must be one
     * of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     *
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Type of the Extension, of which this resource is an instance of. It must be one
     * of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     *
     * @param extensionType the extensionType value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withExtensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Flag to note if this extension participates in auto upgrade of minor
     * version, or not.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Flag to note if this extension participates in auto upgrade of minor
     * version, or not.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the releaseTrain property: ReleaseTrain this extension participates in for auto-upgrade (e.g. Stable,
     * Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     *
     * @return the releaseTrain value.
     */
    public String releaseTrain() {
        return this.releaseTrain;
    }

    /**
     * Set the releaseTrain property: ReleaseTrain this extension participates in for auto-upgrade (e.g. Stable,
     * Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     *
     * @param releaseTrain the releaseTrain value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withReleaseTrain(String releaseTrain) {
        this.releaseTrain = releaseTrain;
        return this;
    }

    /**
     * Get the version property: User-specified version of the extension for this extension to 'pin'. To use 'version',
     * autoUpgradeMinorVersion must be 'false'.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: User-specified version of the extension for this extension to 'pin'. To use 'version',
     * autoUpgradeMinorVersion must be 'false'.
     *
     * @param version the version value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the scope property: Scope at which the extension is installed.
     *
     * @return the scope value.
     */
    public Scope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope at which the extension is installed.
     *
     * @param scope the scope value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withScope(Scope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the configurationSettings property: Configuration settings, as name-value pairs for configuring this
     * extension.
     *
     * @return the configurationSettings value.
     */
    public Map<String, String> configurationSettings() {
        return this.configurationSettings;
    }

    /**
     * Set the configurationSettings property: Configuration settings, as name-value pairs for configuring this
     * extension.
     *
     * @param configurationSettings the configurationSettings value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withConfigurationSettings(Map<String, String> configurationSettings) {
        this.configurationSettings = configurationSettings;
        return this;
    }

    /**
     * Get the configurationProtectedSettings property: Configuration settings that are sensitive, as name-value pairs
     * for configuring this extension.
     *
     * @return the configurationProtectedSettings value.
     */
    public Map<String, String> configurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }

    /**
     * Set the configurationProtectedSettings property: Configuration settings that are sensitive, as name-value pairs
     * for configuring this extension.
     *
     * @param configurationProtectedSettings the configurationProtectedSettings value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withConfigurationProtectedSettings(Map<String, String> configurationProtectedSettings) {
        this.configurationProtectedSettings = configurationProtectedSettings;
        return this;
    }

    /**
     * Get the installedVersion property: Installed version of the extension.
     *
     * @return the installedVersion value.
     */
    public String installedVersion() {
        return this.installedVersion;
    }

    /**
     * Get the provisioningState property: Status of installation of this extension.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the statuses property: Status from this extension.
     *
     * @return the statuses value.
     */
    public List<ExtensionStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: Status from this extension.
     *
     * @param statuses the statuses value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withStatuses(List<ExtensionStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the errorInfo property: Error information from the Agent - e.g. errors during installation.
     *
     * @return the errorInfo value.
     */
    public ManagementError errorInfo() {
        return this.errorInfo;
    }

    /**
     * Get the customLocationSettings property: Custom Location settings properties.
     *
     * @return the customLocationSettings value.
     */
    public Map<String, String> customLocationSettings() {
        return this.customLocationSettings;
    }

    /**
     * Get the packageUri property: Uri of the Helm package.
     *
     * @return the packageUri value.
     */
    public String packageUri() {
        return this.packageUri;
    }

    /**
     * Get the aksAssignedIdentity property: Identity of the Extension resource in an AKS cluster.
     *
     * @return the aksAssignedIdentity value.
     */
    public ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity() {
        return this.aksAssignedIdentity;
    }

    /**
     * Set the aksAssignedIdentity property: Identity of the Extension resource in an AKS cluster.
     *
     * @param aksAssignedIdentity the aksAssignedIdentity value to set.
     * @return the ExtensionProperties object itself.
     */
    public ExtensionProperties withAksAssignedIdentity(ExtensionPropertiesAksAssignedIdentity aksAssignedIdentity) {
        this.aksAssignedIdentity = aksAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() != null) {
            scope().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
        if (aksAssignedIdentity() != null) {
            aksAssignedIdentity().validate();
        }
    }
}
