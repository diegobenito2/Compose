package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.Componentes.Barrier.EjerciciosBarrier
import com.example.compose.Componentes.ProgressBar.progressbar
import com.example.compose.Iconos.icono
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
                    icono(modifier = Modifier.padding(innerPadding))
//                    EjerciciosBarrier(modifier = Modifier.padding(innerPadding))
//                    progressbar(modifier = Modifier.padding(innerPadding))
                }
            }
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