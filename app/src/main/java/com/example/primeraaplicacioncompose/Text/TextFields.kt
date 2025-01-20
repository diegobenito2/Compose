package com.example.primeraaplicacioncompose.Text


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.AlertDialogDefaults.shape
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
/*Parámetros:
- **value**: el valor de entrada TextFieldValue que se mostrará en el campo de texto.
- **onValueChange**: el callback que se activa cuando el servicio de entrada actualiza los valores en TextFieldValue.
 Un TextFieldValue actualizado se pasa como parámetro al callback.
- **modifier**: el modificador que se aplicará a este campo de texto.
- **enabled**: controla el estado habilitado de este campo de texto. Cuando es falso, este componente no responderá a la entrada del usuario,
y aparecerá visualmente deshabilitado y también deshabilitado para los servicios de accesibilidad.
- **readOnly**: controla el estado de edición del campo de texto. Cuando es verdadero, el campo de texto no se puede modificar.
Sin embargo, el usuario puede enfocarlo y copiar el texto desde él. Los campos de texto de solo lectura suelen usarse para mostrar formularios prellenados que el usuario no puede editar.
- **textStyle**: el estilo que se aplicará al texto de entrada. Por defecto, es LocalTextStyle.
- **label**: la etiqueta opcional que se mostrará dentro del contenedor del campo de texto.
El estilo de texto predeterminado para el texto interno es Typography.bodySmall cuando el campo de texto está en foco y Typography.bodyLarge cuando no lo está.
- **placeholder**: el texto de marcador opcional que se mostrará cuando el campo de texto esté en foco y el texto de entrada esté vacío.
El estilo de texto predeterminado para el texto interno es Typography.bodyLarge.
- **leadingIcon**: el ícono opcional que se mostrará al inicio del contenedor del campo de texto.
- **trailingIcon**: el ícono opcional que se mostrará al final del contenedor del campo de texto.
- **prefix**: el prefijo opcional que se mostrará antes del texto de entrada en el campo de texto.
- **suffix**: el sufijo opcional que se mostrará después del texto de entrada en el campo de texto.
- **supportingText**: el texto de apoyo opcional que se mostrará debajo del campo de texto.
- **isError**: indica si el valor actual del campo de texto está en estado de error. Si se establece en verdadero,
la etiqueta, el indicador inferior y el ícono de cierre se mostrarán por defecto en color de error.
- **visualTransformation**: transforma la representación visual del valor de entrada. Por ejemplo, puedes usar PasswordVisualTransformation para crear un campo de texto para contraseñas.
Por defecto, no se aplica ninguna transformación visual.
- **keyboardOptions**: opciones del teclado de software que contienen configuraciones como KeyboardType e ImeAction.
- **keyboardActions**: cuando el servicio de entrada emite una acción IME, se llama al callback correspondiente.
 Ten en cuenta que esta acción IME puede ser diferente de la especificada en KeyboardOptions. imeAction.
- **singleLine**: cuando es verdadero, este campo de texto se convierte en un campo de texto de una sola línea que se desplaza horizontalmente en lugar de envolver el texto en varias líneas.
El teclado se informará para no mostrar la tecla de retorno como ImeAction. Ten en cuenta que el parámetro maxLines será ignorado ya que el atributo maxLines se configurará automáticamente en 1.
- **maxLines**: la altura máxima en términos de número máximo de líneas visibles. Se requiere que 1 <= minLines <= maxLines. Este parámetro se ignora cuando singleLine es verdadero.
- **minLines**: la altura mínima en términos de número mínimo de líneas visibles. Se requiere que 1 <= minLines <= maxLines. Este parámetro se ignora cuando singleLine es verdadero.
- **interactionSource**: el MutableInteractionSource que representa la secuencia de interacciones para este campo de texto.
 Puedes crear y pasar tu propia instancia recordada para observar las interacciones y personalizar la apariencia / comportamiento de este campo de texto en diferentes estados.
- **shape**: define la forma del contenedor de este campo de texto.
- **colors**: TextFieldColors que se utilizarán para resolver los colores usados para este campo de texto en diferentes estados. Consulta TextFieldDefaults.colors.*/

@Composable
fun email(modifier: Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = modifier
    ) {
        TextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            label = { "E-mail:" },
            placeholder = { "Escriba aquí." },
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
            supportingText = { "00000" },
            singleLine = true,
            maxLines = 1,
            minLines = 0,
            keyboardOptions = KeyboardOptions.Default,
            colors = TextFieldDefaults.textFieldColors(
                Color(0xFFF5F5F5),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp)
        )
    }
}





