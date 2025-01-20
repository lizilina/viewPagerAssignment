package com.example.fakeinstaapp.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.fakeinstaapp.R
import com.example.fakeinstaapp.home.adapter.ViewPagerAdapter

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)

        // Set up ViewPager with a simple adapter
        viewPager.adapter = ViewPagerAdapter(this)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
