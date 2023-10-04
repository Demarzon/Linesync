package com.example.linesyncdashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linesyncdashboard.databinding.ActivityMainBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
    }
}