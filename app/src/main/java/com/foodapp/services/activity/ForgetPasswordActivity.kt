package com.foodapp.services.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityForgetPasswordBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.backIV.setOnClickListener {
            onBackPressed()
        }
        binding.signUpLayout.setOnClickListener {
            startActivity(Intent(this@ForgetPasswordActivity, LoginActivity::class.java))
        }
    }
}