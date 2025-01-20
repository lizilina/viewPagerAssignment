package com.example.fakeinstaapp.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fakeinstaapp.home.FeedFragment
import com.example.fakeinstaapp.home.MessagesFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2 // Number of fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FeedFragment()
            1 -> MessagesFragment()
            else -> FeedFragment()
        }
    }
}
