package com.example.primeraaplicacioncompose.Text

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.primeraaplicacioncompose.R

@Composable
fun ejemploTextField(modifier: Modifier) {
    Column(modifier) {
        var text: String by rememberSaveable { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Introduce tu nombre:") })
    }
}

@Composable
fun contraseñaTextField(modifier: Modifier) {
    var password by rememberSaveable { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    Column(modifier = modifier) {
        TextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Introduce la contraseña:") },
            visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                Image(
                    painter = painterResource(id = if (passwordHidden) R.drawable.ver else R.drawable.esconder),
                    "Imagen",
                    Modifier
                        .size(24.dp)
                        .clickable { passwordHidden = false })
            })
    }
}

@Composable
fun email(modifier: Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    Column(modifier = modifier) {
        TextField() {}
    }


}




