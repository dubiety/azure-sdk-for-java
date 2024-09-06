// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.InstanceFlexibility;
import com.azure.resourcemanager.billing.models.RenewPropertiesResponse;
import com.azure.resourcemanager.billing.models.ReservationAppliedScopeProperties;
import com.azure.resourcemanager.billing.models.ReservationBillingPlan;
import com.azure.resourcemanager.billing.models.ReservationExtendedStatusInfo;
import com.azure.resourcemanager.billing.models.ReservationMergeProperties;
import com.azure.resourcemanager.billing.models.ReservationSplitProperties;
import com.azure.resourcemanager.billing.models.ReservationSwapProperties;
import com.azure.resourcemanager.billing.models.ReservationUtilizationAggregates;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

/**
 * The property of reservation object.
 */
@Fluent
public final class ReservationProperty implements JsonSerializable<ReservationProperty> {
    /*
     * The reserved source type of the reservation, e.g. virtual machine.
     */
    private String reservedResourceType;

    /*
     * Allows reservation discount to be applied across skus within the same auto fit group. Not all skus support
     * instance size flexibility.
     */
    private InstanceFlexibility instanceFlexibility;

    /*
     * The display name of the reservation
     */
    private String displayName;

    /*
     * The array of applied scopes of a reservation. Will be null if the reservation is in Shared scope
     */
    private List<String> appliedScopes;

    /*
     * The applied scope type of the reservation.
     */
    private String appliedScopeType;

    /*
     * Indicates if the reservation is archived
     */
    private Boolean archived;

    /*
     * Capabilities of the reservation
     */
    private String capabilities;

    /*
     * The number of the reservation.
     */
    private Float quantity;

    /*
     * The provisioning state of the reservation, e.g. Succeeded
     */
    private String provisioningState;

    /*
     * The effective date time of the reservation
     */
    private OffsetDateTime effectiveDateTime;

    /*
     * This is the DateTime when the reservation benefit started.
     */
    private OffsetDateTime benefitStartTime;

    /*
     * DateTime of the last time the reservation was updated.
     */
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * The expiry date of the reservation
     */
    private String expiryDate;

    /*
     * This is the date-time when the reservation will expire.
     */
    private OffsetDateTime expiryDateTime;

    /*
     * This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     */
    private OffsetDateTime reviewDateTime;

    /*
     * The sku description of the reservation
     */
    private String skuDescription;

    /*
     * The message giving detailed information about the status code.
     */
    private ReservationExtendedStatusInfo extendedStatusInfo;

    /*
     * The billing plan options available for this sku.
     */
    private ReservationBillingPlan billingPlan;

    /*
     * The provisioning state of the reservation for display, e.g. Succeeded
     */
    private String displayProvisioningState;

    /*
     * The provisioning state of the reservation, e.g. Succeeded
     */
    private String provisioningSubState;

    /*
     * This is the date when the reservation was purchased.
     */
    private LocalDate purchaseDate;

    /*
     * This is the date-time when the reservation was purchased.
     */
    private OffsetDateTime purchaseDateTime;

    /*
     * Properties of reservation split
     */
    private ReservationSplitProperties splitProperties;

    /*
     * Properties of reservation merge
     */
    private ReservationMergeProperties mergeProperties;

    /*
     * Properties of reservation swap
     */
    private ReservationSwapProperties swapProperties;

    /*
     * Properties specific to applied scope type. Not required if not applicable. Required and need to provide tenantId
     * and managementGroupId if AppliedScopeType is ManagementGroup
     */
    private ReservationAppliedScopeProperties appliedScopeProperties;

    /*
     * Subscription that will be charged for purchasing reservation or savings plan
     */
    private String billingScopeId;

    /*
     * The renew state of the reservation
     */
    private Boolean renew;

    /*
     * The renew source of the reservation
     */
    private String renewSource;

    /*
     * Reservation Id of the reservation which is purchased because of renew. Format of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     */
    private String renewDestination;

    /*
     * The renew properties for a reservation.
     */
    private RenewPropertiesResponse renewProperties;

