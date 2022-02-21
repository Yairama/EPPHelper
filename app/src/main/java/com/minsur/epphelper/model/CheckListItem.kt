package com.minsur.epphelper.model

data class CheckListItem(
    val userId: Int,
    val areaId: Int,
    val subAreaId: Int,
    val jobId: Int,
    val workId: Int,
    val EPPIds: List<Int>,
    val hasEPP: List<Boolean>

)