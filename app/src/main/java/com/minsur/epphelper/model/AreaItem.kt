package com.minsur.epphelper.model

import androidx.compose.ui.res.stringResource
import com.minsur.epphelper.R

data class AreaItem(
    val id:Int,
    val title: String,
    val image: Int
)

val areaIds : Map<Int,String> = mapOf(
    10 to "PLANTA",
    1 to "MINA",
    2 to "MEDIO AMBIENTE",
    3 to "RECURSOS HUMANOS",
    4 to "MANTENIMIENTO",
    5 to "EXPLORACIONES",
    6 to "GEOLOGIA",
    7 to "LOGISTICA",
    8 to "PLANEAMIENTO",
    9 to "SSO"
)

val areaImages: Map<Int,Int> = mapOf(
    10 to R.drawable.planta,
    1 to R.drawable.mina,
    2 to R.drawable.medio_ambiente,
    3 to R.drawable.rrhh,
    4 to R.drawable.mantenimiento,
    5 to R.drawable.exploraciones,
    6 to R.drawable.geologia,
    7 to R.drawable.logistica,
    8 to R.drawable.planeamiento,
    9 to R.drawable.sso
)

fun getSpecificArea(areaId:Int) =
    AreaItem(
        id = areaId,
        title = areaIds[areaId]!!,
        image = areaImages[areaId]!!
    )

fun getAreas() = areaIds.map {

    AreaItem(
        id = it.key,
        title = it.value,
        image = areaImages[it.key]!!
    )

}



