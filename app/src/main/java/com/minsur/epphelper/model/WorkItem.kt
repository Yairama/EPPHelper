package com.minsur.epphelper.model

import androidx.compose.ui.platform.LocalContext
import com.minsur.epphelper.R

data class WorkItem(
    val id: Int,
    val jobId: Int,
    val subAreaId: Int,
    val areaId: Int,
    val title: String,
    val image: Int,
)

val workIds: Map<Int,String> = mapOf(
    0 to "INSPECCION",
    1 to "PREPARACION DE LECHADA DE CAL",
    2 to "OPERACION DE CHANCADO Y RECLAMO DE MINERAL",
    3 to "LIMPIEZA DE CHANCADO Y RECLAMO DE MINERAL POR MANTENIMIENTO O PARADA INTEMPESTIVA",
    4 to "ARMADO DE SISTEMAS DE RIESGO (CELDAS)",
    5 to "MONITOREO DE FLUJOS",
    6 to "APILAMIENTO",
    7 to "TENDIDO DE GEOMEMBRANA Y REPARACIONES",
    8 to "EMPALME DE TUBERIAS CON SOLDADURA",
    9 to "PREPARACION DE SOLUCION CIANURADA",
    10 to "ADSORCION",
    11 to "DESORCION",
    12 to "REACTIVACION QUIMICA",
    13 to "LIMPIEZA DE TANQUE BARREN",
    14 to "INSPECCION DE POZAS",
    15 to "LAVADO, FILTRADO Y RETORTEO DEL CEMENTO ELECTROLITICO - COSECHA",
    16 to "ACONDICIONAMIENTO Y FUNDICION DEL CEMENTO SECO - FUNDICION",
    17 to "ALMACENAMIENTO DE BARRA DORE",
    18 to "ENVIO DE ESCORIA POBRE AL PAD",
    19 to "LIMPIEZA DE SCRUBBERS",
    20 to "DESPACHO DE BARRA DORE",
    21 to "LEVANTAMIENTO TOPOGRAFICO",
    22 to "REPLANTEO DE MALLAS DE PERFORACION",
    23 to "REPLANTEO DE POLIGONOS",
    24 to "REPLANTEO DE CRESTAS Y TOES",
    25 to "LEVANTAMIENTO TOPOGRAFICO",
    26 to "REPLANTEO DE MALLAS DE PERFORACION",
    27 to "REPLANTEO DE POLIGONOS",
    28 to "REPLANTEO DE CRESTAS Y TOES",
    29 to "MUESTREO (BLASTHOLE, FINOS, DENSIDAD, CALICATAS), COLECTA DE MUESTRAS PARA DENSIDAD",
    30 to "INSERCIÓN DE MUESTRAS DE CONTROL (FRECUENCIA: DIARIO) LABORATORIO SGS",
    31 to "PREPARACION DE MUESTRAS DE CONTROL",
    32 to "ENVIO DE MUESTRAS",
    33 to "TRABAJOS DE CAMPO",
    34 to "MANEJO DE RESIDUOS SOLIDOS",
    35 to "MANEJO DE RESIDUOS SOLIDOS EN PLANTA: RESIDUOS DE HCN PELIGROSOS: POLVO, HCN, HG",
    36 to "MONITOREOS EN PLANTA",
    37 to "TRABAJOS DIVERSOS AMBIENTALES (REVEGETACIÓN, MANTENIMIENTO DE ZONAS ARQUEOLÓGICAS)",
    38 to "MONITOREOS AMBIENTALES: CALIDAD DE AGUA, AIRE, RUIDO, EMISIONES, SUELO",
    39 to "TRABAJOS DE CONSTRUCCIÓN, ELABORACION COMPOST",
    40 to "TRABAJOS DE SOLDADURA MENORES",
    41 to "DESPACHO DE MATERIALES",
    42 to "RECEPCION DE MATERIALES",
    43 to "RECEPCION DE COMBUSTIBLE",
    44 to "RECEPCION DE MATPEL",
    45 to "OPERACION DE CISTERNA DE AGUA",
    46 to "CARPINTERIA",
    47 to "SOLDADURA Y ESMERILADO",
    48 to "PINTURA",
    49 to "GASFITERIA",
    50 to "ALBAÑERIA",
    51 to "INSTALACIONES ELECTRICAS DOMICILIARIAS",
    52 to "TRABAJOS EN ALTURA",
    53 to "MANTENIMIENTO DE TABLEROS DE CONTROL EN SALAS ELECTRICAS",
    54 to "MANTENIMIENTO Y CALIBRACION DE INSTRUMENTOS PLANTA ADR",
    55 to "MANTENIMIENTO DE MOTORES ELECTRICOS EN PLANTA ADR",
    56 to "MANTENIMIENTO DE TABLEROS ELECTRICOS PLANTA (CHANCADO ADR)",
    57 to "MANTENIMIENTO DE TABLEROS ELECTRICOS EN SALAS ELECTRICAS",
    58 to "INSPECCION DE LINEAS DE ALTA TENSION",
    59 to "MANTENIMIENTO TRANSFORMADORES Y SUBESTACIONES ELECTRICAS",
    60 to "AISLAMIENTO Y BLOQUEO DE LINEAS DE ALTA TENSION",
    61 to "MEDICIONES DE POZAS A TIERRA",
    62 to "TRABAJO EN CAMPO, INSPECCIONES",
    63 to "TRABAJOS EN CAMPO, INSPECCIONES PLANTA",
    64 to "TRABAJO EN CAMPO, INSPECCIONES",
    65 to "TRABAJOS EN CAMPO, INSPECCIONES PLANTA",
    66 to "MANTENIMIENTO DE BOMBAS",
    67 to "MANTENIMIENTO DE FAJAS TRANSFORMADORAS",
    68 to "INSTALACION DE TUBERIAS",
    69 to "LUBRICACION DE EQUIPOS",
    70 to "REPARACION DE BOMBAS",
    71 to "TRABAJOS EN ALTURA",
    72 to "PRUEBAS Y EVALUACION DE EQUIPO (ARRANQUE)",
    73 to "CAMBIOS DE ACEITE",
    74 to "CAMBIOS DE FAJAS DE VENTILADOR",
    75 to "CAMBIO DE PUNTAS DE CUCHARON DE CARGADOR",
    76 to "LAVADO DE COMPONENTES (SOLVENTES)",
    77 to "LAVADO DE EQUIPOS",
    78 to "CAMBIOS DE TOLVA DE MOTOR",
    79 to "CAMBIO DE MANGUERA HIDRAULICA",
    80 to "SOLDADURA TRUCKSHOP",
    81 to "SOLDADURA PLANTA ADR",
    82 to "INSPECCION PLANTA ADR",
    83 to "INSPECCION CHANCADO",
    84 to "OPERADOR DE CAMION CISTERNA DE COMBUSTIBLE",
    85 to "OPERADOR DE CAMION CISTERNA DE AGUA",
    86 to "OPERADOR DE TRACTOR ORUGA",
    87 to "OPERADOR DE PERFORADORA",
    88 to "OPERADOR DE EXCAVADORA",
    89 to "OPERADOR DE RODILLO",
    90 to "OPERADOR DE CARGADOR FRONTAL",
    91 to "OPERADOR DE TRACTOR NEUMATICO",
    92 to "OPERADOR DE CAMION"
)

