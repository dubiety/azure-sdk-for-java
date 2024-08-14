// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.fluent.models.EndpointInner;
import com.azure.resourcemanager.cdn.models.CacheBehavior;
import com.azure.resourcemanager.cdn.models.CacheExpirationActionParameters;
import com.azure.resourcemanager.cdn.models.CacheType;
import com.azure.resourcemanager.cdn.models.DeepCreatedOrigin;
import com.azure.resourcemanager.cdn.models.DeepCreatedOriginGroup;
import com.azure.resourcemanager.cdn.models.DeliveryRule;
import com.azure.resourcemanager.cdn.models.DeliveryRuleCacheExpirationAction;
import com.azure.resourcemanager.cdn.models.DeliveryRuleRemoteAddressCondition;
import com.azure.resourcemanager.cdn.models.DeliveryRuleRequestHeaderAction;
import com.azure.resourcemanager.cdn.models.DeliveryRuleResponseHeaderAction;
import com.azure.resourcemanager.cdn.models.EndpointPropertiesUpdateParametersDeliveryPolicy;
import com.azure.resourcemanager.cdn.models.HeaderAction;
import com.azure.resourcemanager.cdn.models.HeaderActionParameters;
import com.azure.resourcemanager.cdn.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.models.HealthProbeRequestType;
import com.azure.resourcemanager.cdn.models.ProbeProtocol;
import com.azure.resourcemanager.cdn.models.QueryStringCachingBehavior;
import com.azure.resourcemanager.cdn.models.RemoteAddressMatchConditionParameters;
import com.azure.resourcemanager.cdn.models.RemoteAddressOperator;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.ResponseBasedDetectedErrorTypes;
import com.azure.resourcemanager.cdn.models.ResponseBasedOriginErrorDetectionParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Endpoints Create.
 */
public final class EndpointsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/Endpoints_Create.json
     */
    /**
     * Sample code: Endpoints_Create.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointsCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .create("RG", "profile1", "endpoint1", new EndpointInner().withLocation("WestUs")
                .withTags(mapOf("key1", "fakeTokenPlaceholder"))
                .withOrigins(Arrays.asList(
                    new DeepCreatedOrigin().withName("origin1")
                        .withHostname("www.someDomain1.net")
                        .withHttpPort(80)
                        .withHttpsPort(443)
                        .withOriginHostHeader("www.someDomain1.net")
                        .withPriority(1)
                        .withWeight(50)
                        .withEnabled(true),
                    new DeepCreatedOrigin().withName("origin2")
                        .withHostname("www.someDomain2.net")
                        .withHttpPort(80)
                        .withHttpsPort(443)
                        .withOriginHostHeader("www.someDomain2.net")
                        .withPriority(2)
                        .withWeight(50)
                        .withEnabled(true)))
                .withOriginGroups(Arrays.asList(new DeepCreatedOriginGroup().withName("originGroup1")
                    .withHealthProbeSettings(new HealthProbeParameters().withProbePath("/health.aspx")
                        .withProbeRequestType(HealthProbeRequestType.GET)
                        .withProbeProtocol(ProbeProtocol.HTTP)
                        .withProbeIntervalInSeconds(120))
                    .withOrigins(Arrays.asList(new ResourceReference().withId(
                        "/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/origin1"),
                        new ResourceReference().withId(
                            "/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/origin2")))
                    .withResponseBasedOriginErrorDetectionSettings(new ResponseBasedOriginErrorDetectionParameters()
                        .withResponseBasedDetectedErrorTypes(ResponseBasedDetectedErrorTypes.TCP_ERRORS_ONLY)
                        .withResponseBasedFailoverThresholdPercentage(10))))
                .withOriginPath("/photos")
                .withContentTypesToCompress(Arrays.asList("text/html", "application/octet-stream"))
                .withOriginHostHeader("www.bing.com")
                .withIsCompressionEnabled(true)
                .withIsHttpAllowed(true)
                .withIsHttpsAllowed(true)
                .withQueryStringCachingBehavior(QueryStringCachingBehavior.BYPASS_CACHING)
                .withDefaultOriginGroup(new ResourceReference().withId(
                    "/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/originGroups/originGroup1"))
                .withDeliveryPolicy(new EndpointPropertiesUpdateParametersDeliveryPolicy()
                    .withDescription("Test description for a policy.")
                    .withRules(Arrays.asList(new DeliveryRule().withName("rule1")
                        .withOrder(1)
                        .withConditions(Arrays.asList(new DeliveryRuleRemoteAddressCondition().withParameters(
                            new RemoteAddressMatchConditionParameters().withOperator(RemoteAddressOperator.IPMATCH)
                                .withNegateCondition(true)
                                .withMatchValues(Arrays.asList("192.168.1.0/24", "10.0.0.0/24")))))
                        .withActions(Arrays.asList(
                            new DeliveryRuleCacheExpirationAction().withParameters(
                                new CacheExpirationActionParameters().withCacheBehavior(CacheBehavior.OVERRIDE)
                                    .withCacheType(CacheType.ALL)
                                    .withCacheDuration("10:10:09")),
                            new DeliveryRuleResponseHeaderAction()
                                .withParameters(new HeaderActionParameters().withHeaderAction(HeaderAction.OVERWRITE)
                                    .withHeaderName("Access-Control-Allow-Origin")
                                    .withValue("*")),
                            new DeliveryRuleRequestHeaderAction()
                                .withParameters(new HeaderActionParameters().withHeaderAction(HeaderAction.OVERWRITE)
                                    .withHeaderName("Accept-Encoding")
                                    .withValue("gzip"))))))),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
