package com.example.fakeinstaapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakeinstaapp.R

class FeedAdapter : RecyclerView.Adapter<FeedAdapter.FeedViewHolder>() {

    // Sample data
    private val feedItems = listOf("Post 1", "Post 2", "Post 3")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed, parent, false)
        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        holder.bind(feedItems[position])
    }

    override fun getItemCount() = feedItems.size

    class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.feedItemText)
        private val imageView: ImageView = itemView.findViewById(R.id.feedItemImage)

        fun bind(text: String) {
            textView.text = text
            imageView.setImageResource(R.drawable.ic_launcher_foreground) // Placeholder image
        }
    }
}


