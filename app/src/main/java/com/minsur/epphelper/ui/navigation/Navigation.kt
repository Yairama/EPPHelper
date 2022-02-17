package com.minsur.epphelper.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.minsur.epphelper.model.areaIds
import com.minsur.epphelper.ui.screen.job.JobScreen
import com.minsur.epphelper.ui.screen.main.MainScreen
import com.minsur.epphelper.ui.screen.required.RequiredScreen
import com.minsur.epphelper.ui.screen.subarea.SubAreaScreen
import com.minsur.epphelper.ui.screen.work.WorkScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavItem.Main.route
    ) {
        composable(NavItem.Main) {
//            MainScreen{ areaItem ->
//                navController.navigate(NavItem.SubArea.createNavRoute(areaItem.id))
//            }
            MainScreen(onAreaClick = { areaItem -> navController.navigate(NavItem.SubArea.createNavRoute(areaItem.id))})
        }
        composable(NavItem.SubArea) { backStackEntry ->
            SubAreaScreen(
                areaId = backStackEntry.findArg(NavArg.AreaId),
                onSubAreaClick = {areaItem,subAreaItem ->
                    navController.navigate(NavItem.Job.createNavRoute(
                    areaId = areaItem.id,
                    subAreaId = subAreaItem.id
                ))},
                onUpClick = {navController.popBackStack()},
            )
        }

        composable(NavItem.Job) { backStackEntry ->
            JobScreen(
                areaId = backStackEntry.findArg(NavArg.AreaId),
                subAreaId = backStackEntry.findArg(NavArg.SubAreaId),
                onUpClick = {navController.popBackStack()},
                onJobClick = { areaItem, subAreaItem, jobItem ->
                    navController.navigate(NavItem.Work.createNavRoute(
                        areaId = areaItem.id ,
                        subAreaId = subAreaItem.id,
                        jobId = jobItem.id))
                }
            )
        }

        composable(NavItem.Work){ backStackEntry ->

            WorkScreen(
                areaId = backStackEntry.findArg(NavArg.AreaId),
                subAreaId = backStackEntry.findArg(NavArg.SubAreaId),
                jobId = backStackEntry.findArg(NavArg.JobId),
                onUpClick = {navController.popBackStack()},
                onWorkClick = { areaItem, subAreaItem, jobItem, workItem ->
                    navController.navigate(NavItem.Required.createNavRoute(
                        areaId = areaItem.id ,
                        subAreaId = subAreaItem.id,
                        jobId = jobItem.id,
                        workId = workItem.id)
                    )
                }
            )

        }

        composable(NavItem.Required){ backStackEntry ->
            RequiredScreen(
                areaId = backStackEntry.findArg(NavArg.AreaId),
                subAreaId = backStackEntry.findArg(NavArg.SubAreaId),
                jobId = backStackEntry.findArg(NavArg.JobId),
                workId = backStackEntry.findArg(NavArg.WorkId),
                onUpClick = {navController.popBackStack()}
            )
        }

    }
}

private fun NavGraphBuilder.composable(
    navItem: NavItem,
    content: @Composable (NavBackStackEntry) -> Unit
){
    composable(
        route = navItem.route,
        arguments = navItem.args
    ){
        content(it)
    }
}

private inline fun <reified T> NavBackStackEntry.findArg(arg: NavArg): T {
    val value = arguments?.get(arg.key)
    requireNotNull(value)
    return value as T
}