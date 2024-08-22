// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Compute Instance properties.
 */
@Fluent
public final class ComputeInstanceProperties implements JsonSerializable<ComputeInstanceProperties> {
    /*
     * Virtual Machine Size
     */
    private String vmSize;

    /*
     * Virtual network subnet resource ID the compute nodes belong to.
     */
    private ResourceId subnet;

    /*
     * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the
     * creator can access applications on this compute instance. When Shared, any workspace user can access applications
     * on this instance depending on his/her assigned role.
     */
    private ApplicationSharingPolicy applicationSharingPolicy;

    /*
     * Specifies policy and settings for SSH access.
     */
    private ComputeInstanceSshSettings sshSettings;

    /*
     * List of Custom Services added to the compute.
     */
    private List<CustomService> customServices;

    /*
     * Returns metadata about the operating system image for this compute instance.
     */
    private ImageMetadata osImageMetadata;

    /*
     * Describes all connectivity endpoints available for this ComputeInstance.
     */
    private ComputeInstanceConnectivityEndpoints connectivityEndpoints;

    /*
     * Describes available applications and their endpoints on this ComputeInstance.
     */
    private List<ComputeInstanceApplication> applications;

    /*
     * Describes information on user who created this ComputeInstance.
     */
    private ComputeInstanceCreatedBy createdBy;

    /*
     * Collection of errors encountered on this ComputeInstance.
     */
    private List<ManagementError> errors;

    /*
     * The current state of this ComputeInstance.
     */
    private ComputeInstanceState state;

    /*
     * The Compute Instance Authorization type. Available values are personal (default).
     */
    private ComputeInstanceAuthorizationType computeInstanceAuthorizationType;

    /*
     * Settings for a personal compute instance.
     */
    private PersonalComputeInstanceSettings personalComputeInstanceSettings;

    /*
     * Details of customized scripts to execute for setting up the cluster.
     */
    private SetupScripts setupScripts;

    /*
     * The last operation on ComputeInstance.
     */
    private ComputeInstanceLastOperation lastOperation;

    /*
     * The list of schedules to be applied on the computes.
     */
    private ComputeSchedules schedules;

    /*
     * Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates
     * that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a
     * private endpoint and no public IPs.
     */
    private Boolean enableNodePublicIp;

    /*
     * Describes informations of containers on this ComputeInstance.
     */
    private List<ComputeInstanceContainer> containers;

    /*
     * Describes informations of dataDisks on this ComputeInstance.
     */
    private List<ComputeInstanceDataDisk> dataDisks;

    /*
     * Describes informations of dataMounts on this ComputeInstance.
     */
    private List<ComputeInstanceDataMount> dataMounts;

    /*
     * ComputeInstance version.
     */
    private ComputeInstanceVersion versions;

    /**
     * Creates an instance of ComputeInstanceProperties class.
     */
    public ComputeInstanceProperties() {
    }

    /**
     * Get the vmSize property: Virtual Machine Size.
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Virtual Machine Size.
     * 
     * @param vmSize the vmSize value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the subnet property: Virtual network subnet resource ID the compute nodes belong to.
     * 
     * @return the subnet value.
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Virtual network subnet resource ID the compute nodes belong to.
     * 
     * @param subnet the subnet value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the applicationSharingPolicy property: Policy for sharing applications on this compute instance among users
     * of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared,
     * any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     * @return the applicationSharingPolicy value.
     */
    public ApplicationSharingPolicy applicationSharingPolicy() {
        return this.applicationSharingPolicy;
    }

    /**
     * Set the applicationSharingPolicy property: Policy for sharing applications on this compute instance among users
     * of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared,
     * any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     * @param applicationSharingPolicy the applicationSharingPolicy value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withApplicationSharingPolicy(ApplicationSharingPolicy applicationSharingPolicy) {
        this.applicationSharingPolicy = applicationSharingPolicy;
        return this;
    }

    /**
     * Get the sshSettings property: Specifies policy and settings for SSH access.
     * 
     * @return the sshSettings value.
     */
    public ComputeInstanceSshSettings sshSettings() {
        return this.sshSettings;
    }

