// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryCreateGlossary {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildGlossaryClient();
        BinaryData atlasGlossary =
                BinaryData.fromString(
                        "{\"name\":\"Glossary\",\"longDescription\":\"Example Long Description\",\"shortDescription\":\"Example Short Description\",\"usage\":\"Example Glossary\",\"language\":\"en\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.createGlossaryWithResponse(atlasGlossary, requestOptions);
    }
}
