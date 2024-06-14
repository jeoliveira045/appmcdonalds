package com.labs.app_mcdonalds.composables

import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.labs.app_mcdonalds.R
import com.labs.app_mcdonalds.model.CardapioItemModel
import com.labs.app_mcdonalds.ui.theme.AppmcdonaldsTheme

@RequiresApi(Build.VERSION_CODES.R)
@Composable
fun CardapioLista(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    LazyColumn(
        modifier
    ) {
        items(lista_sanduiches) { item ->
            CardapioItem(text = item.first.nomeItem.toInt(), drawable = item.second, valorItem = item.first.valorItem, navController = navController)
        }
    }
}

var lista_sanduiches = mutableListOf(
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.combo_classicos_dois_sanduiches_batata_bebida.toString(), 20.60),R.drawable.combo_classicos_dois_sanduiches_batata_bebida),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.coca_mcmelt_46.toString(), 20.60),R.drawable.coca_mcmelt_46),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.dois_sanduiches_desconto.toString(), 20.60),R.drawable.dois_sanduiches_desconto),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.mc_oferta_big_tasty_turbo_queijo.toString(), 20.60),R.drawable.mc_oferta_big_tasty_turbo_queijo),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.big_tasty.toString(), 45.90),R.drawable.bigtasty),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.mcchicken.toString(), 32.50),R.drawable.mcchicken),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.cheeseburger.toString(), 16.50),R.drawable.cheeseburger),
    Pair<CardapioItemModel, @receiver:DrawableRes Int>(CardapioItemModel(R.string.doublecheeseburger.toString(), 20.60),R.drawable.doublecheeseburger)
)

//@RequiresApi(Build.VERSION_CODES.R)
//@Preview
//@Composable
//fun CardapioListaPreview(){
//    AppmcdonaldsTheme {
//        CardapioLista()
//    }
//}
