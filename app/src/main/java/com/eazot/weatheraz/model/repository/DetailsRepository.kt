package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.dto.WeatherDTO


interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}