package com.example.compose.Componentes.CheckBox.ConEstados

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState

@Composable
fun MyTriStateCheckbox(modifier: Modifier) {
    // Definimos tres estados para los checkboxes hijos, que se recuerdan y guardan incluso tras recomposiciones
    var hijo1 by rememberSaveable { mutableStateOf(false) }
    var hijo2 by rememberSaveable { mutableStateOf(false) }
    var hijo3 by rememberSaveable { mutableStateOf(false) }

    // Determinamos el estado del checkbox principal dependiendo de los estados de los checkboxes hijos
    val parentState = when {
        // Si todos los checkboxes hijos están seleccionados, el estado del principal es "On"
        hijo1 && hijo2 && hijo3 -> ToggleableState.On
        // Si al menos uno de los checkboxes está seleccionado, el estado del principal es "Indeterminate"
        hijo1 || hijo2 || hijo3 -> ToggleableState.Indeterminate
        // Si ninguno está seleccionado, el estado del principal es "Off"
        else -> ToggleableState.Off
    }
    Column (modifier = modifier.fillMaxSize()){
        // Layout horizontal que contiene el checkbox principal y el texto "Todo activado"
        Row(verticalAlignment = Alignment.CenterVertically) {
            // TriStateCheckbox es un checkbox que puede estar en 3 estados (On, Off, Indeterminate)
            TriStateCheckbox(
                state = parentState,  // El estado actual del checkbox principal
                onClick = {
                    // Cuando se hace clic en el checkbox principal, actualizamos el estado de los hijos
                    val newState = when (parentState) {
                        // Si el estado actual del principal es "Off", lo cambiamos a "On" (todos los hijos activados)
                        ToggleableState.Off -> true
                        // Si el estado actual del principal es "On", lo cambiamos a "Off" (todos los hijos desactivados)
                        ToggleableState.On -> false
                        // Si el estado es "Indeterminate", cambiamos el estado de los hijos dependiendo del primero
                        else -> !hijo1
                    }
                    // Aplicamos el nuevo estado a todos los checkboxes hijos
                    hijo1 = newState
                    hijo2 = newState
                    hijo3 = newState
                }
            )
            // Texto al lado del checkbox principal
            Text(text = "Todo activado")
        }

        // Layout vertical que contiene los tres checkboxes hijos
        Column {
            // Checkbox hijo 1, que se actualiza al hacer clic
            Checkbox(checked = hijo1, onCheckedChange = { hijo1 = it })
            // Checkbox hijo 2, que se actualiza al hacer clic
            Checkbox(checked = hijo2, onCheckedChange = { hijo2 = it })
            // Checkbox hijo 3, que se actualiza al hacer clic
            Checkbox(checked = hijo3, onCheckedChange = { hijo3 = it })
        }
    }
}