    /*
     * The term of the reservation, e.g. P1Y
     */
    private String term;

    /*
     * The applied scope type of the reservation for display, e.g. Shared
     */
    private String userFriendlyAppliedScopeType;

    /*
     * The renew state of the reservation for display, e.g. On
     */
    private String userFriendlyRenewState;

    /*
     * Reservation utilization
     */
    private ReservationPropertyUtilization innerUtilization;

    /*
     * Represents UPN
     */
    private String productCode;

    /**
     * Creates an instance of ReservationProperty class.
     */
    public ReservationProperty() {
    }

    /**
     * Get the reservedResourceType property: The reserved source type of the reservation, e.g. virtual machine.
     * 
     * @return the reservedResourceType value.
     */
    public String reservedResourceType() {
        return this.reservedResourceType;
    }

    /**
     * Get the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     * 
     * @return the instanceFlexibility value.
     */
    public InstanceFlexibility instanceFlexibility() {
        return this.instanceFlexibility;
    }

    /**
     * Set the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     * 
     * @param instanceFlexibility the instanceFlexibility value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withInstanceFlexibility(InstanceFlexibility instanceFlexibility) {
        this.instanceFlexibility = instanceFlexibility;
        return this;
    }

    /**
     * Get the displayName property: The display name of the reservation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the appliedScopes property: The array of applied scopes of a reservation. Will be null if the reservation is
     * in Shared scope.
     * 
     * @return the appliedScopes value.
     */
    public List<String> appliedScopes() {
        return this.appliedScopes;
    }

    /**
     * Set the appliedScopes property: The array of applied scopes of a reservation. Will be null if the reservation is
     * in Shared scope.
     * 
     * @param appliedScopes the appliedScopes value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withAppliedScopes(List<String> appliedScopes) {
        this.appliedScopes = appliedScopes;
        return this;
    }

    /**
     * Get the appliedScopeType property: The applied scope type of the reservation.
     * 
     * @return the appliedScopeType value.
     */
    public String appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Get the archived property: Indicates if the reservation is archived.
     * 
     * @return the archived value.
     */
    public Boolean archived() {
        return this.archived;
    }

    /**
     * Set the archived property: Indicates if the reservation is archived.
     * 
     * @param archived the archived value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the reservation.
     * 
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of the reservation.
     * 
     * @param capabilities the capabilities value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the quantity property: The number of the reservation.
     * 
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Get the provisioningState property: The provisioning state of the reservation, e.g. Succeeded.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the effectiveDateTime property: The effective date time of the reservation.
     * 
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.benefitStartTime;
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withBenefitStartTime(OffsetDateTime benefitStartTime) {
        this.benefitStartTime = benefitStartTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: DateTime of the last time the reservation was updated.
     * 
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime lastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Get the expiryDate property: The expiry date of the reservation.
     * 
     * @return the expiryDate value.
     */
    public String expiryDate() {
        return this.expiryDate;
    }

    /**
     * Get the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withExpiryDateTime(OffsetDateTime expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /**
     * Get the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @return the reviewDateTime value.
     */
    public OffsetDateTime reviewDateTime() {
        return this.reviewDateTime;
    }

    /**
     * Set the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @param reviewDateTime the reviewDateTime value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withReviewDateTime(OffsetDateTime reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
        return this;
    }

    /**
     * Get the skuDescription property: The sku description of the reservation.
     * 
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Get the extendedStatusInfo property: The message giving detailed information about the status code.
     * 
     * @return the extendedStatusInfo value.
     */
    public ReservationExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Set the extendedStatusInfo property: The message giving detailed information about the status code.
     * 
     * @param extendedStatusInfo the extendedStatusInfo value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withExtendedStatusInfo(ReservationExtendedStatusInfo extendedStatusInfo) {
        this.extendedStatusInfo = extendedStatusInfo;
        return this;
    }

