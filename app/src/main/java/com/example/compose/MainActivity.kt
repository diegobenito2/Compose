package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.compose.Componentes.CheckBox.ConEstados.MyTriStateCheckbox
import com.example.compose.ui.theme.ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    Box(modifier = Modifier.padding(innerPadding))
//                    botones(modifier = Modifier.padding(innerPadding))
//                    coil(modifier = Modifier.padding(innerPadding))
//                    icono(modifier = Modifier.padding(innerPadding))
//                    EjerciciosBarrier(modifier = Modifier.padding(innerPadding))
//                    progressbar(modifier = Modifier.padding(innerPadding))
//                    pruebasCheckBox(modifier = Modifier.padding(innerPadding))
                    MyTriStateCheckbox(modifier = Modifier.padding(innerPadding)) //Uso del triple estado de un checkbox padre que dependiendo de su estado actuan los hijos.

                }
            }
        }
    }



}

