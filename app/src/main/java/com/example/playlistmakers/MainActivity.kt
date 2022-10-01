package com.example.playlistmakers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings_button = findViewById<Button>(R.id.setting)

        settings_button.setOnClickListener {
            val setting_intent = Intent(this,SettingsActivity::class.java)
            startActivity(setting_intent)
        }

        val activity_search = findViewById<Button>(R.id.search)

        activity_search.setOnClickListener {
            val search_intent = Intent(this, com.example.playlistmakers.activity_search::class.java)
            startActivity(search_intent)
        }

        val mediateka_button =findViewById<Button>(R.id.mediaLibrary)

        mediateka_button.setOnClickListener {
            val mediateka_intent = Intent(this, MediaTeka::class.java)
            startActivity(mediateka_intent)
        }
    }
}