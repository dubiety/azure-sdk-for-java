// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import com.azure.core.implementation.util.EnvironmentConfiguration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LoggingEventBuilder;
import reactor.core.Exceptions;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * Contains configuration information that is used during construction of client libraries.
 */
public class Configuration implements Cloneable {

    // Default properties - these are what we read from the environment
    /**
     * URL of the proxy for HTTP connections.
     */
    public static final String PROPERTY_HTTP_PROXY = "HTTP_PROXY";

    /**
     * URL of the proxy for HTTPS connections.
     */
    public static final String PROPERTY_HTTPS_PROXY = "HTTPS_PROXY";

    /**
     * Endpoint to connect to when using Azure Active Directory managed service identity (MSI).
     */
    public static final String PROPERTY_IDENTITY_ENDPOINT = "IDENTITY_ENDPOINT";

    /**
     * Header when connecting to Azure Active Directory using managed service identity (MSI).
     */
    public static final String PROPERTY_IDENTITY_HEADER = "IDENTITY_HEADER";

    /**
     * A list of hosts or CIDR to not use proxy HTTP/HTTPS connections through.
     */
    public static final String PROPERTY_NO_PROXY = "NO_PROXY";

    /**
     * Endpoint to connect to when using Azure Active Directory managed service identity (MSI).
     */
    public static final String PROPERTY_MSI_ENDPOINT = "MSI_ENDPOINT";

    /**
     * Secret when connecting to Azure Active Directory using managed service identity (MSI).
     */
    public static final String PROPERTY_MSI_SECRET = "MSI_SECRET";

    /**
     * Subscription id to use when connecting to Azure resources.
     */
    public static final String PROPERTY_AZURE_SUBSCRIPTION_ID = "AZURE_SUBSCRIPTION_ID";

    /**
     * Username to use when performing username/password authentication with Azure.
     */
    public static final String PROPERTY_AZURE_USERNAME = "AZURE_USERNAME";

    /**
     * Username to use when performing username/password authentication with Azure.
     */
    public static final String PROPERTY_AZURE_PASSWORD = "AZURE_PASSWORD";

    /**
     * Client id to use when performing service principal authentication with Azure.
     */
    public static final String PROPERTY_AZURE_CLIENT_ID = "AZURE_CLIENT_ID";

    /**
     * Client secret to use when performing service principal authentication with Azure.
     */
    public static final String PROPERTY_AZURE_CLIENT_SECRET = "AZURE_CLIENT_SECRET";

    /**
     * Tenant id for the Azure resources.
     */
    public static final String PROPERTY_AZURE_TENANT_ID = "AZURE_TENANT_ID";

    /**
     * Path of a PEM certificate file to use when performing service principal authentication with Azure.
     */
    public static final String PROPERTY_AZURE_CLIENT_CERTIFICATE_PATH = "AZURE_CLIENT_CERTIFICATE_PATH";

    /**
     * Flag to disable the CP1 client capabilities in Azure Identity Token credentials.
     */
    public static final String PROPERTY_AZURE_IDENTITY_DISABLE_CP1 = "AZURE_IDENTITY_DISABLE_CP1";

    /**
     * URL used by Bridge To Kubernetes to redirect IMDS calls in the development environment.
     */
    public static final String PROPERTY_AZURE_POD_IDENTITY_TOKEN_URL = "AZURE_POD_IDENTITY_TOKEN_URL";

    /**
     * Name of Azure AAD regional authority.
     */
    public static final String PROPERTY_AZURE_REGIONAL_AUTHORITY_NAME = "AZURE_REGIONAL_AUTHORITY_NAME";

    /**
     * Name of the Azure resource group.
     */
    public static final String PROPERTY_AZURE_RESOURCE_GROUP = "AZURE_RESOURCE_GROUP";

    /**
     * Name of the Azure cloud to connect to.
     */
    public static final String PROPERTY_AZURE_CLOUD = "AZURE_CLOUD";

    /**
     * The Azure Active Directory endpoint to connect to.
     */
    public static final String PROPERTY_AZURE_AUTHORITY_HOST = "AZURE_AUTHORITY_HOST";

    /**
     * Disables telemetry collection.
     */
    public static final String PROPERTY_AZURE_TELEMETRY_DISABLED = "AZURE_TELEMETRY_DISABLED";

    /**
     * Enables logging by setting a log level.
     */
    public static final String PROPERTY_AZURE_LOG_LEVEL = "AZURE_LOG_LEVEL";

