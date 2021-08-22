package io.curity.identityserver.plugin.remo;

import se.curity.identityserver.sdk.plugin.descriptor.AlarmHandlerPluginDescriptor;
import se.curity.identityserver.sdk.alarm.AlarmHandler;

public final class remoAlarmHandlerDescriptor implements AlarmHandlerPluginDescriptor<remoAlarmHandlerConfig>
{
    @Override
    public Class<? extends AlarmHandler> getAlarmHandler() {
        return remoAlarmHandler.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "remo";
    }

    @Override
    public Class<? extends remoAlarmHandlerConfig> getConfigurationType()
    {
        return remoAlarmHandlerConfig.class;
    }    
}
