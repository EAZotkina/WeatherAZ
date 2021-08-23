package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather
import com.eazot.weatheraz.model.data.convertHistoryEntityToWeather
import com.eazot.weatheraz.model.data.convertWeatherToEntity
import com.eazot.weatheraz.room.HistoryDao

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        return localDataSource.insert(convertWeatherToEntity(weather))
    }
}