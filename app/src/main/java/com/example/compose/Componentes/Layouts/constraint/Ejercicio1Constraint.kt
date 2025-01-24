package com.example.compose.Components.Layouts.constraint

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


@Preview(showBackground = true)
@Composable
fun Ejercicio01Constraint() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (BoxGreen, BoxRed, BoxBlue, BoxMagenta, BoxYellow,BoxBlack,BoxCyan) = createRefs()
        Box(modifier = Modifier.size(75.dp).background(Color.Red).constrainAs(BoxRed) {
            top.linkTo(BoxYellow.bottom)
            start.linkTo(BoxYellow.end)
        })

        Box(modifier = Modifier.size(75.dp).background(Color.Gray).constrainAs(BoxBlue) {
            top.linkTo(BoxYellow.bottom)
            end.linkTo(BoxYellow.start)
        })

        Box(modifier = Modifier.size(75.dp).background(Color.Green).constrainAs(BoxGreen) {
            bottom.linkTo(BoxYellow.top)
            start.linkTo(BoxYellow.end)
        })

        Box(modifier = Modifier.size(75.dp).background(Color.Magenta).constrainAs(BoxMagenta) {
            bottom.linkTo(BoxYellow.top)
            end.linkTo(BoxYellow.start)
        })
        Box(modifier = Modifier.size(75.dp).background(Color.Magenta).constrainAs(BoxMagenta) {
            bottom.linkTo(BoxYellow.top)
            end.linkTo(BoxYellow.start)
        })
        Box(modifier = Modifier.size(75.dp).background(Color.Cyan).constrainAs(BoxCyan) {
            top.linkTo(BoxRed.bottom)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
        })
        Box(modifier = Modifier.size(75.dp).background(Color.Black).constrainAs(BoxBlack) {
            bottom.linkTo(BoxMagenta.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
        })

        Box(modifier = Modifier.size(75.dp).background(Color.Yellow).constrainAs(BoxYellow) {
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            top.linkTo(parent.top)
        })
    }
}

@Composable
fun Ejercicio1Constraint(modifier: Modifier) {
    Ejercicio01Constraint()
}
