package com.foodapp.services.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityManageSiblimgsBinding

class ManageSiblingsActivity : AppCompatActivity() {
    lateinit var binding:ActivityManageSiblimgsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageSiblimgsBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.BackIV.setOnClickListener {
            finish()
        }
        binding.SaveLayout.setOnClickListener {
            finish()
        }
    }
}