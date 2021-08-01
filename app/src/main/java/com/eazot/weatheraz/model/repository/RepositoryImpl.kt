package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather
import com.eazot.weatheraz.model.data.getRussianCities
import com.eazot.weatheraz.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }
}