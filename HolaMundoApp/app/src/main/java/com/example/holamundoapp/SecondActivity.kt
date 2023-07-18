package com.example.holamundoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        var username:String? = intent.getStringExtra("username")
        val textViewUserName:TextView = findViewById(R.id.textViewUserName)
        textViewUserName.text = username

        var webview:WebView = findViewById(R.id.webview)
        webview.loadUrl("https://www.google.com")
    }
}