package com.example.daggerpractice.di;

import android.app.Application;

import com.example.daggerpractice.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton // AppComponent own the Application-wide Singleton scope
@Component(modules = { // modules declared can access Component objects
        AndroidSupportInjectionModule.class, // Contains tools for Dagger
        ActivityBuildersModule.class, // Declares activity/fragment for injection
        AppModule.class, // App Level dependencies
        ViewModelFactoryModule.class // Used by all ViewModels in the project
}) // Dependencies - modules
public interface AppComponent extends AndroidInjector<BaseApplication> { // Injection of Base Application without needing to create inject method

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application); // Bind a instance of application to component at the time of construction is available in the module

        AppComponent build(); // Overwriting Builder
    }
}

// Components - Services, Activities/Fragments - Clients