package com.foodapp.services.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foodapp.services.R
import com.foodapp.services.activity.ChangePasswordActivity
import com.foodapp.services.activity.EditProfileActivity
import com.foodapp.services.activity.ManageSiblingsActivity
import com.foodapp.services.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var binding:FragmentProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        onClick()
        return binding.root
    }

    private fun onClick() {
        binding.ChangePasswordTV.setOnClickListener {
            startActivity(Intent(requireActivity(),ChangePasswordActivity::class.java))
        }
        binding.ManageTV.setOnClickListener {
            startActivity(Intent(requireActivity(),ManageSiblingsActivity::class.java))
        }
        binding.EditProfileIV.setOnClickListener {
            startActivity(Intent(requireActivity(),EditProfileActivity::class.java))
        }
    }
}