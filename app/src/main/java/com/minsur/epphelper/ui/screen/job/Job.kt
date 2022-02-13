package com.minsur.epphelper.ui.screen.job

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.minsur.epphelper.R
import com.minsur.epphelper.model.*
import com.minsur.epphelper.ui.shared.AreaImageThumb
import com.minsur.epphelper.ui.shared.ArrowBackIcon
import com.minsur.epphelper.ui.shared.JobImageThumb

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun JobScreen(areaId: Int,subAreaId: Int, onUpClick: ()->Unit,onJobClick:(AreaItem, SubAreaItem, JobItem) -> Unit, modifier: Modifier=Modifier){
    val subAreaItem : SubAreaItem = remember {
        getSpecificSubArea(
            areaId = areaId,
            subAreaId = subAreaId)
    }
    val areaItem : AreaItem = remember {
        getSpecificArea(areaId = areaId)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = subAreaItem.title)
                },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        }

    ) {
        LazyVerticalGrid(
            contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
            cells = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
            modifier = modifier
        ) {
            items(getJobsPerAreaSubArea(areaId, subAreaId)) { jobItem ->
                JobListItem(
                    item = jobItem,
                    onClick = { onJobClick(areaItem,subAreaItem,jobItem) },
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium))
                )
            }
        }
    }
}

@Composable
fun JobListItem(item: JobItem, onClick: () -> Unit, modifier: Modifier){

    Card(
        modifier = modifier.clickable(onClick = onClick),
        elevation = 0.dp,
        border = BorderStroke(1.dp, Color.LightGray),
        //shape = RoundedCornerShape(8.dp)
    ) {
        Column{

            JobImageThumb(item)
            JobTitle(item)
        }
    }

}

@Composable
private fun JobTitle(jobItem: JobItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            //.background(MaterialTheme.colors.secondary)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = jobItem.title,
            style = MaterialTheme.typography.h5,
            fontSize = 4.em
        )
    }
}