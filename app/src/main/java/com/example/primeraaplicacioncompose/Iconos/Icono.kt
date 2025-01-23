package com.example.primeraaplicacioncompose.Iconos

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import androidx.compose.ui.platform.LocalContext


@Composable
fun icono(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var verImagen = false
    Column(modifier.fillMaxSize()) {
        Text(
            "Interactúa con los íconos y botones",
            Modifier
                .padding(15.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
        Row {
            Column(Modifier.weight(1f)) {
                Icon(
                    Icons.Rounded.Add,
                    contentDescription = "Agregar",
                    Modifier.align(Alignment.CenterHorizontally)
                )
                Text("Agregar", Modifier.align(Alignment.CenterHorizontally))
            }

            Column(Modifier.weight(1f)) {
                Icon(
                    Icons.Rounded.Delete,
                    contentDescription = "Eliminar",
                    Modifier.align(Alignment.CenterHorizontally)
                )
                Text("Eliminar", Modifier.align(Alignment.CenterHorizontally))
            }

            Column(Modifier.weight(1f)) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "Compartir",
                    Modifier.align(Alignment.CenterHorizontally)
                )
                Text("Compartir", Modifier.align(Alignment.CenterHorizontally))
            }
        }
        Button(
            onClick = {
                Toast.makeText(context, "Botón presionado", Toast.LENGTH_SHORT).show()
                verImagen = true
            },
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Mostrar Toast")
        }
        if (verImagen) {
            imagen()
        }

    }
}

@Composable
fun imagen() {
    AsyncImage(
        model = "https://es.pinterest.com/pin/35254809576583933/", // Use a direct image URL
        contentDescription = "Imagen de Pogacar",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(top = 16.dp),
        contentScale = ContentScale.Crop
    )
}