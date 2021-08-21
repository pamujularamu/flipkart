package io.curity.identityserver.plugin.remo;

import se.curity.identityserver.sdk.oauth.consent.signing.SigningConsentor;
import se.curity.identityserver.sdk.plugin.descriptor.SigningConsentorPluginDescriptor;

public final class remoSigningConsentorDescriptor implements SigningConsentorPluginDescriptor<remoConsentorConfig>
{
    @Override
    public Class<? extends SigningConsentor> getConsentorType()
    {
        return remoSigningConsentor.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "remo";
    }

    @Override
    public Class<? extends remoConsentorConfig> getConfigurationType()
    {
        return remoConsentorConfig.class;
    }
}
