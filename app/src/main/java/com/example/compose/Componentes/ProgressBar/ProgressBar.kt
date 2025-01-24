package com.example.compose.Componentes.ProgressBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun progressbar(modifier: Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        progressbar1(modifier.weight(1f))
        progressbar2(modifier.weight(1f))
        progressbar3(modifier.weight(1f))
        progressbar4(modifier.weight(1f))
    }
}

@Composable
fun progressbar1(modifier: Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            Modifier.size(50.dp),
            color = Color.Cyan,
            strokeWidth = 10.dp,
            strokeCap = StrokeCap.Round
        )
        LinearProgressIndicator(
            color = Color.Black,
            trackColor = Color.Cyan,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Composable
fun progressbar2(modifier: Modifier) {
    var progreso by remember { mutableStateOf(0f) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(
            color = Color.Black,
            trackColor = Color.Cyan,
            modifier = Modifier.padding(top = 16.dp),
            progress = progreso
        )
        Button(onClick = {
            if (progreso < 1f) progreso += 0.1f
        }) {
            Text(text = "Incrementar")
        }
    }
}

@Composable
fun progressbar3(modifier: Modifier) {
    var progreso by remember { mutableStateOf(1f) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(
            color = Color.Black,
            trackColor = Color.Cyan,
            modifier = Modifier.padding(top = 16.dp),
            progress = progreso
        )
        Button(onClick = {
            if (progreso > 0f) progreso -= 0.1f
        }) {
            Text(text = "Decrementar")
        }
    }
}

@Composable
fun progressbar4(modifier: Modifier) {
    var showProgress by remember { mutableStateOf(true) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showProgress) {
            LinearProgressIndicator(
                color = Color.Black,
                trackColor = Color.Cyan,
                modifier = Modifier.padding(top = 16.dp)
            )
        }

        Button(onClick = {
            showProgress = !showProgress
        }) {
            Text(text = if (showProgress) "Ocultar" else "Mostrar")
        }
    }
}
