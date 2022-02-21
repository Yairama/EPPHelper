package com.minsur.epphelper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.minsur.epphelper.model.getUser
import com.minsur.epphelper.ui.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Navigation()
        }
    }

}



