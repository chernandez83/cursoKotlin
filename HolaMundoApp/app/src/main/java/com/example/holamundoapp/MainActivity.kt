package com.example.holamundoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonSubmit:Button = findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            // Toast.makeText( this, "Ésto es un toast", Toast.LENGTH_SHORT ).show()
            val intent = Intent(this, SecondActivity::class.java)
            val editTextUserName:EditText = findViewById(R.id.editTextUserName)

            intent.putExtra("username", editTextUserName.text.toString())
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}