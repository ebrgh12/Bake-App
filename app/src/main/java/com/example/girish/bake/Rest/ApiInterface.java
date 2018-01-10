package com.example.girish.bake.Rest;

import com.example.girish.bake.Model.BakeResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("baking.json")
    Call<List<BakeResponse>> getResponse();
/*
    @GET("movie/{id}")
    Call<Step> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
*/
}
