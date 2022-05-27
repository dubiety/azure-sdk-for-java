// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** onlineMeetingInfo. */
@Fluent
public final class MicrosoftGraphOnlineMeetingInfo {
    /*
     * The ID of the conference.
     */
    @JsonProperty(value = "conferenceId")
    private String conferenceId;

    /*
     * The external link that launches the online meeting. This is a URL that
     * clients will launch into a browser and will redirect the user to join
     * the meeting.
     */
    @JsonProperty(value = "joinUrl")
    private String joinUrl;

    /*
     * All of the phone numbers associated with this conference.
     */
    @JsonProperty(value = "phones")
    private List<MicrosoftGraphPhone> phones;

    /*
     * The pre-formatted quickdial for this call.
     */
    @JsonProperty(value = "quickDial")
    private String quickDial;

    /*
     * The toll free numbers that can be used to join the conference.
     */
    @JsonProperty(value = "tollFreeNumbers")
    private List<String> tollFreeNumbers;

    /*
     * The toll number that can be used to join the conference.
     */
    @JsonProperty(value = "tollNumber")
    private String tollNumber;

    /*
     * onlineMeetingInfo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the conferenceId property: The ID of the conference.
     *
     * @return the conferenceId value.
     */
    public String conferenceId() {
        return this.conferenceId;
    }

    /**
     * Set the conferenceId property: The ID of the conference.
     *
     * @param conferenceId the conferenceId value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Get the joinUrl property: The external link that launches the online meeting. This is a URL that clients will
     * launch into a browser and will redirect the user to join the meeting.
     *
     * @return the joinUrl value.
     */
    public String joinUrl() {
        return this.joinUrl;
    }

    /**
     * Set the joinUrl property: The external link that launches the online meeting. This is a URL that clients will
     * launch into a browser and will redirect the user to join the meeting.
     *
     * @param joinUrl the joinUrl value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }

    /**
     * Get the phones property: All of the phone numbers associated with this conference.
     *
     * @return the phones value.
     */
    public List<MicrosoftGraphPhone> phones() {
        return this.phones;
    }

    /**
     * Set the phones property: All of the phone numbers associated with this conference.
     *
     * @param phones the phones value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withPhones(List<MicrosoftGraphPhone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Get the quickDial property: The pre-formatted quickdial for this call.
     *
     * @return the quickDial value.
     */
    public String quickDial() {
        return this.quickDial;
    }

    /**
     * Set the quickDial property: The pre-formatted quickdial for this call.
     *
     * @param quickDial the quickDial value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withQuickDial(String quickDial) {
        this.quickDial = quickDial;
        return this;
    }

    /**
     * Get the tollFreeNumbers property: The toll free numbers that can be used to join the conference.
     *
     * @return the tollFreeNumbers value.
     */
    public List<String> tollFreeNumbers() {
        return this.tollFreeNumbers;
    }

    /**
     * Set the tollFreeNumbers property: The toll free numbers that can be used to join the conference.
     *
     * @param tollFreeNumbers the tollFreeNumbers value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withTollFreeNumbers(List<String> tollFreeNumbers) {
        this.tollFreeNumbers = tollFreeNumbers;
        return this;
    }

    /**
     * Get the tollNumber property: The toll number that can be used to join the conference.
     *
     * @return the tollNumber value.
     */
    public String tollNumber() {
        return this.tollNumber;
    }

    /**
     * Set the tollNumber property: The toll number that can be used to join the conference.
     *
     * @param tollNumber the tollNumber value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withTollNumber(String tollNumber) {
        this.tollNumber = tollNumber;
        return this;
    }

    /**
     * Get the additionalProperties property: onlineMeetingInfo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onlineMeetingInfo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnlineMeetingInfo object itself.
     */
    public MicrosoftGraphOnlineMeetingInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (phones() != null) {
            phones().forEach(e -> e.validate());
        }
    }
}
