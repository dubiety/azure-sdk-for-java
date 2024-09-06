// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the tax identifier.
 */
public final class TaxIdentifierType extends ExpandableStringEnum<TaxIdentifierType> {
    /**
     * Static value Other for TaxIdentifierType.
     */
    public static final TaxIdentifierType OTHER = fromString("Other");

    /**
     * Static value BrazilCcmId for TaxIdentifierType.
     */
    public static final TaxIdentifierType BRAZIL_CCM_ID = fromString("BrazilCcmId");

    /**
     * Static value BrazilCnpjId for TaxIdentifierType.
     */
    public static final TaxIdentifierType BRAZIL_CNPJ_ID = fromString("BrazilCnpjId");

    /**
     * Static value BrazilCpfId for TaxIdentifierType.
     */
    public static final TaxIdentifierType BRAZIL_CPF_ID = fromString("BrazilCpfId");

    /**
     * Static value CanadianFederalExempt for TaxIdentifierType.
     */
    public static final TaxIdentifierType CANADIAN_FEDERAL_EXEMPT = fromString("CanadianFederalExempt");

    /**
     * Static value CanadianProvinceExempt for TaxIdentifierType.
     */
    public static final TaxIdentifierType CANADIAN_PROVINCE_EXEMPT = fromString("CanadianProvinceExempt");

    /**
     * Static value ExternalTaxation for TaxIdentifierType.
     */
    public static final TaxIdentifierType EXTERNAL_TAXATION = fromString("ExternalTaxation");

    /**
     * Static value IndiaFederalTanId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_FEDERAL_TAN_ID = fromString("IndiaFederalTanId");

    /**
     * Static value IndiaFederalServiceTaxId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_FEDERAL_SERVICE_TAX_ID = fromString("IndiaFederalServiceTaxId");

    /**
     * Static value IndiaPanId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_PAN_ID = fromString("IndiaPanId");

    /**
     * Static value IndiaStateCstId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_STATE_CST_ID = fromString("IndiaStateCstId");

    /**
     * Static value IndiaStateGstINId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_STATE_GST_INID = fromString("IndiaStateGstINId");

    /**
     * Static value IndiaStateVatId for TaxIdentifierType.
     */
    public static final TaxIdentifierType INDIA_STATE_VAT_ID = fromString("IndiaStateVatId");

    /**
     * Static value IntlExempt for TaxIdentifierType.
     */
    public static final TaxIdentifierType INTL_EXEMPT = fromString("IntlExempt");

    /**
     * Static value USExempt for TaxIdentifierType.
     */
    public static final TaxIdentifierType USEXEMPT = fromString("USExempt");

    /**
     * Static value VatId for TaxIdentifierType.
     */
    public static final TaxIdentifierType VAT_ID = fromString("VatId");

    /**
     * Static value LoveCode for TaxIdentifierType.
     */
    public static final TaxIdentifierType LOVE_CODE = fromString("LoveCode");

    /**
     * Static value MobileBarCode for TaxIdentifierType.
     */
    public static final TaxIdentifierType MOBILE_BAR_CODE = fromString("MobileBarCode");

    /**
     * Static value NationalIdentificationNumber for TaxIdentifierType.
     */
    public static final TaxIdentifierType NATIONAL_IDENTIFICATION_NUMBER = fromString("NationalIdentificationNumber");

    /**
     * Static value PublicSectorId for TaxIdentifierType.
     */
    public static final TaxIdentifierType PUBLIC_SECTOR_ID = fromString("PublicSectorId");

    /**
     * Creates a new instance of TaxIdentifierType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TaxIdentifierType() {
    }

    /**
     * Creates or finds a TaxIdentifierType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TaxIdentifierType.
     */
    public static TaxIdentifierType fromString(String name) {
        return fromString(name, TaxIdentifierType.class);
    }

    /**
     * Gets known TaxIdentifierType values.
     * 
     * @return known TaxIdentifierType values.
     */
    public static Collection<TaxIdentifierType> values() {
        return values(TaxIdentifierType.class);
    }
}
