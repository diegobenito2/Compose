package com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeraaplicacioncompose.R

@Preview(showBackground = true)
@Composable
fun tutorial3(){
    Image(painter = painterResource(R.drawable.ic_task_completed),"Imagen",Modifier,Alignment.Center)
}