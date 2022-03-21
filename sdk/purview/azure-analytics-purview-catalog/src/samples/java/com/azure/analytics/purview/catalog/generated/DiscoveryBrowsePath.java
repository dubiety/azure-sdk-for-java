// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.DiscoveryClient;
import com.azure.analytics.purview.catalog.DiscoveryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DiscoveryBrowsePath {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.discoverybrowse.discoverybrowsepath
        DiscoveryClient discoveryClient =
                new DiscoveryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData browseRequest =
                BinaryData.fromString(
                        "{\"path\":\"/azure_data_explorer_cluster#examplecluster.westus.kusto.windows.net\",\"limit\":10}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = discoveryClient.browseWithResponse(browseRequest, requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.discoverybrowse.discoverybrowsepath
    }
}
