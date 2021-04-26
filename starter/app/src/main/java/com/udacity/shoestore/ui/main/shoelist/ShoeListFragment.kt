package com.udacity.shoestore.ui.main.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.adapters.ShoesAdapter
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe

class ShoeListFragment : Fragment(), ShoesAdapter.IOnClickListener {

    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.shoeList.adapter = ShoesAdapter(this)

        viewModel.shoesLiveData.observe(viewLifecycleOwner, Observer {
            (binding.shoeList.adapter as ShoesAdapter).update(it)
        })

        viewModel.openDetailEvent.observe(this, Observer {
            onClick(null)
        })

        return binding.root
    }

    override fun onClick(shoe: Shoe?) {
        Navigation.findNavController(binding.root)
            .navigate(R.id.action_shoeListFragment2_to_shoeDetailFragment)
    }
}