package com.example.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val youtube = findViewById<Button>(R.id.button)
        youtube.setOnClickListener {
            val url = "https://www.instagram.com/escokelat.kenangan/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
            }

        val cokelat = intent.getParcelableExtra<CokelatClass>(MainActivity.INTENT_PARCELABLE)

        val cokelatimg = findViewById<ImageView>(R.id.image)
        val cokelatname = findViewById<TextView>(R.id.tv_name)
        val cokelatrate = findViewById<TextView>(R.id.tv_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val cokelatdesc = findViewById<TextView>(R.id.tv_description)

        cokelatimg.setImageResource(cokelat?.cokelatimg!!)
        cokelatname.text = cokelat.cokelatname
        cokelatrate.text = cokelat.cokelatrate
        ratingbar.rating = cokelat.ratingbar.toFloat()
        cokelatdesc.text = cokelat.cokelatdesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}