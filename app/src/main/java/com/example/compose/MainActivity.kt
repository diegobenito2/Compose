package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.Componentes.Estados.CheckInfo
import com.example.compose.Componentes.Estados.MyCheckBoxStateHoisting
import com.example.compose.Componentes.Estados.MyTriStateCheckbox
import com.example.compose.Componentes.Estados.getOptions
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
                    Column {
                        var status by rememberSaveable { mutableStateOf(false) }
                        var checkInfo = CheckInfo(title = "CheckBox", checked = status,
                            onCheckedChange = { status = it })

                        var myOptions = getOptions(listOf("Opción 1", "Opción 2", "Opción 3"))
                        Column(modifier = Modifier.padding(innerPadding)) {
                            MyCheckBoxStateHoisting(checkInfo)
                            Column(Modifier.padding(start = 20.dp)) {
                                myOptions.forEach {
                                    MyCheckBoxStateHoisting(checkInfo = it)
                                }
                            }
                        }
                        var statuspadre by rememberSaveable { mutableStateOf(ToggleableState.Off) }
                        val hijos = rememberSaveable { mutableStateListOf(ToggleableState.Off, ToggleableState.Off, ToggleableState.Off) }

                        var checkInfoPadre = CheckInfo(title = "Padre", checked = statuspadre,
                            onCheckedChange = { statuspadre = it })
                        myOptions = getOptions(listOf("Hijo 1", "Hijo 2", "Hijo 3"))
                        Column(modifier = Modifier.padding(innerPadding)) {
                            MyTriStateCheckbox(checkInfoPadre)

                            Column(Modifier.padding(start = 20.dp)) {
                                myOptions.forEach {
                                    MyCheckBoxStateHoisting(checkInfo = it)

                                }
                            }
                        }
                    }
                }
            }
        }
    }
    @Composable
    fun MyTriStateCheckbox(checkInfo: CheckInfo) {
        var state by rememberSaveable { mutableStateOf(ToggleableState.Off) }

        Row(verticalAlignment = Alignment.CenterVertically) {
            TriStateCheckbox(
                state = state,
                onClick = {
                    // Cambia el estado del padre
                    state = when (state) {
                        ToggleableState.Off -> ToggleableState.On
                        ToggleableState.On -> ToggleableState.Indeterminate
                        ToggleableState.Indeterminate -> ToggleableState.Off
                    }

                    // Actualiza el estado de los hijos dependiendo del estado del padre
                    when (state) {
                        ToggleableState.On -> {
                            hijos.replaceAll { ToggleableState.On }
                        }
                        ToggleableState.Off -> {
                            hijos.replaceAll { ToggleableState.Off }
                        }
                        ToggleableState.Indeterminate -> {
                            // Deja a los hijos con un estado indeterminado o mixto
                        }
                    }
                }
            )
            Text(text = checkInfo.title)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        Greeting("Android")
    }
}