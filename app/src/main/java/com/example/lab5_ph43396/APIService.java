package com.example.lab5_ph43396;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    String DOMAIN = "http://192.168.1.12:3000/";

    @GET("/api/list")
    Call<List<Distributor>> getDistributor();

    @POST("/api/add")
    Call<Void> addDistributor(@Body Distributor distributor);

    @DELETE("/api/delete/{id}")
    Call<Void> deleteDistributor(@Path("id") String id);

    @PUT("/api/update/{id}")
    Call<Void> updateDistributor(
            @Path("id") String id,
            @Body Distributor distributor
    );

    @GET("/api/search")
    Call<List<Distributor>> searchDistributor(@Query("q") String query);
}