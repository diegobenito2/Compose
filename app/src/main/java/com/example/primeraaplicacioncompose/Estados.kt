package com.example.primeraaplicacioncompose

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier



@Composable
fun ejemplo1Estado(modifier: Modifier) {
    var number = remember {mutableStateOf(0)}
    Text("Pulsame: ${number.value}", modifier.clickable { number.value += 1 }
    )
}
@Composable
fun ejemplo2Estado(modifier: Modifier){
    var number by rememberSaveable { mutableIntStateOf(0) }
    Text("Pulsame: $number", modifier.clickable { number += 1 }
    )

}
