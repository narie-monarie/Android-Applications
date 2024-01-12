package com.example.readingslowly

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener{
            val firstName = findViewById<EditText>(R.id.editText1).text.toString()
            val lastName = findViewById<EditText>(R.id.editText2).text.toString()
            val birthday = findViewById<EditText>(R.id.editText3).text.toString()
            val country = findViewById<EditText>(R.id.editText4).text.toString()

            findViewById<TextView>(R.id.textings).text = "$firstName, $lastName, $birthday, $country"

            Log.d("MainActivity Results", "$firstName, $lastName, $birthday, $country")

        }
    }

}