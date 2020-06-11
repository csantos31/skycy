package com.idemia.skycy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
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
        var inflate : LayoutInflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var movieView : View = inflate.inflate(R.layout.card_mv, null)
        movieView.imageView.setImageResource(movie.image!!)
        movieView.textView.text = movie.name!!
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
