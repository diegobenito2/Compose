package com.example.primeraaplicacioncompose.Components.Layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import java.util.EnumSet.range


@Composable
fun myColum(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
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