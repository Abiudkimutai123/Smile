package com.example.brightsmile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DentalDiseasesActivity : AppCompatActivity() {
    lateinit var Diseases:TextView
    lateinit var Listdiseases:TextView
    lateinit var btnDisease:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dental_diseases)
        Diseases = findViewById(findViewById(R.id.Diseases))
        Listdiseases = findViewById(findViewById(R.id.List_Diseases))
        btnDisease = findViewById(findViewById(R.id.btn_Diseases))

        btnDisease.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
