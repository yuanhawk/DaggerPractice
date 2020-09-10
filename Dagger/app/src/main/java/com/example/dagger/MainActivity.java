package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger.car.Car;
import com.example.dagger.dagger.ActivityComponent;
import com.example.dagger.dagger.DieselEngineModule;

import javax.inject.Inject;

//        1. sample case : @inject constructor
//        2. complicated case : @Module with @provide method , or @bind method!
//        3. provides method need { body with return} and @bind method need abstract class and abstract method without body{ }!
//        4. run time value example username!

public class MainActivity extends AppCompatActivity {

    @Inject Car car1, car2; // Field injection, framework types

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create only available if no module takes argument in the constructor
        // CarComponent component = DaggerCarComponent.create();
        // car = component.getCar(); Provision Method


        // singleton works only a single component
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(150, 1400);

        component.inject(this); // Field injection done manually as no constuctor injection done

        car1.drive();
        car2.drive();
    }
}