// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.RecipientTransfersClient;
import com.azure.resourcemanager.billing.fluent.models.RecipientTransferDetailsInner;
import com.azure.resourcemanager.billing.fluent.models.ValidateTransferListResponseInner;
import com.azure.resourcemanager.billing.models.AcceptTransferRequest;
import com.azure.resourcemanager.billing.models.RecipientTransferDetails;
import com.azure.resourcemanager.billing.models.RecipientTransfers;
import com.azure.resourcemanager.billing.models.ValidateTransferListResponse;

public final class RecipientTransfersImpl implements RecipientTransfers {
    private static final ClientLogger LOGGER = new ClientLogger(RecipientTransfersImpl.class);

    private final RecipientTransfersClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public RecipientTransfersImpl(RecipientTransfersClient innerClient,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<RecipientTransferDetails> acceptWithResponse(String transferName, AcceptTransferRequest parameters,
        Context context) {
        Response<RecipientTransferDetailsInner> inner
            = this.serviceClient().acceptWithResponse(transferName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecipientTransferDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecipientTransferDetails accept(String transferName, AcceptTransferRequest parameters) {
        RecipientTransferDetailsInner inner = this.serviceClient().accept(transferName, parameters);
        if (inner != null) {
            return new RecipientTransferDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateTransferListResponse> validateWithResponse(String transferName,
        AcceptTransferRequest parameters, Context context) {
        Response<ValidateTransferListResponseInner> inner
            = this.serviceClient().validateWithResponse(transferName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ValidateTransferListResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ValidateTransferListResponse validate(String transferName, AcceptTransferRequest parameters) {
        ValidateTransferListResponseInner inner = this.serviceClient().validate(transferName, parameters);
        if (inner != null) {
            return new ValidateTransferListResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecipientTransferDetails> declineWithResponse(String transferName, Context context) {
        Response<RecipientTransferDetailsInner> inner = this.serviceClient().declineWithResponse(transferName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecipientTransferDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecipientTransferDetails decline(String transferName) {
        RecipientTransferDetailsInner inner = this.serviceClient().decline(transferName);
        if (inner != null) {
            return new RecipientTransferDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecipientTransferDetails> getWithResponse(String transferName, Context context) {
        Response<RecipientTransferDetailsInner> inner = this.serviceClient().getWithResponse(transferName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecipientTransferDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecipientTransferDetails get(String transferName) {
        RecipientTransferDetailsInner inner = this.serviceClient().get(transferName);
        if (inner != null) {
            return new RecipientTransferDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RecipientTransferDetails> list() {
        PagedIterable<RecipientTransferDetailsInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecipientTransferDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<RecipientTransferDetails> list(Context context) {
        PagedIterable<RecipientTransferDetailsInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecipientTransferDetailsImpl(inner1, this.manager()));
    }

    private RecipientTransfersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
