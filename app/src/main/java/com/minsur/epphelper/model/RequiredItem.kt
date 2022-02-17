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
        EPPIds = listOf(2,3,4,5,6,8,13,14,15,20,21,22,23,24,26,42,49,52,55,57,58,61,64,66,70,72,84,85,86,107)
    ),
    //'Apilamiento
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 6,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,24,26,42,49,52,57,61,66,72,84,85,86,107)
    ),
    //'Tendido de geomenbrana y reparaciones
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 7,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,26,28,42,49,52,57,61,62,64,66,72,74,84,85,86,107)
    ),
    //'Empalme de tuberias con soldadura
    RequiredItem(
        areaId = 0,
        subAreaId = 2,
        jobId = 4,
        workId = 8,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,26,42,49,52,61,62,63,64,66,72,74,84,85,86,107)
    ),
    //Preparación de solución cianurada
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 9,
        EPPIds = listOf(2,5,8,10,14,15,20,21,22,23,26,28,41,43,44,45,46,48,53,54,55,56,57,58,60,61,64,65,72,95,97,101,107)
    ),
    //Adsorción
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 10,
        EPPIds = listOf(2,5,6,8,9,10,14,15,20,21,22,23,26,28,41,43,44,45,46,48,53,54,55,58,60,61,62,64,65,66,71,72,73,107)
    ),
    //Desorción
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 11,
        EPPIds = listOf(2,5,6,9,10,14,15,20,21,22,23,26,28,41,43,44,45,46,48,53,54,55,58,60,61,64,65,71,72,73,107)
    ),
    //Reactivación química
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 12,
        EPPIds = listOf(2,5,6,9,10,14,15,20,21,22,23,26,28,41,43,44,45,46,48,53,54,55,58,60,61,64,65,72,107)
    ),
    //Limpieza de tanque Barren
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 13,
        EPPIds = listOf(2,5,8,10,14,15,20,21,22,23,26,28,29,30,41,43,44,45,48,53,54,55,58,60,61,62,64,66,72,84,85,86,95,97,101,107)
    ),
    //Inspección de pozas
    RequiredItem(
        areaId = 0,
        subAreaId = 3,
        jobId = 4,
        workId = 14,
        EPPIds = listOf(2,5,10,14,15,20,21,22,23,24,26,28,42,49,53,54,55,58,64,66,72,74,84,85,86,95,97,101,107)
    ),
    //Lavado, filtrado y retorteo del cemento electrolítico - COSECHA
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 15,
        EPPIds = listOf(2,4,5,8,10,13,14,15,22,23,26,29,30,38,41,43,45,48,53,54,55,60,62,64,65,72)
    ),
    //Acondicionamiento y fundición del cemento seco- FUNDICION
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 16,
        EPPIds = listOf(2,4,5,6,10,13,14,15,22,23,26,34,35,36,37,41,43,45,48,53,54,56,57,58,61,62,64,65,72,83)
    ),
    //Almacenaje de barra dore
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 17,
        EPPIds = listOf(2,4,5,6,10,13,14,15,22,23,26,28,41,43,45,48,53,54,62,72)
    ),
    //Envío de escoria pobre al PAD
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 18,
        EPPIds = listOf(2,4,5,6,10,13,14,15,22,23,26,28,41,43,45,48,53,54,56,57,58,61,72,74,)
    ),
    //Limpieza de Scrubbers
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 4,
        workId = 19,
        EPPIds = listOf(2,4,5,6,8,10,13,14,15,20,22,23,26,28,41,43,45,48,53,54,55,60,64,65,71,72,73,95,97,101,107)
    ),
    //Despacho de barra dore
    RequiredItem(
        areaId = 0,
        subAreaId = 4,
        jobId = 7,
        workId = 20,
        EPPIds = listOf(2,4,5,6,10,13,14,15,24,26,28,42,49,53,54,62,64,72,84,85,86,)
    ),
    //Levantamiento topografico
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 21,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de mallas de perforación
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 22,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de poligonos
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 23,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de crestas y toes
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 3,
        workId = 24,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Levantamiento topografico
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 21,
        EPPIds = listOf(1,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de mallas de perforación
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 22,
        EPPIds = listOf(1,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de poligonos
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 23,
        EPPIds = listOf(1,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Replanteo de crestas y toes
    RequiredItem(
        areaId = 8,
        subAreaId = 14,
        jobId = 15,
        workId = 24,
        EPPIds = listOf(1,3,5,6,8,10,14,15,20,21,22,24,25,26,28,42,52,55,58,66,72,73,85,86,107)
    ),
    //Muestreo (blasthole, finos, denisdad, calicatas) ,colecta de muestras para densidad
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 29,
        EPPIds = listOf(2,3,5,6,8,10,13,14,15,20,21,22,24,25,26,28,42,52,57,61,62,66,72,74,84,85,86,87,107)
    ),
    //Inserción de muestras de control (frecuencia:diario) Laboratorio SGS
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 30,
        EPPIds = listOf(2,3,5,6,8,10,13,14,15,20,21,)
    ),
    //Preparación de muestras de control
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 31,
        EPPIds = listOf(2,3,5,6,22,26,28,42,52,57,63,64,66,72,75,76,77,78,81,82,84,85,86,87,107)
    ),
    //Envío de muestras
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 13,
        workId = 32,
        EPPIds = listOf(2,3,5,6,22,26,28,42,52,57,61,62,66,72,74,84,85,86,87,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 6,
        subAreaId = 12,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,3,5,6,10,13,14,25,26,28,42,52,57,62,72,85,86,87,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 5,
        subAreaId = 11,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,24,26,41,42,44,52,55,56,58,61,62,64,72,84,86,107)
    ),
    //Manejo de residuos sólidos
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 34,
        EPPIds = listOf(2,3,5,6,10,14,15,20,21,22,23,24,26,28,42,52,69,72,76,85,107)
    ),
    //Manejo de residuos sólidos en Planta: residuos de HCN peligrosos: Polvo, HCN, Hg
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 35,
        EPPIds = listOf(2,5,6,10,14,15,20,21,22,23,24,26,28,41,56,65,72,76,85,107)
    ),
    //Monitoreos en Planta
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 36,
        EPPIds = listOf(2,5,6,10,14,15,20,21,22,23,24,26,28,42,53,54,72,76,85,107)
    ),
    //Trabajos diversos ambientales (Revegetación, mantenimiento de zonas arqueologicas, mantenimineto de drenaje, cunetas; limpieza desedimentos, elaboración de letreros, colocación de pacas en el sistema de contención)
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 37,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,23,24,26,28,42,52,72,76,85,107)
    ),
    //Monitoreos ambientales: calidad de agua,aire, ruido, emisiones, suelo
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 38,
        EPPIds = listOf(2,3,5,6,10,14,15,20,21,22,23,24,26,59,64,72,81,82,95,97,107)
    ),
    //Trabajos de construcción, elaboración compost
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 39,
        EPPIds = listOf(2,3,5,8,10,14,15,20,21,22,23,24,26,28,42,52,55,68,69,72,76,85,107)
    ),
    //Trabajos de soldadura menores
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 2,
        workId = 40,
        EPPIds = listOf(2,5,10,14,15,20,21,22,23,24,256,31,32,33,42,52,72,77,85,89,92,93,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 2,
        subAreaId = 6,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,14,16,24,26,42,52,53,54,58,62,72,85,107)
    ),
    //Despacho de materiales
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 41,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,24,26,42,52,57,58,61,72,74,85,107)
    ),
    //Recepción de materiales
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 42,
        EPPIds = listOf(2,3,4,5,6,10,13,14,15,20,21,22,23,24,26,28,42,52,57,58,61,72,74,85,95,97,100,107)
    ),
    //Rececepción de combustibles
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 43,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,24,26,42,52,55,57,58,72,87,95,97,100,107)
    ),
    //Recepción de MATPEL
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 0,
        workId = 44,
        EPPIds = listOf(2,3,4,5,6,13,14,15,20,21,22,23,24,26,28,41,42,44,52,53,54,55,58,72,74,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 10,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,16,24,26,52,53,54,58,62,72,85,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 7,
        subAreaId = 13,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,16,24,26,52,53,54,58,62,72,85,107)
    ),
    //Operación de cisterna de agua
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 45,
        EPPIds = listOf(2,5,6,10,13,14,15,23,24,26,28,42,52,56,72,74,85,95,97,101,107)
    ),
    //Carpintería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 46,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,28,42,52,55,58,61,72,74,85,107)
    ),
    //Soldadura y esmerilado
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 47,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,31,32,33,42,52,55,58,61,72,74,75,85,89,92,93,107)
    ),
    //Pintura
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 48,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,28,42,52,55,58,61,64,72,74,85,107)
    ),
    //Gasfitería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 49,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,28,42,52,55,58,61,64,72,74,85,107)
    ),
    //Albañilería
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 50,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,28,42,52,55,58,61,72,74,85,107)
    ),
    //Instalaciones eléctricas domiciliarias
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 51,
        EPPIds = listOf(2,5,7,10,13,14,15,22,23,24,26,61,72,74,85,107)
    ),
    //Trabajos en altura
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 1,
        workId = 52,
        EPPIds = listOf(2,5,6,10,13,14,15,22,23,24,26,61,72,74,85,95,97,100,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 3,
        subAreaId = 7,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,16,24,26,42,52,53,54,58,62,72,85,107)
    ),
    //Mantenimiento de tableros  de control en salas eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 9,
        workId = 53,
        EPPIds = listOf(2,5,7,11,14,15,17,18,19,20,21,22,23,24,26,42,49,52,61,72,73,78,84,85,86,101,107)
    ),
    //Mantenimiento y calibración de instrumentos Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 9,
        workId = 54,
        EPPIds = listOf(2,5,7,11,14,15,17,18,19,20,21,22,23,24,26,27,28,41,43,48,53,54,55,58,61,64,66,72,73,95,97,100,107)
    ),
    //Mantenimiento de motores eléctricos en Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 55,
        EPPIds = listOf(2,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,41,43,48,52,53,54,55,58,61,64,66,78,84,85,86,87,95,97,100,107)
    ),
    //Mantenimiento de tableros eléctricos Planta (chancado ADR)
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 56,
        EPPIds = listOf(2,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,41,42,43,48,52,53,54,55,58,61,66,78,84,85,86,87,)
    ),
    //Mantenimiento de tableros eléctricos en salas eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 8,
        workId = 57,
        EPPIds = listOf(2,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,42,43,45,48,52,81,78,82,84,85,86,87,)
    ),
    //Inspección de líneas de alta tensión
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 58,
        EPPIds = listOf(2,3,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,66,72,73,74,84,85,86,87,98,107)
    ),
    //Mantenimiento transformadores y subestaciones eléctricas
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 59,
        EPPIds = listOf(2,3,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,42,49,52,66,72,73,74,81,82,84,85,86,87,98,107)
    ),
    //Aislamiento y bloqueo de líneas de alta tensión ( 4.16kv, 13kV,30KV)
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 60,
        EPPIds = listOf(2,3,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,66,72,73,74,78,81,82,84,85,86,87,90,102,103,104,105,106,107)
    ),
    //Mediciones de pozas a tierra
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 5,
        workId = 61,
        EPPIds = listOf(2,3,5,7,11,13,14,15,17,18,19,20,21,22,23,24,26,27,28,66,72,73,74,84,85,86,87,101,107)
    ),
    //Trabajos en campo,inspecciones
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 7,
        workId = 62,
        EPPIds = listOf(1,5,7,11,14,16,17,18,19,24,26,42,52,58,61,85,86,107)
    ),
    //Trabajos en campo,inspecciones Planta
    RequiredItem(
        areaId = 4,
        subAreaId = 8,
        jobId = 7,
        workId = 63,
        EPPIds = listOf(1,5,7,11,14,16,17,18,19,24,26,28,41,42,53,54,55,58,61,64,85,86,107)
    ),
    //Mantenimiento de bombas
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 64,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,41,43,44,45,46,47,48,53,54,55,58,61,66,70,74,85,86,107)
    ),
    //Mantenimiento a fajas transportadoras
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 65,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,42,49,52,74,84,85,86,87,107)
    ),
    //Instalación de tuberías
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 66,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,41,43,44,45,46,47,48,53,54,55,58,61,70,85,86,107)
    ),
    //Lubricación de equipos
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 67,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,41,43,44,45,46,47,48,53,54,55,58,64,66,85,86,107)
    ),
    //Reparación de bombas
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 68,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,41,43,44,45,46,47,48,53,54,55,58,64,66,74,85,86,107)
    ),
    //Trabajos en altura
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 11,
        workId = 52,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,28,41,43,44,45,46,47,48,53,54,55,58,64,66,74,85,95,97,100,107)
    ),
    //Pruebas y evaluación de equipo (arranque)
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 69,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,61,85,86,87,)
    ),
    //Cambio de aceite
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 70,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,61,64,67,68,69,70,85,86,87)
    ),
    //Cambio de fajas de ventilador
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 71,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,61,70,85,86,87,)
    ),
    //Cambio de puntas de cucharón de cargador
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 72,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,30,42,49,52,70,74,85,86,87,89,107)
    ),
    //Lavado de componentes (solventes)
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 73,
        EPPIds = listOf(2,5,8,10,13,14,15,20,21,22,23,24,26,28,42,49,52,65,70,85,86,87)
    ),
    //Lavado de equipos
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 74,
        EPPIds = listOf(2,5,8,10,13,14,15,20,21,22,23,24,26,28,65,70,85,86,87)
    ),
    //Cambio de tolva de motor
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 75,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,61,64,70,74,85,86,87,95,97,100,107)
    ),
    //Cambio de manguera hidraúlica
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 12,
        workId = 76,
        EPPIds = listOf(2,5,7,10,13,14,15,20,21,22,23,24,26,28,64,67,68,69,70,85,86,87)
    ),
    //Soldadura TruckShop
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 6,
        workId = 77,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,31,32,33,39,42,49,52,70,75,85,89,91,92,93)
    ),
    //Soldadura Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 6,
        workId = 78,
        EPPIds = listOf(2,5,6,10,13,14,15,20,21,22,23,24,26,31,32,33,39,40,42,49,51,52,53,54,55,56,57,58,70,74,75,85,89,91,92,93,94,95,97,100,107,)
    ),
    //Inspección Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 7,
        workId = 79,
        EPPIds = listOf(1,5,6,10,13,14,22,23,24,26,28,41,43,44,45,48,53,54,55,61,64,73,85,86,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 4,
        subAreaId = 9,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,16,22,23,24,26,42,49,52,58,61,73,85,86,107)
    ),
    //Inspección Planta ADR
    RequiredItem(
        areaId = 4,
        subAreaId = 10,
        jobId = 14,
        workId = 79,
        EPPIds = listOf(2,5,7,11,13,14,15,20,21,22,23,24,26,28,41,43,44,45,48,53,54,55,61,62,64,85,86,107)
    ),
    //Inspección Chancado
    RequiredItem(
        areaId = 4,
        subAreaId = 10,
        jobId = 14,
        workId = 80,
        EPPIds = listOf(2,5,7,11,13,14,15,20,21,22,23,24,26,28,42,49,52,58,61,62,85,86,107)
    ),
    //Operador de camión Cisterna de combustible
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 81,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,23,24,26,28,42,49,52,71,72,73,84,85,107)
    ),
    //Operador de camión Cisterna de agua
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 82,
        EPPIds = listOf(2,3,5,6,8,10,14,15,20,21,22,24,26,28,42,49,52,66,73,84,85,107)
    ),
    //Operador Tractor oruga
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 83,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,22,23,24,26,42,49,52,62,73,74,84,85,107)
    ),
    //Operador  de perforadora
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 84,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,22,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Operador excavadora
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 85,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,22,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Operador de rodillo
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 86,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Operador Cargador Frontal
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 87,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Operador de Tractor neumatico
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 88,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,22,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Operador de camión
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 4,
        workId = 89,
        EPPIds = listOf(2,5,6,12,13,14,15,20,21,22,23,24,26,42,49,52,73,74,84,85,107)
    ),
    //Trabajos de campo
    RequiredItem(
        areaId = 1,
        subAreaId = 5,
        jobId = 7,
        workId = 33,
        EPPIds = listOf(1,5,6,10,13,14,16,24,42,49,52,62,73,84,85,107)
    ),
)


fun getEppList(areaId: Int, subAreaId: Int, jobId: Int, workId: Int) =
    requiredItems.first { it ->
        it.areaId == areaId && it.subAreaId == subAreaId && it.jobId == jobId && it.workId == workId
    }.EPPIds