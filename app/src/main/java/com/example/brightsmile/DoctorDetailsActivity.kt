package com.example.brightsmile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DoctorDetailsActivity : AppCompatActivity() {
    lateinit var circle :CircleImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)
        circle = findViewById(R.id.profile_image2)

    }
}