package com.example.menuweek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.menuweek.model.ResStr
import com.example.menuweek.model.TypeOrder
import com.example.menuweek.viewModel.ViewModelListPlates

class FragmentStart : Fragment() {

    val viewModel: ViewModelListPlates by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.fragment_start, container, false)
       ResStr.ResId = resources
        view.findViewById<Button>(R.id.btnMeal).setOnClickListener {
            viewModel.setTypeOrder(TypeOrder.ORDER_MEAL)
            findNavController().navigate(R.id.action_fragmentStart_to_fragmentPlate)
        }
        view.findViewById<Button>(R.id.btnMilk).setOnClickListener {
            viewModel.setTypeOrder(TypeOrder.ORDER_MILK)
            findNavController().navigate(R.id.action_fragmentStart_to_fragmentPlate)
        }
        view.findViewById<Button>(R.id.btnNatural).setOnClickListener {
            viewModel.setTypeOrder(TypeOrder.ORDER_NATURAL)
            findNavController().navigate(R.id.action_fragmentStart_to_fragmentPlate)
        }
        return view
    }

}