package com.foodapp.services.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityShiftInfoBinding


class ShiftInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityShiftInfoBinding
   // val languages = resources.getStringArray(R.array.Languages)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShiftInfoBinding.inflate(layoutInflater)
        onClick()
        setContentView(binding.root)

    }

    private fun onClick() {
        binding.IVADDSibling.setOnClickListener {
            startActivity(Intent(this@ShiftInfoActivity, SiblingInfoActivity::class.java))
        }
        binding.backIV.setOnClickListener {
            finish()
        }
        binding.GoLayout.setOnClickListener {
            startActivity(Intent(this@ShiftInfoActivity, SiblingInfoActivity::class.java))
        }
    }
}