package com.example.viewpagertestproject.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewpagertestproject.MainActivity
import com.example.viewpagertestproject.R

class FragmentOne: Fragment(R.layout.fragment_one) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_one, container, false)

        val testButton = root.findViewById<Button>(R.id.toastButtonView)

        testButton.setOnClickListener {
            Toast.makeText(activity, "ტოსტი გემრიელია მგონი", Toast.LENGTH_SHORT).show()
        }

        return root
    }
}

