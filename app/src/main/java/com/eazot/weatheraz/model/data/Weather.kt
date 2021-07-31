package com.eazot.weatheraz.model.data

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0,
)

fun getDefaultCity() = City("Рязань", 54.37, 39.43)