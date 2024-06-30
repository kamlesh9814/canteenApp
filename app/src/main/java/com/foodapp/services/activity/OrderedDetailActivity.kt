package com.foodapp.services.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.R
import com.foodapp.services.adapter.OrderedDetailActivityAdapter
import com.foodapp.services.databinding.ActivityOrderedDetailBinding

class OrderedDetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityOrderedDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderedDetailBinding.inflate(layoutInflater)
        adapterCall()
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.BackIV.setOnClickListener {
            finish()
        }
    }

    private fun adapterCall() {
        binding.OrderedRec.adapter = OrderedDetailActivityAdapter(this)
    }
}