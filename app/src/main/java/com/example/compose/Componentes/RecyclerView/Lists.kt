package com.example.compose.Componentes.RecyclerView

import android.graphics.Movie
import com.example.compose.R

fun getHeroes():List<HeroeData>{
    return listOf(
        HeroeData(
            photo = R.drawable.spiderman,
            publisher = "Marvel",
            realName = "Peter Parker",
            superheroeName = "Spider-Man"
        ),
        HeroeData(
            photo = R.drawable.batman,
            publisher = "DC",
            realName = "Bruce Wayne",
            superheroeName = "Batman"
        ),
        HeroeData(
            photo = R.drawable.superman,
            publisher = "DC",
            realName = "Clark Kent",
            superheroeName = "Superman"
        ),
        HeroeData(
            photo = R.drawable.ironman,
            publisher = "Marvel",
            realName = "Tony Stark",
            superheroeName = "Iron Man"
        ),
        HeroeData(
            photo = R.drawable.wonderman,
            publisher = "DC",
            realName = "Diana Prince",
            superheroeName = "Wonder Woman"
        ),
        HeroeData(
            photo = R.drawable.capitanamerica,
            publisher = "Marvel",
            realName = "Steve Rogers",
            superheroeName = "Captain America"
        ),
        HeroeData(
            photo = R.drawable.deadpool,
            publisher = "Marvel",
            realName = "Wade Wilson",
            superheroeName = "Deadpool"
        ), HeroeData(
            photo = R.drawable.wolverine,
            publisher = "Marvel",
            realName = "James Howlett (Logan)",
            superheroeName = "Wolverine"
        ), HeroeData(
            photo = R.drawable.thor,
            publisher = "Marvel",
            realName = "Thor Odinson",
            superheroeName = "Thor"
        ), HeroeData(
            photo = R.drawable.hulk,
            publisher = "Marvel",
            realName = "Robert Bruce Banner",
            superheroeName = "Hulk"
        )

    )
}

fun getMovieList(): List<MovieData> {
    return listOf(
        MovieData(
            id = 1,
            nombre = "Inception",
            descripcion = "Un ladrón experto en robar secretos a través de los sueños se enfrenta a una misión arriesgada.",
            año = 2010,
            caratula = R.drawable.inception,
            genero = "Ciencia Ficción"
        ),
        MovieData(
            id = 2,
            nombre = "The Dark Knight",
            descripcion = "Batman lucha contra el crimen en Gotham City mientras enfrenta al Joker, un villano impredecible.",
            año = 2008,
            caratula = R.drawable.dark_knight,
            genero = "Acción"
        ),
        MovieData(
            id = 3,
            nombre = "Forrest Gump",
            descripcion = "La historia de un hombre con una vida extraordinaria, marcada por amor, guerra y amistad.",
            año = 1994,
            caratula = R.drawable.forrest_gump,
            genero = "Drama"
        ),
        MovieData(
            id = 4,
            nombre = "The Matrix",
            descripcion = "Un programador descubre que la realidad que conoce es una simulación creada por máquinas inteligentes.",
            año = 1999,
            caratula = R.drawable.matrix,
            genero = "Ciencia Ficción"
        ),
        MovieData(
            id = 5,
            nombre = "Titanic",
            descripcion = "Una joven pareja vive un amor apasionado a bordo del fatídico viaje del Titanic.",
            año = 1997,
            caratula = R.drawable.titanic,
            genero = "Romántico"
        ),
        MovieData(
            id = 6,
            nombre = "Avatar",
            descripcion = "Un ex-marine es enviado a un planeta lejano donde se involucra en un conflicto con los habitantes nativos.",
            año = 2009,
            caratula = R.drawable.avatarp,
            genero = "Ciencia Ficción"
        ),
        MovieData(
            id = 7,
            nombre = "The Godfather",
            descripcion = "La historia de la familia mafiosa Corleone, centrada en la lucha por el poder y la traición.",
            año = 1972,
            caratula = R.drawable.godfather,
            genero = "Crimen"
        ),
        MovieData(
            id = 8,
            nombre = "Pulp Fiction",
            descripcion = "Varios relatos entrelazados de crimen y violencia en Los Ángeles, con una narrativa no lineal.",
            año = 1994,
            caratula = R.drawable.pulp_fiction,
            genero = "Crimen"
        ),
        MovieData(
            id = 9,
            nombre = "El indomable Will Hunting",
            descripcion = "Will es un joven rebelde con una inteligencia asombrosa, especialmente para las matemáticas.",
            año = 1998,
            caratula = R.drawable.will_hunting,
            genero = "Drama"
        ),
        MovieData(
            id = 10,
            nombre = "Gladiator",
            descripcion = "Un general romano es traicionado y busca venganza luchando en la arena como gladiador.",
            año = 2000,
            caratula = R.drawable.gladiator,
            genero = "Acción"
        ),
        MovieData(
            id = 11,
            nombre = "The Lion King",
            descripcion = "El viaje de un joven león para reclamar su trono y enfrentarse a su destino.",
            año = 1994,
            caratula = R.drawable.lion_king,
            genero = "Animación"
        ),
        MovieData(
            id = 12,
            nombre = "Jurassic Park",
            descripcion = "Un parque temático de dinosaurios se convierte en un caos cuando los animales escapan de sus jaulas.",
            año = 1993,
            caratula = R.drawable.jurassic_park,
            genero = "Aventura"
        ),
        MovieData(
            id = 13,
            nombre = "Mad Max: Fury Road",
            descripcion = "En un mundo post-apocalíptico, Max se une a una rebelde para escapar de un tirano.",
            año = 2015,
            caratula = R.drawable.mad_max,
            genero = "Acción"
        ),
        MovieData(
            id = 14,
            nombre = "Interstellar",
            descripcion = "Un grupo de astronautas viaja a través de un agujero de gusano para salvar a la humanidad.",
            año = 2014,
            caratula = R.drawable.interstellar,
            genero = "Ciencia Ficción"
        ),
        MovieData(
            id = 15,
            nombre = "The Avengers",
            descripcion = "Un equipo de superhéroes se une para salvar el mundo de una amenaza alienígena.",
            año = 2012,
            caratula = R.drawable.avengers,
            genero = "Acción"
        ),
        MovieData(
            id = 16,
            nombre = "The Prestige",
            descripcion = "Dos magos rivales compiten por crear el mejor truco, llevándolos a obsesionarse y cometer actos oscuros.",
            año = 2006,
            caratula = R.drawable.prestige,
            genero = "Misterio"
        ),
        MovieData(
            id = 17,
            nombre = "Whiplash",
            descripcion = "Un joven batería lucha por alcanzar la perfección mientras lidia con un maestro extremadamente exigente.",
            año = 2014,
            caratula = R.drawable.whiplash,
            genero = "Drama"
        ),
        MovieData(
            id = 18,
            nombre = "Gran Turismo",
            descripcion = "Basada en la famosa franquicia de videojuegos, 'Gran Turismo' sigue la historia de un joven con talento para las carreras de simulación que tiene la oportunidad de competir en el mundo real contra algunos de los mejores pilotos del mundo.",
            año = 2025,
            caratula = R.drawable.gran_turismo,
            genero = "Acción"
        ),
        MovieData(
            id = 19,
            nombre = "The Social Network",
            descripcion = "La historia de la creación de Facebook y las luchas legales entre los fundadores de la red social.",
            año = 2010,
            caratula = R.drawable.social_network,
            genero = "Biografía"
        )
    )
}