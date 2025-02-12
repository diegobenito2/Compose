

package com.example.compose.Componentes.RecyclerView

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R


@Composable
fun HeroeRecyclerView(modifier: Modifier) {
    val context = LocalContext.current
    Column(modifier = modifier) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            content = {
                items(
                    items = getHeroes()
                ) { superheroe ->
                    itemHeroe(superheroe = superheroe) {
                        Toast.makeText(
                            context,
                            superheroe.superheroeName,
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            })


    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HeroeRecyclerView2(modifier: Modifier) {
    val context = LocalContext.current
    val heroes = getHeroes().groupBy { it.publisher }
    Column(modifier = modifier) {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)){
            heroes.forEach { publisher, heroe ->
                stickyHeader {
                    Text(
                        text = publisher, modifier = Modifier.fillMaxWidth(), fontSize = 16.sp, color = Color.White
                    )
                }
                items(heroe){
                    itemHeroe(superheroe = it) {Toast.makeText(context,it.superheroeName,Toast.LENGTH_SHORT).show() }
                }
            }
        }
    }
}

@Composable
fun itemHeroe(superheroe: HeroeData, onItemSelected: (HeroeData) -> Unit) {
    Card(
        Modifier
            .width(400.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {
        Column {
            Image(
                painter = painterResource(id = superheroe.photo),
                contentDescription = superheroe.superheroeName,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .clickable { onItemSelected(superheroe) },
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