package com.minsur.epphelper.ui.screen.subarea

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.minsur.epphelper.model.*
import com.minsur.epphelper.ui.navigation.NavItem
import com.minsur.epphelper.ui.shared.ArrowBackIcon
import com.minsur.epphelper.ui.shared.AreaImageThumb


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SubAreaScreen(areaId: Int, onSubAreaClick:(AreaItem,SubAreaItem) -> Unit, onUpClick:()->Unit){

    val areaItem = remember { getSpecificArea(areaId = areaId) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = areaItem.title)},
                navigationIcon = { ArrowBackIcon(onUpClick) }
                )
        }
    
    ) { padding->

        Column(
            modifier = Modifier.padding(vertical = dimensionResource(id= com.minsur.epphelper.R.dimen.padding_xsmall))
        ) {
            AreaImageThumb(areaItem = areaItem, Modifier.padding(padding))
            LazyColumn(){
                items(getSubAreasPerArea(areaItem.id)) { subAreaItem->
                    Card(
                        modifier = Modifier.clickable(onClick = {onSubAreaClick( areaItem, subAreaItem)}),
                        elevation = 0.dp,
                        border = BorderStroke(1.dp, Color.LightGray)
                    ) {
                        Text(
                            text = subAreaItem.title,
                            modifier = Modifier
                                .padding(dimensionResource(id= com.minsur.epphelper.R.dimen.padding_medium)),
                            style = MaterialTheme.typography.subtitle1,
                        )
                    }
                }
            }
        }

    }
}


