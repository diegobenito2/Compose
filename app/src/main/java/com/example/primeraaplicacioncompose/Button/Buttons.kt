package com.example.primeraaplicacioncompose.Button

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick

@Composable
fun myButton(modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(onClick = { Log.i("TAG", "Mybutton: Clicked") }) {
            Text(text = "My button")
        }

    }
}

@Composable
fun mybutton2(modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
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
}

@Composable
fun mybutton3(modifier: Modifier) {
    var enabled by rememberSaveable { mutableStateOf(true) }
    Column(
        modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled = false }, enabled = enabled, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Cyan
            ), border = BorderStroke(4.dp, Color.Black)
        ) {
            Text("My button")
        }
    }
}

@Composable
fun myButton4(modifier: Modifier) {
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
fun myButton5(modifier: Modifier) {
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


