// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.service.implementation.core.http;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import reactor.core.publisher.Mono;

public class TestPerRetryHttpPipelinePolicy implements HttpPipelinePolicy {

    private int callTimes;


    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        return Mono.defer(() -> {
            callTimes++;
            return next.process();
        });
    }

    public int getCallTimes() {
        return callTimes;
    }
}
