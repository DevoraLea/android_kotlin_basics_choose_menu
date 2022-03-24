package com.example.menuweek

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.menuweek.databinding.FragmentPlateBinding
import com.example.menuweek.databinding.FragmentSideDishBinding
import com.example.menuweek.databinding.FragmentSummaryBinding
import com.example.menuweek.viewModel.ViewModelSelectedOrder
import com.google.android.material.snackbar.Snackbar


class FragmentSummary : Fragment() {
    val order: ViewModelSelectedOrder by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentSummaryBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.order = order
        binding.submitOrder.setOnClickListener {
            send()
        }
        binding.cancel.setOnClickListener {
            order.resetOrder()
            findNavController().navigate(R.id.action_fragmentSummary_to_fragmentStart)
        }
        return binding.root
    }

    fun send() {
        var plate = order.selectedPlate.value
        var sideDish = order.selectedSideDish.value
        var acompaniament = order.selectedAcompaniament.value
        var desert = order.selectedDesert.value

        val orderDetail = getString(R.string.order_details,plate?.namePlate,plate?.price.toString(),
            sideDish?.namePlate,sideDish?.price.toString(),
        acompaniament?.namePlate,acompaniament?.price.toString(),
        desert?.namePlate,desert?.price.toString(),order.total.value)


        val intent = Intent(Intent.ACTION_SEND)
            .setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,orderDetail)
        intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.order_title))
        if(activity?.packageManager?.resolveActivity(intent,0)!= null){
            startActivity(intent)
        }

    }
    /*
    fun submitOrder() {
        // Show snackbar to "confirm" order
        Snackbar.make(binding.root, R.string.submit_order, Snackbar.LENGTH_SHORT).show()
    }*/

}