    /**
     * Get the billingPlan property: The billing plan options available for this sku.
     * 
     * @return the billingPlan value.
     */
    public ReservationBillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: The billing plan options available for this sku.
     * 
     * @param billingPlan the billingPlan value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withBillingPlan(ReservationBillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the reservation for display, e.g. Succeeded.
     * 
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.displayProvisioningState;
    }

    /**
     * Get the provisioningSubState property: The provisioning state of the reservation, e.g. Succeeded.
     * 
     * @return the provisioningSubState value.
     */
    public String provisioningSubState() {
        return this.provisioningSubState;
    }

    /**
     * Get the purchaseDate property: This is the date when the reservation was purchased.
     * 
     * @return the purchaseDate value.
     */
    public LocalDate purchaseDate() {
        return this.purchaseDate;
    }

    /**
     * Set the purchaseDate property: This is the date when the reservation was purchased.
     * 
     * @param purchaseDate the purchaseDate value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * Get the purchaseDateTime property: This is the date-time when the reservation was purchased.
     * 
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.purchaseDateTime;
    }

    /**
     * Set the purchaseDateTime property: This is the date-time when the reservation was purchased.
     * 
     * @param purchaseDateTime the purchaseDateTime value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withPurchaseDateTime(OffsetDateTime purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
        return this;
    }

    /**
     * Get the splitProperties property: Properties of reservation split.
     * 
     * @return the splitProperties value.
     */
    public ReservationSplitProperties splitProperties() {
        return this.splitProperties;
    }

    /**
     * Set the splitProperties property: Properties of reservation split.
     * 
     * @param splitProperties the splitProperties value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withSplitProperties(ReservationSplitProperties splitProperties) {
        this.splitProperties = splitProperties;
        return this;
    }

    /**
     * Get the mergeProperties property: Properties of reservation merge.
     * 
     * @return the mergeProperties value.
     */
    public ReservationMergeProperties mergeProperties() {
        return this.mergeProperties;
    }

    /**
     * Set the mergeProperties property: Properties of reservation merge.
     * 
     * @param mergeProperties the mergeProperties value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withMergeProperties(ReservationMergeProperties mergeProperties) {
        this.mergeProperties = mergeProperties;
        return this;
    }

    /**
     * Get the swapProperties property: Properties of reservation swap.
     * 
     * @return the swapProperties value.
     */
    public ReservationSwapProperties swapProperties() {
        return this.swapProperties;
    }

    /**
     * Set the swapProperties property: Properties of reservation swap.
     * 
     * @param swapProperties the swapProperties value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withSwapProperties(ReservationSwapProperties swapProperties) {
        this.swapProperties = swapProperties;
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     * 
     * @return the appliedScopeProperties value.
     */
    public ReservationAppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     * 
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withAppliedScopeProperties(ReservationAppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing reservation or savings plan.
     * 
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Get the renew property: The renew state of the reservation.
     * 
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Get the renewSource property: The renew source of the reservation.
     * 
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.renewSource;
    }

    /**
     * Get the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.renewDestination;
    }

    /**
     * Set the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @param renewDestination the renewDestination value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withRenewDestination(String renewDestination) {
        this.renewDestination = renewDestination;
        return this;
    }

    /**
     * Get the renewProperties property: The renew properties for a reservation.
     * 
     * @return the renewProperties value.
     */
    public RenewPropertiesResponse renewProperties() {
        return this.renewProperties;
    }

    /**
     * Set the renewProperties property: The renew properties for a reservation.
     * 
     * @param renewProperties the renewProperties value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withRenewProperties(RenewPropertiesResponse renewProperties) {
        this.renewProperties = renewProperties;
        return this;
    }

    /**
     * Get the term property: The term of the reservation, e.g. P1Y.
     * 
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the reservation for display, e.g.
     * Shared.
     * 
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.userFriendlyAppliedScopeType;
    }

    /**
     * Get the userFriendlyRenewState property: The renew state of the reservation for display, e.g. On.
     * 
     * @return the userFriendlyRenewState value.
     */
    public String userFriendlyRenewState() {
        return this.userFriendlyRenewState;
    }

