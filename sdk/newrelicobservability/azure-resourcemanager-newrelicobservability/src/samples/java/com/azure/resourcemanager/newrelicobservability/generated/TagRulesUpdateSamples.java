// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import com.azure.resourcemanager.newrelicobservability.models.TagRule;
import java.util.Arrays;

/** Samples for TagRules Update. */
public final class TagRulesUpdateSamples {
    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2022-07-01/examples/TagRules_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: TagRules_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void tagRulesUpdateMaximumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        TagRule resource =
            manager
                .tagRules()
                .getWithResponse(
                    "rgopenapi",
                    "ipxmlcbonyxtolzejcjshkmlron",
                    "bxcantgzggsepbhqmedjqyrqeezmfb",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withLogRules(
                new LogRules()
                    .withSendAadLogs(SendAadLogsStatus.ENABLED)
                    .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                    .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                    .withFilteringTags(
                        Arrays
                            .asList(
                                new FilteringTag()
                                    .withName("saokgpjvdlorciqbjmjxazpee")
                                    .withValue("sarxrqsxouhdjwsrqqicbeirdb")
                                    .withAction(TagAction.INCLUDE))))
            .withMetricRules(
                new MetricRulesInner()
                    .withFilteringTags(
                        Arrays
                            .asList(
                                new FilteringTag()
                                    .withName("saokgpjvdlorciqbjmjxazpee")
                                    .withValue("sarxrqsxouhdjwsrqqicbeirdb")
                                    .withAction(TagAction.INCLUDE)))
                    .withUserEmail("test@testing.com"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2022-07-01/examples/TagRules_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: TagRules_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void tagRulesUpdateMinimumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        TagRule resource =
            manager
                .tagRules()
                .getWithResponse(
                    "rgopenapi",
                    "ipxmlcbonyxtolzejcjshkmlron",
                    "bxcantgzggsepbhqmedjqyrqeezmfb",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
