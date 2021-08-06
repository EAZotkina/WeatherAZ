package com.eazot.weatheraz.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eazot.weatheraz.model.data.Weather
import com.eazot.weatheraz.R
import com.eazot.weatheraz.databinding.DetailsFragmentBinding

class DetailsFragment : Fragment() {

    private var _binding: DetailsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getParcelable<Weather>(BUNDLE_EXTRA)?.let{ weather ->
            populateData(weather)
        }
    }

    private fun populateData(weatherData: Weather) {
        with(binding) {
            weatherData.city.also{ city ->
                cityName.text = city.city
                cityCoordinates.text = String.format(
                    getString(R.string.city_coordinates),
                    city.lat.toString(),
                    city.lon.toString()
                )
            }

            weatherData.apply {
                temperatureValue.text = temperature.toString()
                feelsLikeValue.text = feelsLike.toString()
            }
        }
    }

    companion object {
        const val BUNDLE_EXTRA = "weather"
        fun newInstance(bundle: Bundle): DetailsFragment {
            val fragment = DetailsFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
}