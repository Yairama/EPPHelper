package com.minsur.epphelper.ui.shared

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.minsur.epphelper.R
import com.minsur.epphelper.model.EPPItem
import com.minsur.epphelper.model.JobItem

@Composable
fun EPPImageThumb(eppItem: EPPItem, modifier: Modifier = Modifier){

    Box(
        modifier = modifier
            .height(dimensionResource(id = R.dimen.cell_thumb_height))
            .fillMaxWidth()
            .background(color = Color.Gray)
    ){
        Image(

            painter = painterResource(id = eppItem.image),
            contentDescription = eppItem.title,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
//            Icon(
//                imageVector = Icons.Default.PlayArrow,
//                contentDescription = null // decorative element
//            )
    }
}