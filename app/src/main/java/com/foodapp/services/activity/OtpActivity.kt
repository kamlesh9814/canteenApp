package com.foodapp.services.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    lateinit var binding:ActivityOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.backIV.setOnClickListener {
            finish()
        }
        binding.StartLayout.setOnClickListener {
            finish()
        }
    }
}