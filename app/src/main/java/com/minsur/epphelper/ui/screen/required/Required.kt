package com.minsur.epphelper.ui.screen.required

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.google.gson.Gson
import com.minsur.epphelper.R
import com.minsur.epphelper.model.*
import com.minsur.epphelper.ui.shared.ArrowBackIcon
import com.minsur.epphelper.ui.shared.EPPImageThumb
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import okio.IOException


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RequiredScreen(areaId: Int, subAreaId: Int, jobId: Int, workId: Int, onUpClick: ()->Unit, onCheckListSent: ()->Unit,modifier: Modifier = Modifier){

    val checkList: SnapshotStateMap<Int, Boolean> = remember {mutableStateMapOf<Int, Boolean>()}

    for (item in getSpecificEPPs(getEppList(areaId, subAreaId, jobId, workId))){
        checkList[item.id] = false
    }

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
    val showDialog = remember {
        mutableStateOf(false)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = subAreaItem.title)
                },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    showDialog.value = true
                }
            ) {
                Icon(Icons.Filled.Check,"")
                if(showDialog.value){
                    Alert(showDialog, checkList, areaItem.id, subAreaItem.id, jobItem.id, workItem.id, onCheckListSent)
                }
            }
        }

    ) { padding->

        Column(modifier = Modifier.padding(padding)) {
            Text(text = "AQUI IRÁN LOS CONSEJOS, FALTA DISEÑAR MAS BONITO JSJS, LA TOY PENSANDO :v")
            LazyVerticalGrid(
                contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
                cells = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
                modifier = modifier
            ) {

                items(getSpecificEPPs(getEppList(areaId, subAreaId, jobId, workId))) { eppItem ->
                    val isChecked: MutableState<Boolean> = rememberSaveable(eppItem) { mutableStateOf(false) }
                    checkList[eppItem.id] = isChecked.value
                    EppRequiredListItem(
                        item = eppItem,
                        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                        isChecked = isChecked,
                        checkList = checkList
                    )
                }

            }
        }

    }
}

@Composable
fun Alert(showDialog: MutableState<Boolean>, checkList: SnapshotStateMap<Int, Boolean>, areaId: Int,
          subAreaId: Int, jobId: Int, workId: Int, onCheckListSent: ()->Unit) {
    val trueItems = remember {
        mutableStateOf(checkList.values.toList().count { it })
    }
    val totalItems = checkList.keys.size
    AlertDialog(
        title = {
            Text(text = "¿ESTA SEGURO DE QUE QUIERE COMPLETAR EL CHECK LIST?")
        },
        text = {
            Text("Usted tiene ${trueItems.value} de ${totalItems} EPPs")
        },
        onDismissRequest = {

        },
        buttons = {
            val answerToast = remember {
                mutableStateOf("")
            }
            Button(
                onClick = {
                    showDialog.value = false
                    sendCheckList(checkList,areaId,subAreaId, jobId,workId)
                    answerToast.value = "si"
                    onCheckListSent()
                          }, modifier = Modifier.padding(8.dp)) {
                Text("Si")
                if(answerToast.value=="si"){
                    Toast.makeText(
                        LocalContext.current,
                        "Respuestas enviadas con éxito!",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
            Button(
                onClick = {
                    showDialog.value = false
                    answerToast.value = "no"
                             }, modifier = Modifier.padding(8.dp)) {
                Text("No")
                if (answerToast.value == "no"){
                Toast.makeText(
                    LocalContext.current,
                    "Respuestas NO ENVIADAS, continue editando el check list",
                    Toast.LENGTH_LONG
                ).show()
            }
            }


        }
    )
}

fun sendCheckList(checkList: SnapshotStateMap<Int, Boolean>, areaId: Int, subAreaId: Int, jobId: Int, workId: Int){
    val checkListItem: CheckListItem = CheckListItem(
        userId = mainUser!!.id,
        areaId = areaId,
        subAreaId = subAreaId,
        jobId = jobId,
        workId = workId,
        EPPIds = checkList.keys.toList(),
        hasEPP = checkList.values.toList()
    )

    //"http://10.0.2.2:8000/api/eppchecklists"
    var gson = Gson()
    var jsonString = gson.toJson(checkListItem)
    val client = OkHttpClient()

    val JSON: MediaType? = "application/json; charset=utf-8".toMediaTypeOrNull()
    var body:RequestBody = RequestBody.create(JSON, jsonString)
    val request = Request.Builder().post(body).url("http://20.197.190.239:8000/api/eppchecklists").build()

    client.newCall(request).enqueue(object : Callback {
        override fun onResponse(call: Call, response: Response) {
            val tm = response.body?.string()
            println(tm)
        }

        override fun onFailure(call: Call, e: IOException) {
            Log.d("Failed", "FAILED")
            e.printStackTrace()
        }
    })

    println(jsonString)

}




@Composable
fun EppRequiredListItem(item: EPPItem, modifier: Modifier, isChecked: MutableState<Boolean>, checkList: SnapshotStateMap<Int, Boolean>){

    Card(
        modifier = Modifier.clickable(onClick = {
            isChecked.value = !isChecked.value
            checkList[item.id] = isChecked.value
        }),
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