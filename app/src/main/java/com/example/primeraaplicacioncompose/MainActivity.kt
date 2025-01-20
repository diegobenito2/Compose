package com.example.primeraaplicacioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales.Tutorial1
import com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales.Tutorial2
import com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales.tutorial3
import com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales.tutorial4
import com.example.primeraaplicacioncompose.Components.Layouts.constraint.Ejemplo1
import com.example.primeraaplicacioncompose.Components.Layouts.constraint.Ejercicio1Constraint
import com.example.primeraaplicacioncompose.Components.Layouts.constraint.Ejercicio2Constraint
import com.example.primeraaplicacioncompose.Components.Layouts.myColum
import com.example.primeraaplicacioncompose.Components.Layouts.myRow
import com.example.primeraaplicacioncompose.Text.ejemplosTexto
import com.example.primeraaplicacioncompose.Text.Greeting
import com.example.primeraaplicacioncompose.Text.contraseñaTextField
import com.example.primeraaplicacioncompose.Text.ejemploTextField
import com.example.primeraaplicacioncompose.Text.email
import com.example.primeraaplicacioncompose.Text.mytext
import com.example.primeraaplicacioncompose.ui.theme.PrimeraAplicacionComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAplicacionComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    ejemploTextField(modifier = Modifier.padding(innerPadding))
//                    contraseñaTextField(modifier=Modifier.padding(innerPadding))
//                    menu(modifier = Modifier.padding(innerPadding))
                    email(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }


//    @Composable
//    fun menu(modifier: Modifier) {
//        Column(
//            modifier
//        ) {
//            Button(onClick = {
//                Greeting(
//                    name = "Diego",
//                    modifier = modifier
//                )
//            }) {
//                Text("Saludo")
//            }
//
//            Button(onClick = { mytext()}) {
//                Text("Texto personalizado")
//            }
//            Button(onClick = { myColum() }) {
//                Text("Ejecutar myColum")
//            }
//            Button(onClick = { myRow(modifier = modifier) }) {
//                Text("Ejecutar myRow")
//            }
//            Button(onClick = {
//                Tutorial1(
//                    "Hola esto es el tutorial4_0 1",
//                    "From Diego",
//                    modifier = modifier
//                )
//            }) {
//                Text("Tutorial 1")
//            }
//            Button(onClick = { Tutorial2(modifier = modifier) }) {
//                Text("Tutorial 2")
//            }
//            Button(onClick = { tutorial3(modifier = modifier) }) {
//                Text("Tutorial 3")
//            }
//            Button(onClick = { tutorial4(modifier = modifier) }) {
//                Text("Tutorial 4")
//            }
//            Button(onClick = { Ejemplo1(modifier = modifier) }) {
//                Text("Ejemplo 1 Constraint")
//            }
//            Button(onClick = { Ejercicio1Constraint(modifier = modifier) }) {
//                Text("Ejercicio 1 Constraint")
//            }
//            Button(onClick = { Ejercicio2Constraint(modifier = modifier) }) {
//                Text("Ejercicio 2 Constraint")
//            }
//            Button(onClick = { ejemplo1Estado(modifier = modifier) }) {
//                Text("Ejemplo 1 Estado")
//            }
//            Button(onClick = { ejemplo2Estado(modifier = modifier) }) {
//                Text("Ejemplo 2 Estado")
//            }
//            Button(onClick = { ejemplosTexto(modifier) }) { }
//
//        }
//    }
}
