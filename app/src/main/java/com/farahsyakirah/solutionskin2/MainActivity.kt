package com.farahsyakirah.solutionskin2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val textView3 = findViewById<TextView>(R.id.textView3)
// Set OnClickListener untuk berpindah ke Register Screen
        textView3.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@MainActivity,
                page3::class.java
            )
            startActivity(intent)
        }
    }
}