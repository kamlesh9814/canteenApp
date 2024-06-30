package com.foodapp.services.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.services.activity.OrderedDetailActivity
import com.foodapp.services.databinding.HomeItemLayoutBinding

class OrderedFragmentAdapter(var activity: FragmentActivity) :
    RecyclerView.Adapter<OrderedFragmentAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: HomeItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            HomeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.apply {
                itemView.setOnClickListener {
                    val intent = Intent(activity, OrderedDetailActivity::class.java)
                    activity.startActivity(intent)
                }

                addRemoveLayout.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return 6
    }
}