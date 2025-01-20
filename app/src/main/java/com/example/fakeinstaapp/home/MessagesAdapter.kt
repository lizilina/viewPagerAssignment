package com.example.fakeinstaapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakeinstaapp.R

class MessagesAdapter : RecyclerView.Adapter<MessagesAdapter.StoriesViewHolder>() {

    // Sample data
    private val messagesItems = listOf("message 1", "message 2", "message 3")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return StoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.bind(messagesItems[position])
    }

    override fun getItemCount() = messagesItems.size

    class StoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.messageItemText)
        fun bind(text: String) {
            textView.text = text
        }
    }
}

