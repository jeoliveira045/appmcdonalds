package com.labs.app_mcdonalds.views

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetalhePedido(
    modifier: Modifier = Modifier,
    @StringRes nomeDoPedido: Int,
    @DrawableRes imagemPedido: Int
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imagemPedido),
            contentDescription = null,
            modifier.fillMaxWidth()
                .size(300.dp)
        )
        Text(
            text = stringResource(id = nomeDoPedido),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
    }
}
