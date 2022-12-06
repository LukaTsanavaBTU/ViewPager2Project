package com.example.viewpagertestproject.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.viewpagertestproject.R
import com.example.viewpagertestproject.SharedPreferencesTestActivity

class FragmentTwo: Fragment(R.layout.fragment_two)  {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_two, container, false)

        val goToNotesButton = root.findViewById<Button>(R.id.goToNotesButton)

        goToNotesButton.setOnClickListener {
            val intent = Intent(activity, SharedPreferencesTestActivity()::class.java)
            startActivity(intent)
        }

        return root
    }
}