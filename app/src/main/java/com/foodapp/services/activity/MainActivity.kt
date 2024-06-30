package com.foodapp.services.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivityMainBinding
import com.foodapp.services.fragment.HomeFragment
import com.foodapp.services.fragment.NotificationFragment
import com.foodapp.services.fragment.OrderedFragment
import com.foodapp.services.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        switchFragment(HomeFragment(), "", true, null)
        binding.ivHome.setImageResource(R.drawable.co_home)
        colorChange()
    }
    private fun colorChange() {
        binding.HomeLayout.setOnClickListener {
            switchFragment(HomeFragment(), "", true, null)
            binding.ivHome.setImageResource(R.drawable.co_home)
            binding.ivOrdered.setImageResource(R.drawable.ordered)
            binding.ivNotification.setImageResource(R.drawable.notification)
            binding.ivProfile.setImageResource(R.drawable.profile)

        }

        binding.OrderedLayout.setOnClickListener {
            switchFragment(OrderedFragment(), "", true, null)
            binding.ivOrdered.setImageResource(R.drawable.co_ordered)
            binding.ivNotification.setImageResource(R.drawable.notification)
            binding.ivHome.setImageResource(R.drawable.home)
            binding.ivProfile.setImageResource(R.drawable.profile)

        }

        binding.NotificationLayout.setOnClickListener {
            switchFragment(NotificationFragment(), "", true, null)
            binding.ivNotification.setImageResource(R.drawable.co_notification)
            binding.ivOrdered.setImageResource(R.drawable.ordered)
            binding.ivHome.setImageResource(R.drawable.home)
            binding.ivProfile.setImageResource(R.drawable.profile)

        }

        binding.profileLayout.setOnClickListener {
            switchFragment(ProfileFragment(), "", true, null)
            binding.ivProfile.setImageResource(R.drawable.co_profile)
            binding.ivNotification.setImageResource(R.drawable.notification)
            binding.ivHome.setImageResource(R.drawable.home)
            binding.ivOrdered.setImageResource(R.drawable.ordered)

        }
    }

    private fun switchFragment(fragment: Fragment?, Tag: String?, addToStack: Boolean, bundle: Bundle?) {
        val fragmentManager: FragmentManager = supportFragmentManager
        if (fragment != null) {
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.main_container, fragment, Tag)
            fragmentManager.popBackStack()
            if (bundle != null) fragment.arguments = bundle
            fragmentTransaction.commit()
            fragmentManager.executePendingTransactions()
        }
    }
}