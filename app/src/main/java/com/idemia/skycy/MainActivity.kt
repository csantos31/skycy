package com.idemia.skycy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    var adapter : MovieAdapter? = null
    var movieList = ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        movieList.add(Movie("SuperMan", "DC serie abour cripto man", R.drawable.img2))
        movieList.add(Movie("spiderman", "DC serie abour cripto man", R.drawable.img3))
        movieList.add(Movie("naruto", "DC serie abour cripto man", R.drawable.img4))
        movieList.add(Movie("Boturo", "DC serie abour cripto man", R.drawable.img5))
        movieList.add(Movie("tokiogo", "DC serie abour cripto man", R.drawable.img6))
        movieList.add(Movie("morningstar", "DC serie abour cripto man", R.drawable.img7))
        movieList.add(Movie("tokiogo", "DC serie abour cripto man", R.drawable.img1))
        movieList.add(Movie("morningstar", "DC serie abour cripto man", R.drawable.img2))
        movieList.add(Movie("tokiogo", "DC serie abour cripto man", R.drawable.img3))
        movieList.add(Movie("morningstar", "DC serie abour cripto man", R.drawable.img4))

        adapter = MovieAdapter(this, movieList)
        gridView.adapter = adapter

    }
}