package com.example.compose.Componentes.Slider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(sliderPosition, onValueChange = {sliderPosition=it}, valueRange = 0f..255f, steps = 254)
        Text(text=sliderPosition.toInt().toString())
    }
}
@Composable
@Preview(showBackground = true)
fun mySliderPreview(){
    mySlider(Modifier.fillMaxSize())
}
@Composable
@Preview(showBackground = true)
fun myadvancedSliderPreview(){
    myAdvancedSlider(Modifier.fillMaxSize())
}
@Composable
fun slidersColores(modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        modifier.background(Color(sliderColor(),sliderColor(),sliderColor()))
    }
}
@Composable
fun sliderColor():Float{
    var sliderPosition by remember { mutableStateOf(0f) }
    Slider(sliderPosition, onValueChange = {sliderPosition=it}, valueRange = 0f..255f, steps = 254)
    Text(text=sliderPosition.toInt().toString())
    return sliderPosition
}

