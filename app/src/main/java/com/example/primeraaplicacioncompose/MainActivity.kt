package com.example.primeraaplicacioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.primeraaplicacioncompose.Coil.coil
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
//                    email(modifier = Modifier.padding(innerPadding))
//                    funcionesComposable(modifier = Modifier.padding(innerPadding))
//                    elevacionDeEstado(modifier = Modifier.padding(innerPadding))
//                    botones(modifier = Modifier.padding(innerPadding))
//                    myImage(modifier = Modifier.padding(innerPadding))
//                    ImagenContentScaleFit(modifier = Modifier.padding(innerPadding))
                    coil(modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }

}
