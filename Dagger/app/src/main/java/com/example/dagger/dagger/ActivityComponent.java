package com.example.dagger.dagger;

import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class}) //swapping module to do testing
public interface ActivityComponent { // Backbone

    Car getCar(); // Using provision methods

    void inject(MainActivity mainActivity);

    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create(@BindsInstance @Named("horse_power") int horsePower,
                                 @BindsInstance @Named("engine_capacity") int engineCapacity);
    }
}
