package com.example.example_logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.example_logging.databinding.ActivityMainBinding
import com.jcabi.aspects.Loggable
import org.tinylog.kotlin.Logger

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setButton()
    }

    private fun setButton() {
        binding.logButton.setOnClickListener {
            logWithTinylog()
            logWithAnnotation()
        }
    }

    private fun logWithTinylog() {
        Logger.debug { "logWithTinyLog: Logging example" }
    }

    @Loggable
    private fun logWithAnnotation() {

    }
}