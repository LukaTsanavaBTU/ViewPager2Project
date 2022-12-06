package com.example.viewpagertestproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagertestproject.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerView = findViewById<ViewPager2>(R.id.viewPagerView)
        val tabLayoutView = findViewById<TabLayout>(R.id.tabLayoutView)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPagerView.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayoutView, viewPagerView) {tab, position ->
            when (position) {
                0 -> tab.text = "Notes"
                1 -> tab.text = "Toast"
                2 -> tab.text = "Picture"
            }
        }.attach()

    }
}