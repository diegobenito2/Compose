package com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun tutorial4(modifier: Modifier) {
    tutorial4_0()
}

@Preview(showBackground = true)
@Composable
fun tutorial4_0() {
    Column(Modifier.fillMaxSize()) {
        var texto = ""
        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    texto = "Text composable"
                    Text(texto, Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                    texto = "Displays text and follows the recommended Material Design guidelines."
                    Text(texto, textAlign = TextAlign.Justify)
                }
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    texto = "Image composable"
                    Text(texto, Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                    texto =
                        "Creates a composable that lays out and draws a given Painter class object."
                    Text(texto, textAlign = TextAlign.Justify)
                }
            }
        }
        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    texto = "Row composable"
                    Text(texto, Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                    texto = "A layout composable that places its children in a horizontal sequence."
                    Text(texto, textAlign = TextAlign.Justify)
                }
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    texto = "Column composable"
                    Text(texto, Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                    texto = "A layout composable that places its children in a vertical sequence."
                    Text(texto, textAlign = TextAlign.Justify)
                }
            }
        }

    }
}
