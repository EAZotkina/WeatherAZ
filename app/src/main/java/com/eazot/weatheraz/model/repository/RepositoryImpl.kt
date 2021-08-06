package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather
import com.eazot.weatheraz.model.data.getRussianCities
import com.eazot.weatheraz.model.data.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}
