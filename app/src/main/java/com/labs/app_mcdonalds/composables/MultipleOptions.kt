package com.labs.app_mcdonalds.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MultipleOptions(modifier: Modifier = Modifier, checkbox: Boolean = false, questionList: List<String>){
    Column(
        modifier.fillMaxWidth()
    ) {
        for(item in questionList){
            DetalheItemOptions(text = item, checkbox = checkbox)
        }
    }
}


