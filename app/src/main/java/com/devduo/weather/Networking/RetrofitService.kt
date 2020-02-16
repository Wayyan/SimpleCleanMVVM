package com.devduo.weather.Networking

import com.devduo.weather.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    var retrofit=Retrofit.Builder()
        .baseUrl(Constants().BASE_URL).addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <S> createService(serviceClass: Class<S>?): S {
        return retrofit.create(serviceClass)
    }
}