package com.example.menuweek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.menuweek.databinding.FragmentDesertBinding
import com.example.menuweek.databinding.FragmentSideDishBinding
import com.example.menuweek.viewModel.ViewModelListPlates
import com.example.menuweek.viewModel.ViewModelSelectedOrder


class FragmentDesert : Fragment() {
    private val viewModel: ViewModelListPlates by activityViewModels()
    val viewModelOrder: ViewModelSelectedOrder by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDesertBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.viewModelOrder = viewModelOrder
        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentDesert_to_fragmentSummary)
        }
        binding.cancel.setOnClickListener {
            viewModelOrder.resetOrder()
            findNavController().navigate(R.id.action_fragmentDesert_to_fragmentStart)
        }
        return binding.root
    }

}