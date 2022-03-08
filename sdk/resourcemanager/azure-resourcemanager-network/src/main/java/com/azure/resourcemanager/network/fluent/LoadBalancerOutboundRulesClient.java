// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.OutboundRuleInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LoadBalancerOutboundRulesClient. */
public interface LoadBalancerOutboundRulesClient {
    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<OutboundRuleInner> listAsync(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OutboundRuleInner> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OutboundRuleInner> list(String resourceGroupName, String loadBalancerName, Context context);

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<OutboundRuleInner>> getWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String outboundRuleName);

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OutboundRuleInner> getAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName);

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OutboundRuleInner get(String resourceGroupName, String loadBalancerName, String outboundRuleName);

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OutboundRuleInner> getWithResponse(
        String resourceGroupName, String loadBalancerName, String outboundRuleName, Context context);
}
