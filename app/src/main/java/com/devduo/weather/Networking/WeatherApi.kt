package com.devduo.weather.Networking

import com.devduo.weather.model.BaseResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    fun getWeather(@Query("id") id:String,@Query("appid") appid:String):Call<BaseResponse>
}