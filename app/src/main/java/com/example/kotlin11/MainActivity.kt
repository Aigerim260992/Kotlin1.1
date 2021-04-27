package com.example.kotlin11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start_btn.setOnClickListener {
            val message = edit_text.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("msg", message)
            }
            startActivity(intent)
        }
    }
}