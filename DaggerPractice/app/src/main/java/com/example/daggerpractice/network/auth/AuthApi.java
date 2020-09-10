package com.example.daggerpractice.network.auth;

import com.example.daggerpractice.models.User;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi { // AuthApi -> AuthModule (SubComponent)

    @GET("/users/{id}")
    Flowable<User> getUser(
            @Path("id") int id // Var to be passed
    );
}
