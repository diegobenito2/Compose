package com.example.compose.Box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
fun Box(modifier: Modifier){
    myBox1()
    myBox2()
}

@Composable
fun myBox1() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun myBox2() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red), contentAlignment = Alignment.BottomEnd
        ) {
            Text(text = "Hola")
        }
    }
}