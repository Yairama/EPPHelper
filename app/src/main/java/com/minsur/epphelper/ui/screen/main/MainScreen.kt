package com.minsur.epphelper.ui.screen.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.minsur.epphelper.model.AreaItem
import com.minsur.epphelper.ui.EppApp

@Composable
fun MainScreen(onAreaClick: (AreaItem) -> Unit) {
    EppApp {
        Scaffold(topBar = { MainAppBar() }) { padding ->
            AreaList(
                onAreaClick = onAreaClick,
                modifier = Modifier.padding(padding)
            )
        }
    }

}