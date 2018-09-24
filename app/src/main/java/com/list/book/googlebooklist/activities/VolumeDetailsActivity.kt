package com.list.book.googlebooklist.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.ImageView
import com.google.gson.Gson
import com.list.book.googlebooklist.R
import com.list.book.googlebooklist.data.types.volume.Volume
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.activity_volume_details.*
import kotlinx.android.synthetic.main.content_volume_details.*

class VolumeDetailsActivity : AppCompatActivity() {

    companion object {

        val TAG: String = VolumeDetailsActivity::class.java.simpleName

        const val VOLUME_KEY = "VOLUME_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_details)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        initializeViews()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun initializeViews() {

        intent?.let {

            val jsonVolume = intent.getStringExtra(VOLUME_KEY)
            val volume: Volume = (Gson()).fromJson(jsonVolume, Volume::class.java)

            volume.let {

                Picasso.with(applicationContext)
                        .load(volume.volumeInfo.imageLinks.thumbnail)
                        .into(book_image as ImageView)

                book_title.text = volume.volumeInfo?.title

                if (volume.volumeInfo?.subtitle != null) {

                    book_sub_title.text = volume.volumeInfo?.subtitle
                } else {
                    book_sub_title.visibility = View.GONE
                }

                if (volume.volumeInfo?.authors != null &&
                        volume.volumeInfo?.authors!!.isNotEmpty()) {

                    book_author.text = "Author: ${volume.volumeInfo?.authors!![0]}"
                } else {
                    book_author.visibility = View.GONE
                }

                if (volume.saleInfo?.retailPrice != null) {
                    book_price.text = "Price: $${volume.saleInfo?.retailPrice?.amount}"
                } else {
                    book_price.visibility = View.INVISIBLE
                }

                if (volume.volumeInfo?.publisher != null) {

                    book_publisher.text = "Publisher: ${volume.volumeInfo?.publisher}"
                } else {
                    book_publisher.visibility = View.GONE
                }

                book_description.text = "${volume.volumeInfo?.description}"


            }
        }
    }

}
