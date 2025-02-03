package com.example.compose.Componentes.RadioButton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun radioButtons(modifier: Modifier) {
    Column(modifier.fillMaxSize()) {
        MyRadioButton()
        val lenguajesProg = listOf("Kotlin", "Java", "C++", "C#")
        var selectedOption by remember { mutableStateOf("Kotlin") }
        radiobuttonlist(selectedOption, lenguajesProg, { selectedOption = it })
    }
}
@Composable
fun MyRadioButton() {

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
        RadioButton(
            selected = true, onClick = {}, enabled = false, colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green
            )
        )
        Text(text = "Ejemplo 1")

    }
}

@Composable

fun radiobuttonlist(
    selectedOption: String,
    options: List<String>,
    onOptionSelected: (String) -> Unit
) {
    options.forEach { option ->
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = selectedOption == option, onClick = { onOptionSelected(option) })
            Text(text = option)
        }
    }
    @Composable

    fun radiobuttonlistciclos(
        selectedOption: String,
        options: List<String>,
        onOptionSelected: (String) -> Unit
    ) {
        options.forEach { option ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption == option,
                    onClick = { onOptionSelected(option) })
                Text(text = option)
            }
        }


    }
}































