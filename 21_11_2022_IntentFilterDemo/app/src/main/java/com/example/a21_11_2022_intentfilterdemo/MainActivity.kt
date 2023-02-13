package com.example.a21_11_2022_intentfilterdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21_11_2022_intentfilterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSend.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/.jpeg"
            intent.putExtra(Intent.EXTRA_EMAIL,"aishwarya.phatak@bitcode.in")
            intent.putExtra(Intent.EXTRA_SUBJECT,"Bitcode Android")
            intent.putExtra(Intent.EXTRA_TEXT,"Welcome to Bitcode!")
            startActivity(intent)
        }

        binding.btnView.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }
    }
}