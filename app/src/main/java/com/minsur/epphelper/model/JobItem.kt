package com.minsur.epphelper.model

import android.icu.text.CaseMap
import com.minsur.epphelper.R

data class JobItem(
    val id: Int,
    val subAreaId: Int,
    val areaId: Int,
    val title: String,
    val image: Int,
)

val jobImages: Map<Int, Int> = mapOf(
    0 to R.drawable.auxiliar_de_almacen,
    1 to R.drawable.auxiliar_ssgg,
    2 to R.drawable.auxiliar_ssma,
    3 to R.drawable.ayudante_topografo,
    4 to R.drawable.operador_tecnico_multifuncional,
    5 to R.drawable.operador_de_subestacion,
    6 to R.drawable.soldador,
    7 to R.drawable.supervision,
    8 to R.drawable.tecnico_electricista,
    9 to R.drawable.tecnico_instrumentarista,
    10 to R.drawable.tecnico_de_almacen,
    11 to R.drawable.tecnico_mecanico_planta_chancado,
    12 to R.drawable.tecnico_mecanico_truck_shop,
    13 to R.drawable.tecnico_muestrero,
    14 to R.drawable.tecnico_predictivo,
    15 to R.drawable.tecnico_topografo,
)

val jobIds: Map<Int,String> = mapOf(
    0 to "AUXILIAR DE ALMACEN",
    1 to "AUXILIAR SSGG",
    2 to "AUXILIAR SSMA",
    3 to "AYUDANTE TOPOGRAFO",
    4 to "OPERADOR O TECNICO MULTIFUNCIONAL",
    5 to "OPERADOR DE SUBESTACIÓN",
    6 to "SOLDADOR",
    7 to "SUPERVISION",
    8 to "TECNICO ELECTRICISTA",
    9 to "TECNICO INSTRUMENTARISTA",
    10 to "TECNICO DE ALMACEN",
    11 to "TECNICO MECANICO O PLANTA CHANCADO",
    12 to "TECNICO MECANICO O TRUCK SHOP",
    13 to "TECNICO MUESTRERO",
    14 to "TECNICO PREDICTIVO",
    15 to "TECNICO TOPOGRAFO"
)


val subAreaJobs: Map<Int, List<Int>> = mapOf(
    0 to listOf<Int>(4),
    1 to listOf<Int>(4),
    2 to listOf<Int>(4),
    3 to listOf<Int>(4),
    4 to listOf<Int>(4, 7),
    5 to listOf<Int>(4, 7),
    6 to listOf<Int>(7,2),
    7 to listOf<Int>(7,1),
    8 to listOf<Int>(9,8,5, 7),
    9 to listOf<Int>(11,12,6,7),
    10 to listOf<Int>(14),
    11 to listOf<Int>(7),
    12 to listOf<Int>(13,7),
    13 to listOf<Int>(0,10,7),
    14 to listOf<Int>(3,15),
    15 to listOf<Int>(7)
)



fun getJobsPerAreaSubArea(areaId: Int,subareaId: Int) = subAreaJobs[subareaId]!!.map { job->
    JobItem(
        id = job,
        subAreaId = subareaId,
        areaId = areaId,
        title = jobIds[job]!!,
        image = jobImages[job]!!
    )
}

fun getSpecificJob(areaId: Int, subAreaId: Int, jobId: Int) =
    JobItem(
        id = jobId,
        subAreaId = subAreaId,
        areaId = areaId,
        title = jobIds[jobId]!!,
        image = jobImages[jobId]!!
    )


