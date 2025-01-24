package com.example.compose.Componentes.Barrier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun EjerciciosBarrier(modifier: Modifier) {
    Ejercicio1Barrier()
    Ejercicio2Barrier()
    Ejercicio3Barrier()

}

//@Preview(showBackground = true)
@Composable
fun Ejercicio1Barrier() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val Barrier = createEndBarrier(boxRed, boxYellow)
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(parent.start, margin = 26.dp)
                })
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(parent.start, margin = 32.dp)
                    end.linkTo(Barrier)
                })
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    start.linkTo(Barrier)
                })
    }
}

//@Preview(showBackground = true)
@Composable
fun Ejercicio2Barrier() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val Barrier = createEndBarrier(boxRed, boxYellow)

        Box(
            Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {

                })
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {

                })
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {

                })
    }
}
//@Preview(showBackground = true)
@Composable
fun Ejercicio3Barrier(){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val Barrier = createEndBarrier(boxRed, boxYellow)
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(parent.start)
                    end.linkTo(boxGreen.start)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {

                    end.linkTo(boxRed.start)
                    start.linkTo(boxYellow.end)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    start.linkTo(boxGreen.start)
                    end.linkTo(parent.end)
                })
    }
}
@Preview(showBackground = true)
@Composable
fun Ejercicio4Barrier(){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        createHorizontalChain(boxRed, boxGreen, boxYellow, chainStyle = ChainStyle.Packed)
        val Barrier = createEndBarrier(boxRed, boxYellow)
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(parent.start)
                    end.linkTo(boxGreen.start)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {

                    end.linkTo(boxRed.start)
                    start.linkTo(boxYellow.end)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    start.linkTo(boxGreen.start)
                    end.linkTo(parent.end)
                })
    }
}

