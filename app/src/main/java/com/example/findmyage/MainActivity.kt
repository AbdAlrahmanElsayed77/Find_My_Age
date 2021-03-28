package com.example.findmyage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bu_Get_Age.setOnClickListener {

            val yearOfBirth=  userDOB.text.toString()
            if (yearOfBirth.toInt()==0){
                tvAge.text="invalid input"
                return@setOnClickListener
            }
            val year=Calendar.getInstance().get(Calendar.YEAR)
            val age=year - yearOfBirth.toInt()
            tvAge.text="Your Age is $age Years"
        }
    }
}