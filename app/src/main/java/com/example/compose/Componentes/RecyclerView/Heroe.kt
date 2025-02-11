package com.example.compose.Componentes.RecyclerView

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

data class SuperHeroe(
    val photo: coil3.Image,
    val publisher: String,
    val realName: String,
    val superheroeName: String
)


@Composable
fun HeroeRecyclerView() {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getSuperHeroes()) {
            itemHeroe(Superhero = it)
        }
    }
}

fun getSuperHeroes(): SuperHeroe {

}

@Composable
fun itemHeroe(superheroe: SuperHeroe) {
    Card(
        Modifier
            .width(200.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {
        Column {
            Image(
                painterResource(id = superheroe.photo),
                contentDescription = "Superheroe avatar",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superheroe.superheroeName,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = superheroe.realName,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = superheroe.publisher,
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(8.dp)
            )
        }
    }
}