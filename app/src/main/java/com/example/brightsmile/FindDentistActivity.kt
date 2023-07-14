package com.example.brightsmile

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.google.firebase.auth.FirebaseAuth

class FindDentistActivity : AppCompatActivity() {
    lateinit var cardFindOrthodontist:CardView
    lateinit var cardPeriodontist:CardView
    lateinit var cardFindEndodontist:CardView
    lateinit var cardFindDentalAssistant:CardView
    lateinit var cardFindProstodontist:CardView
    lateinit var cardExit:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_dentist)
        cardFindOrthodontist = findViewById(R.id.cardFindOrthodontist)
        cardPeriodontist = findViewById(R.id.cardFindPeriodontist)
        cardFindEndodontist= findViewById(R.id.cardFindEndodontist)
        cardFindDentalAssistant = findViewById(R.id.CardDentalAssistant)
        cardFindProstodontist = findViewById(R.id.CardProstodontist)
        cardExit = findViewById(R.id.cardExit)


        cardExit.setOnClickListener{

            startActivity(Intent(this, HomeActivity::class.java))
            finish()}
        cardFindOrthodontist.setOnClickListener {

            startActivity(Intent(this, DoctorDetailsActivity::class.java))



        }
        cardPeriodontist.setOnClickListener {

            startActivity(Intent(this, DoctorDetailsActivity::class.java))


        }
        cardFindEndodontist.setOnClickListener {

            startActivity(Intent(this, DoctorDetailsActivity::class.java))


        }
        cardFindDentalAssistant.setOnClickListener {

            startActivity(Intent(this, DoctorDetailsActivity::class.java))


        }
        cardFindProstodontist.setOnClickListener {

            startActivity(Intent(this, DoctorDetailsActivity::class.java))


        }




    }

}