    /**
     * Enables HTTP request/response logging by setting an HTTP log detail level.
     */
    public static final String PROPERTY_AZURE_HTTP_LOG_DETAIL_LEVEL = "AZURE_HTTP_LOG_DETAIL_LEVEL";

    /**
     * Disables tracing.
     */
    public static final String PROPERTY_AZURE_TRACING_DISABLED = "AZURE_TRACING_DISABLED";

    /**
     * Sets the default number of times a request will be retried, if it passes the conditions for retrying, before it
     * fails.
     */
    public static final String PROPERTY_AZURE_REQUEST_RETRY_COUNT = "AZURE_REQUEST_RETRY_COUNT";

    /**
     * Sets the default timeout, in milliseconds, for a request to connect to the remote host.
     * <p>
     * If the configured value is equal to or less than 0 no timeout will be applied.
     */
    public static final String PROPERTY_AZURE_REQUEST_CONNECT_TIMEOUT = "AZURE_REQUEST_CONNECT_TIMEOUT";

    /**
     * Sets the default timeout interval, in milliseconds, allowed between each byte written by a request.
     * <p>
     * If the configured value is equal to or less than 0 no timeout will be applied.
     */
    public static final String PROPERTY_AZURE_REQUEST_WRITE_TIMEOUT = "AZURE_REQUEST_WRITE_TIMEOUT";

    /**
     * Sets the default timeout, in milliseconds, for a request to receive a response from the remote host.
     * <p>
     * If the configured value is equal to or less than 0 no timeout will be applied.
     */
    public static final String PROPERTY_AZURE_REQUEST_RESPONSE_TIMEOUT = "AZURE_REQUEST_RESPONSE_TIMEOUT";

    /**
     * Sets the default timeout interval, in milliseconds, allowed between each byte read in a response.
     * <p>
     * If the configured value is equal to or less than 0 no timeout will be applied.
     */
    public static final String PROPERTY_AZURE_REQUEST_READ_TIMEOUT = "AZURE_REQUEST_READ_TIMEOUT";

    /*
     * Gets the global configuration shared by all client libraries.
     */
    private static final Configuration GLOBAL_CONFIGURATION = new Configuration();

    /**
     * No-op {@link Configuration} object used to opt out of using global configurations when constructing client
     * libraries.
     */
    @SuppressWarnings("StaticInitializerReferencesSubClass")
    public static final Configuration NONE = new NoopConfiguration();

    private final EnvironmentConfiguration environmentConfiguration;
    private final Map<String, String> configurations;
    private final String path;
    private final Configuration defaults;
    private final ClientLogger logger;

    /**
     * Constructs a configuration containing the known Azure properties constants.
     */
    @Deprecated
    public Configuration() {
        this(Collections.emptyMap(), new EnvironmentConfiguration(EnvironmentConfiguration.ENVIRONMENT_SOURCE), null, null);
    }

    Configuration(Map<String, String> configurations, EnvironmentConfiguration environmentConfiguration, String path, Configuration defaults) {
        this.configurations = Collections.unmodifiableMap(Objects.requireNonNull(configurations, "'configurations' cannot be null"));
        this.environmentConfiguration = Objects.requireNonNull(environmentConfiguration, "'environmentConfiguration' cannot be null");;
        this.path = path;
        this.defaults = defaults;
        this.logger = new ClientLogger(Configuration.class);
    }

    private Configuration(Configuration original) {
        this(original.configurations, original.environmentConfiguration.clone(), original.path, original.defaults);
    }

    /**
     * Gets the global configuration store shared by all client libraries.
     *
     * @return The global configuration store.
     */
    public static Configuration getGlobalConfiguration() {
        return GLOBAL_CONFIGURATION;
    }

    /**
     * Gets the value of the configuration.
     * <p>
     * This method first checks the values previously loaded from the environment, if the configuration is found there
     * it will be returned. Otherwise, this will attempt to load the value from the environment.
     *
     * @param name Name of the configuration.
     * @return Value of the configuration if found, otherwise null.
     */
    public String get(String name) {

        // TODO:
        // With this we'd allow env vars to be set in props file
        // should we deprecate all existing (String) methods?

        /*String value = getLocalProperty(name, EMPTY_ARRAY, false);
        if (value != null) {

            return value;
        }*/

        return environmentConfiguration.get(name);
    }

