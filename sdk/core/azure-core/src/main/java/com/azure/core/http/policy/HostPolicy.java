// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.UrlBuilder;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;

/**
 * The pipeline policy that adds the given host to each HttpRequest.
 */
public class HostPolicy implements HttpPipelinePolicy {
    private static final ClientLogger LOGGER = new ClientLogger(HostPolicy.class);

    private final String host;
    private final HttpPipelineSynchronousPolicy inner = new HttpPipelineSynchronousPolicy() {
        @Override
        protected void beforeSendingRequest(HttpPipelineCallContext context) {
            LOGGER.log(LogLevel.VERBOSE, () -> "Setting host to " + host);

            final UrlBuilder urlBuilder = UrlBuilder.parse(context.getHttpRequest().getUrl());
            try {
                context.getHttpRequest().setUrl(urlBuilder.setHost(host).toUrl());
            } catch (MalformedURLException e) {
                throw LOGGER.logExceptionAsError(
                    new RuntimeException(String.format("Host URL '%s' is invalid.", host), e));
            }
        }
    };

    /**
     * Create HostPolicy.
     *
     * @param host The host to set on every HttpRequest.
     */
    public HostPolicy(String host) {
        this.host = host;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        return inner.process(context, next);
    }

    @Override
    public HttpResponse processSynchronously(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        return inner.processSynchronously(context, next);
    }
}
