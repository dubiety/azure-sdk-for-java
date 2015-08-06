/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest.retry;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class RetryHandler implements Interceptor {
    private static final int DEFAULT_NUMBER_OF_ATTEMPTS = 3;
    private static final int DEFAULT_BACKOFF_DELTA = 1000 * 10;
    private static final int DEFAULT_MAX_BACKOFF = 1000 * 10;
    private static final int DEFAULT_MIN_BACKOFF = 1000;

    private RetryStrategy retryStrategy;

    public RetryHandler() {
        this.retryStrategy = new ExponentialBackoffRetryStrategy(
                DEFAULT_NUMBER_OF_ATTEMPTS,
                DEFAULT_MIN_BACKOFF,
                DEFAULT_MAX_BACKOFF,
                DEFAULT_BACKOFF_DELTA);
    }

    public RetryHandler(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // try the request
        Response response = chain.proceed(request);

        int tryCount = 0;
        while (retryStrategy.shouldRetry(tryCount, response)) {
            // TODO: Add logging
            tryCount++;
            // retry the request
            response = chain.proceed(request);
        }

        // otherwise just pass the original response on
        return response;
    }
}
