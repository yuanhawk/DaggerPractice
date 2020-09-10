package com.example.daggerpractice.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerpractice.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
//import dagger.Provides;

@Module
public abstract class ViewModelFactoryModule { // Generate dependency during dependency injection for ViewModelFactory class

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

//    @Provides - same as binds
//    static ViewModelProvider.Factory provideFactory(ViewModelProviderFactory factory) {
//        return factory;
//    }
}
