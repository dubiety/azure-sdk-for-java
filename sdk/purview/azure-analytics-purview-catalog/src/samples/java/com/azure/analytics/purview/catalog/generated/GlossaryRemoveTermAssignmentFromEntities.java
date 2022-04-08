// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryRemoveTermAssignmentFromEntities {
    public static void main(String[] args) {
        // BEGIN:
        // com.azure.analytics.purview.catalog.generated.glossaryremovetermassignmentfromentities.glossaryremovetermassignmentfromentities
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData relatedObjectIds =
                BinaryData.fromString(
                        "[{\"guid\":\"16feb2a1-2c79-ade1-338d-fb24fcb8b8bd\",\"relationshipGuid\":\"624f08bb-3c93-4f03-9ce1-ed2ce2c7c8d5\"}]");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                glossaryClient.removeTermAssignmentFromEntitiesWithResponse(
                        "8a7f65ec-6429-0b9b-3734-ec57bf1e34c2", relatedObjectIds, requestOptions);
        // END:
        // com.azure.analytics.purview.catalog.generated.glossaryremovetermassignmentfromentities.glossaryremovetermassignmentfromentities
    }
}
