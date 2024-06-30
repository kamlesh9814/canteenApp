package com.foodapp.services.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import coil.load
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityEditProfileBinding
import com.github.dhaval2404.imagepicker.ImagePicker
import java.io.IOException

@Suppress("DEPRECATION")
class EditProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditProfileBinding
    private var userImage: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
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

        binding.cameraIv.setOnClickListener {
            ImagePicker.with(this@EditProfileActivity)
                .crop()
                .compress(1024)
                .maxResultSize(1080, 1080)
                .start(111)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 111 && resultCode == RESULT_OK && data != null) {
            try {
                userImage = data.data
                binding.ProfileIV.load(userImage)
            } catch (e: IOException) {
                e.printStackTrace()
            }

        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()

        }
    }
}