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

    // Mapa mutable para almacenar los módulos seleccionados (true si están marcados)
    var texto_Toast = remember { mutableStateOf("") }
    // Mapa mutable para almacenar los módulos seleccionados (true si están marcados)
    val seleccionModulos = remember { mutableStateMapOf<String, Boolean>() }
    Column {
        // Recorremos la lista de módulos y creamos un Checkbox para cada uno
        list.forEach { modulo ->
            val estado = seleccionModulos[modulo] ?: false

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = estado,
                    onCheckedChange = { isChecked ->
                        // Actualizamos el estado del módulo en el mapa
                        seleccionModulos[modulo] = isChecked
                        // Actualizamos el texto del Toast con los módulos seleccionados
                        texto_Toast.value = seleccionModulos
                            .filterValues { it } // Filtramos los que están marcados
                            .keys // Los convertimos en un solo string
                            .joinToString(" ")// Los convertimos en un solo string
                    }
                )
                Text(text = modulo) // Mostramos el nombre del módulo junto al Checkbox
            }
        }
    }
    // Devolvemos el texto del Toast sin espacios adicionales
    return texto_Toast.value.trim()
}
