package com.devduo.weather.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devduo.weather.Constants
import com.devduo.weather.Networking.WeatherRepository
import com.devduo.weather.model.BaseResponse

class WeatherViewModel : ViewModel() {
    var mutableLiveData:MutableLiveData<BaseResponse>?=null
    var weatherRepository: WeatherRepository?=null

    fun init(){
        if (mutableLiveData!=null)
            return

        weatherRepository=WeatherRepository().getInstance()
        mutableLiveData=weatherRepository!!.getWeather(Constants().PYAY_CODE.toString(),Constants().WEATHER_KEY)
    }


}