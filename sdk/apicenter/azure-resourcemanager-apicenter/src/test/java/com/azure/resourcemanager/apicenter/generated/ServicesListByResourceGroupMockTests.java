// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apicenter.ApiCenterManager;
import com.azure.resourcemanager.apicenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.apicenter.models.Service;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\"},\"identity\":{\"principalId\":\"ca19e702-49f6-4557-935f-00d86f9c4a7e\",\"tenantId\":\"851c11a8-2022-4c51-864c-e4ef174a8471\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"pwcukjfkgiawxk\":{\"principalId\":\"9a8c92ff-3579-4df3-a371-41f629d9ffb6\",\"clientId\":\"1aad80e6-eccb-404f-b65b-5fee2b12c1c3\"},\"plwckbas\":{\"principalId\":\"9efd0e66-fb50-4315-8b05-e9e87247fcd0\",\"clientId\":\"d3830407-4127-464a-9c24-0882406e4ad3\"},\"nddhsgcbacph\":{\"principalId\":\"94662726-76b4-4444-98f2-c4d6c21d5d29\",\"clientId\":\"9c39ad31-605f-43d7-beb2-cd946e6318b8\"}}},\"location\":\"koty\",\"tags\":{\"gfgibm\":\"oulzndlikwyq\"},\"id\":\"dgak\",\"name\":\"qsrxybzqqed\",\"type\":\"ytb\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ApiCenterManager manager =
            ApiCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Service> response =
            manager.services().listByResourceGroup("aozwyiftyhxhu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("koty", response.iterator().next().location());
        Assertions.assertEquals("oulzndlikwyq", response.iterator().next().tags().get("gfgibm"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
    }
}
