package com.example.brightsmile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DentalHygieneActivity : AppCompatActivity() {
    lateinit var Hygiene:TextView
    lateinit var ListHygiene:TextView
    lateinit var btnHygiene:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dental_hygiene)
        Hygiene = findViewById(findViewById(R.id.Hygiene))
        ListHygiene = findViewById(findViewById(R.id.List_Hygiene))
        Hygiene = findViewById(findViewById(R.id.btn_Hygiene))

        btnHygiene.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
