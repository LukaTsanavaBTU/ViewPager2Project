package com.example.viewpagertestproject

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SharedPreferencesTestActivity : AppCompatActivity() {

    private lateinit var sharedPreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences_test)

        sharedPreference = getSharedPreferences("APP_DATA", MODE_PRIVATE)
        val editor = sharedPreference.edit()

        val etNotes = findViewById<EditText>(R.id.etNotes)
        val btAdd = findViewById<Button>(R.id.btAdd)
        val btDel = findViewById<Button>(R.id.btDel)
        val tvNotes = findViewById<TextView>(R.id.tvNotes)

        tvNotes.text = sharedPreference.getString("text", "")

        btAdd.setOnClickListener {
            val new_text = etNotes.text.toString()
            val old_text = tvNotes.text.toString()
            val combined_text = "$old_text\n$new_text".trim()
            tvNotes.text = combined_text
            etNotes.text.clear()

            editor.putString("text", combined_text)
            editor.apply()
        }

        btDel.setOnClickListener {
            tvNotes.text = ""
            editor.putString("text", "")
            editor.apply()
        }



    }
}