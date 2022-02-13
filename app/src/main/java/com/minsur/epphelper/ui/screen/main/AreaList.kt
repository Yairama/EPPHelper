package com.minsur.epphelper.ui.screen.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.minsur.epphelper.R
import com.minsur.epphelper.model.AreaItem
import com.minsur.epphelper.model.getAreas
import com.minsur.epphelper.ui.shared.AreaImageThumb


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AreaList(onAreaClick:(AreaItem) -> Unit,modifier: Modifier = Modifier){
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
        cells = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
        modifier = modifier
    ){
        items(getAreas()){ areaItem->
            AreaListItem(
                areaItem= areaItem,
                onClick = {onAreaClick(areaItem)},
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)))
        }
    }
}

//@Preview
@Composable
fun AreaListItem(areaItem: AreaItem,onClick: () -> Unit, modifier: Modifier){

    Card(
        modifier = modifier.clickable(onClick = onClick),
        elevation = 0.dp,
        border = BorderStroke(1.dp, Color.LightGray),
        //shape = RoundedCornerShape(8.dp)
    ) {
        Column{

            AreaImageThumb(areaItem)
            AreaTitle(areaItem)
        }
    }

}

@Composable
private fun AreaTitle(areaItem: AreaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.secondary)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = areaItem.title,
            style = MaterialTheme.typography.h5,
            fontSize = 4.em
        )
    }
}


