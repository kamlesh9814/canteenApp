package com.foodapp.services.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityStudentInfoBinding

class StudentInfoActivity : AppCompatActivity() {
    lateinit var binding:ActivityStudentInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentInfoBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.backIV.setOnClickListener {
            finish()
        }
        binding.ContinueLayout.setOnClickListener {
           startActivity(Intent(this@StudentInfoActivity,ShiftInfoActivity::class.java))
        }
    }
}