package com.list.book.googlebooklist.activities

import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import com.list.book.googlebooklist.R
import com.list.book.googlebooklist.adapter.VolumeAdapter
import com.list.book.googlebooklist.data.view.model.VolumeViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    var mVolumeViewModel: VolumeViewModel? = null
    var lastPosition: Int = 0

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        search_book.setOnSearchClickListener {
            Log.d(TAG, ": ${search_book.query}")
        }

        search_book.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d(TAG, "onQueryTextSubmit: ${search_book.query}")
                if (!TextUtils.isEmpty(search_book.query)) {
                    makeAPICall(search_book.query.toString())
                    val imm = applicationContext.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(search_book.windowToken, 0)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return true
            }


        })
    }

    private fun makeAPICall(searchText: String) {

        mVolumeViewModel = ViewModelProviders.of(this).get(VolumeViewModel::class.java)

        mVolumeViewModel?.setSearchText(searchText)
        mVolumeViewModel?.mutableLiveData?.observe(this, Observer { list ->

            if (list != null && list.size > 0) {

                var adapter = VolumeAdapter(this, list)
                list_recycler_view.adapter = adapter

                if (lastPosition != 0) {

                    list_recycler_view.scrollToPosition(lastPosition - 2)

                }

                list_recycler_view.addOnScrollListener(object : RecyclerView.OnScrollListener() {

                    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                        super.onScrollStateChanged(recyclerView, newState)

                        if (!list_recycler_view.canScrollVertically(1)) {
                            Log.d(TAG, ": has reached end")
                            lastPosition = list.size - 1
                            mVolumeViewModel?.loadMore()
                        }
                    }
                })

            }

        })


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
