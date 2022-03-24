package com.example.menuweek.viewModel

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.menuweek.model.*
import java.text.NumberFormat

class ViewModelListPlates:ViewModel() {

    object ResStrigObj{
        lateinit var ResString: Resources
    }

    val _listPricipal = MutableLiveData<List<Plate>>()
    var listPricipal:LiveData<List<Plate>> = _listPricipal

    val _listSideDish = MutableLiveData<List<Plate>>()
    var listSideDish:LiveData<List<Plate>> = _listSideDish

    val _listAcompaniament = MutableLiveData<List<Plate>>()
    var listAcompaniament:LiveData<List<Plate>> = _listAcompaniament

    val _listDesert = MutableLiveData<List<Plate>>()
    var listDesert:LiveData<List<Plate>> = _listDesert

    init {
        _listPricipal.value = listPrincipalPlate
        _listSideDish.value = listSideDishPlate
        _listAcompaniament.value = listAcompaniamentPlate
        _listDesert.value = listDesertPlate
    }
    fun getPrice(plate:Plate):String{
        return NumberFormat.getCurrencyInstance().format(plate.price)
    }
    fun setTypeOrder(type:TypeOrder){
        when(type){
            TypeOrder.ORDER_MEAL -> {
                _listPricipal.value = listPrincipalPlate
                _listSideDish.value = listSideDishPlate
            }
            TypeOrder.ORDER_MILK ->{
                _listPricipal.value = listPrincipalPlateMilk
                _listSideDish.value = listSideDishPlateMilk
            }
            TypeOrder.ORDER_NATURAL ->{
                _listPricipal.value = listPrincipalPlateParve
                _listSideDish.value = listSideDishPlate
            }
        }
    }
}