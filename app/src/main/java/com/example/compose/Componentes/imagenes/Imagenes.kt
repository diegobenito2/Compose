package com.example.compose.imagenes

import androidx.annotation.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.compose.R

@Composable
fun myImage(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // Primera imagen con opacidad
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .padding(15.dp)
                .alpha(0.5f) // Aplica opacidad
        )

        // Segunda imagen con bordes redondeados
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .padding(15.dp)

                .clip(RoundedCornerShape(75f)) // Bordes redondeados
        )

        // Tercera imagen con borde circular
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .padding(15.dp)
                .clip(CircleShape) // Forma circular
                .border(5.dp, color = Color.Blue, shape = CircleShape) // Borde azul
        )
        //SquashedOval Imagen ovalada
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .padding(15.dp)
                .border(5.dp, color = Color.Blue, shape = SquashedOval()) // Borde azul
        )

    }
}

