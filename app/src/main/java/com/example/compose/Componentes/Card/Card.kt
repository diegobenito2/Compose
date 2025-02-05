package com.example.compose.Componentes.Card


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.compose.R
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.constraintlayout.compose.ConstraintLayout

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
fun ejercicioCardView(modifier: Modifier) {
    Column(modifier) {
        Card(
            Modifier
                .fillMaxWidth()
                .padding(13.dp)
        ) {
            Column {
                AsyncImage(
                    model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeOKy-DyHZMhXtDwnUo2h0N6gytb1zRIDDxQ&s",
                    contentDescription = null,
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop,
                )
                Column(Modifier.padding(top = 4.dp, start = 14.dp)) {
                    Text(
                        text = "Cuidado de los alumnos los primeros meses",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Justify,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "En este articulo veremos los cuidados que requieren los alumnos de 2DAM cuando están aprediendo JetPack Compose",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Justify,
                        fontSize = 12.sp
                    )
                }
                Row(Modifier.fillMaxWidth()) {
                    Row(
                        Modifier
                            .weight(1f)
                            .padding(start = 10.dp),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = Color.Black
                            )
                        ) {
                            Text("Leer más", color = Color.Black)
                        }
                    }

                    Row(
                        Modifier.weight(1f),
                        horizontalArrangement = Arrangement.End
                    ) {
                        var contador by rememberSaveable { mutableIntStateOf(0) }

                        Row(
                            Modifier.padding(end = 16.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            BadgedBox(
                                badge = {
                                    if (contador > 0) {
                                        Badge { Text(contador.toString()) }
                                    }
                                }
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.me_gusta),
                                    contentDescription = "Me Gusta",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clickable {
                                            contador += 1
                                        },
                                    tint = if (contador > 0) Color.Red else Color.Black
                                )
                            }
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.la),
                            contentDescription = "Compartir",
                            modifier = Modifier
                                .size(30.dp)
                                .clickable {
                                    // Implementar funcionalidad de compartir aquí
                                }
                        )
                    }


                }
            }
        }
    }
}




















