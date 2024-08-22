// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpoint;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpointDetail;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FqdnEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FqdnEndpoint model = BinaryData
            .fromString("{\"domainName\":\"irels\",\"endpointDetails\":[{\"port\":730394428},{\"port\":1632471353}]}")
            .toObject(FqdnEndpoint.class);
        Assertions.assertEquals("irels", model.domainName());
        Assertions.assertEquals(730394428, model.endpointDetails().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FqdnEndpoint model = new FqdnEndpoint().withDomainName("irels")
            .withEndpointDetails(Arrays.asList(new FqdnEndpointDetail().withPort(730394428),
                new FqdnEndpointDetail().withPort(1632471353)));
        model = BinaryData.fromObject(model).toObject(FqdnEndpoint.class);
        Assertions.assertEquals("irels", model.domainName());
        Assertions.assertEquals(730394428, model.endpointDetails().get(0).port());
    }
}
