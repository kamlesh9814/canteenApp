package com.foodapp.services.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.services.databinding.OrderedDetailLayoutBinding

class OrderedDetailActivityAdapter(var activity:FragmentActivity):RecyclerView.Adapter<OrderedDetailActivityAdapter.ViewHolder> (){

    inner class ViewHolder(private val binding: OrderedDetailLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            OrderedDetailLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
     return 6
    }
}