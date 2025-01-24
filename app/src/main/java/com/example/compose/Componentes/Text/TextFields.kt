package com.example.primeraaplicacioncompose.Text


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.compose.R

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
    Column(
        modifier = modifier
    ) {
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("E-mail:") },
            singleLine = true,
            maxLines = 1,
            minLines = 0,
            placeholder = { Text("Escriba aquí.", color = Color.Black) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email icon"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Check icon"
                )
            },
            supportingText = { Text("00000") },
            keyboardOptions = KeyboardOptions.Default,
            colors = androidx.compose.material3.OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF6200EE), // Border color when focused
                unfocusedBorderColor = Color.Gray, // Border color when unfocused
                focusedLabelColor = Color(0xFF6200EE), // Label color when focused
                unfocusedLabelColor = Color.Gray // Label color when unfocused
            )
        )


    }
}





