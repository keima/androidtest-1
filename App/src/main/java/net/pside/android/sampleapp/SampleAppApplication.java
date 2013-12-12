package net.pside.android.sampleapp;

import android.app.Application;

import com.deploygate.sdk.DeployGate;

/**
 * Created by keima on 2013/12/12.
 * Copyright (c) moggy,Inc. All rights Reserved.
 */
public class SampleAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DeployGate.install(this);
    }
}