val subAreaJobWork: Map<Int, Map<Int, List<Int>>> = mapOf(
    0 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(0, 1)
    ),
    1 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(2, 3)
    ),
    2 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(4, 5, 6, 7, 8)
    ),
    3 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(9,10,11,12,13,14)
    ),
    4 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(15, 16, 17, 18, 19),
        7 to listOf<Int>(20)
    ),
    14 to mapOf<Int, List<Int>>(
        3 to listOf<Int>(21, 22, 23, 24),
        15 to listOf<Int>(25, 26, 27, 28)
    ),
    12 to mapOf<Int, List<Int>>(
        13 to listOf<Int>(29, 30, 31, 32),
        7 to listOf<Int>(33)
    ),
    15 to mapOf<Int, List<Int>>(
        7 to listOf<Int>(33)
    ),
    11 to mapOf<Int, List<Int>>(
        7 to listOf<Int>(33)
    ),
    6 to mapOf<Int, List<Int>>(
        7 to listOf<Int>(33),
        2 to listOf<Int>(34, 35, 36, 37, 38, 39, 40)
    ),
    13 to mapOf<Int, List<Int>>(
        0 to listOf<Int>(41, 42, 43, 44),
        10 to listOf<Int>(33),
        7 to listOf<Int>(33)
    ),
    7 to mapOf<Int, List<Int>>(
        1 to listOf<Int>(45, 46, 47, 48, 49, 50, 51, 52),
        7 to listOf<Int>(33)
    ),
    8 to mapOf<Int, List<Int>>(
        9 to listOf<Int>(53, 54),
        8 to listOf<Int>(55, 56, 57),
        5 to listOf<Int>(58, 59, 60, 61),
        7 to listOf<Int>(64, 65)
    ),
    9 to mapOf<Int, List<Int>>(
        11 to listOf<Int>(66, 67, 68, 69, 70, 71),
        12 to listOf<Int>(72, 73, 74, 75, 76, 77, 78, 79),
        6 to listOf<Int>(80, 81),
        7 to listOf<Int>(82, 33)
    ),
    10 to mapOf<Int, List<Int>>(
        14 to listOf<Int>(82, 83)
    ),
    5 to mapOf<Int, List<Int>>(
        4 to listOf<Int>(84, 85, 86, 87, 88, 89, 90, 91, 92,),
        7 to listOf<Int>(33)
    )
)


fun getWorksPerAreaSubAreaJob( areaId: Int, subAreaId: Int, jobId: Int) = subAreaJobWork[subAreaId]!![jobId]!!.map{ work ->
    WorkItem(
        id = work,
        jobId = jobId,
        subAreaId = subAreaId,
        areaId = areaId,
        title = workIds[work]!!,
        image = R.drawable.napoleon
    )
}