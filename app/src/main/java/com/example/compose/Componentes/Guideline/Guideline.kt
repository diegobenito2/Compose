package com.example.compose.Componentes.Guideline

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Ejercicio1Guideline(modifier: Modifier) {
    EjercicioGuideline()
}

@Preview(showBackground = true)
@Composable
fun EjercicioGuideline() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()
        val topGuideline = createGuidelineFromTop(0.30f)
        val startGuideLine = createGuidelineFromStart(0.50f)
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(topGuideline)
                    start.linkTo(startGuideLine)
                    end.linkTo(startGuideLine)
                })
    }
}










































