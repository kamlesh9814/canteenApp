package com.foodapp.services.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.core.content.ContextCompat
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    var clicked = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.LoginTV.setOnClickListener {
            startActivity(Intent(this@SignUpActivity,LoginActivity::class.java))
        }
        binding.signUpLayout.setOnClickListener {
            startActivity(Intent(this@SignUpActivity,LoginActivity::class.java))
        }
        binding.backIV.setOnClickListener {
           finish()
        }
        binding.getOtpTV.setOnClickListener {
            startActivity(Intent(this@SignUpActivity,OtpActivity::class.java))
        }
        binding.acceptIV.setOnClickListener {
            clicked = if (clicked == "0") {
                binding.acceptIV.setImageDrawable(
                    (ContextCompat.getDrawable(
                        this,
                        R.drawable.check
                    ))
                )
                "1"
            } else {
                binding.acceptIV.setImageDrawable(
                    (ContextCompat.getDrawable(
                        this,
                        R.drawable.remember_me_empty
                    ))
                )
                "0"
            }
        }
        var strSel = "true"
        binding.eyeCloseIV.setOnClickListener {
            if (strSel == "true") {
                binding.etPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                binding.etPassword.setSelection(binding.etPassword.length())
                binding.eyeCloseIV.setImageDrawable(resources.getDrawable(R.drawable.ic_toggle_show))
                binding.etPassword.setSelection(binding.etPassword.length())
                strSel = "false"
            } else {
                binding.etPassword.transformationMethod =
                    PasswordTransformationMethod.getInstance()
                binding.etPassword.setSelection(binding.etPassword.length())
                binding.eyeCloseIV.setImageDrawable(resources.getDrawable(R.drawable.eye_close))
                binding.etPassword.setSelection(binding.etPassword.length())
                strSel = "true"
            }
        }
    }
}