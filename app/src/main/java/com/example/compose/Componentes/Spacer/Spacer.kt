package com.example.compose.Componentes.Spacer

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Spacer(size:Int)= Spacer(modifier = Modifier.height(size.dp))