package com.example.primeraaplicacioncompose.Components.Layouts.Tutoriales


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R
@Composable
fun Tutorial2(modifier: Modifier){
    Tutorial02()
}

@Preview (showBackground = true)
@Composable
fun Tutorial02() {

    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.bg_compose_background),"Imagen",Modifier.fillMaxWidth().padding(bottom = 8.dp))
        Text(
            "JetPack Compose Tutorial",
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )

        var mensage: String =
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
        Text(
            mensage, Modifier
                .fillMaxWidth()
                .padding(0.dp, 16.dp, 0.dp, 16.dp),
            textAlign = TextAlign.Justify
        )
        mensage =
            "In this tutorial4_0, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        Text(
            mensage, Modifier
                .fillMaxWidth()
                .padding(16.dp, 16.dp, 16.dp, 16.dp),
            textAlign = TextAlign.Justify
        )
    }

}