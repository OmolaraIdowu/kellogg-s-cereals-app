package com.swancodes.kelloggscereals


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swancodes.kelloggscereals.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startTheRunnable()

    }
    private val splashScreenTimer = Runnable {
        try {
            Thread.sleep(3000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } finally {
            val loginIntent = Intent(this, MainActivity::class.java)
            startActivity(loginIntent)
        }
    }
    private fun startTheRunnable() {
        val t = Thread(splashScreenTimer)
        t.start()
    }
}