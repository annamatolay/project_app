package com.palmatolay.app.lifehack

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.palmatolay.app.lifehack.R.layout.items
import kotlinx.android.synthetic.main.items.view.*
//TODO: image
class NewsModel(val title: String, val content: String, var imageSrc: Int)

class NewsAdapter(private val list: List<NewsModel>)
    : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        // no fVBI method needed here anymore ;)
        var titleVew: TextView = itemView.titleText
        var previewView: TextView = itemView.previewText
//        var image: ImageView = itemView.imageView
        var layout: ConstraintLayout = itemView.cardLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(items, parent, false)
        return NewsAdapter.ViewHolder(view)
    }


    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        val news: NewsModel = list[position]
        holder.titleVew.text = news.title
        holder.previewView.text = news.content
//        holder.image.setImageResource(news.imageSrc)
        holder.layout.setBackgroundResource(news.imageSrc)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
