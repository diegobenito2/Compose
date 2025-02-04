package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.compose.Componentes.Card.EjemploCard
import com.example.compose.Componentes.Card.ejercicioCardView
import com.example.compose.Componentes.CheckBox.ConEstados.MyTriStateCheckbox
import com.example.compose.Componentes.RadioButton.MyRadioButton
import com.example.compose.Componentes.RadioButton.radioButtons
import com.example.compose.Componentes.RadioButton.radiobuttonlist
import com.example.compose.Componentes.RadioButton.radiobuttonlistciclos
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
                    ejercicioCardView(Modifier.padding(innerPadding))


                }
            }
        }
    }


}

