// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.PaymentMethodsListResult;

public final class PaymentMethodsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PaymentMethodsListResult model = BinaryData.fromString(
            "{\"nextLink\":\"yjvzukosr\",\"value\":[{\"properties\":{\"id\":\"zm\",\"accountHolderName\":\"k\",\"displayName\":\"wsxvjab\",\"expiration\":\"qa\",\"family\":\"EWallet\",\"lastFourDigits\":\"y\",\"logos\":[{\"mimeType\":\"dndoabhjxw\",\"url\":\"weuipmpvksmi\"}],\"paymentMethodType\":\"sqxtltclkrdpq\",\"status\":\"inactive\"},\"tags\":{\"fcmfcn\":\"frakkldgrc\",\"elnzqgxxgfbbmt\":\"jajqmatxjt\"},\"id\":\"qagynoipr\",\"name\":\"zcalincryq\",\"type\":\"zxaqzibm\"}]}")
            .toObject(PaymentMethodsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PaymentMethodsListResult model = new PaymentMethodsListResult();
        model = BinaryData.fromObject(model).toObject(PaymentMethodsListResult.class);
    }
}
