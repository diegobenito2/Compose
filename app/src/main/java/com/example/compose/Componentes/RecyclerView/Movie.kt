@file:OptIn(ExperimentalFoundationApi::class)

package com.example.compose.Componentes.RecyclerView

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun MovieRecyclerView(modifier: Modifier) {

    val rvState = rememberLazyListState()
    val rvState2 = rememberLazyGridState()

    Column(modifier) {
        val showButtondown by remember { derivedStateOf { rvState.firstVisibleItemIndex > 1 } }
        val showButtonup by remember { derivedStateOf { rvState.firstVisibleItemIndex < getMovieList().size - 2 } }

        var checked by remember { mutableStateOf(false) }
        // Agrupar la lista de películas
        val movieList = if (checked) {
            getMovieList().groupBy { it.genero }
        } else {
            getMovieList().groupBy { it.año }
        }
        var selectedText by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxWidth()) {
            // Mostrar botón "Ir abajo" solo si es necesario
            if (showButtonup) {
                ButtonScroll(
                    text = "Ir abajo",
                    isScrollUp = false,
                    rvState = rvState,
                    targetIndex = getMovieList().size - 1,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(16.dp)
                        .weight(1f)
                )
            }

            // Switch
            Switch(
                checked = checked,
                onCheckedChange = { checked = !checked },
                modifier = Modifier.weight(1f),
                enabled = true,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFF4CAF50), // Verde suave
                    uncheckedThumbColor = Color(0xFF9E9E9E), // Gris suave
                    checkedTrackColor = Color(0xFF81C784), // Verde claro
                    uncheckedTrackColor = Color(0xFFE57373), // Rosa suave
                    disabledCheckedTrackColor = Color(0xFFB2FF59), // Amarillo claro
                    disabledUncheckedTrackColor = Color(0xFFEEEEEE), // Gris suave
                    disabledCheckedThumbColor = Color(0xFF4CAF50), // Verde para el thumb desactivado
                    disabledUncheckedThumbColor = Color(0xFF9E9E9E) // Gris para el thumb desactivado
                )
            )
            val options = listOf(
                "LazyColumn",
                "LazyRow",
                "LazeVerticalGrid"
            )
            var expanded by remember { mutableStateOf(false) }


            IconButton(onClick = { expanded = !expanded }, modifier = Modifier.weight(1f)) {
                Icon(Icons.Default.MoreVert, contentDescription = "Menú de opciones")
            }


            // Menú desplegable
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }, offset = DpOffset(x = 300.dp, y = -30.dp),
                modifier = Modifier.width(200.dp)
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(text = option) },
                        onClick = {
                            selectedText = option
                            expanded = false
                        })
                }
            }
        }
        when (selectedText) {
            "LazyColumn" -> {
                LazyColumn(
                    state = rvState,
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                ) {
                    movieList.forEach { (key, movieList) ->
                        stickyHeader {

                        }
                        items(movieList) { movie ->
                            itemMovie(movie = movie)
                        }
                    }
                }
            }

            "LazyRow" -> {
                LazyRow(
                    state = rvState,
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                ) {
                    movieList.forEach { (key, movieList) ->
                        stickyHeader {

                        }
                        items(movieList) { movie ->
                            itemMovie(movie = movie)
                        }
                    }
                }
            }

            "LazeVerticalGrid" -> {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    state = rvState2,
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                ) {
                    movieList.forEach { (key, movieList) ->
                        items(movieList) { movie ->
                            itemMovie(movie = movie)
                        }
                    }
                }
            }

        }

        Row {
            if (showButtondown) {
                ButtonScroll(
                    text = "Ir arriba",
                    isScrollUp = true,
                    rvState = rvState,
                    targetIndex = 0,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(16.dp)
                        .weight(1f)
                )
            }
        }
    }


}

@Composable
fun ButtonScroll(
    text: String,
    isScrollUp: Boolean,
    rvState: LazyListState,
    targetIndex: Int, modifier: Modifier
) {
    val corutines = rememberCoroutineScope()
    Button(
        onClick = {
            corutines.launch {
                if (isScrollUp) {
                    rvState.animateScrollToItem(0) // Desplaza hacia arriba
                } else {
                    rvState.animateScrollToItem(targetIndex) // Desplaza hacia abajo
                }
            }
        },
        modifier = modifier
    ) {
        Text(text = text)
    }
}


@Composable
fun itemMovie(movie: MovieData) {
    Card(
        Modifier
            .width(400.dp)
            .clip(RoundedCornerShape(20.dp))
            .padding(bottom = 8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = movie.caratula),
                contentDescription = movie.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = movie.nombre,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 8.dp)
            )
            Text(
                text = movie.descripcion,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 2.dp, start = 20.dp, end = 20.dp, bottom = 2.dp)
            )
            Text(
                text = "Año: " + movie.año,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = movie.genero,
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(8.dp)
            )
        }
    }
}