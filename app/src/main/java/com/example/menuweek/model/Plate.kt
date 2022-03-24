package com.example.menuweek.model

import java.text.NumberFormat

data class Plate(val namePlate:String,val description:String,val price:Double)
fun getFormattedPrice(price:Double): String = NumberFormat.getCurrencyInstance().format(price)