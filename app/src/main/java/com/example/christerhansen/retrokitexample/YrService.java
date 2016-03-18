package com.example.christerhansen.retrokitexample;

import com.example.christerhansen.retrokitexample.Model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by christerhansen on 18.03.16.
 */
public interface YrService {
    @GET("/stad/Noreg/Telemark/Sauherad/Gvarv/varsel.xml")
    Call<WeatherData> getWeatherData();
}
