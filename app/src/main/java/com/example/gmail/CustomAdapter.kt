package com.example.gmail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

data class Email(
    val name: String,
    val time: String,
    val title: String,
    val content: String
)


class CustomAdapter(context: Context, private val emails: ArrayList<Email>) : ArrayAdapter<Email>(context, 0, emails) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false)
        }

        val currentEmail = getItem(position)

        val avatar = listItemView!!.findViewById<TextView>(R.id.avatar)
        // Set the image and text in the ImageView
        avatar.text = currentEmail!!.name[0].toString();

        val nameTextView = listItemView.findViewById<TextView>(R.id.name)
        nameTextView.text = currentEmail?.name

        val timeTextView = listItemView.findViewById<TextView>(R.id.time)
        timeTextView.text = currentEmail?.time

        val titleTextView = listItemView.findViewById<TextView>(R.id.title)
        titleTextView.text = currentEmail?.title

        val contentTextView = listItemView.findViewById<TextView>(R.id.content)
        contentTextView.text = currentEmail?.content

        return listItemView
    }
}
