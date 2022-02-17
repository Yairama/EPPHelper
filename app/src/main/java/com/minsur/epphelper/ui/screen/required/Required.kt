package com.minsur.epphelper.ui.screen.required

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
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
import com.minsur.epphelper.ui.shared.EPPImageThumb
import com.minsur.epphelper.ui.shared.JobImageThumb


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RequiredScreen(areaId: Int, subAreaId: Int, jobId: Int, workId: Int, onUpClick: ()->Unit, modifier: Modifier = Modifier){


    val workItem : WorkItem = remember {
        getSpecificWork(
            areaId = areaId,
            subAreaId = subAreaId,
            jobId = jobId,
            workId = workId
        )
    }

    val jobItem : JobItem = remember {
        getSpecificJob(
            areaId = areaId,
            subAreaId = subAreaId,
            jobId = jobId
        )
    }

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

    ) { padding->
        Column(modifier = Modifier.padding(padding)) {
            Text(text = "AQUI IRÁN LOS CONSEJOS, FALTA DISEÑAR MAS BONITO JSJS, LA TOY PENSANDO :v")
            AreaImageThumb(areaItem = areaItem, Modifier.padding(padding))
            LazyVerticalGrid(
                contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
                cells = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
                modifier = modifier
            ) {

                items(getSpecificEPPs(getEppList(areaId, subAreaId, jobId, workId))) { eppItem ->
                    val isChecked: MutableState<Boolean> = remember { mutableStateOf(false) }
                    EppRequiredListItem(
                        item = eppItem,
                        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                        isChecked = isChecked
                    )
                }
            }

        }
    }
}

@Composable
fun EppRequiredListItem(item: EPPItem, modifier: Modifier, isChecked: MutableState<Boolean>){

    Card(
        modifier = Modifier.clickable(onClick = {isChecked.value = !isChecked.value}),
        elevation = 0.dp,
        border = BorderStroke(1.dp, Color.LightGray),
        //shape = RoundedCornerShape(8.dp)
    ) {
        Column{

            EPPImageThumb(item)
            LabelledCheckbox(item, isChecked)
        }
    }

}

@Composable
fun LabelledCheckbox(eppItem: EPPItem,isChecked: MutableState<Boolean>) {
    Row(modifier = Modifier
        .padding(dimensionResource(id = R.dimen.padding_medium))
        .fillMaxWidth()
    ) {


        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            enabled = true,
            colors = CheckboxDefaults.colors(Color.Green),
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_xsmall))
        )
        Text(text = eppItem.title, modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_xsmall)))
    }
}