package com.example.compose.Componentes.RadioButton

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@Composable
fun radiobuttonlistciclos(
    selectedCiclo: String, options: List<String>, onOptionSelected: (String) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {

        options.forEach { option ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = selectedCiclo == option,
                    onClick = { onOptionSelected(option) })
                Text(text = option)
            }
        }

        var context = LocalContext.current
        // Utilizamos un estado mutable aquí para actualizar el texto del Toast
        var textoToas by remember { mutableStateOf("") }

        // Generamos la lista de módulos y el texto del Toast asociado
        val modulosTexto = seleccionModulos(selectedCiclo)
        Button(onClick = {
            // Establecemos el texto del Toast antes de mostrarlo
            textoToas = modulosTexto
            Toast.makeText(context, textoToas, Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Matricularme")
        }
    }
}

@Composable
fun seleccionModulos(
    selectedOption: String
): String {
    val modulos = when (selectedOption) {
        "DAW" -> listOf(
            "Desarrollo web en entorno cliente",
            "Desarrollo web en entorno servidor",
            "Despliegue de aplicaciones web",
            "Diseño de interfaces web",
            "Proyecto de desarrollo de aplicaciones web"
        )

        "DAM" -> listOf(
            "Acceso a datos",
            "Desarrollo de interfaces",
            "Programación multimedia y dispositivos móviles",
            "Programación de servicios y procesos",
            "Sistemas de gestión empresarial"
        )

        "ASIR" -> listOf(
            "Servicios de red e Internet",
            "Implantación de aplicaciones web.",
            "Administración de sistemas gestores de bases de datos",
            "Seguridad y alta disponibilidad",
            "Proyecto de administración de sistemas informáticos en red"
        )

        else -> emptyList()
    }
    // Le pasas la lista de módulos y te devuelve el texto para el Toast
    return modulos(modulos)
}

@Composable
fun modulos(list: List<String>): String {
    // Definimos el estado que acumulará el texto
    var texto_Toast = remember { mutableStateOf("") }

    Column {
//        var seleccionmodulo by remember { mutableStateMapOf<String,Boolean>() }
        list.forEach({ modulo ->
            var estado by remember { mutableStateOf(false) }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = estado, onCheckedChange = {
                    estado = it
                    // Actualizamos el texto_Toast agregando o eliminando módulos
                    texto_Toast.value = if (estado) {
                        "${texto_Toast.value} $modulo"
                    } else {
                        texto_Toast.value.replace(" $modulo", "")
                    }
                })
                Text(text = modulo)
            }
        })
    }
    // Retornamos el texto acumulado
    return texto_Toast.value.trim()
}
