// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Base definition for a job.
 */
@Fluent
public class JobBaseProperties extends ResourceBase {
    /*
     * [Required] Specifies the type of job.
     */
    private JobType jobType = JobType.fromString("JobBaseProperties");

    /*
     * Display name of job.
     */
    private String displayName;

    /*
     * Status of the job.
     */
    private JobStatus status;

    /*
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     */
    private String experimentName;

    /*
     * List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     */
    private Map<String, JobService> services;

    /*
     * ARM resource ID of the compute resource.
     */
    private String computeId;

    /*
     * Is the asset archived?
     */
    private Boolean isArchived;

    /*
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, UserIdentity or null.
     * Defaults to AmlToken if null.
     */
    private IdentityConfiguration identity;

    /*
     * ARM resource ID of the component resource.
     */
    private String componentId;

    /*
     * Notification setting for the job
     */
    private NotificationSetting notificationSetting;

    /**
     * Creates an instance of JobBaseProperties class.
     */
    public JobBaseProperties() {
    }

    /**
     * Get the jobType property: [Required] Specifies the type of job.
     * 
     * @return the jobType value.
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Get the displayName property: Display name of job.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of job.
     * 
     * @param displayName the displayName value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the status property: Status of the job.
     * 
     * @return the status value.
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the job.
     * 
     * @param status the status value to set.
     * @return the JobBaseProperties object itself.
     */
    JobBaseProperties withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the experimentName property: The name of the experiment the job belongs to. If not set, the job is placed in
     * the "Default" experiment.
     * 
     * @return the experimentName value.
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: The name of the experiment the job belongs to. If not set, the job is placed in
     * the "Default" experiment.
     * 
     * @param experimentName the experimentName value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the services property: List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     * @return the services value.
     */
    public Map<String, JobService> services() {
        return this.services;
    }

    /**
     * Set the services property: List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     * @param services the services value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withServices(Map<String, JobService> services) {
        this.services = services;
        return this;
    }

    /**
     * Get the computeId property: ARM resource ID of the compute resource.
     * 
     * @return the computeId value.
     */
    public String computeId() {
        return this.computeId;
    }

    /**
     * Set the computeId property: ARM resource ID of the compute resource.
     * 
     * @param computeId the computeId value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * Get the isArchived property: Is the asset archived?.
     * 
     * @return the isArchived value.
     */
    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * Set the isArchived property: Is the asset archived?.
     * 
     * @param isArchived the isArchived value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Get the identity property: Identity configuration. If set, this should be one of AmlToken, ManagedIdentity,
     * UserIdentity or null.
     * Defaults to AmlToken if null.
     * 
     * @return the identity value.
     */
    public IdentityConfiguration identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity configuration. If set, this should be one of AmlToken, ManagedIdentity,
     * UserIdentity or null.
     * Defaults to AmlToken if null.
     * 
     * @param identity the identity value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withIdentity(IdentityConfiguration identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the componentId property: ARM resource ID of the component resource.
     * 
     * @return the componentId value.
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the componentId property: ARM resource ID of the component resource.
     * 
     * @param componentId the componentId value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get the notificationSetting property: Notification setting for the job.
     * 
     * @return the notificationSetting value.
     */
    public NotificationSetting notificationSetting() {
        return this.notificationSetting;
    }

    /**
     * Set the notificationSetting property: Notification setting for the job.
     * 
     * @param notificationSetting the notificationSetting value to set.
     * @return the JobBaseProperties object itself.
     */
    public JobBaseProperties withNotificationSetting(NotificationSetting notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBaseProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBaseProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBaseProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
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
        if (services() != null) {
            services().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (identity() != null) {
            identity().validate();
        }
        if (notificationSetting() != null) {
            notificationSetting().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("jobType", this.jobType == null ? null : this.jobType.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("experimentName", this.experimentName);
        jsonWriter.writeMapField("services", this.services, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("computeId", this.computeId);
        jsonWriter.writeBooleanField("isArchived", this.isArchived);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeStringField("componentId", this.componentId);
        jsonWriter.writeJsonField("notificationSetting", this.notificationSetting);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobBaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobBaseProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobBaseProperties.
     */
    public static JobBaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("jobType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AutoML".equals(discriminatorValue)) {
                    return AutoMLJob.fromJson(readerToUse.reset());
                } else if ("Command".equals(discriminatorValue)) {
                    return CommandJob.fromJson(readerToUse.reset());
                } else if ("Pipeline".equals(discriminatorValue)) {
                    return PipelineJob.fromJson(readerToUse.reset());
                } else if ("Spark".equals(discriminatorValue)) {
                    return SparkJob.fromJson(readerToUse.reset());
                } else if ("Sweep".equals(discriminatorValue)) {
                    return SweepJob.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static JobBaseProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobBaseProperties deserializedJobBaseProperties = new JobBaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedJobBaseProperties.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedJobBaseProperties.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedJobBaseProperties.withProperties(properties);
                } else if ("jobType".equals(fieldName)) {
                    deserializedJobBaseProperties.jobType = JobType.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedJobBaseProperties.displayName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedJobBaseProperties.status = JobStatus.fromString(reader.getString());
                } else if ("experimentName".equals(fieldName)) {
                    deserializedJobBaseProperties.experimentName = reader.getString();
                } else if ("services".equals(fieldName)) {
                    Map<String, JobService> services = reader.readMap(reader1 -> JobService.fromJson(reader1));
                    deserializedJobBaseProperties.services = services;
                } else if ("computeId".equals(fieldName)) {
                    deserializedJobBaseProperties.computeId = reader.getString();
                } else if ("isArchived".equals(fieldName)) {
                    deserializedJobBaseProperties.isArchived = reader.getNullable(JsonReader::getBoolean);
                } else if ("identity".equals(fieldName)) {
                    deserializedJobBaseProperties.identity = IdentityConfiguration.fromJson(reader);
                } else if ("componentId".equals(fieldName)) {
                    deserializedJobBaseProperties.componentId = reader.getString();
                } else if ("notificationSetting".equals(fieldName)) {
                    deserializedJobBaseProperties.notificationSetting = NotificationSetting.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobBaseProperties;
        });
    }
}
