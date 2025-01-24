package com.example.compose.Components.Layouts.Tutoriales

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.Componentes.Spacer.Spacer
@Composable
fun Ejercicio01(modifier: Modifier){
    Ejercicio1()
}
@Preview(showBackground = true)
@Composable
fun Ejercicio1() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            Modifier
                .weight(1f)
                .fillMaxSize()
                .background(color = Color.Cyan)
        ) {
            Column(
                Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Ejercicio 1")
            }
        }
        Spacer(16)
        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Red)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Ejercicio 2"
                    )
                }
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Green)
            ) {
                Column(
                    Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("Ejercicio 3")
                }
            }
        }
        Spacer(16)
        Box(
            Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center

        ) {
            Text("Ejercicio 4")
        }
    }
}




















































