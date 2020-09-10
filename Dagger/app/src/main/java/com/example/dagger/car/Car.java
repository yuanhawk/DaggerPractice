package com.example.dagger.car;

import android.util.Log;

import com.example.dagger.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    // Constructor > Field > Method
    @Inject Driver driver;
    @Inject Engine engine; // Field injection
    @Inject Wheels wheels;

    @Inject
    public Car() { // Constructor injection, providing dependencies on a single constructor

    }

    @Inject
    public void enableRemote(Remote remote) { // Method injection, must be executed after constructor injection, instance of obj to dependency
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }
}
