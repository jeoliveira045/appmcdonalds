package com.labs.app_mcdonalds

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import com.labs.app_mcdonalds.ui.theme.AppmcdonaldsTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.labs.app_mcdonalds.views.DetalheCardapioItem
import com.labs.app_mcdonalds.views.TelaInicial


@RequiresApi(Build.VERSION_CODES.R)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppmcdonaldsTheme() {
                NavHost(navController = navController, startDestination = "telaInicial") {
                    composable(route = "telaInicial") {
                        TelaInicial(navController = navController)
                    }
                    composable(
                        route = "detalhePedido/{imagemPedido}/{nomePedido}",
                        arguments = listOf(navArgument("imagemPedido") {type = NavType.IntType}, navArgument("nomePedido"){type = NavType.IntType})){
                        DetalheCardapioItem(nomeDoPedido = it.arguments!!.getInt("nomePedido"), imagemPedido = it.arguments!!.getInt("imagemPedido"), navController = navController)
                    }
                }
            }
        }
    }
}
