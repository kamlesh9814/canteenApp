package com.foodapp.services.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.services.databinding.DebitCartLayoutBinding
import com.foodapp.services.databinding.HomeItemLayoutBinding

class PaymentMethodAdapter(var activity: FragmentActivity) :
    RecyclerView.Adapter<PaymentMethodAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: HomeItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            HomeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}