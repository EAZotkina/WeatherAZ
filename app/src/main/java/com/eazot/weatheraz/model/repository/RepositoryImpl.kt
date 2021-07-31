package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }
}