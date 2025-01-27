package com.example.primeraaplicacioncompose.CalculadoraCompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun calculadoraPreview() {
    calculadora(Modifier)
}

@Composable
fun calculadora(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        var resultado by rememberSaveable { mutableIntStateOf(0) }

        Box(
            modifier = Modifier.weight(2f)
        ) {
            Text(
                text = resultado.toString(),
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Right
            )
        }


        Row(modifier = Modifier.weight(1f))
        {
            buttons("7", modifier = Modifier.weight(1f))
            buttons("8", modifier = Modifier.weight(1f))
            buttons("9", modifier = Modifier.weight(1f))
            buttons("/", modifier = Modifier.weight(1f))
        }


        Row(modifier = Modifier.weight(1f))
        {
            buttons("4", modifier = Modifier.weight(1f))
            buttons("5", modifier = Modifier.weight(1f))
            buttons("6", modifier = Modifier.weight(1f))
            buttons("x", modifier = Modifier.weight(1f))
        }


        Row(modifier = Modifier.weight(1f))
        {
            buttons("1", modifier = Modifier.weight(1f))
            buttons("2", modifier = Modifier.weight(1f))
            buttons("3", modifier = Modifier.weight(1f))
            buttons("-", modifier = Modifier.weight(1f))
        }


        Row(modifier = Modifier.weight(1f))
        {
            buttons("0", modifier = Modifier.weight(1f))
            buttons(".", modifier = Modifier.weight(1f))
            buttons("=", modifier = Modifier.weight(1f))
            buttons("+", modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun buttons(numero: String, modifier: Modifier) {
    Button(
        onClick = TODO(), modifier = modifier.padding(4.dp)
    ) {
        Text(
            text = numero,
            modifier = Modifier
                .size(60.dp)
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
    }
}
