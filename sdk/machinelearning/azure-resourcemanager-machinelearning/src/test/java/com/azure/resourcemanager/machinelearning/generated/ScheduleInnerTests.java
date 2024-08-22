// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ScheduleInner;
import com.azure.resourcemanager.machinelearning.models.ScheduleActionBase;
import com.azure.resourcemanager.machinelearning.models.ScheduleProperties;
import com.azure.resourcemanager.machinelearning.models.TriggerBase;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"cteoedlrslsk\",\"isEnabled\":false,\"trigger\":{\"triggerType\":\"TriggerBase\",\"endTime\":\"vjnzdpvocojhpcna\",\"startTime\":\"zf\",\"timeZone\":\"ggytexvzilmhivz\"},\"action\":{\"actionType\":\"ScheduleActionBase\"},\"provisioningState\":\"Deleting\",\"description\":\"ncknrzdajlsk\",\"tags\":{\"eucyrth\":\"jxul\",\"hokamvfej\":\"qlehmcgcjeinu\"},\"properties\":{\"okpysthhzagj\":\"ttmbqdabzfiv\",\"lhgenuzejgvkv\":\"wyy\"}},\"id\":\"aqszllrzl\",\"name\":\"mmdqgmihzpimc\",\"type\":\"rh\"}")
            .toObject(ScheduleInner.class);
        Assertions.assertEquals("ncknrzdajlsk", model.properties().description());
        Assertions.assertEquals("jxul", model.properties().tags().get("eucyrth"));
        Assertions.assertEquals("ttmbqdabzfiv", model.properties().properties().get("okpysthhzagj"));
        Assertions.assertEquals("cteoedlrslsk", model.properties().displayName());
        Assertions.assertEquals(false, model.properties().isEnabled());
        Assertions.assertEquals("vjnzdpvocojhpcna", model.properties().trigger().endTime());
        Assertions.assertEquals("zf", model.properties().trigger().startTime());
        Assertions.assertEquals("ggytexvzilmhivz", model.properties().trigger().timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleInner model = new ScheduleInner().withProperties(new ScheduleProperties()
            .withDescription("ncknrzdajlsk")
            .withTags(mapOf("eucyrth", "jxul", "hokamvfej", "qlehmcgcjeinu"))
            .withProperties(mapOf("okpysthhzagj", "ttmbqdabzfiv", "lhgenuzejgvkv", "wyy"))
            .withDisplayName("cteoedlrslsk")
            .withIsEnabled(false)
            .withTrigger(
                new TriggerBase().withEndTime("vjnzdpvocojhpcna").withStartTime("zf").withTimeZone("ggytexvzilmhivz"))
            .withAction(new ScheduleActionBase()));
        model = BinaryData.fromObject(model).toObject(ScheduleInner.class);
        Assertions.assertEquals("ncknrzdajlsk", model.properties().description());
        Assertions.assertEquals("jxul", model.properties().tags().get("eucyrth"));
        Assertions.assertEquals("ttmbqdabzfiv", model.properties().properties().get("okpysthhzagj"));
        Assertions.assertEquals("cteoedlrslsk", model.properties().displayName());
        Assertions.assertEquals(false, model.properties().isEnabled());
        Assertions.assertEquals("vjnzdpvocojhpcna", model.properties().trigger().endTime());
        Assertions.assertEquals("zf", model.properties().trigger().startTime());
        Assertions.assertEquals("ggytexvzilmhivz", model.properties().trigger().timeZone());
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
