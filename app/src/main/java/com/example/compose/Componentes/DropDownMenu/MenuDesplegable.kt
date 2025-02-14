package com.example.compose.Componentes.DropDownMenu

import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material.icons.twotone.MoreVert
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Send
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun myDropDownMenu(modifier: Modifier) {
    val options = listOf(
        "Opcion 1",
        "Opción 2",
        "Opción 3"
    ) // Define una lista de opciones que aparecerán en el DropdownMenu.
    var expanded by remember { mutableStateOf(false) } // Variable que controla si el DropdownMenu está desplegado o no. Inicialmente está cerrado.
    var selectedText by remember { mutableStateOf("") } // Variable que almacena el texto de la opción seleccionada en el DropdownMenu. Inicialmente está vacío.

    Column(modifier = modifier) { // Se crea una columna para organizar los elementos dentro del layout.
        OutlinedTextField(
            value = selectedText, // El valor del TextField será el texto seleccionado (por ejemplo, "Opcion 1").
            onValueChange = {
                selectedText = it
            }, // Esta función actualiza el valor de 'selectedText' si el usuario cambia el texto.
            // (Aunque el campo es de solo lectura, no es necesario que el usuario edite directamente aquí).
            enabled = false, // Deshabilita la edición del TextField, haciendo que sea solo de lectura.
            readOnly = true, // Hace que el TextField sea solo de lectura (no permite la edición).
            modifier = Modifier
                .clickable {
                    expanded = !expanded
                } // Hace que el TextField sea "clickable", y al hacer clic, alterna el valor de 'expanded' entre true (desplegar el menú) o false (ocultarlo).
                .fillMaxWidth() // Hace que el TextField ocupe todo el ancho disponible.
        )

        DropdownMenu(
            expanded = expanded, // Controla si el DropdownMenu está desplegado según el valor de 'expanded'.
            onDismissRequest = {
                expanded = false
            }, // Si el menú se cierra (al tocar fuera de él), 'expanded' se establece a false.
            modifier = Modifier.fillMaxWidth() // Hace que el DropdownMenu ocupe todo el ancho disponible.
        ) {
            // Itera sobre cada opción de la lista 'options' y crea un DropdownMenuItem por cada una.
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(text = option) }, // Muestra el texto de la opción en el menú.
                    onClick = {
                        selectedText =
                            option // Actualiza el texto seleccionado con la opción elegida.
                        expanded = false // Cierra el menú después de seleccionar una opción.
                    })
            }
        }
    }
}

@Composable
fun ejercicioMenuDesplegable(modifier: Modifier) {
    var items = listOf(
        "Profile" to listOf(Icons.TwoTone.Person),
        "Settings" to listOf(Icons.TwoTone.Settings),
        "Send Feedback" to listOf(Icons.TwoTone.Settings, Icons.TwoTone.Send),
        "About" to listOf(Icons.TwoTone.Info),
        "Help" to listOf(
            Icons.TwoTone.Settings,
            Icons.TwoTone.Add
//            painterResource(R.drawable.la)
        )
    )
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = modifier) {
        Icon(
            Icons.TwoTone.MoreVert,
            contentDescription = "Icono_menu",
            Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { expanded = !expanded }
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(200.dp)
        ) {
            items.forEach { (name, icons) ->
                DropdownMenuItem(
                    text = {
                        Column {
                            if (name.equals("Send Feedback"))
                                HorizontalDivider(
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 5.dp)
                                )
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                if (icons[0] is ImageVector) {
                                    Icon(
                                        imageVector = icons[0],
                                        contentDescription = "",
                                        modifier = Modifier.padding(end = 5.dp)
                                    )
                                }
//                                if (icons[0] is Painter) {
//                                    Icon(
//                                        painter = icons[0],
//                                        contentDescription = "",
//                                        modifier = Modifier.padding(end = 5.dp)
//                                    )
//                                }
                                Text(text = name)
                                if (icons.size == 2) {


                                        if (icons[1] is ImageVector) {
                                            Icon(
                                                imageVector = icons[1],
                                                contentDescription = "",
                                                modifier = Modifier.padding(start = 5.dp)
                                            )
                                        }

//                                    if (icons[1] is Painter) {
//                                        Icon(
//                                            painter = icons[1],
//                                            contentDescription = "",
//                                            modifier = Modifier.padding(end = 5.dp)
//                                        )
//                                    }

                                }
                            }
                            if (name.equals("Send Feedback"))
                                HorizontalDivider(
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(top = 5.dp)
                                )
                        }

                    },
                    onClick = { expanded = false }
                )
            }

        }
    }
}
