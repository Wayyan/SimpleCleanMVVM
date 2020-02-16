package com.devduo.weather.Networking

import androidx.lifecycle.MutableLiveData
import com.devduo.weather.model.BaseResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherRepository {
    var weatherRepository: WeatherRepository?=null
    var weatherApi = RetrofitService().createService(WeatherApi::class.java)

    fun getInstance(): WeatherRepository {
        if (weatherRepository == null)
            weatherRepository = WeatherRepository()
        return weatherRepository!!
    }

    fun getWeather(id: String, appid: String): MutableLiveData<BaseResponse> {
        var data = MutableLiveData<BaseResponse>()
        weatherApi.getWeather(id, appid).enqueue(object : Callback<BaseResponse> {
            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {
                if (response.isSuccessful)
                    data.value = response.body()
            }
        })
        return data
    }


}