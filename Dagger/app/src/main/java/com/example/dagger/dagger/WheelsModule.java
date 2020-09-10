package com.example.dagger.dagger;

import com.example.dagger.car.Rims;
import com.example.dagger.car.Tyres;
import com.example.dagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule { // 3rd Party Wheels not created by programmer, since instance not used we should use abstract, not compiled by dagger

    // Class that contributes to the object graph
    // static used when does not depend on an instance of the class

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }

}
