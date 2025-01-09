package com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun Tutorial1(mensage: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), Arrangement.Center) {
        Text(
            text = mensage,
            fontSize = 100.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            textAlign = TextAlign.Center

        )

    }
}
