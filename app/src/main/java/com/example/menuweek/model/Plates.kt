package com.example.menuweek.model

import android.content.res.Resources
import com.example.menuweek.R
import com.example.menuweek.viewModel.ViewModelListPlates
import java.text.NumberFormat


object ResStr{
    lateinit var ResId:Resources
}

val listPrincipalPlate = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
   Plate(ResStr.ResId.getStringArray(R.array.plateMealFirst)[0],ResStr.ResId.getStringArray(R.array.plateMealFirst)[1],ResStr.ResId.getStringArray(R.array.plateMealFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMealTwo)[0],ResStr.ResId.getStringArray(R.array.plateMealTwo)[1],ResStr.ResId.getStringArray(R.array.plateMealTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMealThree)[0],ResStr.ResId.getStringArray(R.array.plateMealThree)[1],ResStr.ResId.getStringArray(R.array.plateMealThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMealFour)[0],ResStr.ResId.getStringArray(R.array.plateMealFour)[1],ResStr.ResId.getStringArray(R.array.plateMealFour)[2].toDouble())
    )
val listPrincipalPlateMilk = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMilkFirst)[0],ResStr.ResId.getStringArray(R.array.plateMilkFirst)[1],ResStr.ResId.getStringArray(R.array.plateMilkFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMilkTwo)[0],ResStr.ResId.getStringArray(R.array.plateMilkTwo)[1],ResStr.ResId.getStringArray(R.array.plateMilkTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMilkThree)[0],ResStr.ResId.getStringArray(R.array.plateMilkThree)[1],ResStr.ResId.getStringArray(R.array.plateMilkThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateMilkFour)[0],ResStr.ResId.getStringArray(R.array.plateMilkFour)[1],ResStr.ResId.getStringArray(R.array.plateMilkFour)[2].toDouble())
)
val listAcompaniamentPlate = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateAcompaniamentFirst)[0],ResStr.ResId.getStringArray(R.array.plateAcompaniamentFirst)[1],ResStr.ResId.getStringArray(R.array.plateAcompaniamentFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateAcompaniamentTwo)[0],ResStr.ResId.getStringArray(R.array.plateAcompaniamentTwo)[1],ResStr.ResId.getStringArray(R.array.plateAcompaniamentTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateAcompaniamentThree)[0],ResStr.ResId.getStringArray(R.array.plateAcompaniamentThree)[1],ResStr.ResId.getStringArray(R.array.plateAcompaniamentThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateAcompaniamentFour)[0],ResStr.ResId.getStringArray(R.array.plateAcompaniamentFour)[1],ResStr.ResId.getStringArray(R.array.plateAcompaniamentFour)[2].toDouble())
)
val listDesertPlate = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateDesertFirst)[0],ResStr.ResId.getStringArray(R.array.plateDesertFirst)[1],ResStr.ResId.getStringArray(R.array.plateDesertFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateDesertTwo)[0],ResStr.ResId.getStringArray(R.array.plateDesertTwo)[1],ResStr.ResId.getStringArray(R.array.plateDesertTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateDesertThree)[0],ResStr.ResId.getStringArray(R.array.plateDesertThree)[1],ResStr.ResId.getStringArray(R.array.plateDesertThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateDesertFour)[0],ResStr.ResId.getStringArray(R.array.plateDesertFour)[1],ResStr.ResId.getStringArray(R.array.plateDesertFour)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateDesertFive)[0],ResStr.ResId.getStringArray(R.array.plateDesertFive)[1],ResStr.ResId.getStringArray(R.array.plateDesertFive)[2].toDouble())

)
val listPrincipalPlateParve = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateParveFirst)[0],ResStr.ResId.getStringArray(R.array.plateParveFirst)[1],ResStr.ResId.getStringArray(R.array.plateParveFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateParveTwo)[0],ResStr.ResId.getStringArray(R.array.plateParveTwo)[1],ResStr.ResId.getStringArray(R.array.plateParveTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateParveThree)[0],ResStr.ResId.getStringArray(R.array.plateParveThree)[1],ResStr.ResId.getStringArray(R.array.plateParveThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateParveFour)[0],ResStr.ResId.getStringArray(R.array.plateParveFour)[1],ResStr.ResId.getStringArray(R.array.plateParveFour)[2].toDouble())
)

val listSideDishPlate = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishFirst)[0],ResStr.ResId.getStringArray(R.array.plateSideDishFirst)[1],ResStr.ResId.getStringArray(R.array.plateSideDishFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishTwo)[0],ResStr.ResId.getStringArray(R.array.plateSideDishTwo)[1],ResStr.ResId.getStringArray(R.array.plateSideDishTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishThree)[0],ResStr.ResId.getStringArray(R.array.plateSideDishThree)[1],ResStr.ResId.getStringArray(R.array.plateSideDishThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishFour)[0],ResStr.ResId.getStringArray(R.array.plateSideDishFour)[1],ResStr.ResId.getStringArray(R.array.plateSideDishFour)[2].toDouble())
)

val listSideDishPlateMilk = listOf<Plate>(
    Plate(ResStr.ResId.getStringArray(R.array.plateNothing)[0],ResStr.ResId.getStringArray(R.array.plateNothing)[1],ResStr.ResId.getStringArray(R.array.plateNothing)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishMilkFirst)[0],ResStr.ResId.getStringArray(R.array.plateSideDishMilkFirst)[1],ResStr.ResId.getStringArray(R.array.plateSideDishMilkFirst)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishMilkTwo)[0],ResStr.ResId.getStringArray(R.array.plateSideDishMilkTwo)[1],ResStr.ResId.getStringArray(R.array.plateSideDishMilkTwo)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishMilkThree)[0],ResStr.ResId.getStringArray(R.array.plateSideDishMilkThree)[1],ResStr.ResId.getStringArray(R.array.plateSideDishMilkThree)[2].toDouble()),
    Plate(ResStr.ResId.getStringArray(R.array.plateSideDishMilkFour)[0],ResStr.ResId.getStringArray(R.array.plateSideDishMilkFour)[1],ResStr.ResId.getStringArray(R.array.plateSideDishMilkFour)[2].toDouble())
)

