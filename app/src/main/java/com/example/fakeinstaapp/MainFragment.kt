package com.example.fakeinstaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fakeinstaapp.addPost.AddPostFragment
import com.example.fakeinstaapp.databinding.FragmentMainBinding
import com.example.fakeinstaapp.home.HomeFragment
import com.example.fakeinstaapp.profile.ProfileFragment
import com.example.fakeinstaapp.reels.ReelsFragment
import com.example.fakeinstaapp.search.SearchFragment

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun loadFragment(f :Fragment){
        parentFragmentManager.beginTransaction().replace(R.id.placeHolder,f).commit()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        loadFragment(HomeFragment.newInstance())
        bottomNavMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home ->{
                    loadFragment(HomeFragment.newInstance())
                    true
                }
                R.id.search ->{
                    loadFragment(SearchFragment.newInstance())
                    true
                }
                R.id.addPost ->{
                    loadFragment(AddPostFragment.newInstance())
                    true
                }
                R.id.reels ->{
                    loadFragment(ReelsFragment.newInstance())
                    true
                }
                R.id.profile ->{
                    loadFragment(ProfileFragment.newInstance())
                    true
                }
                else -> {
                    loadFragment(HomeFragment.newInstance())
                    true
                }

            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}