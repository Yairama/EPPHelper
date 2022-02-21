package com.minsur.epphelper.model

data class SubAreaItem(
    val id:Int,
    val areaId: Int,
    val title: String
)

val subAreaIds: Map<Int, String> = mapOf(
    16 to "AGUAS Y AZUFRE",
    1 to "CHANCADO",
    2 to "LIXIVIACION",
    3 to "ADR",
    4 to "FUNDICION REFINERIA",
    5 to "MINA",
    6 to "MEDIO AMBIENTE",
    7 to "SSGG",
    8 to "ELECTRICO",
    9 to "MECANICO",
    10 to "PLANEAMIENTO",
    11 to "EXPLORACIONES",
    12 to "GEOLOGIA",
    13 to "LOGISTICA",
    14 to "TOPOGRAFIA",
    15 to "SSO"
)

val areaSubArea: Map<Int, List<Int>> = mapOf(

    10 to listOf<Int>(16, 1, 2, 3, 4),
    1 to listOf<Int>(5),
    2 to listOf<Int>(6),
    3 to listOf<Int>(7),
    4 to listOf<Int>(8, 9, 10),
    5 to listOf<Int>(11),
    6 to listOf<Int>(12),
    7 to listOf<Int>(13),
    8 to listOf<Int>(14),
    9 to listOf<Int>(15)
)

fun getSpecificSubArea(areaId:Int, subAreaId: Int) =
    SubAreaItem(
        id = subAreaId,
        areaId = areaId,
        title = subAreaIds[subAreaId]!!
    )

fun getSubAreasPerArea(areaId:Int) = areaSubArea[areaId]!!.map {
    SubAreaItem(
        id = it,
        areaId = areaId,
        title = subAreaIds[it]!!
    )
}

fun getAllSubAreas(): List<SubAreaItem> {

    var temSubAreaItemList : List<SubAreaItem> = mutableListOf<SubAreaItem>()

    for ((k, v) in areaSubArea) {
        for (id in v){
            temSubAreaItemList +=
                SubAreaItem(
                    id = id,
                    areaId = k,
                    title = subAreaIds[id]!!
                )

        }
    }

    return temSubAreaItemList

}
