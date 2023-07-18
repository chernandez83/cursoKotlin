package com.example.holalistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

/*import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast*/

class MainActivity : AppCompatActivity() {

    /*var arreglo = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19","20")*/

    private var items:ArrayList<String> =  ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ListView con click
        /*val adaptador = ArrayAdapter(this, R.layout.listitem, arreglo)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adaptador

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val texto = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext, "Hola $texto", Toast.LENGTH_SHORT).show()
            }
         */

        addItems()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = MyAdapter(items, this)

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            // Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
            it -> Snackbar.make(it, "Click Snackbar", Snackbar.LENGTH_LONG).show()
        }
    }

    private fun addItems() {
        items.add("Elemento A")
        items.add("Elemento B")
        items.add("Elemento C")
        items.add("Elemento D")
        items.add("Elemento E")
        items.add("Elemento F")
        items.add("Elemento G")
        items.add("Elemento H")
        items.add("Elemento I")
        items.add("Elemento J")
        items.add("Elemento K")
        items.add("Elemento L")
        items.add("Elemento M")
        items.add("Elemento N")
        items.add("Elemento Ñ")
        items.add("Elemento O")
        items.add("Elemento P")
        items.add("Elemento Q")
        items.add("Elemento R")
        items.add("Elemento S")
        items.add("Elemento T")
        items.add("Elemento U")
        items.add("Elemento V")
        items.add("Elemento X")
        items.add("Elemento Y")
        items.add("Elemento Z")
    }
}