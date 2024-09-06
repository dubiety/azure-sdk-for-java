// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.DetailedTransferStatus;
import com.azure.resourcemanager.billing.models.InitiatorCustomerType;
import com.azure.resourcemanager.billing.models.ProxyResourceWithTags;
import com.azure.resourcemanager.billing.models.TransferStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Details of the transfer.
 */
@Fluent
public final class PartnerTransferDetailsInner extends ProxyResourceWithTags {
    /*
     * Details of the transfer.
     */
    private PartnerTransferProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of PartnerTransferDetailsInner class.
     */
    public PartnerTransferDetailsInner() {
    }

    /**
     * Get the innerProperties property: Details of the transfer.
     * 
     * @return the innerProperties value.
     */
    private PartnerTransferProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerTransferDetailsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the expirationTime property: The time at which the transfer request expires.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Get the transferStatus property: Overall transfer status.
     * 
     * @return the transferStatus value.
     */
    public TransferStatus transferStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().transferStatus();
    }

    /**
     * Get the recipientEmailId property: The email ID of the user to whom the transfer request was sent.
     * 
     * @return the recipientEmailId value.
     */
    public String recipientEmailId() {
        return this.innerProperties() == null ? null : this.innerProperties().recipientEmailId();
    }

    /**
     * Get the initiatorCustomerType property: The type of customer who sent the transfer request.
     * 
     * @return the initiatorCustomerType value.
     */
    public InitiatorCustomerType initiatorCustomerType() {
        return this.innerProperties() == null ? null : this.innerProperties().initiatorCustomerType();
    }

    /**
     * Get the initiatorEmailId property: The email ID of the user who sent the transfer request.
     * 
     * @return the initiatorEmailId value.
     */
    public String initiatorEmailId() {
        return this.innerProperties() == null ? null : this.innerProperties().initiatorEmailId();
    }

    /**
     * Get the resellerId property: Optional MPN ID of the reseller for transfer requests that are sent from a Microsoft
     * Partner Agreement billing account.
     * 
     * @return the resellerId value.
     */
    public String resellerId() {
        return this.innerProperties() == null ? null : this.innerProperties().resellerId();
    }

    /**
     * Get the resellerName property: Optional name of the reseller for transfer requests that are sent from Microsoft
     * Partner Agreement billing account.
     * 
     * @return the resellerName value.
     */
    public String resellerName() {
        return this.innerProperties() == null ? null : this.innerProperties().resellerName();
    }

    /**
     * Get the canceledBy property: The email ID of the user who canceled the transfer request.
     * 
     * @return the canceledBy value.
     */
    public String canceledBy() {
        return this.innerProperties() == null ? null : this.innerProperties().canceledBy();
    }

    /**
     * Get the detailedTransferStatus property: Detailed transfer status.
     * 
     * @return the detailedTransferStatus value.
     */
    public List<DetailedTransferStatus> detailedTransferStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedTransferStatus();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PartnerTransferDetailsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PartnerTransferDetailsInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PartnerTransferDetailsInner.
     */
    public static PartnerTransferDetailsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PartnerTransferDetailsInner deserializedPartnerTransferDetailsInner = new PartnerTransferDetailsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPartnerTransferDetailsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPartnerTransferDetailsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPartnerTransferDetailsInner.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPartnerTransferDetailsInner.withTags(tags);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPartnerTransferDetailsInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedPartnerTransferDetailsInner.innerProperties
                        = PartnerTransferProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartnerTransferDetailsInner;
        });
    }
}
