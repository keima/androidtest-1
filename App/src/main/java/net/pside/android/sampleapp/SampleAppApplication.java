package net.pside.android.sampleapp;

import android.app.Application;

import com.testflightapp.lib.TestFlight;
import com.testflightapp.lib.TestFlightProperties;
import com.testflightapp.lib.core.networking.TestFlightHost;

/**
 * Created by keima on 2013/12/12.
 * Copyright (c) moggy,Inc. All rights Reserved.
 */
public class SampleAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TestFlight.takeOff(this, YOUR_TESTFLIGHT_APP_TOKEN);
    }
}
