package com.example.disasterapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(LayoutInflater)
        setContentView(binding.root)

        val listData = generateDummy()
        val disasterAdapter = DisasterAdapter()

        with(receiver = binding) {
            rvDisaster.apply {
                adapter = disasterAdapter
                layoutManager = LinearLayoutManager(context = this@MainActivity)
            }
        }
    }

}