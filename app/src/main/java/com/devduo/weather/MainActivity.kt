package com.devduo.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.devduo.weather.ViewModels.WeatherViewModel
import com.devduo.weather.model.BaseResponse

class MainActivity : AppCompatActivity() {
    var viewModel: WeatherViewModel? =null
    lateinit var img_weather:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_weather=findViewById(R.id.img_weather)

        viewModel=ViewModelProviders.of(this).get(WeatherViewModel::class.java)
        viewModel!!.init()
        viewModel!!.mutableLiveData?.observe(this,object:Observer<BaseResponse>{
            override fun onChanged(t: BaseResponse?) {
                Toast.makeText(this@MainActivity,t!!.main.feels_like.toString(),Toast.LENGTH_SHORT).show()

                 }

        })



    }
}
