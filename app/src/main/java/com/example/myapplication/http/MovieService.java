package com.example.myapplication.http;

import com.example.myapplication.Entity.SubjectsBean3;
import com.example.myapplication.Entity.Top250;
import com.example.myapplication.Entity.Top250V;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MovieService {

    // https://api.douban.com/v2/movie/top250?start=0&count=10
    // &apikey=0df993c66c0c636e29ecbb5344252a4a
    @GET("top250")
    Call<Top250> getTopMovie(
            @Query("start") int start,
            @Query("count") int count,
            @Query("apikey") String apikey
    );



    @GET("top250")
    Observable<Top250> getTopMovie2(
            @Query("start") int start,
            @Query("count") int count,
            @Query("apikey") String apikey
    );



    @GET("top250")
    Observable<Top250V<List<SubjectsBean3>>> getTopMovie3(
            @Query("start") int start,
            @Query("count") int count,
            @Query("apikey") String apikey
    );
}
