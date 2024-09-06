// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingSubscriptionsClient;
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;
import com.azure.resourcemanager.billing.fluent.models.MoveBillingSubscriptionEligibilityResultInner;
import com.azure.resourcemanager.billing.models.BillingSubscription;
import com.azure.resourcemanager.billing.models.BillingSubscriptionMergeRequest;
import com.azure.resourcemanager.billing.models.BillingSubscriptionPatch;
import com.azure.resourcemanager.billing.models.BillingSubscriptions;
import com.azure.resourcemanager.billing.models.BillingSubscriptionSplitRequest;
import com.azure.resourcemanager.billing.models.CancelSubscriptionRequest;
import com.azure.resourcemanager.billing.models.MoveBillingSubscriptionEligibilityResult;
import com.azure.resourcemanager.billing.models.MoveBillingSubscriptionRequest;

public final class BillingSubscriptionsImpl implements BillingSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(BillingSubscriptionsImpl.class);

    private final BillingSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public BillingSubscriptionsImpl(BillingSubscriptionsClient innerClient,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BillingSubscription> getByBillingProfileWithResponse(String billingAccountName,
        String billingProfileName, String billingSubscriptionName, String expand, Context context) {
        Response<BillingSubscriptionInner> inner = this.serviceClient()
            .getByBillingProfileWithResponse(billingAccountName, billingProfileName, billingSubscriptionName, expand,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingSubscription getByBillingProfile(String billingAccountName, String billingProfileName,
        String billingSubscriptionName) {
        BillingSubscriptionInner inner
            = this.serviceClient().getByBillingProfile(billingAccountName, billingProfileName, billingSubscriptionName);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<BillingSubscription> listByBillingProfile(String billingAccountName,
        String billingProfileName) {
        PagedIterable<BillingSubscriptionInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingProfile(String billingAccountName, String billingProfileName,
        Boolean includeDeleted, String expand, String filter, String orderBy, Long top, Long skip, Boolean count,
        String search, Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByBillingProfile(billingAccountName, billingProfileName, includeDeleted, expand, filter, orderBy, top,
                skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByCustomer(String billingAccountName, String billingProfileName,
        String customerName) {
        PagedIterable<BillingSubscriptionInner> inner
            = this.serviceClient().listByCustomer(billingAccountName, billingProfileName, customerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByCustomer(String billingAccountName, String billingProfileName,
        String customerName, Boolean includeDeleted, String expand, String filter, String orderBy, Long top, Long skip,
        Boolean count, String search, Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByCustomer(billingAccountName, billingProfileName, customerName, includeDeleted, expand, filter,
                orderBy, top, skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByInvoiceSection(String billingAccountName, String billingProfileName,
        String invoiceSectionName) {
        PagedIterable<BillingSubscriptionInner> inner
            = this.serviceClient().listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByInvoiceSection(String billingAccountName, String billingProfileName,
        String invoiceSectionName, Boolean includeDeleted, String expand, String filter, String orderBy, Long top,
        Long skip, Boolean count, String search, Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName, includeDeleted, expand,
                filter, orderBy, top, skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public void cancel(String billingAccountName, String billingSubscriptionName,
        CancelSubscriptionRequest parameters) {
        this.serviceClient().cancel(billingAccountName, billingSubscriptionName, parameters);
    }

    public void cancel(String billingAccountName, String billingSubscriptionName, CancelSubscriptionRequest parameters,
        Context context) {
        this.serviceClient().cancel(billingAccountName, billingSubscriptionName, parameters, context);
    }

    public BillingSubscription merge(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionMergeRequest parameters) {
        BillingSubscriptionInner inner
            = this.serviceClient().merge(billingAccountName, billingSubscriptionName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription merge(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionMergeRequest parameters, Context context) {
        BillingSubscriptionInner inner
            = this.serviceClient().merge(billingAccountName, billingSubscriptionName, parameters, context);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription move(String billingAccountName, String billingSubscriptionName,
        MoveBillingSubscriptionRequest parameters) {
        BillingSubscriptionInner inner
            = this.serviceClient().move(billingAccountName, billingSubscriptionName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription move(String billingAccountName, String billingSubscriptionName,
        MoveBillingSubscriptionRequest parameters, Context context) {
        BillingSubscriptionInner inner
            = this.serviceClient().move(billingAccountName, billingSubscriptionName, parameters, context);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription split(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionSplitRequest parameters) {
        BillingSubscriptionInner inner
            = this.serviceClient().split(billingAccountName, billingSubscriptionName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription split(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionSplitRequest parameters, Context context) {
        BillingSubscriptionInner inner
            = this.serviceClient().split(billingAccountName, billingSubscriptionName, parameters, context);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MoveBillingSubscriptionEligibilityResult> validateMoveEligibilityWithResponse(
        String billingAccountName, String billingSubscriptionName, MoveBillingSubscriptionRequest parameters,
        Context context) {
        Response<MoveBillingSubscriptionEligibilityResultInner> inner = this.serviceClient()
            .validateMoveEligibilityWithResponse(billingAccountName, billingSubscriptionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MoveBillingSubscriptionEligibilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MoveBillingSubscriptionEligibilityResult validateMoveEligibility(String billingAccountName,
        String billingSubscriptionName, MoveBillingSubscriptionRequest parameters) {
        MoveBillingSubscriptionEligibilityResultInner inner
            = this.serviceClient().validateMoveEligibility(billingAccountName, billingSubscriptionName, parameters);
        if (inner != null) {
            return new MoveBillingSubscriptionEligibilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String billingAccountName, String billingSubscriptionName) {
        this.serviceClient().delete(billingAccountName, billingSubscriptionName);
    }

    public void delete(String billingAccountName, String billingSubscriptionName, Context context) {
        this.serviceClient().delete(billingAccountName, billingSubscriptionName, context);
    }

    public Response<BillingSubscription> getWithResponse(String billingAccountName, String billingSubscriptionName,
        String expand, Context context) {
        Response<BillingSubscriptionInner> inner
            = this.serviceClient().getWithResponse(billingAccountName, billingSubscriptionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingSubscription get(String billingAccountName, String billingSubscriptionName) {
        BillingSubscriptionInner inner = this.serviceClient().get(billingAccountName, billingSubscriptionName);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription update(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionPatch parameters) {
        BillingSubscriptionInner inner
            = this.serviceClient().update(billingAccountName, billingSubscriptionName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription update(String billingAccountName, String billingSubscriptionName,
        BillingSubscriptionPatch parameters, Context context) {
        BillingSubscriptionInner inner
            = this.serviceClient().update(billingAccountName, billingSubscriptionName, parameters, context);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName, Boolean includeDeleted,
        Boolean includeTenantSubscriptions, Boolean includeFailed, String expand, String filter, String orderBy,
        Long top, Long skip, Boolean count, String search, Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByBillingAccount(billingAccountName, includeDeleted, includeTenantSubscriptions, includeFailed, expand,
                filter, orderBy, top, skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByCustomerAtBillingAccount(String billingAccountName,
        String customerName) {
        PagedIterable<BillingSubscriptionInner> inner
            = this.serviceClient().listByCustomerAtBillingAccount(billingAccountName, customerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByCustomerAtBillingAccount(String billingAccountName,
        String customerName, Boolean includeDeleted, String expand, String filter, String orderBy, Long top, Long skip,
        Boolean count, String search, Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByCustomerAtBillingAccount(billingAccountName, customerName, includeDeleted, expand, filter, orderBy,
                top, skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByEnrollmentAccount(String billingAccountName,
        String enrollmentAccountName) {
        PagedIterable<BillingSubscriptionInner> inner
            = this.serviceClient().listByEnrollmentAccount(billingAccountName, enrollmentAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByEnrollmentAccount(String billingAccountName,
        String enrollmentAccountName, String filter, String orderBy, Long top, Long skip, Boolean count, String search,
        Context context) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient()
            .listByEnrollmentAccount(billingAccountName, enrollmentAccountName, filter, orderBy, top, skip, count,
                search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    private BillingSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
