package com.eazot.weatheraz.model.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0,
    val condition: String = "sunny"
) : Parcelable

fun getDefaultCity() = City("Рязань", 54.37, 39.43)