    /**
     * Get the innerUtilization property: Reservation utilization.
     * 
     * @return the innerUtilization value.
     */
    private ReservationPropertyUtilization innerUtilization() {
        return this.innerUtilization;
    }

    /**
     * Get the productCode property: Represents UPN.
     * 
     * @return the productCode value.
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * Set the productCode property: Represents UPN.
     * 
     * @param productCode the productCode value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get the trend property: last 7 day utilization trend for a reservation.
     * 
     * @return the trend value.
     */
    public String trend() {
        return this.innerUtilization() == null ? null : this.innerUtilization().trend();
    }

    /**
     * Get the aggregates property: The array of aggregates of a reservation's utilization.
     * 
     * @return the aggregates value.
     */
    public List<ReservationUtilizationAggregates> aggregates() {
        return this.innerUtilization() == null ? null : this.innerUtilization().aggregates();
    }

    /**
     * Set the aggregates property: The array of aggregates of a reservation's utilization.
     * 
     * @param aggregates the aggregates value to set.
     * @return the ReservationProperty object itself.
     */
    public ReservationProperty withAggregates(List<ReservationUtilizationAggregates> aggregates) {
        if (this.innerUtilization() == null) {
            this.innerUtilization = new ReservationPropertyUtilization();
        }
        this.innerUtilization().withAggregates(aggregates);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
        if (splitProperties() != null) {
            splitProperties().validate();
        }
        if (mergeProperties() != null) {
            mergeProperties().validate();
        }
        if (swapProperties() != null) {
            swapProperties().validate();
        }
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
        if (renewProperties() != null) {
            renewProperties().validate();
        }
        if (innerUtilization() != null) {
            innerUtilization().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceFlexibility",
            this.instanceFlexibility == null ? null : this.instanceFlexibility.toString());
        jsonWriter.writeArrayField("appliedScopes", this.appliedScopes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("archived", this.archived);
        jsonWriter.writeStringField("capabilities", this.capabilities);
        jsonWriter.writeStringField("benefitStartTime",
            this.benefitStartTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.benefitStartTime));
        jsonWriter.writeStringField("expiryDateTime",
            this.expiryDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiryDateTime));
        jsonWriter.writeStringField("reviewDateTime",
            this.reviewDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.reviewDateTime));
        jsonWriter.writeJsonField("extendedStatusInfo", this.extendedStatusInfo);
        jsonWriter.writeStringField("billingPlan", this.billingPlan == null ? null : this.billingPlan.toString());
        jsonWriter.writeStringField("purchaseDate", Objects.toString(this.purchaseDate, null));
        jsonWriter.writeStringField("purchaseDateTime",
            this.purchaseDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.purchaseDateTime));
        jsonWriter.writeJsonField("splitProperties", this.splitProperties);
        jsonWriter.writeJsonField("mergeProperties", this.mergeProperties);
        jsonWriter.writeJsonField("swapProperties", this.swapProperties);
        jsonWriter.writeJsonField("appliedScopeProperties", this.appliedScopeProperties);
        jsonWriter.writeStringField("renewDestination", this.renewDestination);
        jsonWriter.writeJsonField("renewProperties", this.renewProperties);
        jsonWriter.writeStringField("productCode", this.productCode);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReservationProperty.
     */
    public static ReservationProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationProperty deserializedReservationProperty = new ReservationProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("reservedResourceType".equals(fieldName)) {
                    deserializedReservationProperty.reservedResourceType = reader.getString();
                } else if ("instanceFlexibility".equals(fieldName)) {
                    deserializedReservationProperty.instanceFlexibility
                        = InstanceFlexibility.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedReservationProperty.displayName = reader.getString();
                } else if ("appliedScopes".equals(fieldName)) {
                    List<String> appliedScopes = reader.readArray(reader1 -> reader1.getString());
                    deserializedReservationProperty.appliedScopes = appliedScopes;
                } else if ("appliedScopeType".equals(fieldName)) {
                    deserializedReservationProperty.appliedScopeType = reader.getString();
                } else if ("archived".equals(fieldName)) {
                    deserializedReservationProperty.archived = reader.getNullable(JsonReader::getBoolean);
                } else if ("capabilities".equals(fieldName)) {
                    deserializedReservationProperty.capabilities = reader.getString();
                } else if ("quantity".equals(fieldName)) {
                    deserializedReservationProperty.quantity = reader.getNullable(JsonReader::getFloat);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedReservationProperty.provisioningState = reader.getString();
                } else if ("effectiveDateTime".equals(fieldName)) {
                    deserializedReservationProperty.effectiveDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("benefitStartTime".equals(fieldName)) {
                    deserializedReservationProperty.benefitStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    deserializedReservationProperty.lastUpdatedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiryDate".equals(fieldName)) {
                    deserializedReservationProperty.expiryDate = reader.getString();
                } else if ("expiryDateTime".equals(fieldName)) {
                    deserializedReservationProperty.expiryDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("reviewDateTime".equals(fieldName)) {
                    deserializedReservationProperty.reviewDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("skuDescription".equals(fieldName)) {
                    deserializedReservationProperty.skuDescription = reader.getString();
                } else if ("extendedStatusInfo".equals(fieldName)) {
                    deserializedReservationProperty.extendedStatusInfo = ReservationExtendedStatusInfo.fromJson(reader);
                } else if ("billingPlan".equals(fieldName)) {
                    deserializedReservationProperty.billingPlan = ReservationBillingPlan.fromString(reader.getString());
                } else if ("displayProvisioningState".equals(fieldName)) {
                    deserializedReservationProperty.displayProvisioningState = reader.getString();
                } else if ("provisioningSubState".equals(fieldName)) {
                    deserializedReservationProperty.provisioningSubState = reader.getString();
                } else if ("purchaseDate".equals(fieldName)) {
                    deserializedReservationProperty.purchaseDate
                        = reader.getNullable(nonNullReader -> LocalDate.parse(nonNullReader.getString()));
                } else if ("purchaseDateTime".equals(fieldName)) {
                    deserializedReservationProperty.purchaseDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("splitProperties".equals(fieldName)) {
                    deserializedReservationProperty.splitProperties = ReservationSplitProperties.fromJson(reader);
                } else if ("mergeProperties".equals(fieldName)) {
                    deserializedReservationProperty.mergeProperties = ReservationMergeProperties.fromJson(reader);
                } else if ("swapProperties".equals(fieldName)) {
                    deserializedReservationProperty.swapProperties = ReservationSwapProperties.fromJson(reader);
                } else if ("appliedScopeProperties".equals(fieldName)) {
                    deserializedReservationProperty.appliedScopeProperties
                        = ReservationAppliedScopeProperties.fromJson(reader);
                } else if ("billingScopeId".equals(fieldName)) {
                    deserializedReservationProperty.billingScopeId = reader.getString();
                } else if ("renew".equals(fieldName)) {
                    deserializedReservationProperty.renew = reader.getNullable(JsonReader::getBoolean);
                } else if ("renewSource".equals(fieldName)) {
                    deserializedReservationProperty.renewSource = reader.getString();
                } else if ("renewDestination".equals(fieldName)) {
                    deserializedReservationProperty.renewDestination = reader.getString();
                } else if ("renewProperties".equals(fieldName)) {
                    deserializedReservationProperty.renewProperties = RenewPropertiesResponse.fromJson(reader);
                } else if ("term".equals(fieldName)) {
                    deserializedReservationProperty.term = reader.getString();
                } else if ("userFriendlyAppliedScopeType".equals(fieldName)) {
                    deserializedReservationProperty.userFriendlyAppliedScopeType = reader.getString();
                } else if ("userFriendlyRenewState".equals(fieldName)) {
                    deserializedReservationProperty.userFriendlyRenewState = reader.getString();
                } else if ("utilization".equals(fieldName)) {
                    deserializedReservationProperty.innerUtilization = ReservationPropertyUtilization.fromJson(reader);
                } else if ("productCode".equals(fieldName)) {
                    deserializedReservationProperty.productCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationProperty;
        });
    }
}
