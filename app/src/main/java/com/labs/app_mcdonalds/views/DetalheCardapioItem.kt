package com.labs.app_mcdonalds.views

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.labs.app_mcdonalds.composables.MultipleOptions
import com.labs.app_mcdonalds.composables.YesOrNoOption

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetalheCardapioItem(
    modifier: Modifier = Modifier,
    @StringRes nomeDoPedido: Int,
    @DrawableRes imagemPedido: Int,
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("telaInicial") }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {paddingValues ->

        Column(
            modifier = modifier.padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imagemPedido),
                contentDescription = null,
                modifier
                    .fillMaxWidth()
                    .size(300.dp)
            )
            Text(
                text = stringResource(id = nomeDoPedido),
                modifier = modifier.padding(30.dp),
                style = TextStyle(lineHeight = 50.sp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            YesOrNoOption(question = "Deseja Guardanapos?")
            MultipleOptions(checkbox = true, questionList = QuestionList)


        }
    }
}

var QuestionList: List<String> = mutableListOf(
    "Tomate",
    "Picles",
    "Cebola",
    "Carne Especial McDonalds"
)

//@Composable
//fun
