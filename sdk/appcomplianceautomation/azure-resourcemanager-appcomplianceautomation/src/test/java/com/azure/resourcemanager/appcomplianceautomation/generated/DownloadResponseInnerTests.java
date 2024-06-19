// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.DownloadResponseInner;

public final class DownloadResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DownloadResponseInner model = BinaryData.fromString(
            "{\"resourceList\":[{\"subscriptionId\":\"dgszywkbirryuzh\",\"resourceGroup\":\"kj\",\"resourceType\":\"rvqqaatj\",\"resourceId\":\"rv\"},{\"subscriptionId\":\"upmfiibfg\",\"resourceGroup\":\"ioolvrwxkvtkkgll\",\"resourceType\":\"jygvjayvbl\",\"resourceId\":\"vkzuhbxvvyhgso\"},{\"subscriptionId\":\"yrqufegxuvwz\",\"resourceGroup\":\"nhlmctlpdng\",\"resourceType\":\"vgbmhr\",\"resourceId\":\"kw\"}],\"complianceReport\":[{\"categoryName\":\"ejvegrhbpnaixex\",\"controlFamilyName\":\"b\",\"controlId\":\"eaxhcexdrrvqahqk\",\"controlName\":\"tpwijnh\",\"controlStatus\":\"NotApplicable\",\"responsibilityTitle\":\"f\",\"responsibilityDescription\":\"xzb\",\"resourceId\":\"oowvrv\",\"resourceType\":\"gjqppy\",\"resourceOrigin\":\"Azure\",\"resourceStatus\":\"Healthy\",\"resourceStatusChangeDate\":\"2021-12-06T04:33:25Z\"},{\"categoryName\":\"yhgfipnsx\",\"controlFamilyName\":\"cwaekrrjre\",\"controlId\":\"xt\",\"controlName\":\"umh\",\"controlStatus\":\"Passed\",\"responsibilityTitle\":\"kkxwslol\",\"responsibilityDescription\":\"pvuzlmv\",\"resourceId\":\"lfktgplcrpwjxe\",\"resourceType\":\"oi\",\"resourceOrigin\":\"AWS\",\"resourceStatus\":\"Unhealthy\",\"resourceStatusChangeDate\":\"2021-03-28T01:41:30Z\"},{\"categoryName\":\"kpnb\",\"controlFamilyName\":\"zejjoqk\",\"controlId\":\"fhsxttaugz\",\"controlName\":\"faazpxdtnkdmkqjj\",\"controlStatus\":\"Failed\",\"responsibilityTitle\":\"nvrk\",\"responsibilityDescription\":\"ou\",\"resourceId\":\"bre\",\"resourceType\":\"aays\",\"resourceOrigin\":\"AWS\",\"resourceStatus\":\"Healthy\",\"resourceStatusChangeDate\":\"2021-12-05T00:29:49Z\"}],\"compliancePdfReport\":{\"sasUri\":\"tezlwff\"},\"complianceDetailedPdfReport\":{\"sasUri\":\"kpj\"}}")
            .toObject(DownloadResponseInner.class);
    }
}
