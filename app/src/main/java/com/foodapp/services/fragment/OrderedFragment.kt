package com.foodapp.services.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foodapp.services.R
import com.foodapp.services.adapter.OrderedFragmentAdapter
import com.foodapp.services.databinding.FragmentOrderedBinding

class OrderedFragment : Fragment() {
    lateinit var binding: FragmentOrderedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderedBinding.inflate(layoutInflater, container, false)
        adapterCall()
        return binding.root
    }

    private fun adapterCall() {
        binding.OrderedRec.adapter = OrderedFragmentAdapter(requireActivity())
    }
}