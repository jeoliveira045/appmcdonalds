package com.labs.app_mcdonalds.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.labs.app_mcdonalds.R

@Composable
fun OptionsNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = Color.Red
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Black,
            ),
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Icon(Icons.Filled.AccountCircle, contentDescription = null)
                    Text("Conta")
                }

            }
        )
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Icon(
                        painterResource(id = R.drawable.baglogo),
                        contentDescription = null,
                        modifier.size(25.dp))
                    Text("Sacola")
                }

            }
        )
    }
}
