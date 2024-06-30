package com.foodapp.services.activity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.foodapp.services.R
import com.foodapp.services.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatusBar(Color.WHITE)
        Handler(Looper.getMainLooper()).postDelayed({
            sessionMaintain()
        }, 2500)
    }

    private fun setStatusBar(white: Int) {
        window.statusBarColor = white
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

    }
    private fun sessionMaintain() {
        startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
        finishAffinity()

    }
}