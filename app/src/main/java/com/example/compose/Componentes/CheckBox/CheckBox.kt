package com.example.compose.Componentes.CheckBox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun pruebasCheckBox(modifier: Modifier) {
    Column(modifier.fillMaxSize()) {
        pruebaCheckBox(modifier)
        pruebaCheckBoxTexto(modifier)
        pruebaCheckBoxConSwitch()

    }

}

@Composable
fun pruebaCheckBox(modifier: Modifier) {
    var state by rememberSaveable { mutableStateOf(false) }

    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Gray,
            uncheckedColor = Color.Yellow,
            checkmarkColor = Color.Blue
        ),
        modifier = modifier
    )
}

@Composable
fun pruebaCheckBoxTexto(modifier: Modifier) {

    var state by rememberSaveable { mutableStateOf(false) }
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = state,
            onCheckedChange = { state = !state },
            enabled = true,
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Gray,
                uncheckedColor = Color.Yellow,
                checkmarkColor = Color.Blue
            )
        )
        Spacer(Modifier.width(8.dp))
        Text("Ejemplo1")
    }

}

@Composable
fun pruebaCheckBoxConSwitch() {
    var checked by rememberSaveable { mutableStateOf(false) }
    var state by rememberSaveable { mutableStateOf(false) }
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = state,
            onCheckedChange = { state = !state },
            enabled = true,
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Gray,
                uncheckedColor = Color.Yellow,
                checkmarkColor = Color.Blue
            )
        )
        Spacer(Modifier.width(8.dp))

        Text(text = if (state) "Activado" else "Desactivado")
    }
    if (state) {
        Switch(
            checked = checked,
            onCheckedChange = { checked = !checked },
            enabled = true,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green.copy(alpha = 0.8f),
                uncheckedThumbColor = Color.Red.copy(alpha = 0.9f),
                checkedTrackColor = Color.Cyan.copy(alpha = 0.1f),
                uncheckedTrackColor = Color.Magenta.copy(alpha = 0.5f),
                disabledCheckedTrackColor = Color.Yellow,
                disabledUncheckedTrackColor = Color.Gray,
                disabledCheckedThumbColor = Color.Green,
                disabledUncheckedThumbColor = Color.Gray
            )
        )
    }
}
