package com.example.compose.imagenes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.R

@Composable
fun ImagenContentScaleFit(modifier: Modifier) {
    Column (modifier.fillMaxSize().verticalScroll(rememberScrollState())){
        Text("ContentScale Fit",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Fit
        )
        Text("ContentScale FillWidth",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.FillWidth
        )
        Text("ContentScale FillBounds",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.FillBounds
        )
        Text("ContentScale FillHeight",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.FillHeight
        )
        Text("ContentScale Crop",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
        Text("ContentScale Inside",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Inside
        )
        Text("ContentScale None",Modifier.align(Alignment.CenterHorizontally))
        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = null,
            Modifier.size(300.dp).align(Alignment.CenterHorizontally),
            contentScale = ContentScale.None
        )

    }
}