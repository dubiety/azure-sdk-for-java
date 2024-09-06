// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.AgreementListResult;

public final class AgreementListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgreementListResult model = BinaryData.fromString(
            "{\"nextLink\":\"jaeq\",\"value\":[{\"properties\":{\"acceptanceMode\":\"PhysicalSign\",\"agreementLink\":\"v\",\"billingProfileInfo\":[{\"billingAccountId\":\"qulngsntnbybkzgc\",\"billingProfileDisplayName\":\"wclxxwrl\",\"billingProfileId\":\"ouskcqvkocrc\",\"billingProfileSystemId\":\"kwt\",\"indirectRelationshipOrganizationName\":\"xbnjbiksq\"},{\"billingAccountId\":\"lssai\",\"billingProfileDisplayName\":\"p\",\"billingProfileId\":\"nzl\",\"billingProfileSystemId\":\"fmppe\",\"indirectRelationshipOrganizationName\":\"vmgxsab\"},{\"billingAccountId\":\"qduujitcjczdz\",\"billingProfileDisplayName\":\"ndhkrw\",\"billingProfileId\":\"appd\",\"billingProfileSystemId\":\"dkvwrwjfe\",\"indirectRelationshipOrganizationName\":\"nhutjeltmrldhugj\"}],\"category\":\"MicrosoftCustomerAgreement\",\"displayName\":\"tqxhocdgeab\",\"effectiveDate\":\"2021-05-27T22:50:20Z\",\"expirationDate\":\"2021-10-17T04:41:11Z\",\"participants\":[{\"email\":\"ndv\",\"status\":\"ozwyiftyhxhuro\",\"statusDate\":\"2020-12-20T08:53:33Z\"},{\"email\":\"xolniwpwcukjfk\",\"status\":\"awxklr\",\"statusDate\":\"2021-02-17T21:17:55Z\"},{\"email\":\"ckbasyypndd\",\"status\":\"gcbacphejkot\",\"statusDate\":\"2021-05-11T13:05:51Z\"},{\"email\":\"oulzndlikwyq\",\"status\":\"fgibmadgakeq\",\"statusDate\":\"2021-06-20T22:32:23Z\"}],\"status\":\"bzqqedqytbciq\",\"leadBillingAccountName\":\"uflmm\"},\"tags\":{\"b\":\"smodmgloug\"},\"id\":\"tmut\",\"name\":\"uqktap\",\"type\":\"pwgcuertu\"},{\"properties\":{\"acceptanceMode\":\"PhysicalSign\",\"agreementLink\":\"vqwhbmdgbbjfd\",\"billingProfileInfo\":[{\"billingAccountId\":\"mbe\",\"billingProfileDisplayName\":\"pbhtqqrolfpfpsa\",\"billingProfileId\":\"bquxigjy\",\"billingProfileSystemId\":\"zjaoyfhrtxil\",\"indirectRelationshipOrganizationName\":\"rkujy\"},{\"billingAccountId\":\"l\",\"billingProfileDisplayName\":\"uvfqawrlyxwj\",\"billingProfileId\":\"prbnwbxgjvtbv\",\"billingProfileSystemId\":\"sszdnru\",\"indirectRelationshipOrganizationName\":\"guhmuouqfpr\"},{\"billingAccountId\":\"wbnguitnwui\",\"billingProfileDisplayName\":\"a\",\"billingProfileId\":\"ufizuckyf\",\"billingProfileSystemId\":\"rfidfvzwdz\",\"indirectRelationshipOrganizationName\":\"tymw\"}],\"category\":\"MicrosoftPartnerAgreement\",\"displayName\":\"fthwxmnteiwa\",\"effectiveDate\":\"2021-07-09T10:48:35Z\",\"expirationDate\":\"2021-04-07T17:13:30Z\",\"participants\":[{\"email\":\"mmxdcu\",\"status\":\"fsrpymzidnse\",\"statusDate\":\"2021-09-08T03:00:46Z\"},{\"email\":\"bzsgfyccsne\",\"status\":\"dwzjeiach\",\"statusDate\":\"2021-09-14T11:53:52Z\"},{\"email\":\"flnrosfqpteehzz\",\"status\":\"pyqr\",\"statusDate\":\"2021-02-03T19:04:42Z\"},{\"email\":\"npvswjdkirso\",\"status\":\"qxhcrmn\",\"statusDate\":\"2021-05-15T08:21:17Z\"}],\"status\":\"ckwhds\",\"leadBillingAccountName\":\"fiyipjxsqwpgrj\"},\"tags\":{\"qabnmoc\":\"orcjxvsnby\",\"toqcjmklja\":\"cyshurzafbljjgp\",\"yulpkudjkr\":\"bqidtqaj\",\"e\":\"khbzhfepgzg\"},\"id\":\"locx\",\"name\":\"c\",\"type\":\"aierhhb\"}]}")
            .toObject(AgreementListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgreementListResult model = new AgreementListResult();
        model = BinaryData.fromObject(model).toObject(AgreementListResult.class);
    }
}
