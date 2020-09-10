package com.example.daggerpractice.di;

import com.example.daggerpractice.di.auth.AuthModule;
import com.example.daggerpractice.di.auth.AuthViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module // Activity declarations
public abstract class ActivityBuildersModule { // Dependencies to be added to modules, activities/fragments contributed in this class

    @ContributesAndroidInjector(modules = {
            AuthViewModelsModule.class,
            AuthModule.class
    }) // Declaring dependencies for subcomponents, for organization & scoping
    abstract AuthActivity contributeAuthActivity(); // AuthActivity is a client for Dagger to inject
}
