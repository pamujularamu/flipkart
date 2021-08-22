package io.curity.identityserver.plugin.remo2;

import se.curity.identityserver.sdk.plugin.descriptor.AlarmHandlerPluginDescriptor;
import se.curity.identityserver.sdk.alarm.AlarmHandler;

public final class remo2AlarmHandlerDescriptor implements AlarmHandlerPluginDescriptor<remo2AlarmHandlerConfig>
{
    @Override
    public Class<? extends AlarmHandler> getAlarmHandler() {
        return remo2AlarmHandler.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "remo2";
    }

    @Override
    public Class<? extends remo2AlarmHandlerConfig> getConfigurationType()
    {
        return remo2AlarmHandlerConfig.class;
    }    
}
