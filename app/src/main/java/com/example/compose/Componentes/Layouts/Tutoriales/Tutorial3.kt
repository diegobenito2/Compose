package com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R

@Composable
fun tutorial3(modifier: Modifier) {
    tutorial3_0()
}

@Preview(showBackground = true)
@Composable
fun tutorial3_0() {
    Column(modifier = Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            "Imagen",
            
            )
        Text(
            "All tasks completed",
            Modifier.padding(0.dp, 20.dp, 8.dp, 0.dp),
            fontWeight = FontWeight.Bold
        )
        Text("Nice work!", fontSize = 16.sp)
    }
}