package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.ListView

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val emails = ArrayList<Email>()
        emails.add(Email("John", "10:00 AM", "Meeting", "Let's have a meeting at 2 PM."))
        emails.add(Email("John", "10:00 AM", "Meeting", "Let's have a meeting at 2 PM."))
        emails.add(Email("Long", "9:00PM", "Long content", "This is very long content, This is very long content, This is very long content, This is very long content, This is very long content, This is very long content, This is very long content."))

        val adapter = CustomAdapter(this, emails)

        val listView: ListView = findViewById(R.id.email_list_view)
        listView.adapter = adapter
    }
}
