package io.curity.identityserver.plugin.remo;

import se.curity.identityserver.sdk.alarm.Alarm;
import se.curity.identityserver.sdk.alarm.AlarmHandler;

public final class remoAlarmHandler implements AlarmHandler
{
    private final remoAlarmHandlerConfig _configuration;

    public remoAlarmHandler(remoAlarmHandlerConfig configuration)
    {
        _configuration = configuration;
    }

    @Override
    public void handle(Alarm alarm)
    {
        // TODO: Implement handling an alarm, e.g. send to an external reporting system.
        // Check out the examples on GitHub: https://github.com/search?q=alarm+org%3Acurityio&type=Repositories
    }
}
