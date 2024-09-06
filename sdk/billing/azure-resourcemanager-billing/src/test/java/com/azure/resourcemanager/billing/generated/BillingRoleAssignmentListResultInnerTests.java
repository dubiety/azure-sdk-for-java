// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentListResultInner;

public final class BillingRoleAssignmentListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingRoleAssignmentListResultInner model = BinaryData.fromString(
            "{\"nextLink\":\"kw\",\"value\":[{\"properties\":{\"provisioningState\":\"PendingBilling\",\"createdOn\":\"2021-10-11T20:34:37Z\",\"createdByPrincipalTenantId\":\"rh\",\"createdByPrincipalId\":\"nai\",\"createdByPrincipalPuid\":\"xccbdreaxhcex\",\"createdByUserEmailAddress\":\"rvqahqkghtpwi\",\"modifiedOn\":\"2021-03-19T04:26:57Z\",\"modifiedByPrincipalPuid\":\"jsvfycxzbfvoowv\",\"modifiedByUserEmailAddress\":\"mtg\",\"modifiedByPrincipalId\":\"ppyostronzmyhgf\",\"modifiedByPrincipalTenantId\":\"nsxkmcwaekrrjr\",\"principalPuid\":\"fxtsgum\",\"principalId\":\"glikkxwslolb\",\"principalTenantId\":\"vuzlm\",\"roleDefinitionId\":\"felfktg\",\"scope\":\"crpw\",\"userAuthenticationType\":\"eznoig\",\"userEmailAddress\":\"njwmwkpnbsazejj\",\"principalTenantName\":\"kagfhsxtt\",\"principalDisplayName\":\"gzxnfaazpxdtnk\",\"principalType\":\"Everyone\",\"billingRequestId\":\"j\",\"billingAccountId\":\"wuenvr\",\"billingAccountDisplayName\":\"yo\",\"billingProfileId\":\"ibreb\",\"billingProfileDisplayName\":\"aysjkixqtnqttez\",\"invoiceSectionId\":\"fffiak\",\"invoiceSectionDisplayName\":\"pqqmted\",\"customerId\":\"mmji\",\"customerDisplayName\":\"eozphv\"},\"tags\":{\"ncyg\":\"y\",\"vipmdscwxqupevzh\":\"p\",\"jujbypelmcuvhixb\":\"stotxh\",\"ttpkiwkkbnujrywv\":\"xyfwnylrcool\"},\"id\":\"lbfpncurd\",\"name\":\"iwii\",\"type\":\"htywubxcbihwq\"},{\"properties\":{\"provisioningState\":\"Pending\",\"createdOn\":\"2021-10-01T05:31:27Z\",\"createdByPrincipalTenantId\":\"jchrdgoihxumw\",\"createdByPrincipalId\":\"ond\",\"createdByPrincipalPuid\":\"luudfdlwggytsb\",\"createdByUserEmailAddress\":\"ovvtgseinqfiu\",\"modifiedOn\":\"2021-09-17T22:17:43Z\",\"modifiedByPrincipalPuid\":\"npirgnepttw\",\"modifiedByUserEmailAddress\":\"sniffc\",\"modifiedByPrincipalId\":\"qnrojlpijnkrxfrd\",\"modifiedByPrincipalTenantId\":\"c\",\"principalPuid\":\"tizzronasxif\",\"principalId\":\"zq\",\"principalTenantId\":\"hftwesgog\",\"roleDefinitionId\":\"zhonnxkrlgnyhmo\",\"scope\":\"xkk\",\"userAuthenticationType\":\"h\",\"userEmailAddress\":\"gh\",\"principalTenantName\":\"bdhqxvcxgf\",\"principalDisplayName\":\"dsofbshrns\",\"principalType\":\"User\",\"billingRequestId\":\"wdvzyy\",\"billingAccountId\":\"cnunvjsr\",\"billingAccountDisplayName\":\"f\",\"billingProfileId\":\"nopqgikyzirtx\",\"billingProfileDisplayName\":\"uxzejntpsew\",\"invoiceSectionId\":\"oi\",\"invoiceSectionDisplayName\":\"ukry\",\"customerId\":\"tqmieox\",\"customerDisplayName\":\"ggufhyaomtb\"},\"tags\":{\"pjbi\":\"avgrvkffovjz\",\"yo\":\"gjmfxumvfcl\"},\"id\":\"xnbkfezzxscyhwzd\",\"name\":\"irujbz\",\"type\":\"omvzzbtd\"},{\"properties\":{\"provisioningState\":\"PendingBilling\",\"createdOn\":\"2021-05-17T04:02:41Z\",\"createdByPrincipalTenantId\":\"ujviylwdshfs\",\"createdByPrincipalId\":\"rbgyefry\",\"createdByPrincipalPuid\":\"gaojf\",\"createdByUserEmailAddress\":\"nc\",\"modifiedOn\":\"2021-04-29T14:25:51Z\",\"modifiedByPrincipalPuid\":\"fhir\",\"modifiedByUserEmailAddress\":\"ymoxoftpipiwyczu\",\"modifiedByPrincipalId\":\"a\",\"modifiedByPrincipalTenantId\":\"qjlihhyuspska\",\"principalPuid\":\"vlmfwdgzxulucv\",\"principalId\":\"mrsreuzvxurisjnh\",\"principalTenantId\":\"txifqj\",\"roleDefinitionId\":\"gxmrhublwp\",\"scope\":\"sutrgjup\",\"userAuthenticationType\":\"utpwoqhihejqgw\",\"userEmailAddress\":\"nfqn\",\"principalTenantName\":\"ypsxjvfoim\",\"principalDisplayName\":\"slirciz\",\"principalType\":\"DirectoryRole\",\"billingRequestId\":\"dfcea\",\"billingAccountId\":\"lhvygdyftu\",\"billingAccountDisplayName\":\"twnawjslbiwkojgc\",\"billingProfileId\":\"tsf\",\"billingProfileDisplayName\":\"nbaeqphchqn\",\"invoiceSectionId\":\"rpxeh\",\"invoiceSectionDisplayName\":\"rykqgaifmvikl\",\"customerId\":\"dvk\",\"customerDisplayName\":\"ejd\"},\"tags\":{\"volvtn\":\"cvdsrhnj\"},\"id\":\"qfzgemjdftul\",\"name\":\"ltducea\",\"type\":\"tmczuomejwcwwqi\"}]}")
            .toObject(BillingRoleAssignmentListResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingRoleAssignmentListResultInner model = new BillingRoleAssignmentListResultInner();
        model = BinaryData.fromObject(model).toObject(BillingRoleAssignmentListResultInner.class);
    }
}
