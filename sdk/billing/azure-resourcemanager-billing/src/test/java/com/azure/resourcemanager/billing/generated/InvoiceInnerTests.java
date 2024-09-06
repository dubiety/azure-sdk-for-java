// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.InvoiceInner;
import com.azure.resourcemanager.billing.models.InvoiceProperties;
import com.azure.resourcemanager.billing.models.InvoicePropertiesAmountDue;
import com.azure.resourcemanager.billing.models.InvoicePropertiesAzurePrepaymentApplied;
import com.azure.resourcemanager.billing.models.InvoicePropertiesBilledAmount;
import com.azure.resourcemanager.billing.models.InvoicePropertiesCreditAmount;
import com.azure.resourcemanager.billing.models.InvoicePropertiesFreeAzureCreditApplied;
import com.azure.resourcemanager.billing.models.InvoicePropertiesRebillDetails;
import com.azure.resourcemanager.billing.models.InvoicePropertiesRefundDetails;
import com.azure.resourcemanager.billing.models.InvoicePropertiesSubTotal;
import com.azure.resourcemanager.billing.models.InvoicePropertiesTaxAmount;
import com.azure.resourcemanager.billing.models.InvoicePropertiesTotalAmount;
import com.azure.resourcemanager.billing.models.RefundDetailsSummaryAmountRefunded;
import com.azure.resourcemanager.billing.models.RefundDetailsSummaryAmountRequested;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InvoiceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InvoiceInner model = BinaryData.fromString(
            "{\"properties\":{\"amountDue\":{\"currency\":\"pqvyb\",\"value\":41.283936},\"azurePrepaymentApplied\":{\"currency\":\"x\",\"value\":27.64331},\"billedAmount\":{\"currency\":\"t\",\"value\":16.71524},\"billedDocumentId\":\"eskvcuartrhun\",\"billingProfileDisplayName\":\"iryky\",\"billingProfileId\":\"dzfqivjreuy\",\"creditAmount\":{\"currency\":\"mnwagltbxoe\",\"value\":77.6502},\"creditForDocumentId\":\"lnf\",\"documents\":[{\"documentNumbers\":[\"vqdbpbhfck\",\"vezcrcssbzhdd\",\"b\",\"nqfblhkalehpava\"],\"externalUrl\":\"giqjtiogq\",\"kind\":\"Summary\",\"name\":\"nictteajo\",\"url\":\"ygspnbonhpczykm\",\"source\":\"ENF\"}],\"documentType\":\"CreditNote\",\"dueDate\":\"2021-10-08T19:32:51Z\",\"failedPayments\":[{\"date\":\"2021-02-15T05:35:42Z\",\"failedPaymentReason\":\"BankDeclined\"},{\"date\":\"2021-10-23T22:02:24Z\",\"failedPaymentReason\":\"CardExpired\"}],\"freeAzureCreditApplied\":{\"currency\":\"qumq\",\"value\":7.102519},\"invoiceDate\":\"2021-03-08T06:43:22Z\",\"invoicePeriodEndDate\":\"2021-11-20T22:03:19Z\",\"invoicePeriodStartDate\":\"2021-09-30T01:43:07Z\",\"invoiceType\":\"AzureSupport\",\"isMonthlyInvoice\":false,\"payments\":[{\"amount\":{\"currency\":\"hsfnh\",\"value\":23.970026},\"date\":\"2020-12-23T17:30:48Z\",\"paymentMethodId\":\"pzfngqjcli\",\"paymentMethodFamily\":\"Credits\",\"paymentMethodType\":\"jwjj\",\"paymentType\":\"wbeqrkuor\"},{\"amount\":{\"currency\":\"sruqnmdvha\",\"value\":57.55649},\"date\":\"2021-10-27T04:25:49Z\",\"paymentMethodId\":\"iqswbqer\",\"paymentMethodFamily\":\"EWallet\",\"paymentMethodType\":\"ytxtdgu\",\"paymentType\":\"lbpktg\"},{\"amount\":{\"currency\":\"youambewr\",\"value\":67.716774},\"date\":\"2021-11-17T04:31:46Z\",\"paymentMethodId\":\"egmmuteyxe\",\"paymentMethodFamily\":\"None\",\"paymentMethodType\":\"igijiitnspxlz\",\"paymentType\":\"sygrijwa\"},{\"amount\":{\"currency\":\"anra\",\"value\":50.95093},\"date\":\"2021-07-25T00:37:18Z\",\"paymentMethodId\":\"frojsydgr\",\"paymentMethodFamily\":\"EWallet\",\"paymentMethodType\":\"ygywe\",\"paymentType\":\"kiecafygzm\"}],\"purchaseOrderNumber\":\"eqvdsm\",\"rebillDetails\":{\"invoiceDocumentId\":\"ixqcahyhxalybxaw\",\"creditNoteDocumentId\":\"jpodtbl\",\"rebillDetails\":{\"invoiceDocumentId\":\"kwjdjodqhy\",\"creditNoteDocumentId\":\"ncn\",\"rebillDetails\":{\"invoiceDocumentId\":\"ehllizhceum\",\"creditNoteDocumentId\":\"odkadppyibngq\",\"rebillDetails\":{\"invoiceDocumentId\":\"ywrxw\",\"creditNoteDocumentId\":\"dtluvvadswzsn\",\"rebillDetails\":{}}}}},\"status\":\"OverDue\",\"subscriptionDisplayName\":\"owuowh\",\"subscriptionId\":\"lnwy\",\"specialTaxationType\":\"SubtotalLevel\",\"subTotal\":{\"currency\":\"blgmokzkltrfowtd\",\"value\":76.91684},\"taxAmount\":{\"currency\":\"lihcvjdrqcr\",\"value\":78.2053},\"totalAmount\":{\"currency\":\"tuk\",\"value\":62.583202},\"refundDetails\":{\"requestedOn\":\"2021-02-03T01:15:49Z\",\"approvedOn\":\"2021-05-30T05:43:32Z\",\"completedOn\":\"2021-07-18T23:01:07Z\",\"amountRequested\":{\"currency\":\"zd\",\"value\":37.374027},\"amountRefunded\":{\"currency\":\"ixh\",\"value\":56.773537},\"rebillInvoiceId\":\"tqxmbj\",\"transactionCount\":1385225092,\"refundStatus\":\"Declined\",\"refundOperationId\":\"n\",\"refundReason\":\"ForgotToCancel\"}},\"tags\":{\"llywpvtiotzbp\":\"rhuzgfxonjtpu\",\"owsocnequygdjbo\":\"bollgryfqiuasig\"},\"id\":\"rmtqjkqevadr\",\"name\":\"mwiuawvcm\",\"type\":\"z\"}")
            .toObject(InvoiceInner.class);
        Assertions.assertEquals("rhuzgfxonjtpu", model.tags().get("llywpvtiotzbp"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InvoiceInner model
            = new InvoiceInner().withTags(mapOf("llywpvtiotzbp", "rhuzgfxonjtpu", "owsocnequygdjbo", "bollgryfqiuasig"))
                .withProperties(new InvoiceProperties().withAmountDue(new InvoicePropertiesAmountDue())
                    .withAzurePrepaymentApplied(new InvoicePropertiesAzurePrepaymentApplied())
                    .withBilledAmount(new InvoicePropertiesBilledAmount())
                    .withCreditAmount(new InvoicePropertiesCreditAmount())
                    .withFreeAzureCreditApplied(new InvoicePropertiesFreeAzureCreditApplied())
                    .withRebillDetails(new InvoicePropertiesRebillDetails())
                    .withSubTotal(new InvoicePropertiesSubTotal())
                    .withTaxAmount(new InvoicePropertiesTaxAmount())
                    .withTotalAmount(new InvoicePropertiesTotalAmount())
                    .withRefundDetails(new InvoicePropertiesRefundDetails()
                        .withAmountRequested(new RefundDetailsSummaryAmountRequested())
                        .withAmountRefunded(new RefundDetailsSummaryAmountRefunded())));
        model = BinaryData.fromObject(model).toObject(InvoiceInner.class);
        Assertions.assertEquals("rhuzgfxonjtpu", model.tags().get("llywpvtiotzbp"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
