// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.AutoCompleteOptions;
import com.azure.analytics.purview.datamap.models.AutoCompleteResult;
import com.azure.analytics.purview.datamap.models.AutoCompleteResultValue;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DiscoveryAutoCompleteTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryAutoCompleteTests() throws IOException {
        // method invocation
        AutoCompleteResult response
            = discoveryClient.autoComplete(new AutoCompleteOptions().setKeywords("fakeTokenPlaceholder")
                .setLimit(10)
                .setFilter(JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize("{\"and\":[{\"entityType\":\"azure_blob_path\",\"includeSubTypes\":false}]}",
                        Object.class, SerializerEncoding.JSON)));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "value"
        List<AutoCompleteResultValue> responseValue = response.getValue();
        AutoCompleteResultValue responseValueFirstItem = responseValue.iterator().next();
        Assertions.assertNotNull(responseValueFirstItem);
        Assertions.assertEquals("example", responseValueFirstItem.getText());
        Assertions.assertEquals("example", responseValueFirstItem.getQueryPlusText());
    }
}
