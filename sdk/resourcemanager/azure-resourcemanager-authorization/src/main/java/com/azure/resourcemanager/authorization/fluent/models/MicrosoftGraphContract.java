// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * contract Represents an Azure Active Directory object. The directoryObject type is the base type for many other
 * directory entity types.
 */
@Fluent
public final class MicrosoftGraphContract extends MicrosoftGraphDirectoryObjectInner {
    /*
     * Type of contract.Possible values are: SyndicationPartner - Partner that
     * exclusively resells and manages O365 and Intune for this customer. They
     * resell and support their customers. BreadthPartner - Partner has the
     * ability to provide administrative support for this customer. However,
     * the partner is not allowed to resell to the customer.ResellerPartner -
     * Partner that is similar to a syndication partner, except that the
     * partner doesn’t have exclusive access to a tenant. In the syndication
     * case, the customer cannot buy additional direct subscriptions from
     * Microsoft or from other partners.
     */
    @JsonProperty(value = "contractType")
    private String contractType;

    /*
     * The unique identifier for the customer tenant referenced by this
     * partnership. Corresponds to the id property of the customer tenant's
     * organization resource.
     */
    @JsonProperty(value = "customerId")
    private UUID customerId;

    /*
     * A copy of the customer tenant's default domain name. The copy is made
     * when the partnership with the customer is established. It is not
     * automatically updated if the customer tenant's default domain name
     * changes.
     */
    @JsonProperty(value = "defaultDomainName")
    private String defaultDomainName;

    /*
     * A copy of the customer tenant's display name. The copy is made when the
     * partnership with the customer is established. It is not automatically
     * updated if the customer tenant's display name changes.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the contractType property: Type of contract.Possible values are: SyndicationPartner - Partner that
     * exclusively resells and manages O365 and Intune for this customer. They resell and support their customers.
     * BreadthPartner - Partner has the ability to provide administrative support for this customer. However, the
     * partner is not allowed to resell to the customer.ResellerPartner - Partner that is similar to a syndication
     * partner, except that the partner doesn’t have exclusive access to a tenant. In the syndication case, the customer
     * cannot buy additional direct subscriptions from Microsoft or from other partners.
     *
     * @return the contractType value.
     */
    public String contractType() {
        return this.contractType;
    }

    /**
     * Set the contractType property: Type of contract.Possible values are: SyndicationPartner - Partner that
     * exclusively resells and manages O365 and Intune for this customer. They resell and support their customers.
     * BreadthPartner - Partner has the ability to provide administrative support for this customer. However, the
     * partner is not allowed to resell to the customer.ResellerPartner - Partner that is similar to a syndication
     * partner, except that the partner doesn’t have exclusive access to a tenant. In the syndication case, the customer
     * cannot buy additional direct subscriptions from Microsoft or from other partners.
     *
     * @param contractType the contractType value to set.
     * @return the MicrosoftGraphContract object itself.
     */
    public MicrosoftGraphContract withContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Get the customerId property: The unique identifier for the customer tenant referenced by this partnership.
     * Corresponds to the id property of the customer tenant's organization resource.
     *
     * @return the customerId value.
     */
    public UUID customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId property: The unique identifier for the customer tenant referenced by this partnership.
     * Corresponds to the id property of the customer tenant's organization resource.
     *
     * @param customerId the customerId value to set.
     * @return the MicrosoftGraphContract object itself.
     */
    public MicrosoftGraphContract withCustomerId(UUID customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get the defaultDomainName property: A copy of the customer tenant's default domain name. The copy is made when
     * the partnership with the customer is established. It is not automatically updated if the customer tenant's
     * default domain name changes.
     *
     * @return the defaultDomainName value.
     */
    public String defaultDomainName() {
        return this.defaultDomainName;
    }

    /**
     * Set the defaultDomainName property: A copy of the customer tenant's default domain name. The copy is made when
     * the partnership with the customer is established. It is not automatically updated if the customer tenant's
     * default domain name changes.
     *
     * @param defaultDomainName the defaultDomainName value to set.
     * @return the MicrosoftGraphContract object itself.
     */
    public MicrosoftGraphContract withDefaultDomainName(String defaultDomainName) {
        this.defaultDomainName = defaultDomainName;
        return this;
    }

    /**
     * Get the displayName property: A copy of the customer tenant's display name. The copy is made when the partnership
     * with the customer is established. It is not automatically updated if the customer tenant's display name changes.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: A copy of the customer tenant's display name. The copy is made when the partnership
     * with the customer is established. It is not automatically updated if the customer tenant's display name changes.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphContract object itself.
     */
    public MicrosoftGraphContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphContract object itself.
     */
    public MicrosoftGraphContract withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphContract withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphContract withId(String id) {
        super.withId(id);
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
    }
}
