package com.example.calculatorassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, MainActivitySplashScreen::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}