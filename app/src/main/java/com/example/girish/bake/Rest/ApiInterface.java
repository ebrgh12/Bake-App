package com.example.girish.bake.Rest;

import com.example.girish.bake.Model.Ingredient;
import com.example.girish.bake.Model.Step;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("movie/top_rated")
    Call<Ingredient> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<Step> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

}
