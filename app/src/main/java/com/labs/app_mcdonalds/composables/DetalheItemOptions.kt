package com.labs.app_mcdonalds.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.labs.app_mcdonalds.R
import com.labs.app_mcdonalds.ui.theme.AppmcdonaldsTheme

@Composable
fun DetalheItemOptions(
    text: String,
//    @DrawableRes image: Int,
    checkbox: Boolean = false,
    modifier: Modifier = Modifier) {
    var checked by rememberSaveable {
        mutableStateOf(false)
    }
    Surface(
        modifier = modifier.padding(8.dp),
        shadowElevation = 12.dp,
        shape = MaterialTheme.shapes.medium,

    ){
        Row(
            modifier
                .fillMaxWidth()
                .padding(12.dp)
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
//                Image(painter = painterResource(id = image),
//                      modifier = modifier.size(90.dp),
//                      contentDescription = null
//                )
                Text(text = text, modifier.padding(start = 30.dp))
            }
            if(checkbox){
                Checkbox(checked = checked, onCheckedChange = { checked = it})
            }else {
                RadioButton(selected = checked, onClick = { checked = !checked })
            }
        }
    }
}

//@Preview
//@Composable
//fun DetalheItemOptionsPreview(){
//    AppmcdonaldsTheme {
//        DetalheItemOptions(text = "Levar guardanapos", image = R.drawable.napkins)
//    }
//}
