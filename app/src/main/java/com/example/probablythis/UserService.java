package com.example.probablythis;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {

    @POST("user")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);


    @POST("user")
    Call<RegisterResponse> registerUsers(@Body RegisterRequest registerRequest);


}
