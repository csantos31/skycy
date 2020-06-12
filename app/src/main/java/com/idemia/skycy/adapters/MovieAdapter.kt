package com.idemia.skycy.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.idemia.skycy.R
import com.idemia.skycy.activities.DetailsActivity
import com.idemia.skycy.models.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_mv.view.*

class MovieAdapter : BaseAdapter {

    var movieList = ArrayList<Movie>()
    var context: Context? = null

    constructor(context: Context?, movieList: ArrayList<Movie>) : super() {
        this.movieList = movieList
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var movie: Movie = this.movieList[position]
        var inflate: LayoutInflater =
            context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var movieView: View = inflate.inflate(R.layout.card_mv, null)

        Picasso.get().load(movie.image).placeholder(R.drawable.transparent_bg)
            .error(R.drawable.sherlock).into(movieView.imageView)

        movieView.textView.text = movie.name!!
        movieView.imageView.setOnClickListener {
            var intent = Intent(context, DetailsActivity::class.java)

            intent.putExtra("name", movie.name!!)
            intent.putExtra("description", movie.description!!)
            intent.putExtra("image", movie.image!!)

            context!!.startActivity(intent)
        }

        return movieView
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return movieList.size
    }

}
