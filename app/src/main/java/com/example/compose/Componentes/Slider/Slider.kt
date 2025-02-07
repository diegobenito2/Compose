package com.example.compose.Componentes.Slider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun mySlider(modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(sliderPosition, onValueChange = {sliderPosition=it})
        Text(text=sliderPosition.toString())
    }
}
@Composable
fun myAdvancedSlider(modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.padding(50.dp)) {
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(sliderPosition, onValueChange = {sliderPosition=it}, valueRange = 0f..255f, steps = 254)
        Text(text=sliderPosition.toInt().toString())
    }
}

@Composable
fun slidersColores(modifier: Modifier){
    var color1red by remember { mutableStateOf(0f) }
    var color2blue by remember { mutableStateOf(0f) }
    var color3green by remember { mutableStateOf(0f) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(color1red / 255f, color2blue / 255f, color3green / 255f))
            .padding(50.dp)
    ) {
        sliderColor("Red", color1red) { color1red = it }
        sliderColor("Blue", color2blue) { color2blue = it }
        sliderColor("Green", color3green) { color3green = it }
    }
}

@Composable
fun sliderColor(label: String, value: Float, onValueChange: (Float) -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = label)
        Slider(
            value = value,
            onValueChange = onValueChange,
            valueRange = 0f..255f,
            steps = 254
        )
        Text(text = value.toInt().toString())
    }
}

