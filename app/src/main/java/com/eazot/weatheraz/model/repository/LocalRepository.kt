package com.eazot.weatheraz.model.repository

import com.eazot.weatheraz.model.data.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}