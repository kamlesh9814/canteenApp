package com.foodapp.services.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodapp.services.adapter.PaymentMethodAdapter
import com.foodapp.services.databinding.ActivityCartBinding


class CartActivity : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        onClick()
        adapterCall()
        setContentView(binding.root)
    }

    private fun onClick() {
        binding.CustomerSupportIV.setOnClickListener {
            startActivity(Intent(this@CartActivity, ChatSupportActivity::class.java))
        }

        binding.BackIV.setOnClickListener {
            finish()
        }
    }

    private fun adapterCall() {
        binding.CartRecyclerView.adapter = PaymentMethodAdapter(this)

    }
}