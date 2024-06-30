package com.foodapp.services.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.BackIV.setOnClickListener {
            finish()
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

        binding.eyeCloseIV1.setOnClickListener {
            if (strSel == "true") {
                binding.etNewPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                binding.etNewPassword.setSelection(binding.etNewPassword.length())
                binding.eyeCloseIV1.setImageDrawable(resources.getDrawable(R.drawable.ic_toggle_show))
                binding.etNewPassword.setSelection(binding.etNewPassword.length())
                strSel = "false"
            } else {
                binding.etNewPassword.transformationMethod =
                    PasswordTransformationMethod.getInstance()
                binding.etNewPassword.setSelection(binding.etNewPassword.length())
                binding.eyeCloseIV1.setImageDrawable(resources.getDrawable(R.drawable.eye_close))
                binding.etNewPassword.setSelection(binding.etNewPassword.length())
                strSel = "true"
            }
        }

        binding.eyeCloseIV2.setOnClickListener {
            if (strSel == "true") {
                binding.etReEnterNewPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                binding.etReEnterNewPassword.setSelection(binding.etReEnterNewPassword.length())
                binding.eyeCloseIV2.setImageDrawable(resources.getDrawable(R.drawable.ic_toggle_show))
                binding.etReEnterNewPassword.setSelection(binding.etReEnterNewPassword.length())
                strSel = "false"
            } else {
                binding.etReEnterNewPassword.transformationMethod =
                    PasswordTransformationMethod.getInstance()
                binding.etReEnterNewPassword.setSelection(binding.etReEnterNewPassword.length())
                binding.eyeCloseIV2.setImageDrawable(resources.getDrawable(R.drawable.eye_close))
                binding.etReEnterNewPassword.setSelection(binding.etReEnterNewPassword.length())
                strSel = "true"
            }
        }
    }
}