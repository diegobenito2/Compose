package com.example.compose.Componentes.FuncionesComposable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun funcionesComposable(modifier: Modifier) {
    Column(modifier) {
        ejemplo1EstadoComposable(modifier)
        ejemplo2EstadoComposable(modifier)
    }
}

@Composable
fun ejemplo1EstadoComposable(modifier: Modifier) {
    val number = remember { mutableStateOf(0) } // Usamos 'val' para no reasignar el estado
    Text(
        "Pulsame: ${number.value}",
        fontSize = 40.sp,
        modifier = modifier.clickable {
            number.value += 1
        }
    )
}

//En este tipo cuando lo poner horizontal no se resetea el numero
// por el by rememberSaveable { mutableIntStateOf(0) sin embargo en
//el ejemplo 1 si se reinicia.
@Composable
fun ejemplo2EstadoComposable(modifier: Modifier) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    Text("Pulsame: $number",
        fontSize = 40.sp,
        modifier = modifier.clickable { number += 1 }
    )
}

@Composable
fun elevacionDeEstado(modifier: Modifier) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    var number2 by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = modifier) {
        StateExample1(number) {
            number++
        }
        StateExample2(number2, onClick = { number2++ })
    }
}

@Composable
fun StateExample1(number: Int, onClick: () -> Int) {
    Text("Pulsame:  $number", modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExample2(number: Int, onClick: () -> Int) {
    Text("Pulsame:  $number", modifier = Modifier.clickable { onClick() })
}
