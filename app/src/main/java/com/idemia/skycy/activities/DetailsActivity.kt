package com.idemia.skycy.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idemia.skycy.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.card_mv.view.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var extras = intent.extras

        Picasso.get().load(extras!!.getString("image")).placeholder(R.drawable.transparent_bg)
            .error(R.drawable.sherlockbg).into(imageDetail)

        nameDetail.text = extras!!.getString("name")
        descriptionDetail.text = extras!!.getString("description")
    }
}