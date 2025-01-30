package com.example.compose.Componentes.CheckBox.ConEstados

data class CheckInfo(
    val title: String,
    var checked: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)
