// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.autoconfigure.context;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.management.AzureEnvironment;
import com.azure.spring.cloud.autoconfigure.implementation.properties.AzureGlobalProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

import static com.azure.spring.core.aware.AzureProfileOptionsAware.CloudType.AZURE;
import static com.azure.spring.core.aware.AzureProfileOptionsAware.CloudType.AZURE_CHINA;
import static com.azure.spring.core.aware.AzureProfileOptionsAware.CloudType.OTHER;
import static org.assertj.core.api.Assertions.assertThat;

class AzureGlobalPropertiesAutoConfigurationTests {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AzureGlobalPropertiesAutoConfiguration.class));

    @Test
    void testAutoConfiguration() {
        this.contextRunner.run(context -> {
            assertThat(context).hasSingleBean(AzureGlobalPropertiesAutoConfiguration.class);
            assertThat(context).hasSingleBean(AzureGlobalProperties.class);
        });
    }

    @Test
    void configurationPropertiesShouldBind() {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.client.application-id=fake-application-id",
                "spring.cloud.azure.client.headers[0].name=header-name",
                "spring.cloud.azure.client.headers[0].values=a,b,c",
                "spring.cloud.azure.client.http.connect-timeout=1m",
                "spring.cloud.azure.client.http.read-timeout=2m",
                "spring.cloud.azure.client.http.response-timeout=3m",
                "spring.cloud.azure.client.http.write-timeout=4m",
                "spring.cloud.azure.client.http.connection-idle-timeout=5m",
                "spring.cloud.azure.client.http.maximum-connection-pool-size=6",
                "spring.cloud.azure.client.amqp.transport-type=AmqpWebSockets",
                "spring.cloud.azure.credential.client-id=fake-client-id",
                "spring.cloud.azure.credential.client-secret=fake-client-secret",
                "spring.cloud.azure.credential.client-certificate-path=fake-cert-path",
                "spring.cloud.azure.credential.client-certificate-password=fake-cert-password",
                "spring.cloud.azure.credential.username=fake-username",
                "spring.cloud.azure.credential.password=fake-password",
                "spring.cloud.azure.credential.managed-identity-enabled=true",
                "spring.cloud.azure.proxy.type=https",
                "spring.cloud.azure.proxy.hostname=proxy-host",
                "spring.cloud.azure.proxy.port=8888",
                "spring.cloud.azure.proxy.authentication-type=basic",
                "spring.cloud.azure.proxy.username=x-user",
                "spring.cloud.azure.proxy.password=x-password",
                "spring.cloud.azure.proxy.http.non-proxy-hosts=127.0.0.1",
                "spring.cloud.azure.retry.max-attempts=1",
                "spring.cloud.azure.retry.timeout=200s",
                "spring.cloud.azure.retry.backoff.delay=20s",
                "spring.cloud.azure.retry.backoff.max-delay=30s",
                "spring.cloud.azure.retry.backoff.multiplier=4",
                "spring.cloud.azure.retry.http.retry-after-header=retry-header",
                "spring.cloud.azure.retry.http.retry-after-time-unit=seconds",
                "spring.cloud.azure.profile.tenant-id=fake-tenant-id",
                "spring.cloud.azure.profile.subscription-id=fake-sub-id",
                "spring.cloud.azure.profile.cloud-type=azure_china"
            )
            .run(context -> {
                final AzureGlobalProperties azureProperties = context.getBean(AzureGlobalProperties.class);
                assertThat(azureProperties.getClient().getApplicationId()).isEqualTo("fake-application-id");
                assertThat(azureProperties.getClient().getHeaders().get(0).getName()).isEqualTo("header-name");
                assertThat(azureProperties.getClient().getHeaders().get(0).getValues()).isEqualTo(Arrays.asList("a", "b", "c"));
                assertThat(azureProperties.getClient().getHttp().getConnectTimeout()).isEqualTo(Duration.ofMinutes(1));
                assertThat(azureProperties.getClient().getHttp().getReadTimeout()).isEqualTo(Duration.ofMinutes(2));
                assertThat(azureProperties.getClient().getHttp().getResponseTimeout()).isEqualTo(Duration.ofMinutes(3));
                assertThat(azureProperties.getClient().getHttp().getWriteTimeout()).isEqualTo(Duration.ofMinutes(4));
                assertThat(azureProperties.getClient().getHttp().getConnectionIdleTimeout()).isEqualTo(Duration.ofMinutes(5));
                assertThat(azureProperties.getClient().getHttp().getMaximumConnectionPoolSize()).isEqualTo(6);
                assertThat(azureProperties.getClient().getAmqp().getTransportType()).isEqualTo(AmqpTransportType.AMQP_WEB_SOCKETS);

                assertThat(azureProperties.getCredential().getClientId()).isEqualTo("fake-client-id");
                assertThat(azureProperties.getCredential().getClientSecret()).isEqualTo("fake-client-secret");
                assertThat(azureProperties.getCredential().getClientCertificatePath()).isEqualTo("fake-cert-path");
                assertThat(azureProperties.getCredential().getClientCertificatePassword()).isEqualTo("fake-cert-password");
                assertThat(azureProperties.getCredential().getUsername()).isEqualTo("fake-username");
                assertThat(azureProperties.getCredential().getPassword()).isEqualTo("fake-password");
                assertThat(azureProperties.getCredential().isManagedIdentityEnabled()).isTrue();

                assertThat(azureProperties.getProxy().getType()).isEqualTo("https");
                assertThat(azureProperties.getProxy().getHostname()).isEqualTo("proxy-host");
                assertThat(azureProperties.getProxy().getPort()).isEqualTo(8888);
                assertThat(azureProperties.getProxy().getAuthenticationType()).isEqualTo("basic");
                assertThat(azureProperties.getProxy().getUsername()).isEqualTo("x-user");
                assertThat(azureProperties.getProxy().getPassword()).isEqualTo("x-password");
                assertThat(azureProperties.getProxy().getHttp().getNonProxyHosts()).isEqualTo("127.0.0.1");

                assertThat(azureProperties.getRetry().getMaxAttempts()).isEqualTo(1);
                assertThat(azureProperties.getRetry().getTimeout()).isEqualTo(Duration.ofSeconds(200));
                assertThat(azureProperties.getRetry().getBackoff().getDelay()).isEqualTo(Duration.ofSeconds(20));
                assertThat(azureProperties.getRetry().getBackoff().getMaxDelay()).isEqualTo(Duration.ofSeconds(30));
                assertThat(azureProperties.getRetry().getBackoff().getMultiplier()).isEqualTo(4);
                assertThat(azureProperties.getRetry().getHttp().getRetryAfterHeader()).isEqualTo("retry-header");
                assertThat(azureProperties.getRetry().getHttp().getRetryAfterTimeUnit()).isEqualTo(ChronoUnit.SECONDS);

                assertThat(azureProperties.getProfile().getTenantId()).isEqualTo("fake-tenant-id");
                assertThat(azureProperties.getProfile().getSubscriptionId()).isEqualTo("fake-sub-id");
                assertThat(azureProperties.getProfile().getCloudType()).isEqualTo(AZURE_CHINA);
                assertThat(azureProperties.getProfile().getEnvironment().getActiveDirectoryEndpoint()).isEqualTo(
                    AzureEnvironment.AZURE_CHINA.getActiveDirectoryEndpoint());
            });
    }

    @Test
    void testAzureProfileOtherCouldModifyEndpoint() {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.profile.environment.activeDirectoryEndpoint=abc",
                "spring.cloud.azure.profile.cloud-type=other"
            )
            .run(context -> {
                final AzureGlobalProperties azureProperties = context.getBean(AzureGlobalProperties.class);
                assertThat(azureProperties).extracting("profile.cloudType").isEqualTo(OTHER);
                assertThat(azureProperties).extracting("profile.environment.activeDirectoryEndpoint").isEqualTo("abc");
            });
    }

    @Test
    void testAzureProfileAzureCouldModifyEndpoint() {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.profile.environment.activeDirectoryEndpoint=abc",
                "spring.cloud.azure.profile.cloud-type=azure"
            )
            .run(context -> {
                final AzureGlobalProperties azureProperties = context.getBean(AzureGlobalProperties.class);
                assertThat(azureProperties).extracting("profile.cloudType").isEqualTo(AZURE);
                assertThat(azureProperties).extracting("profile.environment.activeDirectoryEndpoint")
                                           .isEqualTo("abc");
            });
    }

    @Test
    void testAzureProfileAzureChina() {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.profile.cloud-type=azure_china"
            )
            .run(context -> {
                final AzureGlobalProperties azureProperties = context.getBean(AzureGlobalProperties.class);
                assertThat(azureProperties).extracting("profile.cloudType").isEqualTo(AZURE_CHINA);
                assertThat(azureProperties).extracting("profile.environment.activeDirectoryEndpoint")
                                           .isEqualTo(AzureEnvironment.AZURE_CHINA.getActiveDirectoryEndpoint());
            });
    }

}
