package com.minsur.epphelper.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.minsur.epphelper.ui.theme.EPPHelperTheme

@Composable
public fun EppApp(content: @Composable () -> Unit) {
    EPPHelperTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}