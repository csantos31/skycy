package com.idemia.skycy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var extras = intent.extras
        imageDetail.setImageResource(extras!!.getInt("image"))
        nameDetail.text = extras!!.getString("name")
        descriptionDetail.text = extras!!.getString("description")
    }
}