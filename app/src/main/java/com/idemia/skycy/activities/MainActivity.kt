package com.idemia.skycy.activities

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.idemia.skycy.R
import com.idemia.skycy.adapters.MovieAdapter
import com.idemia.skycy.models.Movie
import com.idemia.skycy.models.SKYApi
import com.idemia.skycy.models.SKYResponse
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {
    private val handler: Handler = Handler()

    var adapter: MovieAdapter? = null
    var movieList = ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        getAPI()

    }

    fun getAPI(){
        Thread(Runnable {

            var skyResponse: List<SKYResponse>? = SKYApi.getInstance().getMovies()

            Log.e("log", ""+ skyResponse!![0].backdrops_url?.get(0))

            handler.post(Runnable {
                for(item: SKYResponse in skyResponse){
                    movieList.add(Movie(
                        item.title,
                        item.overview,
                        item.cover_url,
                        item.backdrops_url?.get(0),
                        item.duration,
                        item.release_year
                    ))
                }

                adapter = MovieAdapter(this, movieList)
                gridView.adapter = adapter
            })
        }).start()

    }

}