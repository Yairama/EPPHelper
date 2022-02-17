package com.minsur.epphelper.ui.navigation


import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.minsur.epphelper.model.workIds

sealed class NavItem (
    val baseRoute: String,
    val navArgs: List<NavArg> = emptyList()
){
    val route = run{
        val argKeys = navArgs.map { "{${it.key}}" }
        listOf(baseRoute)
            .plus(argKeys)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key){type = it.navType}
    }

    object Main: NavItem("main")
    object SubArea: NavItem("subarea", listOf(NavArg.AreaId)){
        fun createNavRoute(areaId: Int) = "$baseRoute/$areaId"
    }
    object Job: NavItem("job", listOf(NavArg.AreaId, NavArg.SubAreaId)){
        fun createNavRoute(areaId:Int, subAreaId: Int) = "$baseRoute/$areaId/$subAreaId"
    }
    object Work: NavItem("work", listOf(NavArg.AreaId, NavArg.SubAreaId, NavArg.JobId)){
        fun createNavRoute(areaId: Int,subAreaId: Int, jobId:Int) = "$baseRoute/$areaId/$subAreaId/$jobId"
    }
    object Required: NavItem("required", listOf(NavArg.AreaId, NavArg.SubAreaId, NavArg.JobId, NavArg.WorkId)){
        fun createNavRoute(areaId: Int,subAreaId: Int, jobId:Int, workId:Int) = "$baseRoute/$areaId/$subAreaId/$jobId/$workId"
    }
}

enum class NavArg(val key: String, val navType: NavType<*>){
    AreaId("areaId", NavType.IntType),
    SubAreaId("subareaId", NavType.IntType),
    JobId("jobId", NavType.IntType),
    WorkId("workId", NavType.IntType)
}