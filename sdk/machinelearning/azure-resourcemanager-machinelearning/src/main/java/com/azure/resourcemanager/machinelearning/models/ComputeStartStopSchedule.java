// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Compute start stop schedule properties.
 */
@Fluent
public final class ComputeStartStopSchedule implements JsonSerializable<ComputeStartStopSchedule> {
    /*
     * A system assigned id for the schedule.
     */
    private String id;

    /*
     * The current deployment state of schedule.
     */
    private ProvisioningStatus provisioningStatus;

    /*
     * Is the schedule enabled or disabled?
     */
    private ScheduleStatus status;

    /*
     * [Required] The compute power action.
     */
    private ComputePowerAction action;

    /*
     * [Required] The schedule trigger type.
     */
    private ComputeTriggerType triggerType;

    /*
     * Required if triggerType is Recurrence.
     */
    private Recurrence recurrence;

    /*
     * Required if triggerType is Cron.
     */
    private Cron cron;

    /*
     * [Deprecated] Not used any more.
     */
    private ScheduleBase schedule;

    /**
     * Creates an instance of ComputeStartStopSchedule class.
     */
    public ComputeStartStopSchedule() {
    }

    /**
     * Get the id property: A system assigned id for the schedule.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningStatus property: The current deployment state of schedule.
     * 
     * @return the provisioningStatus value.
     */
    public ProvisioningStatus provisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Get the status property: Is the schedule enabled or disabled?.
     * 
     * @return the status value.
     */
    public ScheduleStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Is the schedule enabled or disabled?.
     * 
     * @param status the status value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withStatus(ScheduleStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the action property: [Required] The compute power action.
     * 
     * @return the action value.
     */
    public ComputePowerAction action() {
        return this.action;
    }

    /**
     * Set the action property: [Required] The compute power action.
     * 
     * @param action the action value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withAction(ComputePowerAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the triggerType property: [Required] The schedule trigger type.
     * 
     * @return the triggerType value.
     */
    public ComputeTriggerType triggerType() {
        return this.triggerType;
    }

    /**
     * Set the triggerType property: [Required] The schedule trigger type.
     * 
     * @param triggerType the triggerType value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withTriggerType(ComputeTriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Get the recurrence property: Required if triggerType is Recurrence.
     * 
     * @return the recurrence value.
     */
    public Recurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: Required if triggerType is Recurrence.
     * 
     * @param recurrence the recurrence value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Get the cron property: Required if triggerType is Cron.
     * 
     * @return the cron value.
     */
    public Cron cron() {
        return this.cron;
    }

    /**
     * Set the cron property: Required if triggerType is Cron.
     * 
     * @param cron the cron value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withCron(Cron cron) {
        this.cron = cron;
        return this;
    }

    /**
     * Get the schedule property: [Deprecated] Not used any more.
     * 
     * @return the schedule value.
     */
    public ScheduleBase schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: [Deprecated] Not used any more.
     * 
     * @param schedule the schedule value to set.
     * @return the ComputeStartStopSchedule object itself.
     */
    public ComputeStartStopSchedule withSchedule(ScheduleBase schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() != null) {
            recurrence().validate();
        }
        if (cron() != null) {
            cron().validate();
        }
        if (schedule() != null) {
            schedule().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        jsonWriter.writeStringField("triggerType", this.triggerType == null ? null : this.triggerType.toString());
        jsonWriter.writeJsonField("recurrence", this.recurrence);
        jsonWriter.writeJsonField("cron", this.cron);
        jsonWriter.writeJsonField("schedule", this.schedule);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeStartStopSchedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeStartStopSchedule if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputeStartStopSchedule.
     */
    public static ComputeStartStopSchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeStartStopSchedule deserializedComputeStartStopSchedule = new ComputeStartStopSchedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.id = reader.getString();
                } else if ("provisioningStatus".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.provisioningStatus
                        = ProvisioningStatus.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.status = ScheduleStatus.fromString(reader.getString());
                } else if ("action".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.action = ComputePowerAction.fromString(reader.getString());
                } else if ("triggerType".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.triggerType
                        = ComputeTriggerType.fromString(reader.getString());
                } else if ("recurrence".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.recurrence = Recurrence.fromJson(reader);
                } else if ("cron".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.cron = Cron.fromJson(reader);
                } else if ("schedule".equals(fieldName)) {
                    deserializedComputeStartStopSchedule.schedule = ScheduleBase.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeStartStopSchedule;
        });
    }
}
