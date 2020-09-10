package com.example.daggerpractice.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.daggerpractice.di.ViewModelKey;
import com.example.daggerpractice.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule { // Dependencies for AuthViewModel, scoped to Auth SubComponent

    @Binds
    @IntoMap // Mapping to key
    @ViewModelKey(AuthViewModel.class) // Referencing class
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
