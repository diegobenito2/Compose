package com.example.compose.Iconos

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var verImagen by remember { mutableStateOf(false) }
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
                verImagen = !verImagen

            },
            modifier = Modifier
                .padding(top = 20.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = if (verImagen) "Ocultar" else "Mostrar")
        }
        if (verImagen) {
            AsyncImage(
                model = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2024/10/05/17281455511829.jpg",
                contentDescription = "Imagen de Pogacar",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                contentScale = ContentScale.Crop
            )
        }

    }
}