    /**
     * Set the sshSettings property: Specifies policy and settings for SSH access.
     * 
     * @param sshSettings the sshSettings value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withSshSettings(ComputeInstanceSshSettings sshSettings) {
        this.sshSettings = sshSettings;
        return this;
    }

    /**
     * Get the customServices property: List of Custom Services added to the compute.
     * 
     * @return the customServices value.
     */
    public List<CustomService> customServices() {
        return this.customServices;
    }

    /**
     * Set the customServices property: List of Custom Services added to the compute.
     * 
     * @param customServices the customServices value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withCustomServices(List<CustomService> customServices) {
        this.customServices = customServices;
        return this;
    }

    /**
     * Get the osImageMetadata property: Returns metadata about the operating system image for this compute instance.
     * 
     * @return the osImageMetadata value.
     */
    public ImageMetadata osImageMetadata() {
        return this.osImageMetadata;
    }

    /**
     * Get the connectivityEndpoints property: Describes all connectivity endpoints available for this ComputeInstance.
     * 
     * @return the connectivityEndpoints value.
     */
    public ComputeInstanceConnectivityEndpoints connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Get the applications property: Describes available applications and their endpoints on this ComputeInstance.
     * 
     * @return the applications value.
     */
    public List<ComputeInstanceApplication> applications() {
        return this.applications;
    }

    /**
     * Get the createdBy property: Describes information on user who created this ComputeInstance.
     * 
     * @return the createdBy value.
     */
    public ComputeInstanceCreatedBy createdBy() {
        return this.createdBy;
    }

    /**
     * Get the errors property: Collection of errors encountered on this ComputeInstance.
     * 
     * @return the errors value.
     */
    public List<ManagementError> errors() {
        return this.errors;
    }

    /**
     * Get the state property: The current state of this ComputeInstance.
     * 
     * @return the state value.
     */
    public ComputeInstanceState state() {
        return this.state;
    }

    /**
     * Get the computeInstanceAuthorizationType property: The Compute Instance Authorization type. Available values are
     * personal (default).
     * 
     * @return the computeInstanceAuthorizationType value.
     */
    public ComputeInstanceAuthorizationType computeInstanceAuthorizationType() {
        return this.computeInstanceAuthorizationType;
    }

    /**
     * Set the computeInstanceAuthorizationType property: The Compute Instance Authorization type. Available values are
     * personal (default).
     * 
     * @param computeInstanceAuthorizationType the computeInstanceAuthorizationType value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties
        withComputeInstanceAuthorizationType(ComputeInstanceAuthorizationType computeInstanceAuthorizationType) {
        this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
        return this;
    }

    /**
     * Get the personalComputeInstanceSettings property: Settings for a personal compute instance.
     * 
     * @return the personalComputeInstanceSettings value.
     */
    public PersonalComputeInstanceSettings personalComputeInstanceSettings() {
        return this.personalComputeInstanceSettings;
    }

    /**
     * Set the personalComputeInstanceSettings property: Settings for a personal compute instance.
     * 
     * @param personalComputeInstanceSettings the personalComputeInstanceSettings value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties
        withPersonalComputeInstanceSettings(PersonalComputeInstanceSettings personalComputeInstanceSettings) {
        this.personalComputeInstanceSettings = personalComputeInstanceSettings;
        return this;
    }

    /**
     * Get the setupScripts property: Details of customized scripts to execute for setting up the cluster.
     * 
     * @return the setupScripts value.
     */
    public SetupScripts setupScripts() {
        return this.setupScripts;
    }

    /**
     * Set the setupScripts property: Details of customized scripts to execute for setting up the cluster.
     * 
     * @param setupScripts the setupScripts value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withSetupScripts(SetupScripts setupScripts) {
        this.setupScripts = setupScripts;
        return this;
    }

    /**
     * Get the lastOperation property: The last operation on ComputeInstance.
     * 
     * @return the lastOperation value.
     */
    public ComputeInstanceLastOperation lastOperation() {
        return this.lastOperation;
    }

