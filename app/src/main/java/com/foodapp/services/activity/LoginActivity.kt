package com.foodapp.services.activity

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    var clicked = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)

    }

    private fun onClick() {
        binding.signInLayout.setOnClickListener {
            startActivity(Intent(this@LoginActivity,StudentInfoActivity::class.java))
        }
        binding.forgetTV.setOnClickListener {
            startActivity(Intent(this@LoginActivity,ForgetPasswordActivity::class.java))
        }
        binding.SignUpTV.setOnClickListener {
            startActivity(Intent(this@LoginActivity,SignUpActivity::class.java))
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

