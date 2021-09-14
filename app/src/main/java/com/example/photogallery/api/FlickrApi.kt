package com.example.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi{

    @GET("services/rest/?method=flickr.interestingness.getList" +
                "&api_key=6eee586294a73e9d6d0fee5857853885" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>

}