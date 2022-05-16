// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.nativex.configuration.implementation.autoconfigure;

import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.spring.cloud.autoconfigure.implementation.keyvault.secrets.properties.AzureKeyVaultSecretProperties;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeAccess;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

@NativeHint(
    trigger = SecretClientBuilder.class,
    types = @TypeHint(
        types = AzureKeyVaultSecretProperties.class,
        access = { TypeAccess.DECLARED_CONSTRUCTORS, TypeAccess.DECLARED_METHODS }
    )
)
public class KeyVaultSecretsHints implements NativeConfiguration {
}
