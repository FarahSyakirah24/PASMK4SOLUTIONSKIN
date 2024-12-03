package com.farahsyakirah.solutionskin2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        ViewCompat.setOnApplyWindowInsetsListener(/* view = */ findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val textView4 = findViewById<TextView>(R.id.textView4)
// Set OnClickListener untuk berpindah ke Register Screen
        textView4.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@page3,
                page4::class.java
            )
            startActivity(intent)
        }
        val textView6 = findViewById<TextView>(R.id.textView6)
// Set OnClickListener untuk berpindah ke Register Screen
        textView6.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@page3,
                page5::class.java
            )
            startActivity(intent)
        }
        val textView7 = findViewById<TextView>(R.id.textView7)
// Set OnClickListener untuk berpindah ke Register Screen
        textView7.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@page3,
                page7::class.java
            )
            startActivity(intent)
        }
        val textView8 = findViewById<TextView>(R.id.textView8)
// Set OnClickListener untuk berpindah ke Register Screen
        textView8.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@page3,
                page6::class.java
            )
            startActivity(intent)
        }
        val textView9 = findViewById<TextView>(R.id.textView9)
// Set OnClickListener untuk berpindah ke Register Screen
        textView9.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@page3,
                page8::class.java
            )
            startActivity(intent)
        }
    }
}
