// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.InvoicePropertiesRefundDetails;
import com.azure.resourcemanager.billing.models.RefundDetailsSummaryAmountRefunded;
import com.azure.resourcemanager.billing.models.RefundDetailsSummaryAmountRequested;

public final class InvoicePropertiesRefundDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InvoicePropertiesRefundDetails model = BinaryData.fromString(
            "{\"requestedOn\":\"2021-04-12T22:11:47Z\",\"approvedOn\":\"2021-05-20T21:34:33Z\",\"completedOn\":\"2021-05-08T16:54:42Z\",\"amountRequested\":{\"currency\":\"msxbaevwjcnkott\",\"value\":94.83965},\"amountRefunded\":{\"currency\":\"ajmailfemjjza\",\"value\":60.582817},\"rebillInvoiceId\":\"iqullqxbdmvr\",\"transactionCount\":1725625204,\"refundStatus\":\"Completed\",\"refundOperationId\":\"ndb\",\"refundReason\":\"AccidentalPurchase\"}")
            .toObject(InvoicePropertiesRefundDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InvoicePropertiesRefundDetails model
            = new InvoicePropertiesRefundDetails().withAmountRequested(new RefundDetailsSummaryAmountRequested())
                .withAmountRefunded(new RefundDetailsSummaryAmountRefunded());
        model = BinaryData.fromObject(model).toObject(InvoicePropertiesRefundDetails.class);
    }
}
