package com.minsur.epphelper.model

data class RequiredItem(
    val areaId: Int,
    val subAreaId: Int,
    val jobId: Int,
    val workId: Int,
    val EPPIds: List<Int>,
)

val requiredItems: List<RequiredItem> = listOf(

    //Inspección
    RequiredItem(
        areaId = 0,
        subAreaId = 0,
        jobId = 4,
        workId = 0,
        EPPIds = listOf(2,3,4,5,6,9,10,13,14,15,20,21,22,23,24,26,61,64,66,72,84,85,86,107),
    ),
    //Preparación de lechada de cal
    RequiredItem(
        areaId = 0,
        subAreaId = 0,
        jobId = 4,
        workId = 1,
        EPPIds = listOf(2,4,5,6,9,13,14,15,20,21,22,23,24,26,28,41,43,44,45,48,52,57,65,72,84,85,86,107),
    ),
    //Operación de Chancado y reclamo de mineral
    RequiredItem(
        areaId = 0,
        subAreaId = 1,
        jobId = 4,
        workId = 2,
        EPPIds = listOf(2,3,5,6,10,13,14,15,20,21,22,23,24,26,42,52,53,54,56,57,58,59,64,66,72,74,84,85,86,107),
    ),
    //Limpieza de chancado y reclamo de mineral por mantenimiento o parada intempestiva
    RequiredItem(
        areaId = 0,
        subAreaId = 1,
        jobId = 4,
        workId = 3,
        EPPIds = listOf(2,3,5,6,8,10,13,14,15,20,21,22,23,24,26,28,41,43,45,48,52,53,54,56,57,58,64,66,72,74,84,85,86,95,97,100,101,107)
    ),
    //Armado de sistema de riesgo(celdas)
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 4,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,26,28,42,49,52,57,61,62,64,66,70,72,84,85,86,107)
    ),
    /**TODO: ADD THE EPP IDS IN THE OTHERS REQUIRED ITEMS**/
    //'Monitoreo de flujos
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 5,
        EPPIds = listOf()
    ),
    //'Apilamiento
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 6,
        EPPIds = listOf()
    ),
    //'Tendido de geomenbrana y reparaciones
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 7,
        EPPIds = listOf()
    ),
    //'Empalme de tuberias con soldadura
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 8,
        EPPIds = listOf()
    ),
    //Preparación de solución cianurada
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 9,
        EPPIds = listOf()
    ),
    //Adsorción
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 10,
        EPPIds = listOf()
    ),
    //Desorción
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 11,
        EPPIds = listOf()
    ),
    //Reactivación química
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 12,
        EPPIds = listOf()
    ),
    //Limpieza de tanque Barren
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 13,
        EPPIds = listOf()
    ),
    //Inspección de pozas
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 14,
        EPPIds = listOf()
    ),
    //Lavado, filtrado y retorteo del cemento electrolítico - COSECHA
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 15,
        EPPIds = listOf()
    ),
    //Acondicionamiento y fundición del cemento seco- FUNDICION
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 16,
        EPPIds = listOf()
    ),
    //Almacenaje de barra dore
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 17,
        EPPIds = listOf()
    ),
    //Envío de escoria pobre al PAD
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 18,
        EPPIds = listOf()
    ),
    //Limpieza de Scrubbers
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 19,
        EPPIds = listOf()
    ),
    //Despacho de barra dore
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 7,
        workId = 20,
        EPPIds = listOf()
    ),
    //Levantamiento topografico
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 21,
        EPPIds = listOf()
    ),
    //Replanteo de mallas de perforación
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 22,
        EPPIds = listOf()
    ),
    //Replanteo de poligonos
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 23,
        EPPIds = listOf()
    ),
    //Replanteo de crestas y toes
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 24,
        EPPIds = listOf()
    ),
    //Levantamiento topografico
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 21,
        EPPIds = listOf()
    ),
    //Replanteo de mallas de perforación
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 22,
        EPPIds = listOf()
    ),
    //Replanteo de poligonos
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 23,
        EPPIds = listOf()
    ),
    //Replanteo de crestas y toes
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 24,
        EPPIds = listOf()
    ),
    //Muestreo (blasthole, finos, denisdad, calicatas) ,colecta de muestras para densidad
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 29,
        EPPIds = listOf()
    ),
    //Inserción de muestras de control (frecuencia:diario) Laboratorio SGS
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 30,
        EPPIds = listOf()
    ),
    //Preparación de muestras de control
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 31,
        EPPIds = listOf()
    ),
    //Envío de muestras
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 32,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 5,
        subAreaId = 11,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Manejo de residuos sólidos
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 34,
        EPPIds = listOf()
    ),
    //Manejo de residuos sólidos en Planta: residuos de HCN peligrosos: Polvo, HCN, Hg
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 35,
        EPPIds = listOf()
    ),
    //Monitoreos en Planta
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 36,
        EPPIds = listOf()
    ),
    //Trabajos diversos ambientales (Revegetación, mantenimiento de zonas arqueologicas, mantenimineto de drenaje, cunetas; limpieza desedimentos, elaboración de letreros, colocación de pacas en el sistema de contención)
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 37,
        EPPIds = listOf()
    ),
    //Monitoreos ambientales: calidad de agua,aire, ruido, emisiones, suelo
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 38,
        EPPIds = listOf()
    ),
    //Trabajos de construcción, elaboración compost
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 39,
        EPPIds = listOf()
    ),
    //Trabajos de soldadura menores
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 40,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Despacho de materiales
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 41,
        EPPIds = listOf()
    ),
    //Recepción de materiales
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 42,
        EPPIds = listOf()
    ),
    //Rececepción de combustibles
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 43,
        EPPIds = listOf()
    ),
    //Recepción de MATPEL
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 44,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 10,
        workId = 33,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Operación de cisterna de agua
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 45,
        EPPIds = listOf()
    ),
    //Carpintería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 46,
        EPPIds = listOf()
    ),
    //Soldadura y esmerilado
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 47,
        EPPIds = listOf()
    ),
    //Pintura
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 48,
        EPPIds = listOf()
    ),
    //Gasfitería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 49,
        EPPIds = listOf()
    ),
    //Albañilería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 50,
        EPPIds = listOf()
    ),
    //Instalaciones eléctricas domiciliarias
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 51,
        EPPIds = listOf()
    ),
    //Trabajos en altura
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 52,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Mantenimiento de tableros  de control en salas eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 9,
        workId = 53,
        EPPIds = listOf()
    ),
    //Mantenimiento y calibración de instrumentos Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 9,
        workId = 54,
        EPPIds = listOf()
    ),
    //Mantenimiento de motores eléctricos en Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 55,
        EPPIds = listOf()
    ),
    //Mantenimiento de tableros eléctricos Planta (chancado ADR)
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 56,
        EPPIds = listOf()
    ),
    //Mantenimiento de tableros eléctricos en salas eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 57,
        EPPIds = listOf()
    ),
    //Inspección de líneas de alta tensión
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 58,
        EPPIds = listOf()
    ),
    //Mantenimiento transformadores y subestaciones eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 59,
        EPPIds = listOf()
    ),
    //Aislamiento y bloqueo de líneas de alta tensión ( 4.16kv, 13kV,30KV)
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 60,
        EPPIds = listOf()
    ),
    //Mediciones de pozas a tierra
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 61,
        EPPIds = listOf()
    ),
    //Trabajos en campo,inspecciones
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 7,
        workId = 62,
        EPPIds = listOf()
    ),
    //Trabajos en campo,inspecciones Planta
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 7,
        workId = 63,
        EPPIds = listOf()
    ),
    //Mantenimiento de bombas
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 64,
        EPPIds = listOf()
    ),
    //Mantenimiento a fajas transportadoras
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 65,
        EPPIds = listOf()
    ),
    //Instalación de tuberías
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 66,
        EPPIds = listOf()
    ),
    //Lubricación de equipos
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 67,
        EPPIds = listOf()
    ),
    //Reparación de bombas
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 68,
        EPPIds = listOf()
    ),
    //Trabajos en altura
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 52,
        EPPIds = listOf()
    ),
    //Pruebas y evaluación de equipo (arranque)
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 69,
        EPPIds = listOf()
    ),
    //Cambio de aceite
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 70,
        EPPIds = listOf()
    ),
    //Cambio de fajas de ventilador
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 71,
        EPPIds = listOf()
    ),
    //Cambio de puntas de cucharón de cargador
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 72,
        EPPIds = listOf()
    ),
    //Lavado de componentes (solventes)
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 73,
        EPPIds = listOf()
    ),
    //Lavado de equipos
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 74,
        EPPIds = listOf()
    ),
    //Cambio de tolva de motor
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 75,
        EPPIds = listOf()
    ),
    //Cambio de manguera hidraúlica
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 76,
        EPPIds = listOf()
    ),
    //Soldadura TruckShop
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 6,
        workId = 77,
        EPPIds = listOf()
    ),
    //Soldadura Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 6,
        workId = 78,
        EPPIds = listOf()
    ),
    //Inspección Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 7,
        workId = 79,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
    //Inspección Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 10,
        jobId = 14,
        workId = 79,
        EPPIds = listOf()
    ),
    //Inspección Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 10,
        jobId = 14,
        workId = 80,
        EPPIds = listOf()
    ),
    //Operador de camión Cisterna de combustible
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 81,
        EPPIds = listOf()
    ),
    //Operador de camión Cisterna de agua
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 82,
        EPPIds = listOf()
    ),
    //Operador Tractor oruga
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 83,
        EPPIds = listOf()
    ),
    //Operador  de perforadora
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 84,
        EPPIds = listOf()
    ),
    //Operador excavadora
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 85,
        EPPIds = listOf()
    ),
    //Operador de rodillo
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 86,
        EPPIds = listOf()
    ),
    //Operador Cargador Frontal
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 87,
        EPPIds = listOf()
    ),
    //Operador de Tractor neumatico
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 88,
        EPPIds = listOf()
    ),
    //Operador de camión
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 89,
        EPPIds = listOf()
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 7,
        workId = 33,
        EPPIds = listOf()
    ),
)
