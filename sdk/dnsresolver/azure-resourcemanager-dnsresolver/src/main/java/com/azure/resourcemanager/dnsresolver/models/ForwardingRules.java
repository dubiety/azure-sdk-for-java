// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ForwardingRules. */
public interface ForwardingRules {
    /**
     * Deletes a forwarding rule in a DNS forwarding ruleset. WARNING: This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @param forwardingRuleName The name of the forwarding rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String dnsForwardingRulesetName, String forwardingRuleName);

    /**
     * Deletes a forwarding rule in a DNS forwarding ruleset. WARNING: This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @param forwardingRuleName The name of the forwarding rule.
     * @param ifMatch ETag of the resource. Omit this value to always overwrite the current resource. Specify the
     *     last-seen ETag value to prevent accidentally overwriting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String dnsForwardingRulesetName,
        String forwardingRuleName,
        String ifMatch,
        Context context);

    /**
     * Gets properties of a forwarding rule in a DNS forwarding ruleset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @param forwardingRuleName The name of the forwarding rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a forwarding rule in a DNS forwarding ruleset.
     */
    ForwardingRule get(String resourceGroupName, String dnsForwardingRulesetName, String forwardingRuleName);

    /**
     * Gets properties of a forwarding rule in a DNS forwarding ruleset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @param forwardingRuleName The name of the forwarding rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a forwarding rule in a DNS forwarding ruleset along with {@link Response}.
     */
    Response<ForwardingRule> getWithResponse(
        String resourceGroupName, String dnsForwardingRulesetName, String forwardingRuleName, Context context);

    /**
     * Lists forwarding rules in a DNS forwarding ruleset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an enumeration operation on forwarding rules within a DNS forwarding ruleset as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ForwardingRule> list(String resourceGroupName, String dnsForwardingRulesetName);

    /**
     * Lists forwarding rules in a DNS forwarding ruleset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
     * @param top The maximum number of results to return. If not specified, returns up to 100 results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an enumeration operation on forwarding rules within a DNS forwarding ruleset as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<ForwardingRule> list(
        String resourceGroupName, String dnsForwardingRulesetName, Integer top, Context context);

    /**
     * Gets properties of a forwarding rule in a DNS forwarding ruleset.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a forwarding rule in a DNS forwarding ruleset along with {@link Response}.
     */
    ForwardingRule getById(String id);

    /**
     * Gets properties of a forwarding rule in a DNS forwarding ruleset.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a forwarding rule in a DNS forwarding ruleset along with {@link Response}.
     */
    Response<ForwardingRule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a forwarding rule in a DNS forwarding ruleset. WARNING: This operation cannot be undone.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a forwarding rule in a DNS forwarding ruleset. WARNING: This operation cannot be undone.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the resource. Omit this value to always overwrite the current resource. Specify the
     *     last-seen ETag value to prevent accidentally overwriting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new ForwardingRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new ForwardingRule definition.
     */
    ForwardingRule.DefinitionStages.Blank define(String name);
}
