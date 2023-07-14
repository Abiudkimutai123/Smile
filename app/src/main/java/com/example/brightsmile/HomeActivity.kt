package com.example.brightsmile

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var cardfinddentist: CardView
    lateinit var cardDentalproblems: CardView
    lateinit var cardDentalhygiene: CardView
    lateinit var cardExit: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        cardfinddentist = findViewById(R.id.cardFinddentist)
        cardDentalproblems = findViewById(R.id.cardDentalproblems)
        cardDentalhygiene = findViewById(R.id.cardDentalhygiene)
        cardExit = findViewById(R.id.cardExit)


        cardfinddentist.setOnClickListener {
            val intent = Intent(this, FindDentistActivity::class.java)
            startActivity(intent)
        }
        cardDentalproblems.setOnClickListener {
            val intent = Intent(this, DentalDiseasesActivity::class.java)
            startActivity(intent)
        }
        cardDentalhygiene.setOnClickListener {
            val intent = Intent(this, DentalHygieneActivity::class.java)
            startActivity(intent)
        }
        cardExit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}