package com.foodapp.services.fragment

import android.annotation.SuppressLint
import android.app.Notification.Style
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.StyleRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.services.R
import com.foodapp.services.activity.CartActivity
import com.foodapp.services.adapter.HomeFragmentAdapter
import com.foodapp.services.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        adapterCall()
        bottomSheet()
        onClick()
        return binding.root
    }

    private fun onClick() {
        binding.AddCartIV.setOnClickListener {
            startActivity(Intent(requireActivity(),CartActivity::class.java))
        }
    }

    @SuppressLint("MissingInflatedId", "InflateParams")
    private fun bottomSheet() {
        binding.DropDoneLayout.setOnClickListener {

            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.bottom_sheet_layoutt, null)
            val btnCancel = view.findViewById<ImageView>(R.id.cancelIV)
            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

            /** cancel code **/
            btnCancel.setOnClickListener {
                dialog.dismiss()
            }
        }
    }

    private fun adapterCall() {
        binding.ListItemRecyclerView.adapter = HomeFragmentAdapter(requireActivity())
    }
}