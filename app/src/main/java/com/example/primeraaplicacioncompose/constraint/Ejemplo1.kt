package com.example.primeraaplicacioncompose.constraint

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Ejemplo1(){
    Ejemplo1Contraints()
}
@Preview(showBackground = true)
@Composable
fun Ejemplo1Contraints(){
    val (BoxGreen,BoxRed,BoxBlue,BoxMagenta,BoxYellow) = createRefs()
    Box(modifier = Modifier.size(150.dp).background(Color.Yellow).constrainAs()){

    }
}