// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.PartnerTransferDetailsListResult;

public final class PartnerTransferDetailsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTransferDetailsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"expirationTime\":\"2021-02-15T16:08:24Z\",\"transferStatus\":\"Declined\",\"recipientEmailId\":\"uqhrlmcskykp\",\"initiatorCustomerType\":\"Partner\",\"initiatorEmailId\":\"ixcnpcf\",\"resellerId\":\"kpyyc\",\"resellerName\":\"wmpjprd\",\"canceledBy\":\"rpcfpcfjfwzl\",\"detailedTransferStatus\":[{\"productType\":\"AzureSubscription\",\"productId\":\"yep\",\"productName\":\"amnni\",\"skuDescription\":\"diawpzxkzr\",\"transferStatus\":\"InProgress\",\"errorDetails\":{}},{\"productType\":\"SavingsPlan\",\"productId\":\"huosgwqpsqaz\",\"productName\":\"qodvqgcnbhcbmj\",\"skuDescription\":\"ti\",\"transferStatus\":\"NotStarted\",\"errorDetails\":{}}]},\"tags\":{\"jrhskbwgmjgrul\":\"sxjmfmeftvhkmoo\",\"tpfdzxcouzfwofwa\":\"fogxhcxnw\",\"dtzxsoe\":\"ukz\",\"isnionetbzdrdpue\":\"nlwglihezomucmq\"},\"id\":\"kgtlzl\",\"name\":\"trlxcznnhzkbn\",\"type\":\"mxlxmwtygeq\"},{\"properties\":{\"expirationTime\":\"2021-08-05T00:42:02Z\",\"transferStatus\":\"InProgress\",\"recipientEmailId\":\"cahfsgbjmlreesr\",\"initiatorCustomerType\":\"Partner\",\"initiatorEmailId\":\"zvlcwlisolntfxxc\",\"resellerId\":\"mipfjw\",\"resellerName\":\"ygizmshxx\",\"canceledBy\":\"iz\",\"detailedTransferStatus\":[{\"productType\":\"AzureSubscription\",\"productId\":\"gsk\",\"productName\":\"o\",\"skuDescription\":\"dzjs\",\"transferStatus\":\"Completed\",\"errorDetails\":{}},{\"productType\":\"Department\",\"productId\":\"qmqipaydhfnzoc\",\"productName\":\"tfshksnyzm\",\"skuDescription\":\"amwbwmbnlslcef\",\"transferStatus\":\"NotStarted\",\"errorDetails\":{}}]},\"tags\":{\"lpfliwoyn\":\"tkvi\",\"ladpcmhjha\":\"uuzhw\"},\"id\":\"ybkekym\",\"name\":\"fztsi\",\"type\":\"sc\"},{\"properties\":{\"expirationTime\":\"2021-11-19T13:37:44Z\",\"transferStatus\":\"CompletedWithErrors\",\"recipientEmailId\":\"hfym\",\"initiatorCustomerType\":\"EA\",\"initiatorEmailId\":\"h\",\"resellerId\":\"seuugcig\",\"resellerName\":\"ogsmgbvmtd\",\"canceledBy\":\"qbe\",\"detailedTransferStatus\":[{\"productType\":\"Department\",\"productId\":\"glab\",\"productName\":\"kbiwznhtfgfic\",\"skuDescription\":\"yhizpaczmu\",\"transferStatus\":\"Failed\",\"errorDetails\":{}},{\"productType\":\"Department\",\"productId\":\"hokhoitwhrjsdmm\",\"productName\":\"dnckidbjpglhz\",\"skuDescription\":\"xzbawkikc\",\"transferStatus\":\"Failed\",\"errorDetails\":{}}]},\"tags\":{\"jey\":\"sd\",\"cfiwhagxsurejq\":\"qxded\",\"g\":\"shzz\",\"xiqqzjkoxdupna\":\"ll\"},\"id\":\"lrouigdmfiv\",\"name\":\"qterdqq\",\"type\":\"gd\"}],\"nextLink\":\"kghpcv\"}")
            .toObject(PartnerTransferDetailsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTransferDetailsListResult model = new PartnerTransferDetailsListResult();
        model = BinaryData.fromObject(model).toObject(PartnerTransferDetailsListResult.class);
    }
}
