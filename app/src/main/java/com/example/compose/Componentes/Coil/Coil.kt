package com.example.compose.Componentes.Coil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun coil(modifier: Modifier) {
    Column(modifier.fillMaxSize()) {
        AsyncImage(
            model = "https://loremflickr.com/320/240",
            contentDescription = null, Modifier
                .fillMaxWidth().height(200.dp)
                .padding(top = 16.dp), contentScale = ContentScale.Crop
        )

        Text("Title 1", Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Cyan).align(Alignment.CenterHorizontally).padding(15.dp), fontWeight = FontWeight.Medium, textAlign = TextAlign.Center)
    }


}

