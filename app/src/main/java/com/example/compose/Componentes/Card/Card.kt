package com.example.compose.Componentes.Card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

@Composable
fun EjemploCard(modifier: Modifier) {

    Column(modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            elevation = CardDefaults.cardElevation(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red,
                contentColor = Color.Black
            ),
            border = BorderStroke(2.dp, Color.Green)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Hola")
                Text("Mundo")
                Text("Luis")
            }
        }
    }
}

@Composable
fun ejercicioCardView(modifier: Modifier){
    Column (modifier){
        Card (Modifier.fillMaxWidth().padding(13.dp)){
            Column {
                AsyncImage(
                    model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeOKy-DyHZMhXtDwnUo2h0N6gytb1zRIDDxQ&s",
                    contentDescription = null, Modifier
                        .fillMaxWidth().height(200.dp)
                        .padding(top = 16.dp), contentScale = ContentScale.Crop
                )
                Text("Cuidado de los alumnos los primeros meses",Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 13.sp)
                Text("En este articulo veremos los cuidados que requieren los alumnos de 2DAM cuando están aprediendo JetPack Compose",Modifier.fillMaxWidth().padding(4.dp), textAlign = TextAlign.Justify)
                Row {
                    Button(onClick = {},colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Cyan
                    )) { Text("Leer más") }
                }
            }
        }
    }
}




















