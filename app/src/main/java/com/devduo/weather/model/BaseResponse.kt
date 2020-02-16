package com.devduo.weather.model

import com.google.gson.annotations.SerializedName

class BaseResponse {
    @SerializedName("weather")
    lateinit var weather: ArrayList<WeatherModel>

    @SerializedName("main")
    lateinit var main: MainModel

    @SerializedName("wind")
    lateinit var wind: WindMidel

    @SerializedName("clouds")
    lateinit var clouds: CloudModel

}

class WeatherModel {
    @SerializedName("main")
    lateinit var main: String

    @SerializedName("description")
    lateinit var description: String

    @SerializedName("icon")
    lateinit var icon: String
}

class MainModel {
    @SerializedName("temp")
    lateinit var temp: String

    @SerializedName("feels_like")
    var feels_like: Double = 0.0

    @SerializedName("temp_min")
    var temp_min: Double = 0.0

    @SerializedName("temp_max")
    var temp_max: Double = 0.0

    @SerializedName("pressure")
    var pressure: Double = 0.0

    @SerializedName("humidity")
    var humidity: Double = 0.0

    @SerializedName("sea_level")
    var sea_level: Double = 0.0

    @SerializedName("grnd_level")
    var grnd_level: Double = 0.0
}

class WindMidel {
    @SerializedName("speed")
    var speed: Double = 0.0

    @SerializedName("deg")
    var deg: Int = 0
}

class CloudModel{
    @SerializedName("all")
    var all: Int = 0
}