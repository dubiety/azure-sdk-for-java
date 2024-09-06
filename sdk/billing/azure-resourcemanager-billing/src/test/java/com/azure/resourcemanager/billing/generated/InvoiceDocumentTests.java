// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.InvoiceDocument;

public final class InvoiceDocumentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InvoiceDocument model = BinaryData.fromString(
            "{\"documentNumbers\":[\"i\",\"pa\",\"rwwgil\"],\"externalUrl\":\"qqa\",\"kind\":\"Invoice\",\"name\":\"xwxdcvjwc\",\"url\":\"iakeciqc\",\"source\":\"ENF\"}")
            .toObject(InvoiceDocument.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InvoiceDocument model = new InvoiceDocument();
        model = BinaryData.fromObject(model).toObject(InvoiceDocument.class);
    }
}
