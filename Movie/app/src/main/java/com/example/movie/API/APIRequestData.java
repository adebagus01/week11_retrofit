package com.example.movie.API;

import com.example.movie.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retrive.php")
    Call<ResponseModel> ardRetrieveData();
}
