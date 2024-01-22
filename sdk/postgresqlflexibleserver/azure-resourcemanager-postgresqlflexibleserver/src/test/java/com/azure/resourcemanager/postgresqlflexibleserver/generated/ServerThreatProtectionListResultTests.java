// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerThreatProtectionListResult;

public final class ServerThreatProtectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerThreatProtectionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"state\":\"Enabled\",\"creationTime\":\"2021-11-23T16:36:18Z\"},\"id\":\"ublwpcesutrg\",\"name\":\"upauut\",\"type\":\"woqhihe\"},{\"properties\":{\"state\":\"Enabled\",\"creationTime\":\"2021-11-12T23:28:54Z\"},\"id\":\"nfqn\",\"name\":\"cypsxjv\",\"type\":\"oimwkslirc\"}],\"nextLink\":\"jxv\"}")
            .toObject(ServerThreatProtectionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerThreatProtectionListResult model = new ServerThreatProtectionListResult();
        model = BinaryData.fromObject(model).toObject(ServerThreatProtectionListResult.class);
    }
}
