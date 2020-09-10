package com.example.dagger.dagger;

import com.example.dagger.car.Engine;
import com.example.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine); // Use bind when Engine is an interface, never create implementation nor call method, instantiate engine only
}