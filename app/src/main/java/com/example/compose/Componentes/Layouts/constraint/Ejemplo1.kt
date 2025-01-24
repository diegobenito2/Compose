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
import kotlinx.coroutines.NonDisposableHandle.parent


@Composable
fun Ejemplo1(modifier: Modifier) {
    Ejemplo1Contraints()
}

@Preview(showBackground = true)
@Composable
fun Ejemplo1Contraints() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (BoxGreen, BoxRed, BoxBlue, BoxMagenta, BoxYellow) = createRefs()
        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs(BoxRed) {
            top.linkTo(BoxYellow.bottom)
            start.linkTo(BoxYellow.end)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Gray).constrainAs(BoxBlue) {
            top.linkTo(BoxYellow.bottom)
            end.linkTo(BoxYellow.start)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Green).constrainAs(BoxGreen) {
            bottom.linkTo(BoxYellow.top)
            start.linkTo(BoxYellow.end)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Magenta).constrainAs(BoxMagenta) {
            bottom.linkTo(BoxYellow.top)
            end.linkTo(BoxYellow.start)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Yellow).constrainAs(BoxYellow) {
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            top.linkTo(parent.top)
        })

    }
}