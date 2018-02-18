package com.palmatolay.app.lifehack

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

//import kotlinx.android.synthetic.main.activity_main.view.toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager

        val list = ArrayList<NewsModel>()
        list.add(NewsModel("sampleTitle", "Here's the sample news content for a " +
                "perview text about this new.", R.drawable.sample1))
        list.add(NewsModel("sampleTitle", "Here's the sample news content. " +
                "Here's the sample news content for a perview text about this new." +
                "Here's the sample news content for a perview text about this new.",
                R.drawable.sample2))
        list.add(NewsModel("sampleTitle", "Here's the sample news content. " +
                "Here's the sample news content for a perview text about this new.",
                R.drawable.sample3))
        recyclerView.adapter = NewsAdapter(list)
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

    fun shareButtonListener(view: View) {
        Snackbar.make(view, R.string.shareText, Snackbar.LENGTH_LONG)
                .setAction("Cancel", null).show()
    }


    fun favouriteBtnListener(view: View){
        Snackbar.make(view, R.string.favouriteText, Snackbar.LENGTH_LONG)
                .setAction("Cancel", null).show()
    }

    fun onePlusButtonListener(view: View){
        Snackbar.make(view, R.string.onePlusText, Snackbar.LENGTH_LONG)
                .setAction("Cancel", null).show()
    }
}
