package com.example.compose.Componentes.RecyclerView

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyRecyclerView(modifier: Modifier) {
    val myList = listOf("Marta", "Pepe", "Manolo", "Jaime")
    LazyColumn (modifier){
        item {
            Text(text = "Mi primer RecyclerView")
        }
        items(
            count = 7
        ) {
            Text(text = "Este es el item $it")
        }
        items(myList) {
            Text(text = "Hola me llamo $it")
        }
    }
}