package com.minsur.epphelper.ui.screen.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.minsur.epphelper.R

@Composable
fun MainAppBar(){
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        actions = {
            AppBarAction(imageVector = Icons.Default.Accessibility, onclick = {/*TODO*/})
        }
    )
}

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onclick:()->Unit
) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = imageVector, contentDescription = null)
    }
}