    /**
     * Get the schedules property: The list of schedules to be applied on the computes.
     * 
     * @return the schedules value.
     */
    public ComputeSchedules schedules() {
        return this.schedules;
    }

    /**
     * Set the schedules property: The list of schedules to be applied on the computes.
     * 
     * @param schedules the schedules value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withSchedules(ComputeSchedules schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * Get the enableNodePublicIp property: Enable or disable node public IP address provisioning. Possible values are:
     * Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates
     * that the compute nodes will have a private endpoint and no public IPs.
     * 
     * @return the enableNodePublicIp value.
     */
    public Boolean enableNodePublicIp() {
        return this.enableNodePublicIp;
    }

    /**
     * Set the enableNodePublicIp property: Enable or disable node public IP address provisioning. Possible values are:
     * Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates
     * that the compute nodes will have a private endpoint and no public IPs.
     * 
     * @param enableNodePublicIp the enableNodePublicIp value to set.
     * @return the ComputeInstanceProperties object itself.
     */
    public ComputeInstanceProperties withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.enableNodePublicIp = enableNodePublicIp;
        return this;
    }

    /**
     * Get the containers property: Describes informations of containers on this ComputeInstance.
     * 
     * @return the containers value.
     */
    public List<ComputeInstanceContainer> containers() {
        return this.containers;
    }

    /**
     * Get the dataDisks property: Describes informations of dataDisks on this ComputeInstance.
     * 
     * @return the dataDisks value.
     */
    public List<ComputeInstanceDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Get the dataMounts property: Describes informations of dataMounts on this ComputeInstance.
     * 
     * @return the dataMounts value.
     */
    public List<ComputeInstanceDataMount> dataMounts() {
        return this.dataMounts;
    }

    /**
     * Get the versions property: ComputeInstance version.
     * 
     * @return the versions value.
     */
    public ComputeInstanceVersion versions() {
        return this.versions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (sshSettings() != null) {
            sshSettings().validate();
        }
        if (customServices() != null) {
            customServices().forEach(e -> e.validate());
        }
        if (osImageMetadata() != null) {
            osImageMetadata().validate();
        }
        if (connectivityEndpoints() != null) {
            connectivityEndpoints().validate();
        }
        if (applications() != null) {
            applications().forEach(e -> e.validate());
        }
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (personalComputeInstanceSettings() != null) {
            personalComputeInstanceSettings().validate();
        }
        if (setupScripts() != null) {
            setupScripts().validate();
        }
        if (lastOperation() != null) {
            lastOperation().validate();
        }
        if (schedules() != null) {
            schedules().validate();
        }
        if (containers() != null) {
            containers().forEach(e -> e.validate());
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
        if (dataMounts() != null) {
            dataMounts().forEach(e -> e.validate());
        }
        if (versions() != null) {
            versions().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vmSize", this.vmSize);
        jsonWriter.writeJsonField("subnet", this.subnet);
        jsonWriter.writeStringField("applicationSharingPolicy",
            this.applicationSharingPolicy == null ? null : this.applicationSharingPolicy.toString());
        jsonWriter.writeJsonField("sshSettings", this.sshSettings);
        jsonWriter.writeArrayField("customServices", this.customServices,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("computeInstanceAuthorizationType",
            this.computeInstanceAuthorizationType == null ? null : this.computeInstanceAuthorizationType.toString());
        jsonWriter.writeJsonField("personalComputeInstanceSettings", this.personalComputeInstanceSettings);
        jsonWriter.writeJsonField("setupScripts", this.setupScripts);
        jsonWriter.writeJsonField("schedules", this.schedules);
        jsonWriter.writeBooleanField("enableNodePublicIp", this.enableNodePublicIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeInstanceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeInstanceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputeInstanceProperties.
     */
    public static ComputeInstanceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeInstanceProperties deserializedComputeInstanceProperties = new ComputeInstanceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmSize".equals(fieldName)) {
                    deserializedComputeInstanceProperties.vmSize = reader.getString();
                } else if ("subnet".equals(fieldName)) {
                    deserializedComputeInstanceProperties.subnet = ResourceId.fromJson(reader);
                } else if ("applicationSharingPolicy".equals(fieldName)) {
                    deserializedComputeInstanceProperties.applicationSharingPolicy
                        = ApplicationSharingPolicy.fromString(reader.getString());
                } else if ("sshSettings".equals(fieldName)) {
                    deserializedComputeInstanceProperties.sshSettings = ComputeInstanceSshSettings.fromJson(reader);
                } else if ("customServices".equals(fieldName)) {
                    List<CustomService> customServices = reader.readArray(reader1 -> CustomService.fromJson(reader1));
                    deserializedComputeInstanceProperties.customServices = customServices;
                } else if ("osImageMetadata".equals(fieldName)) {
                    deserializedComputeInstanceProperties.osImageMetadata = ImageMetadata.fromJson(reader);
                } else if ("connectivityEndpoints".equals(fieldName)) {
                    deserializedComputeInstanceProperties.connectivityEndpoints
                        = ComputeInstanceConnectivityEndpoints.fromJson(reader);
                } else if ("applications".equals(fieldName)) {
                    List<ComputeInstanceApplication> applications
                        = reader.readArray(reader1 -> ComputeInstanceApplication.fromJson(reader1));
                    deserializedComputeInstanceProperties.applications = applications;
                } else if ("createdBy".equals(fieldName)) {
                    deserializedComputeInstanceProperties.createdBy = ComputeInstanceCreatedBy.fromJson(reader);
                } else if ("errors".equals(fieldName)) {
                    List<ManagementError> errors = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedComputeInstanceProperties.errors = errors;
                } else if ("state".equals(fieldName)) {
                    deserializedComputeInstanceProperties.state = ComputeInstanceState.fromString(reader.getString());
                } else if ("computeInstanceAuthorizationType".equals(fieldName)) {
                    deserializedComputeInstanceProperties.computeInstanceAuthorizationType
                        = ComputeInstanceAuthorizationType.fromString(reader.getString());
                } else if ("personalComputeInstanceSettings".equals(fieldName)) {
                    deserializedComputeInstanceProperties.personalComputeInstanceSettings
                        = PersonalComputeInstanceSettings.fromJson(reader);
                } else if ("setupScripts".equals(fieldName)) {
                    deserializedComputeInstanceProperties.setupScripts = SetupScripts.fromJson(reader);
                } else if ("lastOperation".equals(fieldName)) {
                    deserializedComputeInstanceProperties.lastOperation = ComputeInstanceLastOperation.fromJson(reader);
                } else if ("schedules".equals(fieldName)) {
                    deserializedComputeInstanceProperties.schedules = ComputeSchedules.fromJson(reader);
                } else if ("enableNodePublicIp".equals(fieldName)) {
                    deserializedComputeInstanceProperties.enableNodePublicIp
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("containers".equals(fieldName)) {
                    List<ComputeInstanceContainer> containers
                        = reader.readArray(reader1 -> ComputeInstanceContainer.fromJson(reader1));
                    deserializedComputeInstanceProperties.containers = containers;
                } else if ("dataDisks".equals(fieldName)) {
                    List<ComputeInstanceDataDisk> dataDisks
                        = reader.readArray(reader1 -> ComputeInstanceDataDisk.fromJson(reader1));
                    deserializedComputeInstanceProperties.dataDisks = dataDisks;
                } else if ("dataMounts".equals(fieldName)) {
                    List<ComputeInstanceDataMount> dataMounts
                        = reader.readArray(reader1 -> ComputeInstanceDataMount.fromJson(reader1));
                    deserializedComputeInstanceProperties.dataMounts = dataMounts;
                } else if ("versions".equals(fieldName)) {
                    deserializedComputeInstanceProperties.versions = ComputeInstanceVersion.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeInstanceProperties;
        });
    }
}
