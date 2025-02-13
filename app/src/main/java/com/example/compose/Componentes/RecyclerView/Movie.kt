package com.example.compose.Componentes.RecyclerView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun MovieRecyclerView(modifier: Modifier) {
    val MovieList = getMovieList()
    val rvState = rememberLazyListState()
    Column(modifier) {
        val showButtondown by remember { derivedStateOf { rvState.firstVisibleItemIndex > 0 } }
        val showButtonup by remember { derivedStateOf { rvState.firstVisibleItemIndex < getMovieList().size - 2 } }
        val corutines = rememberCoroutineScope()
        Row {
            if (showButtonup) {
                Button(
                    onClick = { corutines.launch { rvState.animateScrollToItem(getMovieList().size - 1) } },
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(16.dp)
                        .weight(1f)
                ) { Text(text = "Ir abajo") }

            }
        }
        LazyColumn(
            state = rvState,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        ) {
            items(MovieList) {
                itemMovie(movie = it)
            }
        }
        Row {

            if (showButtondown) {
                Button(
                    onClick = { corutines.launch { rvState.animateScrollToItem(0) } },
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(16.dp)
                        .weight(1f)
                ) { Text(text = "Ir arriba") }
            }


        }

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