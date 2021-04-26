package com.udacity.shoestore.ui.main.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)

        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel

        viewModel.openInstructionEvent.observe(this, Observer {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        })

        return binding.root
    }
}