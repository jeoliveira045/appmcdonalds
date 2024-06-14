package com.labs.app_mcdonalds.views

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.labs.app_mcdonalds.R
import com.labs.app_mcdonalds.composables.CardapioLista
import com.labs.app_mcdonalds.composables.OptionsNavigationBar

@RequiresApi(Build.VERSION_CODES.R)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaInicial(
    navController: NavController
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(painter = painterResource(id = R.drawable.mcdonalds_svgrepo_com), contentDescription = "McDonalds", Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp))
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFFF2323)),
                modifier = Modifier.height(80.dp),
            )
        },
        bottomBar = {
            OptionsNavigationBar()
        },
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets.add(WindowInsets(top = 200.dp))
    ) {
        paddingValues -> CardapioLista(Modifier.padding(paddingValues), navController)
    }
}
