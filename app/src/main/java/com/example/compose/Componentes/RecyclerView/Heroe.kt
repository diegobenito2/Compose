package com.example.compose.Componentes.RecyclerView

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.R

data class SuperHeroe(
    val photo: Int,
    val publisher: String,
    val realName: String,
    val superheroeName: String
)


@Composable
fun HeroeRecyclerView(modifier: Modifier) {
    val context = LocalContext.current
    Column(modifier = modifier) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            content = {
                items(
                    items = listOf(
                        SuperHeroe(
                            photo = R.drawable.spiderman,
                            publisher = "Marvel",
                            realName = "Peter Parker",
                            superheroeName = "Spider-Man"
                        ),
                        SuperHeroe(
                            photo = R.drawable.batman,
                            publisher = "DC",
                            realName = "Bruce Wayne",
                            superheroeName = "Batman"
                        ),
                        SuperHeroe(
                            photo = R.drawable.superman,
                            publisher = "DC",
                            realName = "Clark Kent",
                            superheroeName = "Superman"
                        ),
                        SuperHeroe(
                            photo = R.drawable.ironman,
                            publisher = "Marvel",
                            realName = "Tony Stark",
                            superheroeName = "Iron Man"
                        ),
                        SuperHeroe(
                            photo = R.drawable.wonderman,
                            publisher = "DC",
                            realName = "Diana Prince",
                            superheroeName = "Wonder Woman"
                        ),
                        SuperHeroe(
                            photo = R.drawable.capitanamerica,
                            publisher = "Marvel",
                            realName = "Steve Rogers",
                            superheroeName = "Captain America"
                        ),
                        SuperHeroe(
                            photo = R.drawable.deadpool,
                            publisher = "Marvel",
                            realName = "Wade Wilson",
                            superheroeName = "Deadpool"
                        ), SuperHeroe(
                            photo = R.drawable.wolverine,
                            publisher = "Marvel",
                            realName = "James Howlett (Logan)",
                            superheroeName = "Wolverine"
                        ), SuperHeroe(
                            photo = R.drawable.thor,
                            publisher = "Marvel",
                            realName = "Thor Odinson",
                            superheroeName = "Thor"
                        ),SuperHeroe(
                            photo = R.drawable.hulk,
                            publisher = "Marvel",
                            realName = "Robert Bruce Banner",
                            superheroeName = "Hulk"
                        )

                    )
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

@Composable
fun itemHeroe(superheroe: SuperHeroe, onItemSelected: (SuperHeroe) -> Unit) {
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
                    .height(300.dp).clickable { onItemSelected(superheroe) },
                contentScale = ContentScale.Crop
            )
//            AsyncImage(
//                model = "${superheroe.photo}",
//                contentDescription = superheroe.superheroeName,
//                modifier = Modifier.fillMaxWidth(),
//                contentScale = ContentScale.Crop
//            )
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

/*SuperHeroe(
      photo = "https://i.pinimg.com/736x/2e/5e/be/2e5ebe6bac9515a76ec4f8d5de7613e6.jpg",
      publisher = "Marvel",
      realName = "Peter Parker",
      superheroeName = "Spider-Man"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/736x/11/85/9f/11859f2bea3de25684710868562f6c63.jpg",
      publisher = "DC",
      realName = "Bruce Wayne",
      superheroeName = "Batman"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/236x/a8/48/ea/a848eab53daf3efbbbbe4a7b4da809a0.jpg",
      publisher = "DC",
      realName = "Clark Kent",
      superheroeName = "Superman"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/236x/31/76/f3/3176f3cb386210985c8839734d072d9d.jpg",
      publisher = "Marvel",
      realName = "Tony Stark",
      superheroeName = "Iron Man"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/236x/07/f8/b9/07f8b91c8e0812c6884ce6e477d33010.jpg",
      publisher = "DC",
      realName = "Diana Prince",
      superheroeName = "Wonder Woman"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/236x/6d/be/64/6dbe64f11645117a5b345e2e3cebaf55.jpg",
      publisher = "Marvel",
      realName = "Steve Rogers",
      superheroeName = "Captain America"
  ),
  SuperHeroe(
      photo = "https://i.pinimg.com/236x/e6/65/30/e66530069f774e90549008294162f9c9.jpg",
      publisher = "Marvel",
      realName = "Wade Wilson",
      superheroeName = "Deadpool"
  ), SuperHeroe(
      photo = "https://i.pinimg.com/236x/20/0d/54/200d54e5fdf1af29c64d07fdb4e4e88b.jpg",
      publisher = "Marvel",
      realName = "James Howlett (Logan)",
      superheroeName = "Wolverine"
  ), SuperHeroe(
      photo = "https://i.pinimg.com/474x/3f/28/7a/3f287a000945262cd30887d0566d12c6.jpg",
      publisher = "Marvel",
      realName = "Thor Odinson",
      superheroeName = "Thor"
  )*/