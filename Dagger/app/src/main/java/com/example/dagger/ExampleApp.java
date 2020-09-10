package com.example.dagger;

import android.app.Application;

import com.example.dagger.dagger.ActivityComponent;
import com.example.dagger.dagger.AppComponent;
import com.example.dagger.dagger.DaggerAppComponent;
import com.example.dagger.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
