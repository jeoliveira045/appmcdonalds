package com.labs.app_mcdonalds.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.labs.app_mcdonalds.ui.theme.AppmcdonaldsTheme

@Composable
fun YesOrNoOption(question: String, modifier: Modifier = Modifier) {
    Column(
        modifier
    ) {
        Surface(
            modifier.fillMaxWidth(),
            shadowElevation = 8.dp
        ) {
            Text(
                text = question, 
                fontSize = 20.sp, 
                modifier = modifier.padding(16.dp),
                fontWeight = FontWeight.Bold)

        }
            DetalheItemOptions(text = "Sim")
            DetalheItemOptions(text = "Não")
    }
}

@Preview
@Composable
fun YesOrNoOptionPreview(){
    AppmcdonaldsTheme {
        YesOrNoOption(question = "Deseja Guardanapos?")
    }
}
