package com.example.primeraaplicacioncompose.Coil

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage

@Composable
fun coil(modifier: Modifier){
    AsyncImage(
        model = "https://www.google.com/imgres?q=pogacar&imgurl=https%3A%2F%2Fwww.ciclismoafondo.es%2Fuploads%2Fs1%2F13%2F88%2F14%2F27%2Fpoga-ai.jpeg&imgrefurl=https%3A%2F%2Fwww.ciclismoafondo.es%2Fnoticias%2Ftodo-quiere-ganar-pogacar-en-2025_304149_102.html&docid=MoHaRmOCCNqCnM&tbnid=vEg5RV2qAEfZ4M&vet=12ahUKEwjojaOGqYmLAxWWRKQEHYTcG5EQM3oECHkQAA..i&w=2000&h=1333&hcb=2&ved=2ahUKEwjojaOGqYmLAxWWRKQEHYTcG5EQM3oECHkQAA",
        contentDescription = null,
    )
}

