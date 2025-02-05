package com.example.compose.Surface


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.unit.dp

@Composable
fun mySurface(modifier: Modifier) {
    Column(modifier) {
        Surface(
            modifier = Modifier
                .height(150.dp)
                .width(250.dp)
                .padding(16.dp),
            color = Color.Cyan,
            tonalElevation = 12.dp,
            shadowElevation = 12.dp,
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(text = "Basic Surface", Modifier.padding(16.dp))
        }
    }

}