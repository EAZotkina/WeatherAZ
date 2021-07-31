package com.eazot.weatheraz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eazot.weatheraz.R
import com.eazot.weatheraz.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}