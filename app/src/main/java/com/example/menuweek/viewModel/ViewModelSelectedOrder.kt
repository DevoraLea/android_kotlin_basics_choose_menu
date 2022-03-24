package com.example.menuweek.viewModel

import android.service.autofill.Transformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.menuweek.model.Plate
import com.example.menuweek.model.listAcompaniamentPlate
import com.example.menuweek.model.listPrincipalPlate
import com.example.menuweek.model.listSideDishPlate
import java.text.NumberFormat



class ViewModelSelectedOrder:ViewModel() {

    private val TAXRATE= 0.08

    private var platePrice = 0.0
    private var sideDishPrice = 0.0
    private var acompaniamentPrice = 0.0
    private var desertPrice = 0.0

    private val _selectedPlate = MutableLiveData<Plate>()
    val selectedPlate:LiveData<Plate> = _selectedPlate

    private val _selectedSideDish = MutableLiveData<Plate>()
    val selectedSideDish:LiveData<Plate> = _selectedSideDish

    private val _selectedAcompaniament = MutableLiveData<Plate>()
    val selectedAcompaniament:LiveData<Plate> = _selectedAcompaniament

    private val _selectedDesert = MutableLiveData<Plate>()
    val selectedDesert:LiveData<Plate> = _selectedDesert

    private val _subtotal = MutableLiveData(0.0)
    val subtotal:LiveData<String> = Transformations.map(_subtotal){
        NumberFormat.getCurrencyInstance().format(it)
    }
    private val _total = MutableLiveData(0.0)
    val total:LiveData<String> = Transformations.map(_total){
        NumberFormat.getCurrencyInstance().format(it)
    }
    private val _tax = MutableLiveData(0.0)
    val tax:LiveData<String> = Transformations.map(_tax){
        NumberFormat.getCurrencyInstance().format(it)
    }

    init {
        _selectedPlate.value = listPrincipalPlate.get(0)
        _selectedSideDish.value= listSideDishPlate.get(0)
        _selectedAcompaniament.value = listAcompaniamentPlate[0]
        _selectedDesert.value = listSideDishPlate[0]
    }
    fun setTax(){
        _tax.value = _subtotal.value?.times(TAXRATE)
        _total.value = _tax.value?.let { _subtotal.value?.plus(it) }
    }
    fun setPlate(plate:Plate){
        _selectedPlate.value = plate
        if(_subtotal.value == 0.0){
            _subtotal.value = plate.price
        }
        else {
            _subtotal.value = _subtotal.value?.minus(platePrice)
            _subtotal.value = _subtotal.value?.plus(plate.price)
        }
        platePrice = plate.price
        setTax()
    }
    fun setSideDish(plate:Plate){
        _selectedSideDish.value = plate
        if(_subtotal.value == 0.0){
            _subtotal.value = plate.price
        }
        else {
            _subtotal.value = _subtotal.value?.minus(sideDishPrice)
            _subtotal.value = _subtotal.value?.plus(plate.price)
        }
        sideDishPrice = plate.price
        setTax()
    }
    fun setAcomapniament(plate:Plate){
        _selectedAcompaniament.value = plate
        if(_subtotal.value == 0.0){
            _subtotal.value = plate.price
        }
        else {
            _subtotal.value = _subtotal.value?.minus(acompaniamentPrice)
            _subtotal.value = _subtotal.value?.plus(plate.price)
        }
        acompaniamentPrice = plate.price
        setTax()
    }
    fun setDesert(plate:Plate){
        _selectedDesert.value = plate
        if(_subtotal.value == 0.0){
            _subtotal.value = plate.price
        }
        else {
            _subtotal.value = _subtotal.value?.minus(desertPrice)
            _subtotal.value = _subtotal.value?.plus(plate.price)
        }
        desertPrice = plate.price
        setTax()
    }
    fun getPrice(plate:Plate):String{
        return NumberFormat.getCurrencyInstance().format(plate.price)
    }
    fun resetOrder(){
        _selectedPlate.value = listPrincipalPlate.get(0)
        _selectedSideDish.value= listSideDishPlate.get(0)
        _selectedAcompaniament.value = listAcompaniamentPlate[0]
        _selectedDesert.value = listSideDishPlate[0]

        _subtotal.value = 0.0
        _tax.value = 0.0
        _total.value = 0.0
    }
}