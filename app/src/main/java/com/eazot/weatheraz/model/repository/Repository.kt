package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}