// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.EmailNotificationEnableType;
import com.azure.resourcemanager.machinelearning.models.IdentityConfiguration;
import com.azure.resourcemanager.machinelearning.models.JobBaseProperties;
import com.azure.resourcemanager.machinelearning.models.JobService;
import com.azure.resourcemanager.machinelearning.models.Nodes;
import com.azure.resourcemanager.machinelearning.models.NotificationSetting;
import com.azure.resourcemanager.machinelearning.models.Webhook;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobBasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobBaseProperties model = BinaryData.fromString(
            "{\"jobType\":\"JobBaseProperties\",\"displayName\":\"efgv\",\"status\":\"Preparing\",\"experimentName\":\"kcvtl\",\"services\":{\"kalehp\":{\"jobServiceType\":\"skvcuartrhunl\",\"port\":1593194036,\"endpoint\":\"kycndzfqivjreuy\",\"status\":\"bmnwa\",\"errorMessage\":\"tbxoee\",\"properties\":{\"myymvqdbpbhfckdv\":\"lnf\",\"b\":\"zcrcssbzhddubbnq\"},\"nodes\":{\"nodesValueType\":\"Nodes\"}},\"chkhufm\":{\"jobServiceType\":\"awugiqjti\",\"port\":837547009,\"endpoint\":\"dminic\",\"status\":\"eajohiyg\",\"errorMessage\":\"n\",\"properties\":{\"qcs\":\"hpczykmktpvw\"},\"nodes\":{\"nodesValueType\":\"Nodes\"}},\"sruqnmdvha\":{\"jobServiceType\":\"umqy\",\"port\":1595572928,\"endpoint\":\"zulo\",\"status\":\"aeuzanh\",\"errorMessage\":\"nhsenwphpzfng\",\"properties\":{\"fwbeqrkuorh\":\"lidftujwjj\"},\"nodes\":{\"nodesValueType\":\"Nodes\"}}},\"computeId\":\"vjytiqswbq\",\"isArchived\":false,\"identity\":{\"identityType\":\"IdentityConfiguration\"},\"componentId\":\"iytxt\",\"notificationSetting\":{\"emails\":[\"vlbpktgdstyou\",\"mbewreswmo\",\"egmmuteyxe\",\"guqigijiitns\"],\"emailOn\":[\"JobFailed\"],\"webhooks\":{\"jwaiuf\":{\"webhookType\":\"Webhook\",\"eventType\":\"ygr\"}}},\"description\":\"raybfueqfr\",\"tags\":{\"ydkygywezskieca\":\"ydgr\",\"ixqcahyhxalybxaw\":\"ygzmxieqvdsmak\",\"jodqhykincn\":\"ijpodtblxpkkwj\"},\"properties\":{\"qodkadppyibngql\":\"ehllizhceum\",\"wrxwhydtl\":\"d\",\"uyem\":\"vvadswzs\"}}")
            .toObject(JobBaseProperties.class);
        Assertions.assertEquals("raybfueqfr", model.description());
        Assertions.assertEquals("ydgr", model.tags().get("ydkygywezskieca"));
        Assertions.assertEquals("ehllizhceum", model.properties().get("qodkadppyibngql"));
        Assertions.assertEquals("efgv", model.displayName());
        Assertions.assertEquals("kcvtl", model.experimentName());
        Assertions.assertEquals("skvcuartrhunl", model.services().get("kalehp").jobServiceType());
        Assertions.assertEquals(1593194036, model.services().get("kalehp").port());
        Assertions.assertEquals("kycndzfqivjreuy", model.services().get("kalehp").endpoint());
        Assertions.assertEquals("lnf", model.services().get("kalehp").properties().get("myymvqdbpbhfckdv"));
        Assertions.assertEquals("vjytiqswbq", model.computeId());
        Assertions.assertEquals(false, model.isArchived());
        Assertions.assertEquals("iytxt", model.componentId());
        Assertions.assertEquals("vlbpktgdstyou", model.notificationSetting().emails().get(0));
        Assertions.assertEquals(EmailNotificationEnableType.JOB_FAILED, model.notificationSetting().emailOn().get(0));
        Assertions.assertEquals("ygr", model.notificationSetting().webhooks().get("jwaiuf").eventType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobBaseProperties model = new JobBaseProperties().withDescription("raybfueqfr")
            .withTags(
                mapOf("ydkygywezskieca", "ydgr", "ixqcahyhxalybxaw", "ygzmxieqvdsmak", "jodqhykincn", "ijpodtblxpkkwj"))
            .withProperties(mapOf("qodkadppyibngql", "ehllizhceum", "wrxwhydtl", "d", "uyem", "vvadswzs"))
            .withDisplayName("efgv")
            .withExperimentName("kcvtl")
            .withServices(mapOf("kalehp",
                new JobService().withJobServiceType("skvcuartrhunl")
                    .withPort(1593194036)
                    .withEndpoint("kycndzfqivjreuy")
                    .withProperties(mapOf("myymvqdbpbhfckdv", "lnf", "b", "zcrcssbzhddubbnq"))
                    .withNodes(new Nodes()),
                "chkhufm",
                new JobService().withJobServiceType("awugiqjti")
                    .withPort(837547009)
                    .withEndpoint("dminic")
                    .withProperties(mapOf("qcs", "hpczykmktpvw"))
                    .withNodes(new Nodes()),
                "sruqnmdvha",
                new JobService().withJobServiceType("umqy")
                    .withPort(1595572928)
                    .withEndpoint("zulo")
                    .withProperties(mapOf("fwbeqrkuorh", "lidftujwjj"))
                    .withNodes(new Nodes())))
            .withComputeId("vjytiqswbq")
            .withIsArchived(false)
            .withIdentity(new IdentityConfiguration())
            .withComponentId("iytxt")
            .withNotificationSetting(new NotificationSetting()
                .withEmails(Arrays.asList("vlbpktgdstyou", "mbewreswmo", "egmmuteyxe", "guqigijiitns"))
                .withEmailOn(Arrays.asList(EmailNotificationEnableType.JOB_FAILED))
                .withWebhooks(mapOf("jwaiuf", new Webhook().withEventType("ygr"))));
        model = BinaryData.fromObject(model).toObject(JobBaseProperties.class);
        Assertions.assertEquals("raybfueqfr", model.description());
        Assertions.assertEquals("ydgr", model.tags().get("ydkygywezskieca"));
        Assertions.assertEquals("ehllizhceum", model.properties().get("qodkadppyibngql"));
        Assertions.assertEquals("efgv", model.displayName());
        Assertions.assertEquals("kcvtl", model.experimentName());
        Assertions.assertEquals("skvcuartrhunl", model.services().get("kalehp").jobServiceType());
        Assertions.assertEquals(1593194036, model.services().get("kalehp").port());
        Assertions.assertEquals("kycndzfqivjreuy", model.services().get("kalehp").endpoint());
        Assertions.assertEquals("lnf", model.services().get("kalehp").properties().get("myymvqdbpbhfckdv"));
        Assertions.assertEquals("vjytiqswbq", model.computeId());
        Assertions.assertEquals(false, model.isArchived());
        Assertions.assertEquals("iytxt", model.componentId());
        Assertions.assertEquals("vlbpktgdstyou", model.notificationSetting().emails().get(0));
        Assertions.assertEquals(EmailNotificationEnableType.JOB_FAILED, model.notificationSetting().emailOn().get(0));
        Assertions.assertEquals("ygr", model.notificationSetting().webhooks().get("jwaiuf").eventType());
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
