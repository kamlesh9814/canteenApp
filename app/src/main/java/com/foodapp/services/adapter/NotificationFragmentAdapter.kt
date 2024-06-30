package com.foodapp.services.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.services.databinding.NotificationItemLayoutBinding

class NotificationFragmentAdapter(var activity: FragmentActivity) :
    RecyclerView.Adapter<NotificationFragmentAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: NotificationItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            NotificationItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 12
    }
}