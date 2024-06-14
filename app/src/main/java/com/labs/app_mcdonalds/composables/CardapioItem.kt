package com.labs.app_mcdonalds.composables

import android.content.res.Resources
import android.icu.number.FormattedNumber
import android.icu.number.NumberFormatter
import android.icu.number.Precision
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.labs.app_mcdonalds.R
import com.labs.app_mcdonalds.ui.theme.AppmcdonaldsTheme
import java.math.BigDecimal

@RequiresApi(Build.VERSION_CODES.R)
@Composable
fun CardapioItem(
    @StringRes text: Int,
    @DrawableRes drawable: Int,
    valorItem: Double,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        shadowElevation = 8.dp,
        modifier = modifier.padding(10.dp).clickable(enabled = true) {
            navController.navigate("detalhePedido/$drawable/$text")
        }
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ){
            Image(
                painter = painterResource(drawable),
                contentDescription = null,
                modifier = modifier
                    .size(200.dp)
                    .padding(top = 10.dp, end = 10.dp, bottom = 10.dp, start = 0.dp)
            )
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = modifier.height(80.dp)
            ){
                Text(
                    text = stringResource(id = text),
                    fontWeight = FontWeight(700)
                )
                Text(text = "R$ ${valorItemFormatter(valorItem)}")

            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.R)
fun valorItemFormatter(number : Double): FormattedNumber{
    return NumberFormatter
        .with()
        .locale(Resources.getSystem().configuration.locales.get(0))
        .precision(Precision.fixedFraction(2))
        .format(number)
}

//@Preview
//@Composable
//fun CardapioItemPreview(){
//    AppmcdonaldsTheme {
//        CardapioItem(R.string.big_tasty,R.drawable.bigtasty)
//    }
//}
