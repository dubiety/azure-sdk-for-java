// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The scheduling constraints for when the profile begins.
 */
@Fluent
public final class RecurrentSchedule implements JsonSerializable<RecurrentSchedule> {
    /*
     * the timezone for the hours of the profile. Some examples of valid time zones are: Dateline Standard Time, UTC-11,
     * Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico), Pacific Standard Time, US Mountain
     * Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time, Central America Standard Time, Central
     * Standard Time, Central Standard Time (Mexico), Canada Central Standard Time, SA Pacific Standard Time, Eastern
     * Standard Time, US Eastern Standard Time, Venezuela Standard Time, Paraguay Standard Time, Atlantic Standard Time,
     * Central Brazilian Standard Time, SA Western Standard Time, Pacific SA Standard Time, Newfoundland Standard Time,
     * E. South America Standard Time, Argentina Standard Time, SA Eastern Standard Time, Greenland Standard Time,
     * Montevideo Standard Time, Bahia Standard Time, UTC-02, Mid-Atlantic Standard Time, Azores Standard Time, Cape
     * Verde Standard Time, Morocco Standard Time, UTC, GMT Standard Time, Greenwich Standard Time, W. Europe Standard
     * Time, Central Europe Standard Time, Romance Standard Time, Central European Standard Time, W. Central Africa
     * Standard Time, Namibia Standard Time, Jordan Standard Time, GTB Standard Time, Middle East Standard Time, Egypt
     * Standard Time, Syria Standard Time, E. Europe Standard Time, South Africa Standard Time, FLE Standard Time,
     * Turkey Standard Time, Israel Standard Time, Kaliningrad Standard Time, Libya Standard Time, Arabic Standard Time,
     * Arab Standard Time, Belarus Standard Time, Russian Standard Time, E. Africa Standard Time, Iran Standard Time,
     * Arabian Standard Time, Azerbaijan Standard Time, Russia Time Zone 3, Mauritius Standard Time, Georgian Standard
     * Time, Caucasus Standard Time, Afghanistan Standard Time, West Asia Standard Time, Ekaterinburg Standard Time,
     * Pakistan Standard Time, India Standard Time, Sri Lanka Standard Time, Nepal Standard Time, Central Asia Standard
     * Time, Bangladesh Standard Time, N. Central Asia Standard Time, Myanmar Standard Time, SE Asia Standard Time,
     * North Asia Standard Time, China Standard Time, North Asia East Standard Time, Singapore Standard Time, W.
     * Australia Standard Time, Taipei Standard Time, Ulaanbaatar Standard Time, Tokyo Standard Time, Korea Standard
     * Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS Central Standard Time, E. Australia Standard Time,
     * AUS Eastern Standard Time, West Pacific Standard Time, Tasmania Standard Time, Magadan Standard Time, Vladivostok
     * Standard Time, Russia Time Zone 10, Central Pacific Standard Time, Russia Time Zone 11, New Zealand Standard
     * Time, UTC+12, Fiji Standard Time, Kamchatka Standard Time, Tonga Standard Time, Samoa Standard Time, Line Islands
     * Standard Time
     */
    private String timeZone;

    /*
     * the collection of days that the profile takes effect on. Possible values are Sunday through Saturday.
     */
    private List<String> days;

    /*
     * A collection of hours that the profile takes effect on. Values supported are 0 to 23 on the 24-hour clock (AM/PM
     * times are not supported).
     */
    private List<Integer> hours;

    /*
     * A collection of minutes at which the profile takes effect at.
     */
    private List<Integer> minutes;

    /**
     * Creates an instance of RecurrentSchedule class.
     */
    public RecurrentSchedule() {
    }

    /**
     * Get the timeZone property: the timezone for the hours of the profile. Some examples of valid time zones are:
     * Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico),
     * Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time,
     * Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard
     * Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time,
     * Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time,
     * Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA
     * Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02,
     * Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT
     * Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard
     * Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard
     * Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard
     * Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad
     * Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian
     * Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time,
     * Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard
     * Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka
     * Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia
     * Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North
     * Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar
     * Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS
     * Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time,
     * Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific
     * Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard
     * Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time.
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: the timezone for the hours of the profile. Some examples of valid time zones are:
     * Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico),
     * Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time,
     * Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard
     * Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time,
     * Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time,
     * Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA
     * Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02,
     * Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT
     * Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard
     * Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard
     * Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard
     * Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad
     * Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian
     * Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time,
     * Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard
     * Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka
     * Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia
     * Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North
     * Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar
     * Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS
     * Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time,
     * Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific
     * Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard
     * Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time.
     * 
     * @param timeZone the timeZone value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the days property: the collection of days that the profile takes effect on. Possible values are Sunday
     * through Saturday.
     * 
     * @return the days value.
     */
    public List<String> days() {
        return this.days;
    }

    /**
     * Set the days property: the collection of days that the profile takes effect on. Possible values are Sunday
     * through Saturday.
     * 
     * @param days the days value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withDays(List<String> days) {
        this.days = days;
        return this;
    }

    /**
     * Get the hours property: A collection of hours that the profile takes effect on. Values supported are 0 to 23 on
     * the 24-hour clock (AM/PM times are not supported).
     * 
     * @return the hours value.
     */
    public List<Integer> hours() {
        return this.hours;
    }

    /**
     * Set the hours property: A collection of hours that the profile takes effect on. Values supported are 0 to 23 on
     * the 24-hour clock (AM/PM times are not supported).
     * 
     * @param hours the hours value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withHours(List<Integer> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get the minutes property: A collection of minutes at which the profile takes effect at.
     * 
     * @return the minutes value.
     */
    public List<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Set the minutes property: A collection of minutes at which the profile takes effect at.
     * 
     * @param minutes the minutes value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withMinutes(List<Integer> minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeZone() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property timeZone in model RecurrentSchedule"));
        }
        if (days() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property days in model RecurrentSchedule"));
        }
        if (hours() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property hours in model RecurrentSchedule"));
        }
        if (minutes() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property minutes in model RecurrentSchedule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecurrentSchedule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timeZone", this.timeZone);
        jsonWriter.writeArrayField("days", this.days, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("hours", this.hours, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeArrayField("minutes", this.minutes, (writer, element) -> writer.writeInt(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecurrentSchedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecurrentSchedule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RecurrentSchedule.
     */
    public static RecurrentSchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecurrentSchedule deserializedRecurrentSchedule = new RecurrentSchedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeZone".equals(fieldName)) {
                    deserializedRecurrentSchedule.timeZone = reader.getString();
                } else if ("days".equals(fieldName)) {
                    List<String> days = reader.readArray(reader1 -> reader1.getString());
                    deserializedRecurrentSchedule.days = days;
                } else if ("hours".equals(fieldName)) {
                    List<Integer> hours = reader.readArray(reader1 -> reader1.getInt());
                    deserializedRecurrentSchedule.hours = hours;
                } else if ("minutes".equals(fieldName)) {
                    List<Integer> minutes = reader.readArray(reader1 -> reader1.getInt());
                    deserializedRecurrentSchedule.minutes = minutes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecurrentSchedule;
        });
    }
}
