package net.pside.android.sampleapp;

import android.app.Application;

import com.vessel.VesselSDK;

/**
 * Created by keima on 2013/12/12.
 * Copyright (c) moggy,Inc. All rights Reserved.
 */
public class SampleAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VesselSDK.initialize(getApplicationContext(), "YOUR_VESSEL_SECRET_CODE");
    }
}
