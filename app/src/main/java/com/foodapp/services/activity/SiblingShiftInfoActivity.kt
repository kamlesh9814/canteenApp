package com.foodapp.services.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivitySiblingShiftInfoBinding

class SiblingShiftInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivitySiblingShiftInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySiblingShiftInfoBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.GoLayout.setOnClickListener {
            startActivity(Intent(this@SiblingShiftInfoActivity, MainActivity::class.java))
        }
        binding.backIV.setOnClickListener {
            finish()
        }
    }
}