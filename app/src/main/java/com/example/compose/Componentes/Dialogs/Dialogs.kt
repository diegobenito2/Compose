package com.example.compose.Componentes.Dialogs


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil3.compose.AsyncImage
import com.example.compose.R

@Composable
fun ejemploalertDialog(modifier: Modifier) {
    Column(modifier) {
        var show by remember { mutableStateOf(false) }
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Button(onClick = { show = true }) {
                Text(text = "Mostrar diálogo:")
            }
        }
        if (show) {
            AlertDialog(
                onDismissRequest = { show = false },
                title = { Text("Alerta") },
                text = { Text("¿Estás seguro de que deseas continuar?") },
                confirmButton = {
                    TextButton(onClick = {
                        show = false
                    }) {
                        Text("Confirmar")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { show = false }) {
                        Text("Cancelar")
                    }
                }
            )
        }
    }
}

@Composable
fun ejemplodialog(modifier: Modifier) {
    Column(modifier) {
        var show by remember { mutableStateOf(true) }

        if (show) {
            Dialog(
                onDismissRequest = { show = false },
                properties = DialogProperties(
                    dismissOnClickOutside = false,
                    dismissOnBackPress = false
                )
            ) {
                Column(
                    Modifier
                        .background(Color.White)
                        .padding(24.dp)
                        .fillMaxWidth()
                ) {
                    Text("Hola")
                }
            }
        }
    }
}

@Composable
fun ejercicioDialog1(modifier: Modifier) {
    var show by remember { mutableStateOf(true) }

    if (show) {
        Dialog(
            onDismissRequest = { show = false },
            properties = DialogProperties(
                dismissOnClickOutside = false,
                dismissOnBackPress = false
            )
        ) {
            Column(
                Modifier
                    .width(500.dp)
                    .height(350.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(207, 159, 255))


            ) {
                AsyncImage(
                    model = "https://i.pinimg.com/236x/8b/8d/68/8b8d68a2fbfd23930de9dbc9da6fb0c2.jpg",
                    contentDescription = null,
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(top = 25.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "This is a cuenta with buttons and an image.",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 10.dp, end = 10.dp)
                )

                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text("Dismiss", Modifier
                        .clickable { show = true }

                    )
                    Text("Confirm", Modifier
                        .clickable { show = false }

                    )
                }
            }
        }
    }
}


@Composable
fun ejercicioDialog2(modifier: Modifier) {
    Column(modifier) {


        var show by remember { mutableStateOf(true) }

        if (show) {
            Dialog(
                onDismissRequest = { show = false },
                properties = DialogProperties(
                    dismissOnClickOutside = false,
                    dismissOnBackPress = false
                )
            ) {
                Column(Modifier
                    .background(Color.White)
                    .padding(20.dp)) {
                    Text("Configurar backup de la cuenta",Modifier.padding(bottom = 10.dp))


                    cuenta("ejemplo1@gmail.es", painterResource(R.drawable.avatar))
                    cuenta("ejemplo2@gmail.es", painterResource(R.drawable.avatar))
                    cuenta("Añadir Cuenta", painterResource(R.drawable.add))
                }
            }
        }
    }
}

@Composable
fun cuenta(texto: String, avatar: Painter) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        Image(
            painter = avatar,
            contentDescription = texto,
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(60.dp))
        )
        Text(text = texto,Modifier.padding(10.dp))
    }
}

























