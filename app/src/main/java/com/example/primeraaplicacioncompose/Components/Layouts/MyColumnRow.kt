package com.example.primeraaplicacioncompose.Components.Layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun myColum(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            "Diego 1", modifier = Modifier
                .background(Color.Red)
//                .weight(1f)
        )
        Text(
            "Diego 2", modifier = Modifier
                .background(Color.Blue)
//                .weight(1f)
        )
        Text(
            "Diego 3", modifier = Modifier
                .background(Color.Cyan)
//                .weight(1f)
        )
        for (i in 4..100) {
            Text(
                "Diego " + i, modifier = Modifier
                    .background(Color.Green)
//                    .weight(1f)
            )
        }


    }
}

@Composable
fun myRow(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
        , horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        for (i in 1..100) {
            Text(
                "Diego " + i, modifier = Modifier
                    .background(Color.Green)
            )
        }
    }
}