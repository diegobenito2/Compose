package com.example.compose.Componentes.Dialogs


import android.app.Dialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@Composable
fun myDialog() {
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
@Composable
fun ejercicioDialog(){
    var show by remember { mutableStateOf(true) }

    if (show) {
        Dialog(
            onDismissRequest={show=false},
            properties=DialogProperties(dismissOnClickOutside = false, dismissOnBackPress = false)

        ){
            Column (Modifier.background(Color.Gray).padding(24.dp).fillMaxWidth()){
                

            }
        }
    }
}