    /**
     * Gets the value of the configuration converted to {@code T}.
     * <p>
     * This method first checks the values previously loaded from the environment, if the configuration is found there
     * it will be returned. Otherwise, this will attempt to load the value from the environment.
     * <p>
     * If no configuration is found, the {@code defaultValue} is returned.
     *
     * @param name Name of the configuration.
     * @param defaultValue Value to return if the configuration isn't found.
     * @param <T> Type that the configuration is converted to if found.
     * @return The converted configuration if found, otherwise the default value is returned.
     */
    public <T> T get(String name, T defaultValue) {
        return environmentConfiguration.get(name, defaultValue);
    }

    /**
     * Gets the value of the configuration and converts it with the {@code converter}.
     * <p>
     * This method first checks the values previously loaded from the environment, if the configuration is found there
     * it will be returned. Otherwise, this will attempt to load the value from the environment.
     * <p>
     * If no configuration is found the {@code converter} won't be called and null will be returned.
     *
     * @param name Name of the configuration.
     * @param converter Converter used to map the configuration to {@code T}.
     * @param <T> Type that the configuration is converted to if found.
     * @return The converted configuration if found, otherwise null.
     */
    public <T> T get(String name, Function<String, T> converter) {
        return environmentConfiguration.get(name, converter);
    }

    /**
     * Adds a configuration with the given value.
     * <p>
     * This will overwrite the previous configuration value if it existed.
     *
     * @param name Name of the configuration.
     * @param value Value of the configuration.
     * @return The updated Configuration object.
     */
    @Deprecated
    public Configuration put(String name, String value) {
        environmentConfiguration.put(name, value);
        return this;
    }

    /**
     * Removes the configuration.
     * <p>
     * This returns the value of the configuration if it previously existed.
     *
     * @param name Name of the configuration.
     * @return The configuration if it previously existed, otherwise null.
     */
    @Deprecated
    public String remove(String name) {
        return environmentConfiguration.remove(name);
    }

    /**
     * Determines if the configuration exists.
     * <p>
     * This only checks against values previously loaded into the Configuration object, this won't inspect the
     * environment for containing the value.
     *
     * @param name Name of the configuration.
     * @return True if the configuration exists, otherwise false.
     */
    public boolean contains(String name) {
        return environmentConfiguration.contains(name);
    }

    /**
     * Clones this Configuration object.
     *
     * @return A clone of the Configuration object.
     */
    @SuppressWarnings("CloneDoesntCallSuperClone")
    @Deprecated // TODO we don't really need to clone anymore since config is immutable
    public Configuration clone() {
        return new Configuration(this);
    }

    public boolean contains(ConfigurationProperty<?> property) {
        return getWithFallback(property) != null;
    }

    public <T> T get(ConfigurationProperty<T> property) {
        Objects.requireNonNull(property, "'property' cannot be null");
        String valueStr = getWithFallback(property);

        if (valueStr == null) {
            if (property.isRequired()) {
                throw logger.atError()
                    .addKeyValue("property", property.getName())
                    .addKeyValue("path", path)
                    .log(new IllegalArgumentException("Missing required property."));
            }
            return property.getDefaultValue();
        }

        try {
            return property.getConverter().apply(valueStr);
        } catch (Throwable t) {
            throw logger.atError()
                .addKeyValue("property", property.getName())
                .addKeyValue("value", property.canLogValue() ? valueStr : "redacted")
                .log(Exceptions.propagate(t));
        }
    }

    private String getLocalProperty(String name, String[] aliases, boolean canLogValue) {
        String value = configurations.get(name);

        LoggingEventBuilder logEvent = logger.atVerbose()
                .addKeyValue("name", name)
                .addKeyValue("path", path);

        if (value != null) {
            logEvent
                .addKeyValue("value", canLogValue ? value : "redacted")
                .log("Got property value by name.");
            return value;
        }

        for(String alias : aliases) {
            value = configurations.get(alias);
            if (value != null) {
                logEvent
                    .addKeyValue("value", canLogValue ? value : "redacted")
                    .log("Got property value by alias.");
                return value;
            }
        }

        return null;
    }


    private <T> String getWithFallback(ConfigurationProperty<T> property) {
        String value = getLocalProperty(property.getName(), property.getAliases(), property.canLogValue());
        if (value != null) {
            return value;
        }

        if (property.isGlobal() && defaults != null) {
            value = defaults.getLocalProperty(property.getName(), property.getAliases(), property.canLogValue());
            if (value != null) {
                return value;
            }
        }

        for (String name : property.getEnvironmentVariables()) {
            value = environmentConfiguration.get(name);
            if (value != null) {
                logger.atVerbose()
                    .addKeyValue("name", name)
                    .addKeyValue("value", property.canLogValue() ? value : "redacted")
                    .log("Got property from environment.");
                return value;
            }
        }

        return null;
    }
}
