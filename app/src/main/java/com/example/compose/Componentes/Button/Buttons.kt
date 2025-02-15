package com.example.compose.Button

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun botones(modifier: Modifier) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        mybutton(modifier)
        mybutton2(modifier)
        mybutton3(modifier)
        mybutton4(modifier)
        mybutton5(modifier)
    }
}

@Composable
fun mybutton(modifier: Modifier) {

    Button(onClick = { Log.i("TAG", "Mybutton: Clicked") }, modifier = modifier) {
        Text(text = "My button")
    }


}

@Composable
fun mybutton2(modifier: Modifier) {

    Button(
        onClick = { Log.i("TAG", "Mybutton: Clicked") },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.Cyan
        ), border = BorderStroke(4.dp, Color.Black)
    ) {
        Text(text = "My button")
    }


}

@Composable
fun mybutton3(modifier: Modifier) {
    var enabled by rememberSaveable { mutableStateOf(true) }

    Button(
        onClick = { enabled = false }, enabled = enabled, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.Cyan
        ), border = BorderStroke(4.dp, Color.Black)
    ) {
        Text("My button")
    }

}

@Composable
fun mybutton4(modifier: Modifier) {
    var enabled by rememberSaveable { mutableStateOf(true) }

    OutlinedButton(
        onClick = { enabled = false }, colors = ButtonDefaults.buttonColors(
            Color.Red,
            Color.White
        )
    ) {
        Text(text = "Reset")
    }
}

@Composable
fun mybutton5(modifier: Modifier) {
    var enabled by rememberSaveable { mutableStateOf(true) }

    TextButton(
        onClick = { enabled = false }, colors = ButtonDefaults.buttonColors(
            Color.Red,
            Color.White
        )
    ) {
        Text(text = "Exit")
    }
}


