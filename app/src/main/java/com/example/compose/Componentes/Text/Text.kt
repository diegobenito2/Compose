package com.example.compose.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

@Preview(showBackground = true)
@Composable
fun greetingPreview() {
    ComposeTheme {
        Greeting("Diego")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
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

@Composable
fun ejemplosTexto(modifier: Modifier) {
    Column(modifier) {
        Text(text = "Hola Luis")
        Text(text = "Hola Luis", color = Color.Red)
        Text(text = "Hola Luis", fontSize = 30.sp)
        Text(text = "Hola Luis", fontStyle = FontStyle.Italic)
        Text(text = "Hola Luis", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp)
        Text(text = "Hola Luis", letterSpacing = 4.sp)
        Text(text = "Hola Luis", textDecoration = TextDecoration.LineThrough)
        Text(text = "Hola Luis", textDecoration = TextDecoration.Underline)
        Text(
            text = "Hola Luis", textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            )
        )
        Text(text = "Hola Luis", color = Color.Blue, textDecoration = TextDecoration.Underline, modifier = Modifier.clickable {  })
//        Text(text="Hola Luis", modifier = modifier.align(Alignment.))
        Text(text="Hola Luis", maxLines = 1, overflow = TextOverflow.Ellipsis)

    }
}
