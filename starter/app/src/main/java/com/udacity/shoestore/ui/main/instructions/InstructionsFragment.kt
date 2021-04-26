package com.udacity.shoestore.ui.main.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(InstructionsViewModel::class.java)

        binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel

        viewModel.openStoreEvent.observe(this, Observer {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        })

        return binding.root
    }
}