package com.example.viewpagertestproject.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagertestproject.Fragments.FragmentOne
import com.example.viewpagertestproject.Fragments.FragmentThree
import com.example.viewpagertestproject.Fragments.FragmentTwo

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentTwo()
            }
            1 -> {
                FragmentOne()
            }
            else -> {
                FragmentThree()
            }
        }
    }
}