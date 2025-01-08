package com.example.primeraaplicacioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primeraaplicacioncompose.ui.theme.PrimeraAplicacionComposeTheme
import com.example.primeraaplicacioncompose.Components.Layouts.myColum

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAplicacionComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    greeting(
                        name = "Diego",
                        modifier = Modifier.padding(innerPadding)
                    )
                    mytext(
                        "Hola mundo", Modifier
                            .padding(25.dp)
                            .fillMaxWidth()
                            .background(Color.Green)
                    )
                    myBox2()
                    myColum()


                }
            }
        }
    }
}

@Composable
fun greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun mytext(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun mytext() {
    mytext(
        "Adios", Modifier
            .padding(25.dp)
            .fillMaxWidth()
            .background(Color.Green)
    )
    mytext(
        "Hola",
        Modifier
            .background(Color.Green)
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun greetingPreview() {
    PrimeraAplicacionComposeTheme {
        greeting("Diego")
    }
}

@Composable
fun myBox1() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun myBox2() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Red), contentAlignment = Alignment.BottomEnd
        ) {
            Text(text = "Hola")
        }
    }
}
