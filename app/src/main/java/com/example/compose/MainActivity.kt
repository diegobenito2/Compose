package com.example.compose

import com.example.compose.ui.theme.ComposeTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold

import androidx.compose.ui.Modifier
import com.example.compose.Componentes.DropDownMenu.myDropDownMenu
import com.example.compose.Componentes.RecyclerView.HeroeRecyclerView
import com.example.compose.Componentes.RecyclerView.HeroeRecyclerView2
import com.example.compose.Componentes.RecyclerView.MovieRecyclerView

import com.example.compose.Componentes.RecyclerView.MyRecyclerView


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
                    //  MyTriStateCheckbox(modifier = Modifier.padding(innerPadding)) //Uso del triple estado de un checkbox padre que dependiendo de su estado actuan los hijos.
//                    radioButtons(modifier = Modifier.padding(innerPadding))
//                    trescheckboxIndependientes(modifier = Modifier.padding(innerPadding))
//                    EjemploCard(Modifier.padding(innerPadding))
//                    Column(modifier = Modifier.padding(innerPadding)) {
//                        Text("Matriculación Ciclos")
//                        val cicloselected = listOf("DAW", "DAM", "ASIR")
//                        var selectedCiclo by remember { mutableStateOf("DAW") }
//                        radiobuttonlistciclos(selectedCiclo, cicloselected, { selectedCiclo = it })
//                    }
//                    ejercicioCardView(Modifier.padding(innerPadding))
//                    mySurface(Modifier.padding(innerPadding))
//                    myDropDownMenu(Modifier.padding(innerPadding)) //Ejemplo Menu Desplegable.
//                    ejercicioMenuDesplegable(Modifier.padding(innerPadding)) //Ejercicio Menu Desplegable.
//                    mySlider(Modifier.padding(innerPadding))
//                    myAdvancedSlider(Modifier.padding(innerPadding))
//                    slidersColores(Modifier.padding(innerPadding))
//                    ejemploalertDialog(Modifier.padding(innerPadding))
//                    ejemplodialog(Modifier.padding(innerPadding)) // Ejemplo cuenta con propiedades para que no te puedas salir.
//                    ejercicioDialog1(Modifier.padding(innerPadding))
//                    ejercicioDialog2(Modifier.padding(innerPadding))
//                    MyRecyclerView(Modifier.padding(innerPadding))
//                    HeroeRecyclerView(Modifier.padding(innerPadding)) // Recyclerview grill con boton para volver arriba
//                    HeroeRecyclerView2(Modifier.padding(innerPadding)) //Sticky Header Agrupaciones.
                    MovieRecyclerView(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

